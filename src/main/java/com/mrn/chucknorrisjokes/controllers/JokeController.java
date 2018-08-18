package com.mrn.chucknorrisjokes.controllers;

import com.mrn.chucknorrisjokes.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""}) // map out the context
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris"; // returns the view - we need to create this view (html file named after the view)
    }
}
