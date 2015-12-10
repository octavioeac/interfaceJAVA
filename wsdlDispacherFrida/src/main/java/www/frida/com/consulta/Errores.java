package www.frida.com.consulta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="errores",
propOrder={
		"codigoError",
		"descripError"})
public class Errores {

	@XmlElement(required=true)
	public String codigoError;
	@XmlElement(required=true)
	public String descripError;
	public String getCodigoError() {
		return codigoError;
	}
	public void setCodigoError(String codigoError) {
		this.codigoError = codigoError;
	}
	public String getDescripError() {
		return descripError;
	}
	public void setDescripError(String descripError) {
		this.descripError = descripError;
	}
	
	
}
