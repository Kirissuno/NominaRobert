package laboral;

public class CalculaNominas {
	public static void main(String[] args) throws Exception {
		
		Empleado james = new Empleado("James Cosling", "32000032G", 'M', 4, 7);
				
		Empleado ada = new Empleado("Ada Lovelace", "32000031R", 'F');
		
		System.out.println(escribe(james));
		System.out.println(escribe(ada));
		
		ada.incAnyo();
		james.setCategoria(9);
		
		System.out.println("----------------------");
		System.out.println(escribe(james));
		System.out.println(escribe(ada));
		
	}
	
	static private String escribe(Empleado emp) {
		Nomina nom = new Nomina();
		return emp.imprime() + " " + nom.sueldo(emp);
	}

}
