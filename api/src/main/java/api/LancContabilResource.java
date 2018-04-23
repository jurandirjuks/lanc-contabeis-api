package api;

import api.responses.ResponseID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;
import to.LancContabilTO;
import services.LancamentoContabilService;
import to.StatisticsTO;

import java.util.List;

@RestController
@RequestMapping(path = "/lancamentos-contabeis")
public class LancContabilResource {

    @Autowired
    private LancamentoContabilService lancamentoContabilService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<LancContabilTO> findLancContabil(@PathVariable String id) {
        LancContabilTO lancamento = lancamentoContabilService.findLancamento(id);
        return new ResponseEntity(lancamento, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<LancContabilTO> findLancContabilByConta(@RequestParam long contaContabil) {
        List<LancContabilTO> lancamentos = lancamentoContabilService.findLancamentoByConta(contaContabil);
        return new ResponseEntity(lancamentos, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity<ResponseID> createLanContabil(@RequestBody LancContabilTO lancContabilTO) {
        String andSaveLancContabil = lancamentoContabilService.createAndSaveLancContabil(lancContabilTO);
        return new ResponseEntity(new ResponseID(andSaveLancContabil), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/_stats", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<StatisticsTO> findLancContabilByConta(@RequestParam(required = false)  Long contaContabil) {
        StatisticsTO statisticsTO = lancamentoContabilService.generateStatistics(contaContabil);
        return new ResponseEntity(statisticsTO, HttpStatus.OK);
    }
}
