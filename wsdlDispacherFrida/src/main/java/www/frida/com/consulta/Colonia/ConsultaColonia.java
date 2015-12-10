package www.frida.com.consulta.Colonia;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import www.frida.com.consulta.Errores;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="consultaColonia",propOrder={
		"folioSC",
		 "tipoContrato",
		 "tipoConcentracion",
		 "claveOperador",
		 "region",
		  "error"

})
public class ConsultaColonia {

	    @XmlElement(required = true)
	    protected String folioSC;
	    
	    @XmlElement(required = true)
	    protected String tipoContrato;
	    
	    @XmlElement(required = true)
	    protected String tipoConcentracion;

	    
	    @XmlElement(required = true)
	    protected String claveOperador;


	     @XmlElement(required = true)
	    protected List<Region> region;
	    
	    
	    @XmlElement(required = true)
	    protected Errores error;


		public String getFolioSC() {
			return folioSC;
		}


		public void setFolioSC(String folioSC) {
			this.folioSC = folioSC;
		}


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


		public String getClaveOperador() {
			return claveOperador;
		}


		public void setClaveOperador(String claveOperador) {
			this.claveOperador = claveOperador;
		}


		public List<Region> getRegion() {
			return region;
		}


		public void setRegion(List<Region> region) {
			this.region = region;
		}


		public Errores getError() {
			return error;
		}


		public void setError(Errores error) {
			this.error = error;
		}

	
}
