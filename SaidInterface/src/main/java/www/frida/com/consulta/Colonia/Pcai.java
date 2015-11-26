package www.frida.com.consulta.Colonia;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="pcai",propOrder={
		"folioPcai",
		"ncai"
		})
public class Pcai {
	
	@XmlElement(required=true)
	protected String folioPcai;

	@XmlElement(required=true)
	protected List<Ncai> ncai;

	public String getFolioPcai() {
		return folioPcai;
	}

	public void setFolioPcai(String folioPcai) {
		this.folioPcai = folioPcai;
	}

	public List<Ncai> getNcai() {
		return ncai;
	}

	public void setNcai(List<Ncai> ncai) {
		this.ncai = ncai;
	}


	
}
