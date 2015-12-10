package www.frida.com.consulta.ContratacionColonia;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessorType;
import www.frida.com.consulta.Colonia.Ncai;
import www.frida.com.consulta.Colonia.Pcai;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="regionesConsultaColonia",propOrder={
		"pc1",
		"pc2",
		"pcai"
		})

public class RegionesConsultaColonia {
	
	@XmlElement(required=true)
	protected Pc1 pc1;
	
	@XmlElement(required=true)
	protected Pc1 pc2;
	
	@XmlElement(required=true)
	protected List<Pcai> pcai;
	
	public Pc1 getPc1() {
		return pc1;
	}

	public void setPc1(Pc1 pc1) {
		this.pc1 = pc1;
	}

	public Pc1 getPc2() {
		return pc2;
	}

	public void setPc2(Pc1 pc2) {
		this.pc2 = pc2;
	}

	public List<Pcai> getPcai() {
		return pcai;
	}

	public void setPcai(List<Pcai> pcai) {
		this.pcai = pcai;
	}


	
	
}
