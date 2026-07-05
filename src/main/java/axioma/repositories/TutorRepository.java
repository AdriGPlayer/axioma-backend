package axioma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import axioma.models.TutorModel;

public interface TutorRepository extends JpaRepository<TutorModel, Long> {

}
