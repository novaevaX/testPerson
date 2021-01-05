package example.Service;

import example.DAO.PersonDAORepository;
import example.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceRepo implements PersonServiceImplements{


    private final PersonDAORepository personDAORepository;

    public PersonServiceRepo(PersonDAORepository personDAORepository) {
        this.personDAORepository = personDAORepository;
    }

    @Override
    public List<Person> showAllPeople(){
        return personDAORepository.findAll();
    }

}
