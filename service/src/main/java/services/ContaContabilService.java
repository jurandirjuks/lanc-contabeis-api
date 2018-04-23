package services;

import modelo.entidades.ContaContabil;
import modelo.repository.ContaContabilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaContabilService {

    @Autowired
    private ContaContabilRepository contaContabilRepository;

    public Long createContaContabil(long numero, String descricao) {
        ContaContabil contaContabil = new ContaContabil();
        contaContabil.setNumero(numero);
        contaContabil.setDescricao(descricao);
        contaContabilRepository.save(contaContabil);
        return contaContabil.getId();
    }
}
