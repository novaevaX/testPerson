package example.Controller;

import example.Model.Person;
import example.Service.PersonService;
import example.Service.PersonServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerFirst {

    private PersonServiceRepo personServiceRepo;

    private PersonService personService;

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/main")
    public String main(Model model){
        model.addAttribute("people", new Person());
        model.addAttribute("showAll", new PersonService().showAllPeople());
        return "main";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greet";
    }


}