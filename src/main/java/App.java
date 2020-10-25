import dao.AbstractDao;
import dao.CarsDao;
import dao.CustomersDao;
import dao.RentDao;
import model.Cars;
import model.Customers;
import model.Rent;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class App {
    public static void main(String[] args) {

        CarsDao carsDao = new CarsDao();
        CustomersDao customersDao = new CustomersDao();
        RentDao rentDao = new RentDao();
        Customers customers = new Customers(1, "Andrzej", "Andrzejewicz");
        Customers customers1 = new Customers(2, "Stachu", "Stachuowicz");
        Customers customers2 = new Customers(3, "Mieciu", "Mieciuchowicz");
        customersDao.add(customers);
        customersDao.add(customers1);
        customersDao.add(customers2);
        Cars cars = new Cars("Mercedes", "A Class", "niebieski", 123456, "AVE7894",true);
        Cars cars1 = new Cars("Mercedes", "B Class", "czerwony", 234567, "AGH4567",true);
        Cars cars2 = new Cars("Mercedes", "C Class", "zielony", 456789, "LKH4567", true);
        carsDao.add(cars);
        carsDao.add(cars1);
        carsDao.add(cars2);

        LocalDate localDate = new LocalDate(2020, 10, 25);



    }
}
