package StepByStepInstructions.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import StepByStepInstructions.model.Steps;


public interface StepsDAO extends JpaRepository<Steps, Integer> {
}
