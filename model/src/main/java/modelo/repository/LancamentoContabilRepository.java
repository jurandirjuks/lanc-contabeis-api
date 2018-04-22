package modelo.repository;

import modelo.entidades.LancamentoContabil;
import org.springframework.stereotype.Repository;

@Repository
public interface LancamentoContabilRepository extends org.springframework.data.repository.CrudRepository<LancamentoContabil,Long>{

}
