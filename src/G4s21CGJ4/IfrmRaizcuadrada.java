/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G4s21CGJ4;

import Operaciones.Avanzado;

/**
 *
 * @author Joshua 
 */
public class IfrmRaizcuadrada extends javax.swing.JInternalFrame {

    /**
     * Creates new form IfrmRaizcuadrada
     */
    public IfrmRaizcuadrada() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblresultado = new javax.swing.JLabel();
        txtnum1 = new javax.swing.JTextField();
        btnraizcuadrada = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Introduce el numero");

        lblresultado.setText("Resultado");

        btnraizcuadrada.setText("Sacar raiz cuadrada");
        btnraizcuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnraizcuadradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnraizcuadrada)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnraizcuadrada)
                .addGap(27, 27, 27)
                .addComponent(lblresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnraizcuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnraizcuadradaActionPerformed
        // TODO add your handling code here:
        Avanzado objavanzado = new Avanzado();
        lblresultado.setText("El resultado de la raiz cuadrada es " + String.valueOf(objavanzado.raizcuadrada(Integer.valueOf(txtnum1.getText()))));
    }//GEN-LAST:event_btnraizcuadradaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnraizcuadrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblresultado;
    private javax.swing.JTextField txtnum1;
    // End of variables declaration//GEN-END:variables
}