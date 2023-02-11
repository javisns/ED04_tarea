package Cuentas;

/**
 * 
 * @author javie con el del main.
 */
public class CCuenta {

    /**
     * @return devuelve el nombre cuando se solicita.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre cambia el nombre cuando se llama a esta instancia.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return cuenta devuelve la información de cuenta.
     */
     
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta cambia la información de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo con con los anteriores
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set como los anteriores...
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInteres como anteriores....
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    
   
    public CCuenta()
    {
    }
/**
 * 
 * @param nom parametros introducidos al crear la cuenta.
 * @param cue parametros introducidos al crear la cuenta.
 * @param sal parametros introducidos al crear la cuenta.
 * @param tipo parametros introducidos al crear la cuenta.
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return getSaldo();
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}