package www.frida.com.consulta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="centrales",
propOrder={
		"ncaiId",
		"ncaiSiglas",
		"ncaiCentral"})
public class Centrales {
	@XmlElement(required=true)
	protected String ncaiId;
	@XmlElement(required=true)
	protected String ncaiSiglas;
	@XmlElement(required=true)
	protected String ncaiCentral;
	public String getNcaiId() {
		return ncaiId;
	}
	public void setNcaiId(String ncaiId) {
		this.ncaiId = ncaiId;
	}
	public String getNcaiSiglas() {
		return ncaiSiglas;
	}
	public void setNcaiSiglas(String ncaiSiglas) {
		this.ncaiSiglas = ncaiSiglas;
	}
	public String getNcaiCentral() {
		return ncaiCentral;
	}
	public void setNcaiCentral(String ncaiCentral) {
		this.ncaiCentral = ncaiCentral;
	}
	
	
	
}
