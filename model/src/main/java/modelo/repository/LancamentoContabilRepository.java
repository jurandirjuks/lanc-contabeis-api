package modelo.repository;

import modelo.entidades.LancamentoContabil;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LancamentoContabilRepository extends org.springframework.data.repository.CrudRepository<LancamentoContabil,String>{

    List<LancamentoContabil> findByContaContabil_id(long contaContabil);
}
