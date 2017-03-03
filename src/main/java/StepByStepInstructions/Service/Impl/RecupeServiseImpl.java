package StepByStepInstructions.Service.Impl;


import StepByStepInstructions.Service.RecupeServise;
import org.springframework.beans.factory.annotation.Autowired;
import StepByStepInstructions.DAO.RecipeDAO;
import StepByStepInstructions.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.List;


public class RecupeServiseImpl implements RecupeServise{
    @Autowired
    private RecipeDAO recipeDAO;

    public Recipe addRecipe(Recipe recipe){
        Recipe savedUser = recipeDAO.saveAndFlush(recipe);

        return savedUser;
    }
    public Recipe getByName(String name){
        return recipeDAO.findByName(name);
    }
    public Recipe getById(Integer id){
        return recipeDAO.findOne(id);
    }
    public void upgrade(Recipe recipe, String name){
        recipe.setName(name);
        recipeDAO.saveAndFlush(recipe);
    }
    public List<Recipe> getAll(){
        return recipeDAO.findAll();
    }

    public List<Recipe> findBest(){return recipeDAO.findBest();}
}
