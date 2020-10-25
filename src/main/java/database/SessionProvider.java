package database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SessionProvider {
    private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    private SessionProvider(){

    }
    public static Session getSession(){
        return sessionFactory.openSession();
    }
}
