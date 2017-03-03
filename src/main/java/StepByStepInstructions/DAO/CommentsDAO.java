package StepByStepInstructions.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import StepByStepInstructions.model.Comments;

@Repository
public interface CommentsDAO extends JpaRepository<Comments, Integer> {
}
