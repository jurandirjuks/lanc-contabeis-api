package services;

import org.junit.Test;
import to.StatisticsTO;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.Assert.*;


public class StatisticsActorTest {

    private StatisticsService statisticsService = new StatisticsService();


    @Test
    public void testaZeroLancamentos(){
        StatisticsTO to = statisticsService.generate(new ArrayList<>());

        assertEquals(BigDecimal.ZERO,to.getMax());
        assertEquals(BigDecimal.ZERO,to.getMin());
        assertEquals(BigDecimal.ZERO,to.getSoma());
        assertEquals(BigDecimal.ZERO,to.getMedia());
        assertEquals(Integer.valueOf(0),to.getQtde());
    }

    @Test
    public void testaVariosLancamentos(){
        StatisticsTO to = statisticsService.generate(new ArrayList<>());

        assertEquals(BigDecimal.ZERO,to.getMax());
        assertEquals(BigDecimal.ZERO,to.getMin());
        assertEquals(BigDecimal.ZERO,to.getSoma());
        assertEquals(BigDecimal.ZERO,to.getMedia());
        assertEquals(Integer.valueOf(0),to.getQtde());
    }

}