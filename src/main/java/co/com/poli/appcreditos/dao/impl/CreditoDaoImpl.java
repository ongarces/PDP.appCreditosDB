package co.com.poli.appcreditos.dao.impl;

import co.com.poli.appcreditos.dao.ICreditoDao;
import co.com.poli.appcreditos.data.CreditoData;
import co.com.poli.appcreditos.jpacontroller.TblcreditosJpaController;
import co.com.poli.appcreditos.model.Credito;
import co.com.poli.appcreditos.model.Tblcreditos;
import co.com.poli.appcreditos.util.JPAFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cgaop
 */
public class CreditoDaoImpl implements ICreditoDao{

    @Override
    public List<Tblcreditos> obtenerListaCreditos() {        
        List<Tblcreditos> listaCreditos = new ArrayList<>();
        TblcreditosJpaController tblcreditosJpaController = new TblcreditosJpaController(JPAFactory.getFACTORY());
        listaCreditos = tblcreditosJpaController.findTblcreditosEntities();        
        return listaCreditos;
    }

    @Override
    public String crearCredito(Tblcreditos credito) {
        try {
            TblcreditosJpaController tblcreditosJpaController = new TblcreditosJpaController(JPAFactory.getFACTORY());
            tblcreditosJpaController.create(credito);
        } catch (Exception ex) {
            Logger.getLogger(CreditoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Credito creado";
    }

    @Override
    public Credito obtenerCredito(String numero) {
        Credito credito = null;
        List<Credito> listaCreditos = CreditoData.getListaCreditos();
        
        for (Credito credit : listaCreditos) {
            if (credit.getCredito().equals(numero)) {
                credito = credit;
            }
        }
        return credito;
    }
}
