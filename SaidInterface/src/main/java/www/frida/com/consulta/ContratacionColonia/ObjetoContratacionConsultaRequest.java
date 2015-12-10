package www.frida.com.consulta.ContratacionColonia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="objetoContratacionConsultaRequest",namespace="http://www.frida.com/Saib")
@XmlType(name="",propOrder={
		"peticionContratacionConsulta"
		})
public class ObjetoContratacionConsultaRequest {

@XmlElement(required=true)	
protected PeticionContratacionConsulta peticionContratacionConsulta;

public PeticionContratacionConsulta getPeticionContratacionConsulta() {
	return peticionContratacionConsulta;
}

public void setPeticionContratacionConsulta(PeticionContratacionConsulta peticionContratacionConsulta) {
	this.peticionContratacionConsulta = peticionContratacionConsulta;
}
	
}
