package www.frida.com.consulta.Colonia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="objetoSaidColoniaResponse" ,namespace="http://www.frida.com/Said")
@XmlType(name="",propOrder={"consulCol"})
public class ObjetoSaidColoniaResponse {

	
	@XmlElement(required=true)
	protected ConsultaColonia consulCol;

	public ConsultaColonia getConsulCol() {
		return consulCol;
	}

	public void setConsulCol(ConsultaColonia consulCol) {
		this.consulCol = consulCol;
	}
	
	

}
