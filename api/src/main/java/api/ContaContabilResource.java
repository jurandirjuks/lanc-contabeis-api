package api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.ContaContabilService;
import to.ContaContabilTO;

@RestController
public class ContaContabilResource {

    @Autowired
    private ContaContabilService contaContabilService;

    @RequestMapping(path = "/conta-contabil",method = RequestMethod.POST)
    public @ResponseBody String createContaContabil(@RequestBody ContaContabilTO contaContabilTO) {


        return super.toString();
    }
}
