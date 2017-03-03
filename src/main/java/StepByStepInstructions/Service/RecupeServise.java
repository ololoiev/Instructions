package StepByStepInstructions.Service;


import StepByStepInstructions.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RecupeServise {

    Recipe addRecipe(Recipe recipe);
    Recipe getByName(String name);
    Recipe getById(Integer id);
    List<Recipe> getAll();
    List<Recipe> findBest();
}
