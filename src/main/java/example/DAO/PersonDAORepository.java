package example.DAO;

import example.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDAORepository extends JpaRepository<Person, Long> {

}
