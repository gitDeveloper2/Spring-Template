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
        log.info("user details service called with {}",username);
        Optional<ke.co.mspace.ClientManager.entity.User> fetchedUser=userRepository.findByUsername(username);

        if(fetchedUser.isPresent()){
            log.info("user found");
            MyUserDetails myUserDetails=new MyUserDetails(fetchedUser.get());
            System.out.println(myUserDetails.getAuthorities());
          return myUserDetails; }
        else{
            log.info("user not found");
//            throw new UserNotLoggedInException("stupid");
            throw new UsernameNotFoundException("UserRepo not found");
        }
    }
}
