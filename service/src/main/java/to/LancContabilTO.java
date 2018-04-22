package to;

import java.math.BigDecimal;
import java.util.Date;

public class LancContabilTO {

    private long contacontabil;

    private Date data;

    private BigDecimal valor;

    public long getContacontabil() {
        return contacontabil;
    }

    public void setContacontabil(long contacontabil) {
        this.contacontabil = contacontabil;
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
}
