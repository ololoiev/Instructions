package StepByStepInstructions.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import StepByStepInstructions.model.Rating;


@Repository
public interface RatingDAO extends JpaRepository<Rating, Integer> {
}
