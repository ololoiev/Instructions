package StepByStepInstructions.Service;

import StepByStepInstructions.model.User;

import java.util.List;

public interface UserServise {

    User addUser(User user);
    User getByName(String name);
    User getById(Integer id);
    void upgrade(User user);
    List<User> getAll();
}
