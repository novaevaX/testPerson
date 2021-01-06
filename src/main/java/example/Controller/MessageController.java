package example.Controller;

import example.DAO.MessageRepository;
import example.Model.MessageForPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerMessage {

    @Autowired
    private MessageRepository messageRepository;

    @GetMapping("/message")
    public String mes(Model model){
        Iterable<MessageForPerson> messageForPersonIterable = messageRepository.findAll();
        model.addAttribute("mes", messageForPersonIterable);
        return "message";
    }

    @PostMapping("/sending")
    public String sending(@RequestParam String text, @RequestParam String tag, Model model){
        MessageForPerson message = new MessageForPerson(text, tag);
        messageRepository.save(message);
        Iterable<MessageForPerson> messageForPersonIterable = messageRepository.findAll();
        model.addAttribute("messageForPersonIterable", messageForPersonIterable);
        return "message";
    }

    @PostMapping("/filter")
    public String filter(@RequestParam String tag, Model model){
        Iterable<MessageForPerson> messageForPersonList = messageRepository.findByTag(tag);
        model.addAttribute("mes2", messageForPersonList);
        return "message";
    }
}