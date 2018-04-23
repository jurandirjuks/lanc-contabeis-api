package modelo.entidades;

import javax.persistence.*;

@Entity
@Table(name = "CONTA_CONTABIL")
public class ContaContabil {

    public ContaContabil() {
    }

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Long numero;

    @Column(nullable = false)
    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
