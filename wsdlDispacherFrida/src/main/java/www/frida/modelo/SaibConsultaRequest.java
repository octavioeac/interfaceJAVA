package www.frida.modelo;

import java.util.Date;

public class SaibConsultaRequest {
	
	private int id;
	private String tipoConcentracion;
	private String tipoContrato;
	private String movimiento;
	private String folioSC;
	private String claveOperador;
	private String siglasCentral;
	private String error;
	private String errorMensaje;
	private Date fechaRequest;
	
	
	public SaibConsultaRequest(){}
	
	public SaibConsultaRequest(int id, String tipoConcentracion,
			String tipoContrato, String movimiento, String folioSC,
			String claveOperador, String siglasCentral, String error,
			String errorMensaje, Date fechaRequest) {
		super();
		this.id = id;
		this.tipoConcentracion = tipoConcentracion;
		this.tipoContrato = tipoContrato;
		this.movimiento = movimiento;
		this.folioSC = folioSC;
		this.claveOperador = claveOperador;
		this.siglasCentral = siglasCentral;
		this.error = error;
		this.errorMensaje = errorMensaje;
		this.fechaRequest = fechaRequest;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipoConcentracion() {
		return tipoConcentracion;
	}
	public void setTipoConcentracion(String tipoConcentracion) {
		this.tipoConcentracion = tipoConcentracion;
	}
	public String getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	public String getMovimiento() {
		return movimiento;
	}
	public void setMovimiento(String movimiento) {
		this.movimiento = movimiento;
	}
	public String getFolioSC() {
		return folioSC;
	}
	public void setFolioSC(String folioSC) {
		this.folioSC = folioSC;
	}
	public String getClaveOperador() {
		return claveOperador;
	}
	public void setClaveOperador(String claveOperador) {
		this.claveOperador = claveOperador;
	}
	public String getSiglasCentral() {
		return siglasCentral;
	}
	public void setSiglasCentral(String siglasCentral) {
		this.siglasCentral = siglasCentral;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getErrorMensaje() {
		return errorMensaje;
	}
	public void setErrorMensaje(String errorMensaje) {
		this.errorMensaje = errorMensaje;
	}
	public Date getFechaRequest() {
		return fechaRequest;
	}
	public void setFechaRequest(Date fechaRequest) {
		this.fechaRequest = fechaRequest;
	}
	
	

}
