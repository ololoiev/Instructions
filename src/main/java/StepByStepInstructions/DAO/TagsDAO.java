package StepByStepInstructions.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import StepByStepInstructions.model.Tags;

@Repository
public interface TagsDAO extends JpaRepository<Tags, Integer> {
}
