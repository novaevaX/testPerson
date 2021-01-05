package example.Service;

import example.DAO.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService implements PersonServiceImplements{

    private PersonDAO personDAO;

    @Autowired
    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    @Transactional
    public List showAllPeople(){
        return this.personDAO.showAllPeople();
    }
}
