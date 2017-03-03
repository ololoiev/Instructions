package StepByStepInstructions.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import StepByStepInstructions.DAO.UserDAO;
import StepByStepInstructions.Service.UserServise;
import StepByStepInstructions.model.User;

import java.util.List;

public class UserServiseImpl implements UserServise {

    @Autowired
    private UserDAO userDAO;

    public User addUser(User user){
        User savedUser = userDAO.saveAndFlush(user);

        return savedUser;
    }
    public User getByName(String name){
        return userDAO.findByName(name);
    }
    public User getById(Integer id){
        return userDAO.findById(id);
    }
    public void upgrade(User user){
        user.setID_ROLE("Admin");
        userDAO.saveAndFlush(user);
    }
    public List<User> getAll(){
        return userDAO.findAll();
    }
}
