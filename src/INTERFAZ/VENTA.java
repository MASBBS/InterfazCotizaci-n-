/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFAZ;

/**
 *
 * @author MASB
 */
public class VENTA extends javax.swing.JFrame {

    /**
     * Creates new form VENTA
     */
    public VENTA() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Txtbienvenida = new javax.swing.JLabel();
        productos = new javax.swing.JLabel();
        txtCaracteristicas = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JLabel();
        txtTotalPresupuestados = new javax.swing.JLabel();
        GENERARVT = new javax.swing.JToggleButton();
        cancelarpre = new javax.swing.JToggleButton();
        Generarpre = new javax.swing.JToggleButton();
        cantidad1 = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        cantidad2 = new javax.swing.JTextField();
        cantidad3 = new javax.swing.JTextField();
        precio3 = new javax.swing.JTextField();
        precio2 = new javax.swing.JTextField();
        precio1 = new javax.swing.JTextField();
        ListaMedidas = new javax.swing.JComboBox<>();
        volantes = new javax.swing.JLabel();
        tarjetas = new javax.swing.JLabel();
        lonas = new javax.swing.JLabel();
        tarjetas1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        ListaMedidas1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        ListaMedidas2 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Txtbienvenida.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        Txtbienvenida.setText("¡ BIENVENIDO, VENDEDOR !");
        getContentPane().add(Txtbienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, 50));

        productos.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        productos.setText("PRODUCTOS");
        getContentPane().add(productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        txtCaracteristicas.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        txtCaracteristicas.setText("CARACTERISTÍCAS ");
        getContentPane().add(txtCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        txtPrecio.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        txtPrecio.setText("PRECIO");
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, -1, -1));

        txtCantidad.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        txtCantidad.setText("CANTIDAD");
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));

        txtTotalPresupuestados.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        txtTotalPresupuestados.setText("TOTAL PRESUPUESTADO");
        getContentPane().add(txtTotalPresupuestados, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, -1, -1));

        GENERARVT.setBackground(new java.awt.Color(204, 255, 204));
        GENERARVT.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        GENERARVT.setText("Generar Venta");
        GENERARVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GENERARVTActionPerformed(evt);
            }
        });
        getContentPane().add(GENERARVT, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, -1, -1));

        cancelarpre.setBackground(new java.awt.Color(204, 255, 204));
        cancelarpre.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cancelarpre.setText("Cancelar Presupuesto");
        cancelarpre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarpreActionPerformed(evt);
            }
        });
        getContentPane().add(cancelarpre, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 570, -1, -1));

        Generarpre.setBackground(new java.awt.Color(204, 255, 204));
        Generarpre.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Generarpre.setText("Generar Presupuesto");
        Generarpre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarpreActionPerformed(evt);
            }
        });
        getContentPane().add(Generarpre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, -1, -1));

        cantidad1.setBackground(new java.awt.Color(0, 211, 201));
        cantidad1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cantidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidad1ActionPerformed(evt);
            }
        });
        getContentPane().add(cantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 140, 30));

        total.setBackground(new java.awt.Color(0, 211, 201));
        total.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 140, 30));

        cantidad2.setEditable(false);
        cantidad2.setBackground(new java.awt.Color(0, 211, 201));
        cantidad2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cantidad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidad2ActionPerformed(evt);
            }
        });
        getContentPane().add(cantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 140, 30));

        cantidad3.setBackground(new java.awt.Color(0, 211, 201));
        cantidad3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(cantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 120, 30));

        precio3.setBackground(new java.awt.Color(0, 211, 201));
        precio3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(precio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 120, 30));

        precio2.setBackground(new java.awt.Color(0, 211, 201));
        precio2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 120, 30));

        precio1.setBackground(new java.awt.Color(0, 211, 201));
        precio1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, 180, 30));

        ListaMedidas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ListaMedidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4x0", "4x1", "4x4" }));
        ListaMedidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaMedidasActionPerformed(evt);
            }
        });
        getContentPane().add(ListaMedidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 160, -1));

        volantes.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        volantes.setText("VOLANTES");
        getContentPane().add(volantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        tarjetas.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        tarjetas.setText("TARJETAS");
        getContentPane().add(tarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        lonas.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lonas.setText("LONAS");
        getContentPane().add(lonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        tarjetas1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        tarjetas1.setText("PRESUPUESTO");
        getContentPane().add(tarjetas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jTextField1.setBackground(new java.awt.Color(0, 211, 201));
        jTextField1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jTextField1.setText("Seleccionar Medida de Volantes ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 200, 30));

        ListaMedidas1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ListaMedidas1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4x0", "4x1", "4x4" }));
        ListaMedidas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaMedidas1ActionPerformed(evt);
            }
        });
        getContentPane().add(ListaMedidas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 160, -1));

        jTextField2.setBackground(new java.awt.Color(0, 211, 201));
        jTextField2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jTextField2.setText("Seleccionar Medida de Lonas  ");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 190, 30));

        ListaMedidas2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ListaMedidas2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4x0", "4x1", "4x4" }));
        ListaMedidas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaMedidas2ActionPerformed(evt);
            }
        });
        getContentPane().add(ListaMedidas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 160, -1));

        jTextField3.setBackground(new java.awt.Color(0, 211, 201));
        jTextField3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jTextField3.setText("Seleccionar Medida Tarjetas ");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 200, 30));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/56-567472_gradient-ombre-blue-watercolor-background.jpg"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 834, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarpreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarpreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarpreActionPerformed

    private void GenerarpreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarpreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenerarpreActionPerformed

    private void cantidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidad1ActionPerformed

    private void ListaMedidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaMedidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaMedidasActionPerformed

    private void GENERARVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GENERARVTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GENERARVTActionPerformed

    private void ListaMedidas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaMedidas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaMedidas1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void ListaMedidas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaMedidas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaMedidas2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void cantidad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidad2ActionPerformed

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
            java.util.logging.Logger.getLogger(VENTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VENTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VENTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VENTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VENTA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JToggleButton GENERARVT;
    private javax.swing.JToggleButton Generarpre;
    private javax.swing.JComboBox<String> ListaMedidas;
    private javax.swing.JComboBox<String> ListaMedidas1;
    private javax.swing.JComboBox<String> ListaMedidas2;
    private javax.swing.JLabel Txtbienvenida;
    private javax.swing.JToggleButton cancelarpre;
    private javax.swing.JTextField cantidad1;
    private javax.swing.JTextField cantidad2;
    private javax.swing.JTextField cantidad3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lonas;
    private javax.swing.JTextField precio1;
    private javax.swing.JTextField precio2;
    private javax.swing.JTextField precio3;
    private javax.swing.JLabel productos;
    private javax.swing.JLabel tarjetas;
    private javax.swing.JLabel tarjetas1;
    private javax.swing.JTextField total;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtCaracteristicas;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JLabel txtTotalPresupuestados;
    private javax.swing.JLabel volantes;
    // End of variables declaration//GEN-END:variables
}
