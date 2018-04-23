package services;

import modelo.dao.LancamentoContabilDAO;
import modelo.entidades.LancamentoContabil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import to.LancContabilTO;
import to.StatisticsTO;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LancamentoContabilService {

    @Autowired
    private LancamentoContabilDAO lancamentoContabilDAO;

    @Autowired
    private StatisticsService statisticsService;

    public String createAndSaveLancContabil(LancContabilTO lancContabilTO) {
        LancamentoContabil andSaveLancContabil = lancamentoContabilDAO.createAndSaveLancContabil(
                lancContabilTO.getContaContabil(), lancContabilTO.getData(), lancContabilTO.getValor());
        return andSaveLancContabil.getId();
    }

    public LancContabilTO findLancamento(String id) {
        LancamentoContabil lancamento = this.lancamentoContabilDAO.findLancamentoBy(id);
        LancContabilTO to = new LancContabilTO();
        to.setContaContabil(lancamento.getContaContabil().getId());
        to.setData(lancamento.getDataLancamento());
        to.setValor(lancamento.getValor());
        return to;
    }

    public List<LancContabilTO> findLancamentoByConta(long contaContabil) {
        List<LancamentoContabil> lancamentos = lancamentoContabilDAO.findByConta(contaContabil);
        return lancamentos.stream().map(LancContabilTO::createFrom).collect(Collectors.toList());
    }

    public StatisticsTO generateStatistics(Long contaContabil) {
        List<LancamentoContabil> lancamentos;
        if (contaContabil != null){
           lancamentos = lancamentoContabilDAO.findByConta(contaContabil);
        } else {
            lancamentos = lancamentoContabilDAO.findAll();
        }

        return statisticsService.generate(lancamentos);
    }
}
