package to;

import modelo.entidades.LancamentoContabil;

import java.math.BigDecimal;
import java.util.Date;

public class LancContabilTO {

    private long contaContabil;

    private Date data;

    private BigDecimal valor;

    public long getContaContabil() {
        return contaContabil;
    }

    public void setContaContabil(long contaContabil) {
        this.contaContabil = contaContabil;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public static LancContabilTO createFrom(LancamentoContabil lancamentoContabil) {
        LancContabilTO to = new LancContabilTO();
        to.setValor(lancamentoContabil.getValor());
        to.setData(lancamentoContabil.getDataLancamento());
        to.setContaContabil(lancamentoContabil.getContaContabil().getId());
        return to;
    }

}
