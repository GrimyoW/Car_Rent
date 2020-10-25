package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Rent")
public class Rent {
    @Column
    private long rentDate;

    @Column
    private long expireDate;

    @Column
    private int idCustomers;

    @Column
    private String id_car;

    public Rent(long rentDate, long expireDate, int idCustomers, String id_car) {
        this.rentDate = rentDate;
        this.expireDate = expireDate;
        this.idCustomers = idCustomers;
        this.id_car = id_car;
    }

    public long getRentDate() {
        return rentDate;
    }

    public void setRentDate(long rentDate) {
        this.rentDate = rentDate;
    }

    public long getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(long expireDate) {
        this.expireDate = expireDate;
    }

    public int getIdCustomers() {
        return idCustomers;
    }

    public void setIdCustomers(int idCustomers) {
        this.idCustomers = idCustomers;
    }

    public String getId_car() {
        return id_car;
    }

    public void setId_car(String id_car) {
        this.id_car = id_car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rent rent = (Rent) o;
        return rentDate == rent.rentDate &&
                expireDate == rent.expireDate &&
                idCustomers == rent.idCustomers &&
                Objects.equals(id_car, rent.id_car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rentDate, expireDate, idCustomers, id_car);
    }

    @Override
    public String toString() {
        return "Rent{" +
                "rentDate=" + rentDate +
                ", expireDate=" + expireDate +
                ", idCustomers=" + idCustomers +
                ", id_car='" + id_car + '\'' +
                '}';
    }
}
