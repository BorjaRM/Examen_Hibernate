
public class Actuacion {
	private String hora;
	private String escenario;
	
	public Actuacion() {
	
	}
	
	public Actuacion(String hora, String escenario) {
		super();
		this.hora = hora;
		this.escenario = escenario;
	}
	
	public String getHora() {
		return hora;
	}
	
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public String getEscenario() {
		return escenario;
	}
	
	public void setEscenario(String escenario) {
		this.escenario = escenario;
	}
}
