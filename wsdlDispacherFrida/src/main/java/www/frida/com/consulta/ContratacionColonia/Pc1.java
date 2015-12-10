package www.frida.com.consulta.ContratacionColonia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="pc1",propOrder={
		"siglas",
		"codigoConfirmacion",
		})

public class Pc1 {

	@XmlElement(required=true)
	protected String siglas;
	
	@XmlElement(required=true)
	protected String codigoConfirmacion;

	public String getSiglas() {
		return siglas;
	}

	public void setSiglas(String siglas) {
		this.siglas = siglas;
	}

	public String getCodigoConfirmacion() {
		return codigoConfirmacion;
	}

	public void setCodigoConfirmacion(String codigoConfirmacion) {
		this.codigoConfirmacion = codigoConfirmacion;
	}
	
}
