package www.frida.com.consulta.Colonia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="objetoSaidConsultaContratacionColoniaResponse" ,namespace="http://www.frida.com/Saib")
@XmlType(name="",propOrder={"consulContratacion"})
public class ObjetoSaidConsultaContratacionColoniaResponse {

	
	@XmlElement(required=true)
	protected ConsultaColonia consulContratacion;

	public ConsultaColonia getConsulContratacion() {
		return consulContratacion;
	}

	public void setConsulContratacion(ConsultaColonia consulContratacion) {
		this.consulContratacion = consulContratacion;
	}

	
	
	

}
