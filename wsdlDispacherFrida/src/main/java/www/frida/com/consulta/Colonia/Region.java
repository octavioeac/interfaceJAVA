package www.frida.com.consulta.Colonia;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Region",propOrder={
		"idRegion",
		"pc1Siglas",
		"pc1Central",
		"pc2Siglas",
		"pc2Central",
		"puertos1G",
		"puertos10G"
		
		})
public class Region {
	@XmlElement(required = true)
	protected String idRegion;
	
	@XmlElement(required = true)
	protected String pc1Siglas;
	
	@XmlElement(required = true)
	protected String pc1Central;
	
	@XmlElement(required = true)
	protected String pc2Siglas;
	
	@XmlElement(required = true)
	protected String pc2Central;
	
	@XmlElement(required = true)
	protected List<Puertos1G> puertos1G;
	
	@XmlElement(required = true)
	protected List<Puertos10G> puertos10G;

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

	public List<Puertos1G> getPuertos1G() {
		return puertos1G;
	}

	public void setPuertos1G(List<Puertos1G> puertos1g) {
		puertos1G = puertos1g;
	}

	public List<Puertos10G> getPuertos10G() {
		return puertos10G;
	}

	public void setPuertos10G(List<Puertos10G> puertos10g) {
		puertos10G = puertos10g;
	}

	
	
	
}
