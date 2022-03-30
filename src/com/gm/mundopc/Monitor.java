package com.gm.mundopc;

/**
 *
 * @author DIDIER JAVIER
 */
public class Monitor {
    private final int idMonitor;
    private String marca;
    private Double tamanio;
    private static int contadorMonitores;

    public Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    public Monitor(String marca, Double tamanio) {
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID Monitor= ").append(idMonitor);
        sb.append(", Marca= ").append(marca);
        sb.append(", Tamaño= ").append(tamanio);
        return sb.toString();
    }
    
    
    
}


