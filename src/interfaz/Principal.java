/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.clase;
import javax.swing.JOptionPane;

/**
 *
 * @author liborio
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        cmdCalcular.setEnabled(true);
        cmdBorrar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtR1 = new javax.swing.JTextField();
        txtI1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtR2 = new javax.swing.JTextField();
        txtI2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbOper = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        txtR = new javax.swing.JTextField();
        txtI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtNR1 = new javax.swing.JTextField();
        txtNI1 = new javax.swing.JTextField();
        txtDR1 = new javax.swing.JTextField();
        txtDI2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Numeros Complejos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        txtR1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtR1KeyTyped(evt);
            }
        });
        jPanel1.add(txtR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 60, 30));

        txtI1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtI1KeyTyped(evt);
            }
        });
        jPanel1.add(txtI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 60, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel2.setText("i");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 10, 30));

        txtR2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtR2KeyTyped(evt);
            }
        });
        jPanel1.add(txtR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 60, 30));

        txtI2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtI2KeyTyped(evt);
            }
        });
        jPanel1.add(txtI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 60, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("+");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("+");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 20, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel5.setText("i");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, 50));

        cmbOper.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmbOper.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicación", "División" }));
        jPanel1.add(cmbOper, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtR.setEditable(false);
        jPanel2.add(txtR, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 17, 60, -1));

        txtI.setEditable(false);
        jPanel2.add(txtI, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 17, 60, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel6.setText("i");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 20, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("+");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 20, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 170, 60));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Division", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNR1.setEditable(false);
        jPanel3.add(txtNR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, -1));

        txtNI1.setEditable(false);
        jPanel3.add(txtNI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 70, -1));

        txtDR1.setEditable(false);
        jPanel3.add(txtDR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 60, -1));

        txtDI2.setEditable(false);
        jPanel3.add(txtDI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 70, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 60, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 70, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("+");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel10.setText("i");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 210, 100));

        cmdCalcular.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        cmdBorrar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 384));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed

        if (txtR1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite La Parte Real Del Primer Numero");
            txtR1.requestFocusInWindow();
        } else if (txtI1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite La Parte Imaginaria Del Primer Numero");
            txtI1.requestFocusInWindow();
        } else if (txtR2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite La Parte Real Del Segundo Numero");
            txtR2.requestFocusInWindow();
        } else if (txtI2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite La Parte Imaginaria Del Segundo Numero");
            txtI2.requestFocusInWindow();
        } else {
            int Oper;
            double Real1, Imag1, Real2, Imag2, Aux;
            clase R1, R2, R3;
            try {
                Oper = cmbOper.getSelectedIndex();
                Real1 = Integer.parseInt(txtR1.getText());
                Imag1 = Integer.parseInt(txtI1.getText());
                Real2 = Integer.parseInt(txtR2.getText());
                Imag2 = Integer.parseInt(txtI2.getText());

                R1 = new clase(Real1, Imag1);
                R2 = new clase(Real2, Imag2);
                switch (Oper) {
                    case 0:
                        R3 = R1.Suma(R2);
                        txtR.setText("" + R3.getPr());
                        txtI.setText("" + R3.getPi());
                        break;
                    case 1:
                        R3 = R1.Resta(R2);
                        txtR.setText(String.valueOf(R3.getPr()));
                        txtI.setText("" + R3.getPi());
                        break;
                    case 2:
                        R3 = R1.Multiplicacion(R2);
                        txtR.setText(String.valueOf(R3.getPr()));
                        txtI.setText(String.valueOf(R3.getPi()));
                        break;
                    case 3:
                        R3 = R1.Division(R2);
                        txtR.setText("");
                        txtI.setText("");
                        Aux = (R2.getPr() * R2.getPr()) + (R2.getPi() * R2.getPi());
                        txtNR1.setText(String.valueOf(R3.getPr()));
                        txtDR1.setText(String.valueOf(Aux));
                        txtNI1.setText(String.valueOf(R3.getPi()));
                        txtDI2.setText(String.valueOf(Aux));
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor Invalido", "ERROR", JOptionPane.ERROR_MESSAGE);

            }
        }

    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed

        txtR1.setText("");
        txtI1.setText("");
        txtR2.setText("");
        txtI2.setText("");
        txtR.setText("");
        txtI.setText("");
        txtNR1.setText("");
        txtDR1.setText("");
        txtNI1.setText("");
        txtDI2.setText("");
        txtR1.requestFocusInWindow();
        cmbOper.setSelectedIndex(0);
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtR1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtR1KeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtR1KeyTyped

    private void txtI1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtI1KeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtI1KeyTyped

    private void txtR2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtR2KeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtR2KeyTyped

    private void txtI2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtI2KeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtI2KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOper;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtDI2;
    private javax.swing.JTextField txtDR1;
    private javax.swing.JTextField txtI;
    private javax.swing.JTextField txtI1;
    private javax.swing.JTextField txtI2;
    private javax.swing.JTextField txtNI1;
    private javax.swing.JTextField txtNR1;
    private javax.swing.JTextField txtR;
    private javax.swing.JTextField txtR1;
    private javax.swing.JTextField txtR2;
    // End of variables declaration//GEN-END:variables
}
