package StepByStepInstructions.controllers;

import StepByStepInstructions.DAO.RecipeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    private RecipeDAO recipeDAO;

    @RequestMapping("/")
    public ModelAndView jumpToMain() {return new ModelAndView("main", "recipe", recipeDAO.findBest());}

    @RequestMapping("/main")
    public ModelAndView listMain() {return new ModelAndView("main", "recipe", recipeDAO.findBest());}

}
