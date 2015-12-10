package www.frida.com.consulta.ContratacionColonia;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import www.frida.com.consulta.Errores;
import www.frida.com.consulta.Regiones;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="objetoContratacionContulta",propOrder={
		"folioSC",
		"tipoConcentracion",
		"claveOperador",
		"region",
		"err"
})
public class ObjetoContratacionContulta {
	
	
	@XmlElement(required=true)
	protected String folioSC;
	@XmlElement(required=true)
	protected String tipoConcentracion;
	@XmlElement(required=true)
	protected String claveOperador;
	
	@XmlElement(required=true)
	protected  List<RegionesConsultaColonia> region;
	
	@XmlElement(required=true)
	protected Errores err;

	public String getFolioSC() {
		return folioSC;
	}

	public void setFolioSC(String folioSC) {
		this.folioSC = folioSC;
	}

	public String getTipoConcentracion() {
		return tipoConcentracion;
	}

	public void setTipoConcentracion(String tipoConcentracion) {
		this.tipoConcentracion = tipoConcentracion;
	}

	public String getClaveOperador() {
		return claveOperador;
	}

	public void setClaveOperador(String claveOperador) {
		this.claveOperador = claveOperador;
	}

	public List<RegionesConsultaColonia> getRegion() {
		return region;
	}

	public void setRegion(List<RegionesConsultaColonia> region) {
		this.region = region;
	}

	
	public Errores getErr() {
		return err;
	}

	public void setErr(Errores err) {
		this.err = err;
	}
	

}
