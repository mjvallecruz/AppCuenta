package personaCuenta;

public class AppCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Persona p1 = new Persona("Pepe", 40, "20202020A");
	        Persona p2 = new Persona("Marta", 25, "30303030B");

	        CuentaBancaria cuenta1 = new CuentaBancaria(1, p1);
	        CuentaBancaria cuenta2 = new CuentaBancaria(2, p2);

	        cuenta1.ingresar(100);
	        cuenta2.ingresar(200);

	        cuenta1.mostrarDatos();
	        cuenta2.mostrarDatos();
	        p1.mostrarDatos();
	//p1.mostrarDatosConBordes();
	//modifico app desde GitHub
	}

}
