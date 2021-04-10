


// paquete
package cuentas;
//Clase Principal *comentario*
/** 
 Clase princiapl que contien los datos de:
 * nombre del titular
 * numero de la cuenta bancaria
 * el saldo disponible de la cuenta
 * el procentaje de interes
 * Ademas contiene metodos para ingresar y retitar dinero en efectivo
 
 */
public class CCuenta {

/**
 * nombre del titular de la cuenta
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
/**
 * Constructor vacio que permite modificar cualquier parametro
 */
    public CCuenta()
    {
    }
/**
 * Constructor con todos los parametros permitidos
 * @param nom Nombre del titular
 * @param cue Numero de cuenta
 * @param sal Saldo inicial con el que se abre dicha cuenta
 * @param tipo Tipo de interes aplicable.
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * 
 * @return 
 */
    public double estado()
    {
        return getSaldo();
    }
/**
 * Este metodo incrementa el saldo disponible en la cantidad introducida
 * @param cantidad importe a incrementar el saldo
 * @throws java.lang.Exception Si la cantidad a ingresar es negativa
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Este metodo decrementa el saldo disponible en la cantidad introducida.
 * @param cantidad importe a decrementar el saldo
 * @throws Exception si la cantidad es igual o menor a cero o si la cantidad es mayor al saldo.
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInteres
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
}
