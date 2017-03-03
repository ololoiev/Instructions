package StepByStepInstructions.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import StepByStepInstructions.model.Categories;

@Repository
public interface CategoriesDAO extends JpaRepository<Categories, String> {
}
