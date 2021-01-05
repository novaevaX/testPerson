package example.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
public class PersonDAO implements PersonDAOImplements{

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List showAllPeople(){
        Session session = this.sessionFactory.getCurrentSession();
        final List from_person = session.createQuery("SELECT '*' FROM Person").list();
        return from_person;
    }

}
