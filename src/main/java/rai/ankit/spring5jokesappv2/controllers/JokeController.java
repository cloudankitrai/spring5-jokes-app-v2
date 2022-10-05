package rai.ankit.spring5jokesappv2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import rai.ankit.spring5jokesappv2.services.JokesService;

@Controller
public class JokeController {

    private final JokesService jokesService;


    public JokeController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke",jokesService.getJoke());
        return "index";
    }
}
