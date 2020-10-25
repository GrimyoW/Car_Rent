package dao;

import database.SessionProvider;
import model.Rent;
import org.hibernate.Session;

import java.util.List;

public class RentDao extends AbstractDao<Rent> {
    public RentDao() {
        super(Rent.class);
    }

}
