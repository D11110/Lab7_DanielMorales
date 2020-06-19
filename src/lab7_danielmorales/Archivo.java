/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_danielmorales;

/**
 *
 * @author danie
 */
public class Archivo {
    private String nombre;
    private String link;
    private String extension;
    private Double tamaño;

    public Archivo(String nombre, String link, String extension, Double tamaño) {
        this.nombre = nombre;
        this.link = link;
        this.extension = extension;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Double getTamaño() {
        return tamaño;
    }

    public void setTamaño(Double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Archivo{" + "nombre=" + nombre + ", link=" + link + ", extension=" + extension + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
}
