package StepByStepInstructions.controllers;

import StepByStepInstructions.DAO.RecipeDAO;
import StepByStepInstructions.Service.Impl.RecupeServiseImpl;
import StepByStepInstructions.Service.RecupeServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    private RecipeDAO recipeDAO;

    @Autowired
    private RecupeServise recupeServise;

    @RequestMapping("/")
    public ModelAndView jumpToMain() {return new ModelAndView("main", "recipe", recipeDAO.findBest());}

    @RequestMapping("/main")
    public ModelAndView listMain() {return new ModelAndView("main", "recipe", recupeServise.findBest());}

}
