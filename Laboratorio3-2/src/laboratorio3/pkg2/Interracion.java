package laboratorio3.pkg2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Interracion extends javax.swing.JFrame {

    ImageIcon Imagenes[] = new ImageIcon[6];
    int contador = 0;
    Timer tiempo;

    public Interracion() {
        initComponents();
        for (int i = 1; i < 5; i++) {

            Imagenes[i] = new ImageIcon(getClass().getResource("/Imagenes/" + i + ".PNG"));
            Visor.setIcon(Imagenes[i]);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        laboratorio321 = new laboratorio3.pkg2.Laboratorio32();
        Visor = new javax.swing.JButton();
        Velocidad = new javax.swing.JSlider();
        comenzar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Visor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisorActionPerformed(evt);
            }
        });

        Velocidad.setMaximum(1000);
        Velocidad.setPaintLabels(true);
        Velocidad.setPaintTicks(true);

        comenzar.setText("Comenzar");
        comenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(Visor, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(Velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(comenzar)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Visor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(comenzar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VisorActionPerformed

    private void comenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarActionPerformed
        int velo = Velocidad.getValue();
        tiempo = new Timer((int) velo , new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Visor.setIcon(Imagenes[contador]);
                contador++;
                if (contador == (Imagenes.length - 1)) {
                    contador = 0;

                }
            }

        });
        tiempo.start();
    }//GEN-LAST:event_comenzarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider Velocidad;
    private javax.swing.JButton Visor;
    private javax.swing.JButton comenzar;
    private laboratorio3.pkg2.Laboratorio32 laboratorio321;
    // End of variables declaration//GEN-END:variables
}
