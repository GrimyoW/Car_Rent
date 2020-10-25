package dao;

import database.SessionProvider;
import org.hibernate.Session;
import org.hibernate.Transaction;

public abstract class AbstractDao<T> {

    private final Class<T> clazz;

    public AbstractDao(Class<T> clazz) { this.clazz = clazz; }

    public void add(T record){
        Session session = SessionProvider.getSession();
        Transaction transaction =session.beginTransaction();
        session.save(record);
        transaction.commit();
        session.close();

    }
    public T findById(int id){
        Session session = SessionProvider.getSession();
        Transaction transaction = session.beginTransaction();
        T record = session.find(clazz, id);
        transaction.commit();
        session.close();
        return record;

    }
    public void update(T record) {
        Session session = SessionProvider.getSession();
        Transaction transaction = session.beginTransaction();
        session.update(record);
        transaction.commit();
        session.close();
    }

}
