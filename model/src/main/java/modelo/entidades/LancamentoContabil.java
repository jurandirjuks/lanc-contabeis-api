package modelo.entidades;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "LANCAMENTO_CONTABIL")
public class LancamentoContabil  {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private ContaContabil contaContabil;

    @Column(nullable = false)
    private Date dataLancamento;

    @Column(nullable = false)
    private BigDecimal valor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ContaContabil getContaContabil() {
        return contaContabil;
    }

    public void setContaContabil(ContaContabil contaContabil) {
        this.contaContabil = contaContabil;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
