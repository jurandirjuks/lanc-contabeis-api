package services;

import modelo.entidades.LancamentoContabil;
import org.springframework.stereotype.Component;
import to.StatisticsTO;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;

@Component
public class StatisticsService {
    public StatisticsTO generate(List<LancamentoContabil> lancamentos) {
        if (lancamentos == null || lancamentos.size() == 0) {
            return new StatisticsTO();
        }

        BigDecimal soma = lancamentos.stream().map(LancamentoContabil::getValor).reduce(BigDecimal::add).get();
        BigDecimal media = soma.divide(BigDecimal.valueOf(lancamentos.size()));
        BigDecimal max = lancamentos.stream().max(Comparator.comparing(LancamentoContabil::getValor)).get().getValor();
        BigDecimal min = lancamentos.stream().min(Comparator.comparing(LancamentoContabil::getValor)).get().getValor();

        StatisticsTO to = new StatisticsTO();
        to.setSoma(soma);
        to.setMax(max);
        to.setMin(min);
        to.setMedia(media);
        to.setQtde(lancamentos.size());
        return to;
    }
}
