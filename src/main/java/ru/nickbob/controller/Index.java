package ru.nickbob.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.GenericApplicationListener;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ru.nickbob.model.AddUser;
import ru.nickbob.model.User;

@Controller
public class Index {

    private static List<User> crew = new ArrayList<>();

    static {
        crew.add(new User("Serg", "Bobkin"));
        crew.add(new User("Elon", "Musk"));
    }

    @Value("${welcome}")
    private String welcome;

    @Value("${create.user.error}")
    private String createUserError;

    @GetMapping(value = { "/", "/index" })
    public String index(Model model) {
        model.addAttribute("welcome", welcome);
        return "index";
    }

    @GetMapping("/users")
    public String users(Model model) {
        model.addAttribute("crew", crew);
        return "users";
    }

    @GetMapping("signon")
    public String signon(Model model) {
        AddUser addUser = new AddUser();
        model.addAttribute("addUser", addUser);
        return "signon";
    }

    @PostMapping("signon")
    public String signonPost(@ModelAttribute("addUser") AddUser addUser, Model model) {
        String fn = addUser.getFname();
        String sn = addUser.getSname();

        if (fn != null && fn.length() > 0 && sn != null && sn.length() > 0) {
            User user = new User(fn, sn);
            crew.add(user);
            model.addAttribute("crew", crew);
            return "redirect:/users";
        }

        model.addAttribute("createUserError", createUserError);
        return "signon";
    }
}