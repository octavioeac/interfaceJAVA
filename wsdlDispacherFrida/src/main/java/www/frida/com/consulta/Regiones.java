package www.frida.com.consulta;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="regiones", 
propOrder={"idRegion",
		"central"})
public class Regiones {
	
	@XmlElement(required=true)
	protected String idRegion;
	@XmlElement(required=true)
	protected List<Centrales> central;
	public String getIdRegion() {
		return idRegion;
	}
	public void setIdRegion(String idRegion) {
		this.idRegion = idRegion;
	}
	public List<Centrales> getCentral() {
		return central;
	}
	public void setCentral(List<Centrales> central) {
		this.central = central;
	}
	
	
}
