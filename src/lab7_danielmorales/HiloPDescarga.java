/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_danielmorales;

import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danie
 */
public class HiloPDescarga implements Runnable {

    private boolean avanzar;
    private boolean vive;
    private JProgressBar progBar_t;
    private int tam;
    private JTable tabla;
    private Carpeta c;

    public HiloPDescarga(JProgressBar progBar_t, int tiempo, JTable tab, Carpeta cap) {
        this.progBar_t = progBar_t;
        this.tam = tiempo;
        avanzar = true;
        vive = true;
        this.tabla = tab;
        this.c = cap;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {

                if (progBar_t.getValue() < progBar_t.getMaximum()) {
                    progBar_t.setMaximum(tam);
                    this.progBar_t.setValue(this.progBar_t.getValue() + 1);

                } else {
                    DefaultTableModel model = (DefaultTableModel) tabla.getModel();
                    for (Archivo a : c.getArchivos()) {
                        Object[] newrow2 = {
                            a.getNombre(),
                            a.getExtension(),
                            a.getLink(), a.getTamaño()
                        };
                        model.addRow(newrow2);
                        tabla.setModel(model);
                    }
                    avanzar = false;
                }
                try {
                    Thread.sleep(1000);

                } catch (Exception ex) {

                }
            }
        }
    }
}
