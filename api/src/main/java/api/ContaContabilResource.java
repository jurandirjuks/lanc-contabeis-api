package api;

import api.responses.ResponseID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.ContaContabilService;
import to.ContaContabilTO;

@RestController
public class ContaContabilResource {

    @Autowired
    private ContaContabilService contaContabilService;

    @RequestMapping(path = "/conta-contabil",method = RequestMethod.POST)
    public @ResponseBody
    ResponseID createContaContabil(@RequestBody ContaContabilTO contaContabilTO) {
        Long contaContabilID = contaContabilService.createContaContabil(contaContabilTO.getNumero(),
                contaContabilTO.getDescricao());
        return new ResponseID(contaContabilID.toString());
    }
}
