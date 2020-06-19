/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_danielmorales;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Carpeta {
    private String nombre;
    private String link;
    private ArrayList archivos = new ArrayList();
    private ArrayList carpetas = new ArrayList();

    public Carpeta(String nombre, String link) {
        this.nombre = nombre;
        this.link = link;
    }

    public Carpeta() {
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

    public ArrayList getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList archivos) {
        this.archivos = archivos;
    }

    public ArrayList getCarpetas() {
        return carpetas;
    }

    public void setCarpetas(ArrayList carpetas) {
        this.carpetas = carpetas;
    }

    @Override
    public String toString() {
        return "Carpeta{" + "nombre=" + nombre + ", link=" + link + ", archivos=" + archivos + ", carpetas=" + carpetas + '}';
    }
    
     
}
