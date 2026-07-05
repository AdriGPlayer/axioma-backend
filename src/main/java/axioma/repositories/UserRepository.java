package axioma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import axioma.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

}
