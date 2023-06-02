package ke.co.mspace.ClientManager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import java.util.Optional;
@Repository
public interface UserRepo extends JpaRepository<ke.co.mspace.ClientManager.entity.User,Integer> {
    Optional<ke.co.mspace.ClientManager.entity.User> findByUsername(String username);


}
