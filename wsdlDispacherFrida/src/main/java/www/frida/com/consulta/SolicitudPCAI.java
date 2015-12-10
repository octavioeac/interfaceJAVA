

package www.frida.com.consulta;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitudPCAI", propOrder = {
    "tipoContrato",
    "tipoConcentracion",
    "movimiento",
    "folioSC",
    "siglaCentral",
    "claveOperador"
    
})
public class SolicitudPCAI {

    @XmlElement(required = true)
    protected String tipoContrato;
    @XmlElement(required = true)
    protected String tipoConcentracion;
    
    @XmlElement(required = true)
    protected String movimiento;

    
    @XmlElement(required = true)
    protected String folioSC;


    @XmlElementWrapper(name = "siglas")
    @XmlElement(required = true)
    protected List<String> siglaCentral;
    
    
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


	public List<String> getSiglaCentral() {
		return siglaCentral;
	}


	public void setSiglaCentral(List<String> siglaCentral) {
		this.siglaCentral = siglaCentral;
	}


	public String getClaveOperador() {
		return claveOperador;
	}


	public void setClaveOperador(String claveOperador) {
		this.claveOperador = claveOperador;
	}

    

}
