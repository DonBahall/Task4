package com.example.task4.controllers;

import com.example.task4.Model.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class AuthController {

    private final ArrayList<User> users = new ArrayList<>();

    @GetMapping("/")
    public String hello(HttpSession session) {
        session.setAttribute("log", null);
        session.setAttribute("error",null);
        return "hello";
    }

    @GetMapping("/auth")
    public ModelAndView authorisation(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView("/auth");

        if(session.getAttribute("error") != null) {
            modelAndView.addObject("error","error");
            session.setAttribute("error",null);
        }
        return modelAndView;
    }

    @PostMapping("/auth")
    public String log_in(@RequestParam String login, @RequestParam String password, HttpSession session) {
        users.add(new User("Dima", "user", "1234"));
        users.add(new User("Andrey", "user2", "1111"));
        for (User user : users) {
            if (user.login.equals(login) && user.password.equals(password)) {
                session.setAttribute("log", user.login);
                return "lobby";
            }
        }
        session.setAttribute("error","error");
        return "auth";
    }

    @GetMapping("/lobby")
    public String lobby(HttpSession session) {
        if (session.getAttribute("log") != null) {
            return "lobby";
        }
        return "redirect:/auth";
    }

    @GetMapping("/list")
    public ModelAndView listOfUsers(HttpSession session) {
        ModelAndView view = new ModelAndView("/list");
        view.addObject("users", users);
        if (session.getAttribute("log") != null) {
            return view;
        } else {
            view.setViewName("auth");
            return view;
        }
    }
}

