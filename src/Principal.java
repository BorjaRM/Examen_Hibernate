import org.hibernate.Session;

public class Principal {

	public static void main(String[] args) {
		
		Session session=HibernateUtilities.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		// Creamos dos Actuaciones
		Actuacion a1 = new Actuacion("20:00","Escenario Principal");
		Actuacion a2 = new Actuacion("22:30","Escenario Secundario");
		
		// Creamos dos Festivales
		Festival f1 = new Festival("Festival 1", "Valencia", "22/06/2018");
		Festival f2 = new Festival("Festival 2", "Barcelona", "14/07/2018");
		
		// Creamos el primer grupo
		Grupo g1 = new Grupo("Grupo 1","estilo");
		
		// Creamos sus miembros
		Miembro m1 = new Miembro("Miembro 1","instrumento");
		Miembro m2 = new Miembro("Miembro 2","instrumento");
		// Obtenemos el listado de miembros y añadimos los dos que hemos creado
		g1.getMiembros().add(m1);
		g1.getMiembros().add(m2);

		// Creamos el segundo grupo
		Grupo g2 = new Grupo("Grupo 2","estilo");
		
		// Creamos sus miembros
		Miembro m3 = new Miembro("Miembro 3","instrumento");
		Miembro m4 = new Miembro("Miembro 4","instrumento");
		// Obtenemos el listado de miembros y añadimos los dos que hemos creado
		g2.getMiembros().add(m3);
		g2.getMiembros().add(m4);
		
		session.save(a1);
		session.save(a2);
		session.save(f1);
		session.save(f2);
		session.save(g1);
		session.save(g2);
		
		session.getTransaction().commit();
		
		session.close();
		
		// si utilizamos create-drop las tablas se borran cuando cerramos SessionFactory
		HibernateUtilities.getSessionFactory().close();
			
	}

}
