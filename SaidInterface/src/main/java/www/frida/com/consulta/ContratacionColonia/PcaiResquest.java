package www.frida.com.consulta.ContratacionColonia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="pcaiResquest",propOrder={
		"folio",
		"estatus",
		"ncai"
		})

public class PcaiResquest {
	
	@XmlElement(required=true)	
	protected String folio;
	@XmlElement(required=true)	
	protected String estatus;
	@XmlElement(required=true)	
	protected NcaiRequest ncai;
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public NcaiRequest getNcai() {
		return ncai;
	}
	public void setNcai(NcaiRequest ncai) {
		this.ncai = ncai;
	}

}
