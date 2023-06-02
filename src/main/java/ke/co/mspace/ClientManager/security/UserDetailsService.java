package ke.co.mspace.ClientManager.security;
import ke.co.mspace.ClientManager.exceptions.UserNotLoggedInException;
import ke.co.mspace.ClientManager.repositories.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.Optional;

@Service
@Slf4j
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
    @Autowired
    UserRepo userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<ke.co.mspace.ClientManager.entity.User> fetchedUser=userRepository.findByUsername(username);

        if(fetchedUser.isPresent()){

            MyUserDetails myUserDetails=new MyUserDetails(fetchedUser.get());
            log.info("user {} found with privileges {}",myUserDetails.getUsername(),myUserDetails.getAuthorities());

          return myUserDetails; }
        else{
            log.error("user {} not found",username);
            throw new UsernameNotFoundException("UserRepo {} not found");
        }
    }
}
