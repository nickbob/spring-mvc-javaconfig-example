package ru.nickbob.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import ru.nickbob.model.AddUser;
import ru.nickbob.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class Index {

    @Value("${create.user.error}")
    private String createUserError;

    @Value("${welcome.message}")
    private String welcome;

    public static List<User> crew = new ArrayList<>();

    static {
        crew.add(new User("Serg", "Bobkin"));
        crew.add(new User("Elon", "Musk"));
    }

    @GetMapping(value = { "/", "/index" })
    public String indexPage(Model model) {
        model.addAttribute("welcome", welcome);
        return "index";
    }

    @GetMapping("/users")
    public String userList(Model model) {
        model.addAttribute("crew", crew);
        return "users";
    }

    @GetMapping("/signon")
    public String signon(Model model) {
        AddUser addUser = new AddUser();
        model.addAttribute(addUser);
        return "signon";
    }

    @PostMapping("/signon")
    public String postSignon(Model model, @ModelAttribute("addUser") AddUser addUser) {
        String Fname = addUser.getFirstName();
        String Sname = addUser.getSecondName();

        if (Fname != null && Fname.length() > 0 && Sname != null && Sname.length() > 0) {
            User user = new User(Fname,Sname);
            crew.add(user);
            model.addAttribute("crew", crew);
            return "redirect:/users";
        }
        model.addAttribute("createUserError", createUserError);

        return "signon";
    }

}