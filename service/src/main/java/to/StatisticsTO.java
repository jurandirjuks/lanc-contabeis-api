package to;

import java.math.BigDecimal;

public class StatisticsTO {

    private BigDecimal soma;

    private BigDecimal min;

    private  BigDecimal max;

    private BigDecimal media;

    private Integer qtde;

    public StatisticsTO(){
        this.soma = BigDecimal.ZERO;
        this.min = BigDecimal.ZERO;
        this.max = BigDecimal.ZERO;
        this.media = BigDecimal.ZERO;
        this.qtde = 0;
    }

    public BigDecimal getSoma() {
        return soma;
    }

    public void setSoma(BigDecimal soma) {
        this.soma = soma;
    }

    public BigDecimal getMin() {
        return min;
    }

    public void setMin(BigDecimal min) {
        this.min = min;
    }

    public BigDecimal getMax() {
        return max;
    }

    public void setMax(BigDecimal max) {
        this.max = max;
    }

    public BigDecimal getMedia() {
        return media;
    }

    public void setMedia(BigDecimal media) {
        this.media = media;
    }

    public Integer getQtde() {
        return qtde;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }
}
