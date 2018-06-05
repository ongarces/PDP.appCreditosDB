package co.com.poli.appcreditos.business.impl;

import co.com.poli.appcreditos.business.ICreditoBusiness;
import co.com.poli.appcreditos.dao.impl.CreditoDaoImpl;
import co.com.poli.appcreditos.model.Credito;
import co.com.poli.appcreditos.model.Tblcreditos;
import java.util.List;

/**
 *
 * @author cgaop
 */
public class CreditoBusinessImpl implements ICreditoBusiness {

    private CreditoDaoImpl creditoDaoImpl = new CreditoDaoImpl();

    @Override
    public List<Tblcreditos> obtenerListaCreditos() {
        return creditoDaoImpl.obtenerListaCreditos();
    }

    @Override
    public String crearCredito(Tblcreditos credito) {
        return creditoDaoImpl.crearCredito(credito);
    }

    @Override
    public Credito obtenerCredito(String numero) {
        return creditoDaoImpl.obtenerCredito(numero);
    }

    @Override
    public String creditoMasUsado() {
        int acumVivienda = 0, acumEstudio = 0, acumInversion = 0;
        String mensaje = "";

        List<Tblcreditos> listaCreditos = creditoDaoImpl.obtenerListaCreditos();

        for (Tblcreditos listaCredito : listaCreditos) {
            if (listaCredito.getTipocredito().equalsIgnoreCase("vivienda")) {
                acumVivienda++;
            } else if (listaCredito.getTipocredito().equalsIgnoreCase("estudio")) {
                acumEstudio++;
            } else {
                acumInversion++;
            }
        }//finFor

        if (acumEstudio > acumInversion && acumEstudio > acumVivienda) {
            mensaje = "El tipo de credito mas usado es para Estudio";
        } else if (acumInversion > acumEstudio && acumInversion > acumVivienda) {
            mensaje = "El tipo de credito mas usado es para Inversion";
        } else if (acumVivienda > acumEstudio && acumVivienda > acumInversion) {
             mensaje = "El tipo de credito mas usado es para Vivienda";
        }else{
            mensaje = "No existe un credito que sea el mas usado";
        }
        return mensaje;
    }

    @Override
    public String acumuladoCreditos() {
        String msj ="";
        Double vivienda = 0.0;
        Double estudio = 0.0;
        Double inversion = 0.0;
        List<Tblcreditos> listaCreditos = creditoDaoImpl.obtenerListaCreditos();
        for (Tblcreditos listaCredito : listaCreditos) {
            if (listaCredito.getTipocredito().equalsIgnoreCase("vivienda")) {
                vivienda = vivienda + Double.parseDouble(listaCredito.getMonto().toString());
            }else if (listaCredito.getTipocredito().equalsIgnoreCase("estudio")) {
                estudio = estudio + Double.parseDouble(listaCredito.getMonto().toString());
            }else if (listaCredito.getTipocredito().equalsIgnoreCase("inversion")) {
                inversion = inversion + Double.parseDouble(listaCredito.getMonto().toString());
            }
        }
        
        if (vivienda > estudio && vivienda > inversion) {
            msj = "Credito de vivienda con un valor acumulado de: " + vivienda;
        }else if (estudio > vivienda && estudio > inversion) {
            msj = "Credito de estudio con un valor acumulado de: " + estudio;
        }else if (inversion > vivienda && inversion > estudio) {
            msj = "Credito de inversion con un valor acumulado de: " + inversion;
        }        
        
        return msj;
        
    }

    @Override
    public String mayorPrestamista() {
        String mensaje ="";
        int contadorIND = 0;
        int contadorDEP = 0;
        List<Tblcreditos> listaCreditos = creditoDaoImpl.obtenerListaCreditos();
        for (Tblcreditos listaCredito : listaCreditos) {
            if (listaCredito.getTipotrabajador().equalsIgnoreCase("independiente")) {
                contadorIND++;
            }else if (listaCredito.getTipotrabajador().equalsIgnoreCase("dependiente")) {
                contadorDEP++;
            }
        }
        
        if (contadorIND > contadorDEP) {
            mensaje = "Prestan mas los independientes con " + contadorIND + " creditos";
        }else if (contadorDEP > contadorIND) {
            mensaje = "Prestan mas los dependientes con " + contadorDEP + " creditos";
        }else{
            mensaje = "Prestan en igual proporcion los dependientes e independientes";
        }
        
        return mensaje;
    }

    @Override
    public Boolean creditoExiste(String documento, String tipoCredito) {
        Boolean sw = false;
        List<Tblcreditos> listaCreditos = creditoDaoImpl.obtenerListaCreditos();
        for (Tblcreditos listaCredito : listaCreditos) {
            if (listaCredito.getDocumento().equals(documento)) {//si existe el documento
                if (listaCredito.getTipocredito().equals(tipoCredito)) {//si este documento tiene el mismo tipo de credito
                    sw = true;
                }
            }
        }
        return sw;
    }

}
