package axioma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import axioma.models.AlumnoModel;

public interface AlumnoRepository extends JpaRepository<AlumnoModel, Long> {

}
