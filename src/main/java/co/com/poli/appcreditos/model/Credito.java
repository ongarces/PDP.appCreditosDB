package co.com.poli.appcreditos.model;

import java.util.Objects;

/**
 *
 * @author cgaop
 */
public class Credito {
    
    private String credito;
    private String documento;
    private String nombres;
    
    private double montoPrestar;
    private String tipoTrabajador;
    private String tipoCredito;
    private String vinculado;

    public Credito() {
    }

    public Credito(String credito, String documento, String nombres, double montoPrestar, String tipoTrabajador, String tipoCredito, String vinculado) {
        this.credito = credito;
        this.documento = documento;
        this.nombres = nombres;
        this.montoPrestar = montoPrestar;
        this.tipoTrabajador = tipoTrabajador;
        this.tipoCredito = tipoCredito;
        this.vinculado = vinculado;
    }

    public String isVinculado() {
        return vinculado;
    }

    public void setVinculado(String vinculado) {
        this.vinculado = vinculado;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public double getMontoPrestar() {
        return montoPrestar;
    }

    public void setMontoPrestar(double montoPrestar) {
        this.montoPrestar = montoPrestar;
    }

    public String getTipoTrabajador() {
        return tipoTrabajador;
    }

    public void setTipoTrabajador(String tipoTrabajador) {
        this.tipoTrabajador = tipoTrabajador;
    }

    public String getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.credito);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Credito other = (Credito) obj;
        if (!Objects.equals(this.credito, other.credito)) {
            return false;
        }
        return true;
    }    
    
}
