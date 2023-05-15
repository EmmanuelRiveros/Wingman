/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.wingman.ui;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import mx.itson.wingman.DAO.PilotoDAO;
import mx.itson.wingman.entidades.Piloto;
import mx.itson.wingman.enumeradores.EstadoAvion;
import mx.itson.wingman.enumeradores.EstadoPiloto;
import mx.itson.wingman.enumeradores.TipoAvion;

/**
 *
 * @author emman
 */
public class formPilotosEditar extends javax.swing.JDialog {

    /**
     * Creates new form formPilotosEditar
     */
    public formPilotosEditar(java.awt.Frame parent, boolean modal) {
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

        tontin2 = new javax.swing.JButton();
        tontin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbEspecialidad = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();

        tontin2.setText("Limpiar");
        tontin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tontin2ActionPerformed(evt);
            }
        });

        tontin.setText("Editar");
        tontin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tontinActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Estado");

        cmbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATACANTE" }));

        jLabel3.setText("Especialidad");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DISPONIBLE" }));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Editar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLimpiar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btnFinalizar)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizar)
                    .addComponent(btnLimpiar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tontin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tontin2ActionPerformed

    }//GEN-LAST:event_tontin2ActionPerformed

    private void tontinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tontinActionPerformed
 
    }//GEN-LAST:event_tontinActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        PilotoDAO pilotoDAO = new PilotoDAO();
        if (btnFinalizar.getText().equals("Agregar")){

            Piloto piloto = new Piloto();
            
            String nombre = txtNombre.getText();
            TipoAvion especialidad = TipoAvion.valueOf(cmbEspecialidad.getSelectedItem().toString());
            EstadoPiloto estado = EstadoPiloto.valueOf(cmbEstado.getSelectedItem().toString());
            
            piloto.setNombre(nombre);
            piloto.setEspecialidad(especialidad);
            piloto.setEstado(estado);
            
            if (pilotoDAO.agregarPiloto(piloto)){
                JOptionPane.showMessageDialog(this, "Los valores se han guardado correctamente", "Guardado exitoso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Ha habido un error al guardar los valores", "Error de guardado", JOptionPane.ERROR_MESSAGE);
            }

            this.dispose();
        } else {
            Piloto piloto = new Piloto();
            
            String nombre = txtNombre.getText();
            TipoAvion especialidad = TipoAvion.valueOf(cmbEspecialidad.getSelectedItem().toString());
            EstadoPiloto estado = EstadoPiloto.valueOf(cmbEstado.getSelectedItem().toString());
            
            piloto.setPilotoId(id);
            piloto.setNombre(nombre);
            piloto.setEspecialidad(especialidad);
            piloto.setEstado(estado);
            

            if (pilotoDAO.editarPiloto(piloto)){
                JOptionPane.showMessageDialog(this, "Los valores se han guardado correctamente", "Guardado exitoso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Ha habido un error al guardar los valores", "Error de guardado", JOptionPane.ERROR_MESSAGE);
            }

            this.dispose();
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombre.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Obtener los valores del enumerador
        EstadoPiloto [] pilotoEstados = EstadoPiloto.values();
        // Crear un DefaultComboBoxModel con los valores del enumerador convertidos a strings
        DefaultComboBoxModel<String> cmbEstadoPiloto = new DefaultComboBoxModel<>();
        for (EstadoPiloto estado : pilotoEstados) {
            cmbEstadoPiloto.addElement(estado.toString());
        }   
        // Pasar el modelo al comboBox ya existente
        cmbEstado.setModel(cmbEstadoPiloto);
        
        // Obtener los valores del enumerador
        TipoAvion[] especialidad = TipoAvion.values();
        // Crear un DefaultComboBoxModel con los valores del enumerador convertidos a strings
        DefaultComboBoxModel<String> cmbTipo = new DefaultComboBoxModel<>();
        for (TipoAvion tipo : especialidad) {
            cmbTipo.addElement(tipo.toString());
        }   
        // Pasar el modelo al comboBox ya existente
        cmbEspecialidad.setModel(cmbTipo);
        
    }//GEN-LAST:event_formWindowOpened

    public void setId(String text) {
        id = Integer.parseInt(text);
    }
    
    public void setNombreText(String text) {
        txtNombre.setText(text);
    }
    
    public void setCmbEstadoPiloto(String text) {
        // Analizar cada item del modelo JComboBox
        for (int i = 0; i < cmbEstado.getItemCount(); i++) {
            String item = cmbEstado.getItemAt(i);
            if (item.equals(text)) {
                // Asignar el item creado a base del string como el item seleccionado
                cmbEstado.setSelectedItem(item);
                break;
            }
        }
    }
    
    public void setCmbEspecialidad(String text) {
        // Analizar cada item del modelo JComboBox
        for (int i = 0; i < cmbEspecialidad.getItemCount(); i++) {
            String item = cmbEspecialidad.getItemAt(i);
            if (item.equals(text)) {
                // Asignar el item creado a base del string como el item seleccionado
                cmbEspecialidad.setSelectedItem(item);
                break;
            }
        }
    }
    
    public void setBtnFinalizarText(String text){
        btnFinalizar.setText(text);
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
            java.util.logging.Logger.getLogger(formPilotosEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formPilotosEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formPilotosEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formPilotosEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formPilotosEditar dialog = new formPilotosEditar(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cmbEspecialidad;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton tontin;
    private javax.swing.JButton tontin2;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
