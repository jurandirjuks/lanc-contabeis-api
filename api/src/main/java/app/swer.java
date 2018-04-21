package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.ContabilService;

@RestController
public class swer {

    @Autowired
    private ContabilService contabilService;

    @RequestMapping("/hello")
    public String teste() {
        return contabilService.teste();
    }
}
