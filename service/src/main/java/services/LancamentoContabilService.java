package services;

import modelo.dao.LancamentoContabilDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import to.LancContabilTO;

@Service
public class LancamentoContabilService {

    @Autowired
    private LancamentoContabilDAO lancamentoContabilDAO;


    public Long createAndSaveLancContabil(LancContabilTO lancContabilTO) {
        return null;
    }
}
