package mx.itson.wingman.ui;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.itson.wingman.entidades.Avion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lm
 */
public class formAviones extends javax.swing.JFrame {

    /**
     * Creates new form FormulariAviones
     */
    public formAviones() {
        initComponents();
        cargarTablaAviones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAviones = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, -1, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        tblAviones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"3", "FSDF", "SDF", "SDF", "5", "TRANSPORTE", "EN_VUELO", "SI", "NO"}
            },
            new String [] {
                "Id", "Nombre", "Modelo", "Fabricante", "Capacidad", "Tipo Avion", "Estado Avion", "Avion Cargero", "Avion Combate"
            }
        ));
        jScrollPane1.setViewportView(tblAviones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 750, 260));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Aviones");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // Abrir nueva ventana
        formTrabajo formTrabajo = new formTrabajo();
        formTrabajo.setVisible(true);

        // Cerrar ventana actual
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Obtener la fila seleccionada
        int filaSeleccionada = tblAviones.getSelectedRow();

        // Verificar si se ha seleccionado una fila
        if (filaSeleccionada != -1 && tblAviones.getSelectedRowCount() < 2) {
            // Obtener los valores de la fila seleccionada
            String id = tblAviones.getValueAt(filaSeleccionada, 0).toString();
            String nombre = tblAviones.getValueAt(filaSeleccionada, 1).toString();
            String modelo = tblAviones.getValueAt(filaSeleccionada, 2).toString();
            String fabricante = tblAviones.getValueAt(filaSeleccionada, 3).toString();
            String capacidad = tblAviones.getValueAt(filaSeleccionada, 4).toString();
            String tipoAvion = tblAviones.getValueAt(filaSeleccionada, 5).toString();
            String estadoAvion = tblAviones.getValueAt(filaSeleccionada, 6).toString();
            String avionCarguero = tblAviones.getValueAt(filaSeleccionada, 7).toString();
            String avionCombate = tblAviones.getValueAt(filaSeleccionada, 8).toString();

            // Abrir la ventana para editar el avion
            formAvionesEditar formEditar = new formAvionesEditar(this, true);
            
            // Asignar los valores que se obtenieron de la tabla
            formEditar.setId(id);
            formEditar.setNombreText(nombre);
            formEditar.setModeloText(modelo);
            formEditar.setFabricanteText(fabricante);
            formEditar.setCapacidadText(capacidad);
            formEditar.setCmbEstadoAvion(estadoAvion);
            formEditar.setCmbTipoAvion(tipoAvion);
            formEditar.setChbAvionCarguero(avionCarguero);
            formEditar.setChbAvionCombate(avionCombate);
            
            formEditar.setVisible(true);    
                    
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado una fila", "Error de selección", JOptionPane.ERROR_MESSAGE);
        }       
        
        cargarTablaAviones();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        formAvionesEditar formEditar = new formAvionesEditar(this, true);
        formEditar.setBtnFinalizarText("Agregar");
        formEditar.setVisible(true);
          
        cargarTablaAviones();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Crea una variable que almacenara la id de cada columna seleccionada
        int ids[] = tblAviones.getSelectedRows();
        // Asigna la id correspondiente de los actores a cada campo que existe en ids
        for (int i=0; tblAviones.getSelectedRowCount()>i; i++){
            ids[i] = Integer.parseInt(tblAviones.getValueAt(tblAviones.getSelectedRows()[i], 0).toString());
        }
        
        boolean resultado = Avion.eliminar(ids);
          
        // Mostrar un mensaje de dialogo dependiendo del valor de resultado
        if(resultado){
            JOptionPane.showMessageDialog(this, "El registro se actualizo correctamente", "Registro borrado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al borrar", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        cargarTablaAviones();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cargarTablaAviones() {
    DefaultTableModel modelo = (DefaultTableModel) tblAviones.getModel();
    modelo.setRowCount(0);

    List<Avion> aviones = Avion.obtenerTodos();
    for (Avion avion : aviones) {
        
        String avionCarguero = avion.isAvionCarguero() ? "SI" : "NO";
        String avionCombate = avion.isAvionCombate() ? "SI" : "NO";
        
        modelo.addRow(new Object[]{
            avion.getId(),
            avion.getNombre(),
            avion.getModelo(),
            avion.getFabricante(),
            avion.getCapacidad(),
            avion.getTipoAvion(),
            avion.getEstadoAvion(),
            avionCarguero,
            avionCombate
        });
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
            java.util.logging.Logger.getLogger(formAviones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formAviones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formAviones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formAviones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formAviones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAviones;
    // End of variables declaration//GEN-END:variables
}
