package www.frida.com.consulta.Colonia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ncai",propOrder={
		"folioNcai",
		"ncaId",
		"ncaiSiglas",
		"ncaiCentral",
		"equipoAcceso",
		"codigoConfirmacion",
		"estatus"
		
		})
public class Ncai {
	
	@XmlElement(required=true)
	protected String folioNcai;

	@XmlElement(required=true)
	protected String ncaId;
	
	@XmlElement(required=true)
	protected String ncaiSiglas;
	
	@XmlElement(required=true)
	protected String ncaiCentral;
	
	@XmlElement(required=true)
	protected String equipoAcceso;
	
	@XmlElement
	protected String estatus;


	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getFolioNcai() {
		return folioNcai;
	}

	public void setFolioNcai(String folioNcai) {
		this.folioNcai = folioNcai;
	}

	public String getNcaId() {
		return ncaId;
	}

	public void setNcaId(String ncaId) {
		this.ncaId = ncaId;
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

	public String getEquipoAcceso() {
		return equipoAcceso;
	}

	public void setEquipoAcceso(String equipoAcceso) {
		this.equipoAcceso = equipoAcceso;
	}

	public String getCodigoConfirmacion() {
		return codigoConfirmacion;
	}

	public void setCodigoConfirmacion(String codigoConfirmacion) {
		this.codigoConfirmacion = codigoConfirmacion;
	}

	@XmlElement(required=true)
	protected String codigoConfirmacion;

		
	
}

