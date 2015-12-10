package www.frida.com.consulta.Colonia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="objetoSaidConsultaContratacionColoniaRequest" ,namespace="http://www.frida.com/Saib")
@XmlType(name="",propOrder={"consulContrata"})
public class ObjetoSaidConsultaContratacionColoniaRequest {
	
	
	@XmlElement(required=true)
	protected  SolicitudContratacionConsulta consulContrata;

	public SolicitudContratacionConsulta getConsulContrata() {
		return consulContrata;
	}

	public void setConsulContrata(SolicitudContratacionConsulta consulContrata) {
		this.consulContrata = consulContrata;
	}

}
