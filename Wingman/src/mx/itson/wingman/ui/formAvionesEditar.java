/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.wingman.ui;

import mx.itson.wingman.enumeradores.EstadoAvion;
import mx.itson.wingman.enumeradores.TipoAvion;
import mx.itson.wingman.entidades.Avion;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author emman
 */
public class formAvionesEditar extends javax.swing.JDialog {

    /**
     * Creates new form formAvionesEditar
     */
    public formAvionesEditar(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal); 
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
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFabricante = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        lblTipoAvion = new javax.swing.JLabel();
        cmbTipoAvion = new javax.swing.JComboBox<>();
        lblTipoAvion1 = new javax.swing.JLabel();
        cmbEstadoAvion = new javax.swing.JComboBox<>();
        chbAvionCarguero = new javax.swing.JCheckBox();
        chbAvionCombate = new javax.swing.JCheckBox();
        btnFinalizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Modelo");

        jLabel3.setText("Fabricante");

        txtFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFabricanteActionPerformed(evt);
            }
        });

        jLabel4.setText("Capacidad");

        lblTipoAvion.setText("Tipo Avión");

        cmbTipoAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carga", "Transporte", "Interceptor", "Atacante", "Polivalente", "AWACS" }));
        cmbTipoAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoAvionActionPerformed(evt);
            }
        });

        lblTipoAvion1.setText("Estado Avión");

        cmbEstadoAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En hangar", "Mantenimiento", "En vuelo", "Kia", "Mia", "Repostando" }));
        cmbEstadoAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoAvionActionPerformed(evt);
            }
        });

        chbAvionCarguero.setText("Avion Carguero");

        chbAvionCombate.setText("Avion Combate");

        btnFinalizar.setText("Editar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCapacidad)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipoAvion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTipoAvion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipoAvion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEstadoAvion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtFabricante)
                    .addComponent(txtModelo)
                    .addComponent(txtNombre)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chbAvionCarguero)
                            .addComponent(btnLimpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFinalizar)
                            .addComponent(chbAvionCombate))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoAvion)
                    .addComponent(cmbTipoAvion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoAvion1)
                    .addComponent(cmbEstadoAvion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbAvionCarguero)
                    .addComponent(chbAvionCombate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizar)
                    .addComponent(btnLimpiar))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbEstadoAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoAvionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEstadoAvionActionPerformed

    private void txtFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFabricanteActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombre.setText("");
        txtModelo.setText("");
        txtFabricante.setText("");
        txtCapacidad.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Obtener los valores del enumerador
        EstadoAvion[] avionEstados = EstadoAvion.values();
        // Crear un DefaultComboBoxModel con los valores del enumerador convertidos a strings
        DefaultComboBoxModel<String> cmbEstado = new DefaultComboBoxModel<>();
        for (EstadoAvion estado : avionEstados) {
            cmbEstado.addElement(estado.toString());
        }   
        // Pasar el modelo al comboBox ya existente
        cmbEstadoAvion.setModel(cmbEstado);
        
        // Obtener los valores del enumerador
        TipoAvion[] tipoAvion = TipoAvion.values();
        // Crear un DefaultComboBoxModel con los valores del enumerador convertidos a strings
        DefaultComboBoxModel<String> cmbTipo = new DefaultComboBoxModel<>();
        for (TipoAvion tipo : tipoAvion) {
            cmbTipo.addElement(tipo.toString());
        }   
        // Pasar el modelo al comboBox ya existente
        cmbTipoAvion.setModel(cmbTipo);
        
    }//GEN-LAST:event_formWindowOpened

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        if (btnFinalizar.getText().equals("Agregar")){
            
            String nombre = txtNombre.getText();
            String modelo = txtModelo.getText();
            String fabricante = txtFabricante.getText();;
            int capacidad =  Integer.parseInt(txtCapacidad.getText());
            String tipoAvion = cmbTipoAvion.getSelectedItem().toString();
            String estadoAvion = cmbEstadoAvion.getSelectedItem().toString();;
            boolean avionCarguero = chbAvionCarguero.isSelected();
            boolean avionCombate = chbAvionCombate.isSelected();
            
            if (Avion.guardar(nombre, modelo, fabricante, capacidad, tipoAvion, estadoAvion, avionCarguero, avionCombate)){
                JOptionPane.showMessageDialog(this, "Los valores se han guardado correctamente", "Guardado exitoso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Ha habido un error al guardar los valores", "Error de guardado", JOptionPane.ERROR_MESSAGE);
            }
            
            this.dispose();
        } else {      
            String nombre = txtNombre.getText();
            String modelo = txtModelo.getText();
            String fabricante = txtFabricante.getText();;
            int capacidad =  Integer.parseInt(txtCapacidad.getText());
            String tipoAvion = cmbTipoAvion.getSelectedItem().toString();
            String estadoAvion = cmbEstadoAvion.getSelectedItem().toString();;
            boolean avionCarguero = chbAvionCarguero.isSelected();
            boolean avionCombate = chbAvionCombate.isSelected();
            
            if (Avion.editar(id, nombre, modelo, fabricante, capacidad, tipoAvion, estadoAvion, avionCarguero, avionCombate)){
                JOptionPane.showMessageDialog(this, "Los valores se han guardado correctamente", "Guardado exitoso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Ha habido un error al guardar los valores", "Error de guardado", JOptionPane.ERROR_MESSAGE);
            }
            
            this.dispose();
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void cmbTipoAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoAvionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoAvionActionPerformed

    public void setId(String text) {
        id = Integer.parseInt(text);
    }
    
    public void setBtnFinalizarText(String text){
        btnFinalizar.setText(text);
    }
    
    public void setNombreText(String text) {
        txtNombre.setText(text);
    }
    
    public void setModeloText(String text) {
        txtModelo.setText(text);
    }
    
    public void setFabricanteText(String text) {
        txtFabricante.setText(text);
    }
    
    public void setCapacidadText(String text) {
        txtCapacidad.setText(text);
    }
    
    public void setCmbEstadoAvion(String text) {
        // Analizar cada item del modelo JComboBox
        for (int i = 0; i < cmbEstadoAvion.getItemCount(); i++) {
            String item = cmbEstadoAvion.getItemAt(i);
            if (item.equals(text)) {
                // Asignar el item creado a base del string como el item seleccionado
                cmbEstadoAvion.setSelectedItem(item);
                break;
            }
        }
    }
    
    public void setCmbTipoAvion(String text) {
        // Analizar cada item del modelo JComboBox
        for (int i = 0; i < cmbTipoAvion.getItemCount(); i++) {
            String item = cmbTipoAvion.getItemAt(i);
            if (item.equals(text)) {
                // Asignar el item creado a base del string como el item seleccionado
                cmbTipoAvion.setSelectedItem(item);
                break;
            }
        }
    }
    
    public void setChbAvionCarguero(String text) {
        if (text.equals("SI")){
            chbAvionCarguero.setSelected(true);
        } else if (text.equals("NO")){
            chbAvionCarguero.setSelected(false);
        }
    }        
    
    public void setChbAvionCombate(String text) {
        if (text.equals("SI")){
            chbAvionCarguero.setSelected(true);
        } else if (text.equals("NO")){
            chbAvionCarguero.setSelected(false);
        }
    }   
            
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
            java.util.logging.Logger.getLogger(formAvionesEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formAvionesEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formAvionesEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formAvionesEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formAvionesEditar dialog = new formAvionesEditar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private int id;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox chbAvionCarguero;
    private javax.swing.JCheckBox chbAvionCombate;
    private javax.swing.JComboBox<String> cmbEstadoAvion;
    private javax.swing.JComboBox<String> cmbTipoAvion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblTipoAvion;
    private javax.swing.JLabel lblTipoAvion1;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
