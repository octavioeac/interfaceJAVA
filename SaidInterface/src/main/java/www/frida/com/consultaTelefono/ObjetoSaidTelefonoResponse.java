package www.frida.com.consultaTelefono;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="objetoSaidTelefonoResponse",namespace="http://www.frida.com/Said")
@XmlType(name="",propOrder={"telefonoResponse"})
@XmlAccessorType(XmlAccessType.FIELD)

public class ObjetoSaidTelefonoResponse {
	
	@XmlElement(required=true)
	protected ConsulTelResponse telefonoResponse;

	public ConsulTelResponse getTelefonoResponse() {
		return telefonoResponse;
	}

	public void setTelefonoResponse(ConsulTelResponse telefonoResponse) {
		this.telefonoResponse = telefonoResponse;
	}

}
