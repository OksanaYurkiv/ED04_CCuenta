package cuentas;
public class Main {
	
       static double  saldoActual;

    public static void main(String[] args) {
     
    	CCuenta cuenta1;
        cuenta1 = new CCuenta("Antonio Lopez","1000-2365-85-1230456789",2500,0);
        operativa_cuenta (cuenta1);
    }
    
    private static double operativa_cuenta (CCuenta cuenta) {
    	
    	saldoActual = cuenta.estado();
    	
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            cuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
		return saldoActual;
    }
}
