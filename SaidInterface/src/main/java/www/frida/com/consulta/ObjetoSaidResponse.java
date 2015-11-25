package www.frida.com.consulta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="",propOrder={"objSc"})
@XmlRootElement(name="objetoSaidResponse",namespace="http://www.frida.com/Said")
public class ObjetoSaidResponse {
	
	@XmlElement(required=true)
	protected ObjectSc objSc;

	public ObjectSc getObjSc() {
		return objSc;
	}

	public void setObjSc(ObjectSc objSc) {
		this.objSc = objSc;
	}
	
	
	
	

}
