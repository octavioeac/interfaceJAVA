package www.frida.com.in.dep;


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import www.frida.com.consulta.Errores;
import www.frida.com.consulta.SolicitudPCAI;
import www.frida.com.consulta.DAO.criterExistefolioDAO;
import www.frida.com.consulta.DAO.insertaConsultaDAO;








public class IssueMensageConsultaImple implements IssueMessage {

	
	private SolicitudPCAI obj;
	private Errores ok;
	
	
	
	public IssueMensageConsultaImple(SolicitudPCAI para) {
		super();
		this.obj = para;
			
	}

	
	@Override
	public Errores getErrores() {
		Errores k=new Errores();
		criterExistefolioDAO j=new criterExistefolioDAO();
		if(obj.getTipoContrato().isEmpty()){
			k.setCodigoError("601");
			k.setDescripError("El tag 'tipoContrato' esta vacio");
			ok=k;
		
		}
		else{
			if(obj.getMovimiento().isEmpty()){
				k.setCodigoError("501");
				k.setDescripError("El tag 'movimiento' esta vacio");
				ok=k;
			
			}
			else{
				if(obj.getMovimiento().equals("CONSULTA")){
					if(obj.getTipoConcentracion().isEmpty()){
						k.setCodigoError("501");
						k.setDescripError("El tag 'tipoConcentracion' esta vacio");
						ok=k;
					
					}
					else{
						if(obj.getTipoConcentracion().equals("LOCAL")||obj.getTipoConcentracion().equals("REGIONAL")||obj.getTipoConcentracion().equals("NACIONAL")){
							k.setCodigoError("");
							k.setDescripError("");
							ok=k;
							
							if(obj.getFolioSC().isEmpty()){ /*FOLIO*/
								k.setCodigoError("501");
								k.setDescripError("El tag 'folioSC' esta vacio");
								ok=k;
							    
							}
							else{
								if(j.getExistencia(obj.getFolioSC())!="si"){
									
									
									if(obj.getClaveOperador().isEmpty()){

										k.setCodigoError("901");
										k.setDescripError("El tag 'claveOperador' esta vacio");
										ok=k;
									
									}
									else{
										if(obj.getClaveOperador().length()<=4){   /*OPERADOR  */
								
											//////////////////////////////////////////////////////////////
											////////////////////////////////////////////////////////////
											////////////////////////
										
											k.setCodigoError("");
											k.setDescripError("");
											ok=k;
										
										}
										else{
											k.setCodigoError("910");
											k.setDescripError("El tag 'claveOperador' acepta 4 caracteres maximo");
											ok=k;
										} /*OPERADOR  */
										
									}
																
		}
								else{
									k.setCodigoError("1001");
									k.setDescripError("El 'folioSC': "+obj.getFolioSC()+" ya existe");
									ok=k;
									
								}
													
							} /*FOLIO*/
						}
						else{
							k.setCodigoError("101");
							k.setDescripError("El tag 'tipoConcentracion' tiene un dato invalido, se permite 'LOCAL','REGIONAL','NACIONAL'");
							ok=k;
						}
						
					}
				}
				else{
					k.setCodigoError("97");
					k.setDescripError("El tag 'movimiento' tiene un dato invalido, se permite 'CONSULTA'");
					ok=k;
				}
				
			}

			
			
			
			
		}
				
	

		
		
	return ok;
	}

	
	
	public Errores validaSiglas(String sigla){
		Errores k=new Errores();
		if(sigla.isEmpty()){
			k.setCodigoError("401");
			k.setDescripError("El tag 'siglaCentral' esta vacio");
			ok=k;
		
		}
		else{
			if(sigla.length()<=3){
				k.setCodigoError("");
				k.setDescripError("");
				ok=k;
			
			}
			else{
				k.setCodigoError("405");
				k.setDescripError("El tag 'siglaCentral' con valor '"+sigla+"' acepta 3 caracteres maximo");
				ok=k;
			}
		
	}
		return ok;
	
	}
	
	public Hashtable<Boolean, Errores> analizaTotalSiglas(List<String> lista){
		Hashtable<Boolean, Errores> source = new Hashtable<Boolean,Errores>();
		insertaConsultaDAO daoObjeto= new insertaConsultaDAO();		
		int[] array =new int[lista.size()];
		int i=0;
		Errores k=new Errores();
		
		for(String h :lista){
			Errores eo=validaSiglas(h);	
			   if(eo.getCodigoError().isEmpty()){
				   System.out.println(obj.getClaveOperador());	          			   
				   System.out.println(obj.getFolioSC());
				   System.out.println(obj.getMovimiento());
				   System.out.println(obj.getTipoConcentracion());
				   System.out.println(obj.getTipoContrato());
				   System.out.println(eo.getDescripError());
				   System.out.println(h);
				   System.out.println("SIGLA BUENA");
				   daoObjeto.insertaConsulta(
						   obj.getTipoContrato(), 
						   obj.getTipoConcentracion(),
						   obj.getMovimiento(),
						   obj.getFolioSC(),
						   obj.getClaveOperador(), 
						   h,"", "");		   
				   
				   source.put(true, eo);
				   			   }
			   else{
				   
				   System.out.println(obj.getClaveOperador());	          			   
				   System.out.println(obj.getFolioSC());
				   System.out.println(obj.getMovimiento());
				   System.out.println(obj.getTipoConcentracion());
				   System.out.println(obj.getTipoContrato());
			      System.out.println(h);
				   System.out.println(eo.getDescripError());
				   System.out.println("SIGLA MALA");
				   daoObjeto.insertaConsulta(
						   obj.getTipoContrato(), 
						   obj.getTipoConcentracion(),
						   obj.getMovimiento(),
						   obj.getFolioSC(),
						   obj.getClaveOperador(), 
						   h,eo.getCodigoError() , 
						   eo.getDescripError());		   
				   
				   
				   source.put(false, eo);
			   }
			   i++;
			   System.out.println(i);
		}
		return source;
		
	}
        	
	public void regresaError(Errores isu){
		
		
		List<String> lista =new ArrayList<String>();
		insertaConsultaDAO daoObjeto= new insertaConsultaDAO();		
			Errores k=new Errores();
		for(String h :obj.getSiglaCentral()){
			Errores eo=validaSiglas(h);
			   			   System.out.println(obj.getClaveOperador());	          			   
				   System.out.println(obj.getFolioSC());
				   System.out.println(obj.getMovimiento());
				   System.out.println(obj.getTipoConcentracion());
				   System.out.println(obj.getTipoContrato());
			      System.out.println(h);
				   System.out.println(eo.getDescripError());
				   System.out.println("SIGLA MALA");
				   daoObjeto.insertaConsulta(
						   obj.getTipoContrato(), 
						   obj.getTipoConcentracion(),
						   obj.getMovimiento(),
						   obj.getFolioSC(),
						   obj.getClaveOperador(), 
						   h,isu.getCodigoError() , 
						   isu.getDescripError());		   
					   
		}

		
	}
	
	

}
