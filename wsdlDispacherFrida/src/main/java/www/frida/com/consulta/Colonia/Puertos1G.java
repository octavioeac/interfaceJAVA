package www.frida.com.consulta.Colonia;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="puertos1G",propOrder={
		"pcai"
		})
public class Puertos1G {

	@XmlElement(required=true)
	protected List<Pcai> pcai;

	public List<Pcai> getPcai() {
		return pcai;
	}

	public void setPcai(List<Pcai> pcai) {
		this.pcai = pcai;
	}

	

   
	
	
}
