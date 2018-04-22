package modelo.repository;

import modelo.entidades.ContaContabil;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaContabilRepository extends CrudRepository<ContaContabil,Long>{
}
