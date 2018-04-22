package modelo.dao;

import modelo.repository.ContaContabilRepository;
import modelo.repository.LancamentoContabilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LancamentoContabilDAO {

    @Autowired
    private LancamentoContabilRepository lancamentoContabilRepository;

    @Autowired
    private ContaContabilRepository contaContabilRepository;


}
