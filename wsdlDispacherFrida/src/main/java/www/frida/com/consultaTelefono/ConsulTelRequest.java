package www.frida.com.consultaTelefono;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="consulTelRequest",
propOrder={
	    "tipoContrato",
	    "tipoConcentracion",
	    "movimiento",
	    "folioSC",
	    "siglaCentral",
	    "claveOperador"
})
public class ConsulTelRequest {
	

    @XmlElement(required = true)
    protected String tipoContrato;
    @XmlElement(required = true)
    protected String tipoConcentracion;
    @XmlElement(required = true)
    protected String movimiento;

    @XmlElement(required = true)
    protected String folioSC;
    @XmlElement(required = true)
    protected String numero;
  
    @XmlElement(required = true)
    protected String equipoAcceso;
    
    
    @XmlElement(required = true)
    protected String claveOperador;


	public String getTipoContrato() {
		return tipoContrato;
	}


	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}


	public String getTipoConcentracion() {
		return tipoConcentracion;
	}


	public void setTipoConcentracion(String tipoConcentracion) {
		this.tipoConcentracion = tipoConcentracion;
	}


	public String getMovimiento() {
		return movimiento;
	}


	public void setMovimiento(String movimiento) {
		this.movimiento = movimiento;
	}


	public String getFolioSC() {
		return folioSC;
	}


	public void setFolioSC(String folioSC) {
		this.folioSC = folioSC;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getEquipoAcceso() {
		return equipoAcceso;
	}


	public void setEquipoAcceso(String equipoAcceso) {
		this.equipoAcceso = equipoAcceso;
	}


	public String getClaveOperador() {
		return claveOperador;
	}


	public void setClaveOperador(String claveOperador) {
		this.claveOperador = claveOperador;
	}


	




}
