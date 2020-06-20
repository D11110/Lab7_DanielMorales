/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_danielmorales;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class adminCarpeta {

    private ArrayList<Carpeta> listaCarpetas = new ArrayList();
    private File archivo = null;

    public adminCarpeta(String path) {
        archivo = new File(path);
    }

    public ArrayList<Carpeta> getListaCarpeta() {
        return listaCarpetas;
    }

    public void setListaCarpeta(ArrayList<Carpeta> listaPersonas) {
        this.listaCarpetas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaCarpetas=" + listaCarpetas;
    }

    //extra mutador
    public void setCarpetas(Carpeta p) {
        this.listaCarpetas.add(p);
    }

    public void cargarArchivo() {
        try {
            listaCarpetas = new ArrayList();
            Carpeta temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Carpeta) objeto.readObject()) != null) {
                        listaCarpetas.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Carpeta t : listaCarpetas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

}
