package www.frida.com.consulta.Colonia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="objetoSaidColoniaRequest" ,namespace="http://www.frida.com/Said")
@XmlType(name="",propOrder={"consulContrata"})
public class ObjetoSaidColoniaRequest {
	
	
	@XmlElement(required=true)
	protected  SolicitudContratacionConsulta consulContrata;

	public SolicitudContratacionConsulta getConsulContrata() {
		return consulContrata;
	}

	public void setConsulContrata(SolicitudContratacionConsulta consulContrata) {
		this.consulContrata = consulContrata;
	}

}
