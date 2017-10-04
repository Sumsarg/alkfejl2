package hello.controller;

import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    
    @GetMapping("")
    public String studentList(Model model) {
        model.addAttribute("title", "Student list");
        model.addAttribute("students", Arrays.asList(
            "name1",
            "name2",
            "name3"
        ));
        return "list";
    }
    
}
