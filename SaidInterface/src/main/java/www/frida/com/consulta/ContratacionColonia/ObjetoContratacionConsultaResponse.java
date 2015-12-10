package www.frida.com.consulta.ContratacionColonia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;




@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="objetoContratacionConsultaResponse",namespace="http://www.frida.com/Saib")
@XmlType(name="",propOrder={
		"contratacionContultaResponse"
		})
public class ObjetoContratacionConsultaResponse {

	
	
	@XmlElement(required=true)
	protected ObjetoContratacionContulta contratacionContultaResponse;

	public ObjetoContratacionContulta getContratacionContultaResponse() {
		return contratacionContultaResponse;
	}

	public void setContratacionContultaResponse(ObjetoContratacionContulta contratacionContultaResponse) {
		this.contratacionContultaResponse = contratacionContultaResponse;
	}



	
}
