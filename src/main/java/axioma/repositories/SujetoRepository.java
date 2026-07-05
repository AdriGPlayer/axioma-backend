package axioma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import axioma.models.SujetoModel;

public interface SujetoRepository extends JpaRepository<SujetoModel, Long> {

}
