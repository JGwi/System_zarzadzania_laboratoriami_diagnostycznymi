package pl.javaproject.labmaster_02.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.javaproject.labmaster_02.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
