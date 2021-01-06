package example.Controller;

import example.DAO.PersonRepository;
import example.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class ControllerPerson {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/main")
    public String main(Model model){
        Iterable<Person> people = personRepository.findAll();
        model.addAttribute("people", people);
        return "main";
    }

    @PostMapping("/addNewPerson")
    public String add(@RequestParam String name, @RequestParam String mail,
                      @RequestParam int age, @RequestParam String position,
                      Model model){
        Person person = new Person(name, mail, age, position);
        personRepository.save(person);
        Iterable<Person> people = personRepository.findAll();
        model.addAttribute("people", people);
        return "main";
    }

    @GetMapping("/main/{id}")
    public String showPerson(){

        return "";
    }

    @PatchMapping("/main/editor/{id}")
    public String editor(){

        return "";
    }

    @DeleteMapping("/deletePerson")
    public String delete(@PathVariable("id") int id){

        return "main";
    }
}
