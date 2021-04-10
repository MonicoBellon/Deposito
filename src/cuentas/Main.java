package cuentas;
/**
 * Clase que contiene la funcion main()
 *
 * @author Monico
 */
public class Main {
/**
 * Inicio de la aplicacion
 * @param args 
 */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio Lopez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1, null);
    }

    /**
     * Operativa de la cuenta
     * @param cuenta1 the value of cuenta1
     * @param cantidad the value of cantidad
     */
    protected static void operativa_cuenta(CCuenta cuenta1, java.lang.Float cantidad) {
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
