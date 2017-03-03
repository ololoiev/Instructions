package StepByStepInstructions.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;
import StepByStepInstructions.DAO.UserDAO;
import StepByStepInstructions.model.User;

import java.util.HashSet;
import java.util.Set;

public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserDAO userDao;

    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByName(username);

        Set<GrantedAuthority> grantedAuthorities = new HashSet<GrantedAuthority>();


            grantedAuthorities.add(new SimpleGrantedAuthority(user.getID_ROLE()));

        return new org.springframework.security.core.userdetails.User(user.getUSER(), user.getUSER_NAME(), grantedAuthorities);
    }
}
