package Cuentas;

/**
 * 
 * @author javie añadimos el autor
 */
public class Main {

    /**
     * 
     * @param args aquí es donde se encuentra el código principal o funcional del proyecto.
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        float cantidad=0;
        operativa_cuenta(cantidad);
    }
/**
 * 
 * @param cantidad este parametro float es el que se introdujo según el ejercicio.
 */
    public static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
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
