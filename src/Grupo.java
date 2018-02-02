import java.util.ArrayList;
import java.util.List;

public class Grupo {
	private int id;
	private String nombre;
	private String estilo;
	private List miembros = new ArrayList<Miembro>();
	
	public Grupo() {
	
	}
	
	public Grupo(String nombre, String estilo) {
		super();
		this.nombre = nombre;
		this.estilo = estilo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public List getMiembros() {
		return miembros;
	}

	public void setMiembros(List miembros) {
		this.miembros = miembros;
	}
	
}
