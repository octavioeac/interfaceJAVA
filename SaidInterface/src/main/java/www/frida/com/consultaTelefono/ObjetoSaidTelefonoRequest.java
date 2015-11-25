package www.frida.com.consultaTelefono;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="objetoSaidTelefonoRequest",namespace="http://www.frida.com/Said")
@XmlType(name="",propOrder={"telefonoRequest"})
@XmlAccessorType(XmlAccessType.FIELD)
public class ObjetoSaidTelefonoRequest {
	
	@XmlElement(required=true)
	protected ConsulTelRequest telefonoRequest;

	public ConsulTelRequest getTelefonoRequest() {
		return telefonoRequest;
	}

	public void setTelefonoRequest(ConsulTelRequest telefonoRequest) {
		this.telefonoRequest = telefonoRequest;
	}

}
