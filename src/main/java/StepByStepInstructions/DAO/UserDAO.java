package StepByStepInstructions.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import StepByStepInstructions.model.User;

public interface UserDAO extends JpaRepository<User, Integer> {
    User findById(Integer id);
    @Query("select u from users u where u.user = :name")
    User findByName(@Param("name") String USER);
}
