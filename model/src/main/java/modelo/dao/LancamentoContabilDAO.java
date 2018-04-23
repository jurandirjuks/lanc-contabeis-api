package modelo.dao;

import modelo.entidades.ContaContabil;
import modelo.entidades.LancamentoContabil;
import modelo.repository.ContaContabilRepository;
import modelo.repository.LancamentoContabilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.*;

@Component
public class LancamentoContabilDAO {

    @Autowired
    private LancamentoContabilRepository lancamentoContabilRepository;

    @Autowired
    private ContaContabilRepository contaContabilRepository;


    public LancamentoContabil createAndSaveLancContabil(long contacontabil, Date data, BigDecimal valor) throws RuntimeException {
        Optional<ContaContabil> cc = contaContabilRepository.findById(contacontabil);
        if(!cc.isPresent()){
            throw new RuntimeException("Conta contabil não existe");
        }
        LancamentoContabil lancamentoContabil = new LancamentoContabil();
        lancamentoContabil.setDataLancamento(data);
        lancamentoContabil.setValor(valor);
        lancamentoContabil.setContaContabil(cc.get());
        lancamentoContabil.setId(lancamentoContabil.generateID());
        LancamentoContabil save = lancamentoContabilRepository.save(lancamentoContabil);
        return save;
    }

    public LancamentoContabil findLancamentoBy(String id) {
        Optional<LancamentoContabil> lancamentoContabil = this.lancamentoContabilRepository.findById(id);
        if(!lancamentoContabil.isPresent()){
            throw new RuntimeException("Lancamento contabil nao existe");
        }
        return lancamentoContabil.get();
    }


    public List<LancamentoContabil> findByConta(long contaContabil) {
        return lancamentoContabilRepository.findByContaContabil_id(contaContabil);
    }

    public List<LancamentoContabil> findAll() {
        return (List<LancamentoContabil>) this.lancamentoContabilRepository.findAll();
    }
}
