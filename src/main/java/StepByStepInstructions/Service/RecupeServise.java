package StepByStepInstructions.Service;


import StepByStepInstructions.model.Recipe;

import java.util.List;

public interface RecupeServise {

    Recipe addRecipe(Recipe recipe);
    Recipe getByName(String name);
    Recipe getById(Integer id);
    void upgrade(Recipe recipe);
    List<Recipe> getAll();
    List<Recipe> findBest();
}
