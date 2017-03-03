package StepByStepInstructions.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import StepByStepInstructions.model.Recipe;

import java.util.List;

@Repository
public interface RecipeDAO extends JpaRepository<Recipe, Integer>{
    List<Recipe> findAll();
    @Query("select r from recipe r where r.name = :name")
    Recipe findByName(@Param("name") String NAME);
    @Query("select r from recipe r, rating g where r.id= g.ID_RECIPE " +
            "group by r.id, r.NAME, r.ID_USER, r.ID_CATEGORY, r.VIDEO order by avg (g.mark)")
    Recipe findBest();

}
