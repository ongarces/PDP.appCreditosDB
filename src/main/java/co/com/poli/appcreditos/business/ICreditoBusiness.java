package co.com.poli.appcreditos.business;

import co.com.poli.appcreditos.model.Credito;
import co.com.poli.appcreditos.model.Tblcreditos;
import java.util.List;

/**
 *
 * @author cgaop
 */
public interface ICreditoBusiness {

    List<Tblcreditos> obtenerListaCreditos();

    String crearCredito(Tblcreditos credito);

    Credito obtenerCredito(String numero);
    
    Boolean creditoExiste(String documento, String tipoCredito);
    
    String creditoMasUsado();
    String acumuladoCreditos();
    String mayorPrestamista();

}
