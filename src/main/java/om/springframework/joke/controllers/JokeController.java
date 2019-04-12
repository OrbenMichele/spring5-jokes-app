package om.springframework.joke.controllers;

import om.springframework.joke.services.JokeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeServiceImpl jokeService;

    @Autowired
    public JokeController(JokeServiceImpl jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String showJoke(Model model){

        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
}
