package modelo.entidades;

import org.springframework.util.DigestUtils;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "LANCAMENTO_CONTABIL")
public class LancamentoContabil  {

    @Id
    private String id;

    @ManyToOne
    private ContaContabil contaContabil;

    @Column(nullable = false)
    private Date dataLancamento;

    @Column(nullable = false)
    private BigDecimal valor;


    public LancamentoContabil() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    @Transient
    public String generateID(){
        String id = DigestUtils.md5DigestAsHex(this.toString().getBytes());
        StringBuilder b = new StringBuilder(id);
        b.insert(8,"-");
        b.insert(13,"-");
        b.insert(18,"-");
        b.insert(23,"-");
        return b.toString();
    }
}
