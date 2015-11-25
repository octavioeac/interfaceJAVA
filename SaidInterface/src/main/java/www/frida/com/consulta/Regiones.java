package www.frida.com.consulta;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="regiones", 
propOrder={"idRegion",
		"pc1Siglas",
		"pc1Central",
		"pc2Siglas",
		"pc2Central",
		"central"})
public class Regiones {
	
	@XmlElement(required=true)
	protected String idRegion;
	@XmlElement(required=true)
	protected String pc1Siglas;
	@XmlElement(required=true)
	protected String pc1Central;
	@XmlElement(required=true)
	protected String pc2Siglas;
	@XmlElement(required=true)
	protected String pc2Central;
	@XmlElement(required=true)
	protected List<Centrales> central;
	
	public String getIdRegion() {
		return idRegion;
	}
	public void setIdRegion(String idRegion) {
		this.idRegion = idRegion;
	}
	public String getPc1Siglas() {
		return pc1Siglas;
	}
	public void setPc1Siglas(String pc1Siglas) {
		this.pc1Siglas = pc1Siglas;
	}
	public String getPc1Central() {
		return pc1Central;
	}
	public void setPc1Central(String pc1Central) {
		this.pc1Central = pc1Central;
	}
	public String getPc2Siglas() {
		return pc2Siglas;
	}
	public void setPc2Siglas(String pc2Siglas) {
		this.pc2Siglas = pc2Siglas;
	}
	public String getPc2Central() {
		return pc2Central;
	}
	public void setPc2Central(String pc2Central) {
		this.pc2Central = pc2Central;
	}
	public List<Centrales> getCentral() {
		return central;
	}
	public void setCentral(List<Centrales> central) {
		this.central = central;
	}

}
