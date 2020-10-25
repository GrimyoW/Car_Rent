package model;

import org.hibernate.annotations.GenericGenerator;


import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Table(name = "Cars")
public class Cars {
    @Column
    private String marka;

    @Column
    private String model;

    @Column
    private String color;

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "car")
    @GenericGenerator(name = "car", strategy = "increment")
    private int id;

    @Column
    private String numerRejestracyjny;

    @Column
    private boolean stanAuta;

    public Cars(String marka, String model, String color, int id, String numerRejestracyjny, boolean stanAuta) {
        this.marka = marka;
        this.model = model;
        this.color = color;
        this.id = id;
        this.numerRejestracyjny = numerRejestracyjny;
        this.stanAuta = stanAuta;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumerRejestracyjny() {
        return numerRejestracyjny;
    }

    public void setNumerRejestracyjny(String numerRejestracyjny) {
        this.numerRejestracyjny = numerRejestracyjny;
    }

    public boolean isStanAuta() {
        return stanAuta;
    }

    public void setStanAuta(boolean stanAuta) {
        this.stanAuta = stanAuta;
    }

    @Override
    public boolean equals(Object o) {


        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return id == cars.id &&
                stanAuta == cars.stanAuta &&
                Objects.equals(marka, cars.marka) &&
                Objects.equals(model, cars.model) &&
                Objects.equals(color, cars.color) &&
                Objects.equals(numerRejestracyjny, cars.numerRejestracyjny);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, model, color, id, numerRejestracyjny, stanAuta);
    }

    @Override
    public String toString() {
        return "Cars{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", id=" + id +
                ", numerRejestracyjny='" + numerRejestracyjny + '\'' +
                ", stanAuta=" + stanAuta +
                '}';
    }
}