package com.gm.mundopc;

/**
 *
 * @author DIDIER JAVIER
 */
public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    public static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public Computadora[] getComputadoras() {
        return computadoras;
    }

    public void setComputadoras(Computadora[] computadoras) {
        this.computadoras = computadoras;
    }

    public static int getContadorOrdenes() {
        return contadorOrdenes;
    }

    public static int getContadorComputadoras() {
        return contadorComputadoras;
    }

    public void agregarComputadora(Computadora computadora) {
        if(Orden.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[Orden.contadorComputadoras++] = computadora;
        }else{
            System.out.println("Ha superado el máximo de computadoras permitidas en la orden: " + Orden.MAX_COMPUTADORAS);
        }
    }
    
    public void mostrarOrden(Orden orden) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Orden numero: " + this.idOrden);
        System.out.println("-----------------------------------------------------------------------------");
        for (int i = 0; i < (Orden.contadorComputadoras); i++) {
            System.out.println("Computadoras agregadas a la orden: " + this.computadoras[i]);
        }
    }
}


