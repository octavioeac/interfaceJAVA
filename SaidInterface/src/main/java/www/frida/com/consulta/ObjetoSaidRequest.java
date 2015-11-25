package www.frida.com.consulta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="",propOrder={"pcai"})
@XmlRootElement(name="objetoSaidRequest",namespace="http://www.frida.com/Said")
public class ObjetoSaidRequest {

	@XmlElement(required=true)
	protected SolicitudPCAI pcai;

	public SolicitudPCAI getPcai() {
		return pcai;
	}

	public void setPcai(SolicitudPCAI pcai) {
		this.pcai = pcai;
	} 
	
	
	
}
