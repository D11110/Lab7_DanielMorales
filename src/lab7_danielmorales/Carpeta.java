package lab7_danielmorales;

import java.io.Serializable;
import java.util.ArrayList;

public class Carpeta implements Serializable{
    private String nombre;
    private String link;
    private ArrayList<Archivo> archivos = new ArrayList();
    private ArrayList carpetas = new ArrayList();
    private static final long SerialVersionUID = 777L;

    public Carpeta(String nombre, String link) {
        this.nombre = nombre;
        this.link = link;
    }
    
    public Carpeta(String nombre, String link, ArrayList carpetas, ArrayList archivos){
        this.nombre = nombre;
        this.link = link;
        setCarpetas(carpetas);
        setArchivos(archivos);
    }
    
    public Carpeta(String nombre, String link, ArrayList archivos){
        this.nombre = nombre;
        this.link = link;
        setArchivos(archivos);
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

    public ArrayList<Archivo> getArchivos() {
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
        return "Carpeta{" + "nombre=" + nombre + ", link=" + link + '}';
    }
    
     
}
