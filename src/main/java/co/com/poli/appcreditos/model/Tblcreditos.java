package co.com.poli.appcreditos.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cgaop
 */
@Entity
@Table(name = "tblcreditos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblcreditos.findAll", query = "SELECT t FROM Tblcreditos t")
    , @NamedQuery(name = "Tblcreditos.findByIdcredito", query = "SELECT t FROM Tblcreditos t WHERE t.idcredito = :idcredito")
    , @NamedQuery(name = "Tblcreditos.findByDocumento", query = "SELECT t FROM Tblcreditos t WHERE t.documento = :documento")
    , @NamedQuery(name = "Tblcreditos.findByNombres", query = "SELECT t FROM Tblcreditos t WHERE t.nombres = :nombres")
    , @NamedQuery(name = "Tblcreditos.findByMonto", query = "SELECT t FROM Tblcreditos t WHERE t.monto = :monto")
    , @NamedQuery(name = "Tblcreditos.findByVinculado", query = "SELECT t FROM Tblcreditos t WHERE t.vinculado = :vinculado")
    , @NamedQuery(name = "Tblcreditos.findByTipotrabajador", query = "SELECT t FROM Tblcreditos t WHERE t.tipotrabajador = :tipotrabajador")
    , @NamedQuery(name = "Tblcreditos.findByTipocredito", query = "SELECT t FROM Tblcreditos t WHERE t.tipocredito = :tipocredito")})
public class Tblcreditos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "idcredito")
    private String idcredito;
    @Size(max = 50)
    @Column(name = "documento")
    private String documento;
    @Size(max = 50)
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "monto")
    private BigInteger monto;
    @Size(max = 5)
    @Column(name = "vinculado")
    private String vinculado;
    @Size(max = 50)
    @Column(name = "tipotrabajador")
    private String tipotrabajador;
    @Size(max = 50)
    @Column(name = "tipocredito")
    private String tipocredito;

    public Tblcreditos() {
    }

    public Tblcreditos(String idcredito) {
        this.idcredito = idcredito;
    }

    public Tblcreditos(String idcredito, String documento, String nombres, BigInteger monto, String vinculado, String tipotrabajador, String tipocredito) {
        this.idcredito = idcredito;
        this.documento = documento;
        this.nombres = nombres;
        this.monto = monto;
        this.vinculado = vinculado;
        this.tipotrabajador = tipotrabajador;
        this.tipocredito = tipocredito;
    }    
    

    public String getIdcredito() {
        return idcredito;
    }

    public void setIdcredito(String idcredito) {
        this.idcredito = idcredito;
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

    public BigInteger getMonto() {
        return monto;
    }

    public void setMonto(BigInteger monto) {
        this.monto = monto;
    }

    public String getVinculado() {
        return vinculado;
    }

    public void setVinculado(String vinculado) {
        this.vinculado = vinculado;
    }

    public String getTipotrabajador() {
        return tipotrabajador;
    }

    public void setTipotrabajador(String tipotrabajador) {
        this.tipotrabajador = tipotrabajador;
    }

    public String getTipocredito() {
        return tipocredito;
    }

    public void setTipocredito(String tipocredito) {
        this.tipocredito = tipocredito;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcredito != null ? idcredito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblcreditos)) {
            return false;
        }
        Tblcreditos other = (Tblcreditos) object;
        if ((this.idcredito == null && other.idcredito != null) || (this.idcredito != null && !this.idcredito.equals(other.idcredito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.poli.appcreditos.model.Tblcreditos[ idcredito=" + idcredito + " ]";
    }
    
}
