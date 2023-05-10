/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;


import DAO.EntradaDAO;
import DAO.ProveedorDAO;
import Modelo.Entrada;
import Modelo.Iva;
import Modelo.Proveedor;
import java.util.List;
import Modelo.Usuario;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class formRegistroEntradasAdd1 extends javax.swing.JFrame {

    Usuario sysUser;
    
    /**
     * Creates new form formUsuarioAdd
     */
    public formRegistroEntradasAdd1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public formRegistroEntradasAdd1(Usuario user) {
        initComponents();
        this.sysUser = user;
        this.setLocationRelativeTo(null);
        this.getPorcentaje();
        this.getproveedores();
    }
    public void getproveedores(){
        ProveedorDAO proveDAO = new ProveedorDAO();
        List<Proveedor> prove = proveDAO.listar();

        jtxentrada.removeAllItems();
        for(Proveedor pro:prove){
            jtxentrada.addItem(new Proveedor(pro.getIdProveedor(), pro.getPrimerNombre()));
        }    
    }
     public void getPorcentaje(){
        
        listIva.removeAllItems();
        listIva.addItem(new Iva("0%",1));
        listIva.addItem(new Iva("12%",2));
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMain = new javax.swing.JPanel();
        labTitle = new javax.swing.JLabel();
        labcodigo = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        labIdProve = new javax.swing.JLabel();
        labFecha = new javax.swing.JLabel();
        labSubTotal = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        labIva = new javax.swing.JLabel();
        labSegundoApellido = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
        txtFecha2 = new javax.swing.JFormattedTextField();
        listIva = new javax.swing.JComboBox<>();
        jtxentrada = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        panMain.setBackground(new java.awt.Color(255, 255, 255));
        panMain.setForeground(new java.awt.Color(255, 255, 255));
        panMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labTitle.setForeground(new java.awt.Color(11, 58, 82));
        labTitle.setText("Registrar Entradas");
        panMain.add(labTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        labcodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labcodigo.setText("Codigo");
        panMain.add(labcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        txtcodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcodigo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        panMain.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 170, 30));

        labIdProve.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labIdProve.setText("ID Provedor");
        panMain.add(labIdProve, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        labFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labFecha.setText("Fecha");
        panMain.add(labFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        labSubTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labSubTotal.setText("Sub Total");
        panMain.add(labSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 20));

        txtSubTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSubTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotalActionPerformed(evt);
            }
        });
        panMain.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 180, 30));

        labIva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labIva.setText("Iva");
        panMain.add(labIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, -1));

        labSegundoApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labSegundoApellido.setText("Total");
        panMain.add(labSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        panMain.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 190, 30));

        btnGuardar.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setText("Cancelar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panMain.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 610, 90, 30));

        btnGuardar1.setBackground(new java.awt.Color(11, 58, 82));
        btnGuardar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar1.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar1.setText("Guardar");
        btnGuardar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        panMain.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, 90, 30));

        txtFecha2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtFecha2.setText("dd/MM/yyyy");
        txtFecha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFecha2ActionPerformed(evt);
            }
        });
        panMain.add(txtFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 210, 30));

        listIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listIvaActionPerformed(evt);
            }
        });
        panMain.add(listIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 200, 30));

        jtxentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxentradaActionPerformed(evt);
            }
        });
        panMain.add(jtxentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panMain, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubTotalActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        
        Entrada entra = new Entrada();
       EntradaDAO EntraDAO = new EntradaDAO();
        
        if(!txtcodigo.getText().equals("") && 
                !txtFecha2.getText().equals("") && !txtSubTotal.getText().equals("") &&
                !txtTotal.getText().equals("") ){
            
            entra.setCodigo((String)txtcodigo.getText());
            entra.setIdProveedor(String.valueOf(jtxentrada.getItemAt(jtxentrada.getSelectedIndex()).getIdProveedor()));     
           
            entra.setSubtotal(Float.parseFloat(txtSubTotal.getText()));
            entra.setValorIva((int) listIva.getItemAt(listIva.getSelectedIndex()).getValor());
            LocalDate fecha = LocalDate.parse(txtFecha2.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy")); 
            entra.setFechaEntrada(fecha);

            
            if(entra.getCodigo().length() > 4 && entra.getCodigo().length() <= 5){
                
                if(entra.getIdProveedor().length() >= 1){
                    if(entra.getIdProveedor().length() <= 11){

                       entra.setEstado(1);
                        entra.setFechaIngreso(LocalDateTime.now());
                        entra.setUsuarioIngreso(sysUser.getUsername());
                            
                        if(EntraDAO.registrar(entra)){                           
                            this.dispose();
                            formRegistroEntradas.getEntradas();

                        }else{
                            JOptionPane.showMessageDialog(null, "No se guradaron los datos.");
                        }
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "El id del provedor debe de ser de 1 caracter maximo 11.");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "El id del provedor debe de ser de 1 caracter maximo 11.");
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "El codigo deber tener 5 caracteres.");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos del formulario.");
        }
        
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void txtFecha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFecha2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFecha2ActionPerformed

    private void listIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listIvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listIvaActionPerformed

    private void jtxentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxentradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxentradaActionPerformed

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
            java.util.logging.Logger.getLogger(formRegistroEntradasAdd1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formRegistroEntradasAdd1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formRegistroEntradasAdd1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formRegistroEntradasAdd1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formRegistroEntradasAdd1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JComboBox<Proveedor> jtxentrada;
    private javax.swing.JLabel labFecha;
    private javax.swing.JLabel labIdProve;
    private javax.swing.JLabel labIva;
    private javax.swing.JLabel labSegundoApellido;
    private javax.swing.JLabel labSubTotal;
    private javax.swing.JLabel labTitle;
    private javax.swing.JLabel labcodigo;
    private javax.swing.JComboBox<Modelo.Iva> listIva;
    private javax.swing.JPanel panMain;
    private javax.swing.JFormattedTextField txtFecha2;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtcodigo;
    // End of variables declaration//GEN-END:variables
}
