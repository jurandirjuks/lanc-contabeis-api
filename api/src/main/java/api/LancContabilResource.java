package api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import to.LancContabilTO;
import services.LancamentoContabilService;

@RestController
public class LancContabilResource {

    @Autowired
    private LancamentoContabilService lancamentoContabilService;

    @RequestMapping(value = "/lancamentos-contabeis" ,method = RequestMethod.POST)
    public @ResponseBody Long createLanContabil(@RequestBody LancContabilTO lancContabilTO) {
        return lancamentoContabilService.createAndSaveLancContabil(lancContabilTO);
    }
}
