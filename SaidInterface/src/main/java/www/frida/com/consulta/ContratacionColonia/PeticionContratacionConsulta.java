package www.frida.com.consulta.ContratacionColonia;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "peticionContratacionConsulta", propOrder = {
    "tipoContrato",
    "tipoConcentracion",
    "movimiento",
    "folioSC",
    "claveOperador",
    "nis",
   "region"
    
})
public class PeticionContratacionConsulta {
	
	
	    @XmlElement(required = true)
	    protected String tipoContrato;
	  
	  
	    @XmlElement(required = true)
	    protected String tipoConcentracion;
	    
	    @XmlElement(required = true)
	    protected String movimiento;

	    
	    @XmlElement(required = true)
	    protected String folioSC;



	    @XmlElement(required = true)
	    protected String nis;
	    
	    
	    @XmlElement(required = true)
	    protected String claveOperador;

	    @XmlElement(required = true)
	    protected RegionesConsultaColoniapeticion region;

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

		public String getNis() {
			return nis;
		}

		public void setNis(String nis) {
			this.nis = nis;
		}

		public String getClaveOperador() {
			return claveOperador;
		}

		public void setClaveOperador(String claveOperador) {
			this.claveOperador = claveOperador;
		}

		public RegionesConsultaColoniapeticion getRegion() {
			return region;
		}

		public void setRegion(RegionesConsultaColoniapeticion region) {
			this.region = region;
		}

		
	
}
