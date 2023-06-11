/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import DAO.ParametroDAO;
import Modelo.Parametro;
import Modelo.Usuario;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
/**
 *
 * @author Jonathan
 */
public class formHome extends javax.swing.JFrame {

    /**
     * Creates new form formDashboard
     */
    Usuario sysUser;
    Parametro parametro;
    
    public formHome() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public formHome(Usuario user) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sysUser = user;
        ParametroDAO param = new ParametroDAO();
        parametro = param.leer("EMPR");
        labNameEmpresa.setText(parametro.getValor());
        labUsername.setText(user.getNombreCompleto());
        labFechaActual.setText(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
        __getMenu(user.getNombreRol());
    }

    private void __getMenu(String nombreRol){
        if(!"ADMN".equals(nombreRol)){
            menuItem7.setEnabled(false);
            menuItem7.setText("");
            menuItem8.setEnabled(false);
            menuItem8.setText("");
            menuItem9.setEnabled(false);
            menuItem9.setText("");
            menuItem10.setEnabled(false);
            menuItem10.setText("");
        }
 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panContainer = new javax.swing.JPanel();
        panMenu = new javax.swing.JPanel();
        labNameSystem = new javax.swing.JLabel();
        sepMenu = new javax.swing.JSeparator();
        menuItem1 = new javax.swing.JButton();
        menuItem2 = new javax.swing.JButton();
        menuItem3 = new javax.swing.JButton();
        menuItem4 = new javax.swing.JButton();
        menuItem5 = new javax.swing.JButton();
        menuItem6 = new javax.swing.JButton();
        menuItem7 = new javax.swing.JButton();
        menuItem8 = new javax.swing.JButton();
        menuItem9 = new javax.swing.JButton();
        menuItem10 = new javax.swing.JButton();
        menuItem11 = new javax.swing.JButton();
        menuItem12 = new javax.swing.JButton();
        panHeader = new javax.swing.JPanel();
        labNameEmpresa = new javax.swing.JLabel();
        labFechaActual = new javax.swing.JLabel();
        labUsername = new javax.swing.JLabel();
        panContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".: SIFARM :.");

        panContainer.setBackground(new java.awt.Color(224, 224, 224));

        panMenu.setBackground(new java.awt.Color(11, 58, 82));

        labNameSystem.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labNameSystem.setForeground(new java.awt.Color(255, 255, 255));
        labNameSystem.setText("SIFAR");

        sepMenu.setBackground(new java.awt.Color(255, 255, 255));
        sepMenu.setForeground(new java.awt.Color(255, 255, 255));

        menuItem1.setBackground(new java.awt.Color(11, 58, 82));
        menuItem1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menuItem1.setForeground(new java.awt.Color(255, 255, 255));
        menuItem1.setText("Clientes");
        menuItem1.setBorder(null);
        menuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItem1.setFocusable(false);
        menuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem1ActionPerformed(evt);
            }
        });

        menuItem2.setBackground(new java.awt.Color(11, 58, 82));
        menuItem2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menuItem2.setForeground(new java.awt.Color(255, 255, 255));
        menuItem2.setText("Proveedores");
        menuItem2.setBorder(null);
        menuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItem2.setFocusable(false);
        menuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem2ActionPerformed(evt);
            }
        });

        menuItem3.setBackground(new java.awt.Color(11, 58, 82));
        menuItem3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menuItem3.setForeground(new java.awt.Color(255, 255, 255));
        menuItem3.setText("Productos");
        menuItem3.setBorder(null);
        menuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItem3.setFocusable(false);
        menuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem3ActionPerformed(evt);
            }
        });

        menuItem4.setBackground(new java.awt.Color(11, 58, 82));
        menuItem4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menuItem4.setForeground(new java.awt.Color(255, 255, 255));
        menuItem4.setText("Entradas");
        menuItem4.setBorder(null);
        menuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItem4.setFocusable(false);
        menuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem4ActionPerformed(evt);
            }
        });

        menuItem5.setBackground(new java.awt.Color(11, 58, 82));
        menuItem5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menuItem5.setForeground(new java.awt.Color(255, 255, 255));
        menuItem5.setText("Salidas");
        menuItem5.setBorder(null);
        menuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItem5.setFocusable(false);
        menuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem5ActionPerformed(evt);
            }
        });

        menuItem6.setBackground(new java.awt.Color(11, 58, 82));
        menuItem6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menuItem6.setForeground(new java.awt.Color(255, 255, 255));
        menuItem6.setText("Inventario");
        menuItem6.setBorder(null);
        menuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItem6.setFocusable(false);
        menuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem6ActionPerformed(evt);
            }
        });

        menuItem7.setBackground(new java.awt.Color(11, 58, 82));
        menuItem7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menuItem7.setForeground(new java.awt.Color(255, 255, 255));
        menuItem7.setText("Categorias");
        menuItem7.setBorder(null);
        menuItem7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItem7.setFocusable(false);
        menuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem7ActionPerformed(evt);
            }
        });

        menuItem8.setBackground(new java.awt.Color(11, 58, 82));
        menuItem8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menuItem8.setForeground(new java.awt.Color(255, 255, 255));
        menuItem8.setText("Medidas");
        menuItem8.setBorder(null);
        menuItem8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItem8.setFocusable(false);
        menuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem8ActionPerformed(evt);
            }
        });

        menuItem9.setBackground(new java.awt.Color(11, 58, 82));
        menuItem9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menuItem9.setForeground(new java.awt.Color(255, 255, 255));
        menuItem9.setText("Usuarios");
        menuItem9.setBorder(null);
        menuItem9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItem9.setFocusable(false);
        menuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem9ActionPerformed(evt);
            }
        });

        menuItem10.setBackground(new java.awt.Color(11, 58, 82));
        menuItem10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menuItem10.setForeground(new java.awt.Color(255, 255, 255));
        menuItem10.setText("Roles");
        menuItem10.setBorder(null);
        menuItem10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItem10.setFocusable(false);
        menuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem10ActionPerformed(evt);
            }
        });

        menuItem11.setBackground(new java.awt.Color(11, 58, 82));
        menuItem11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menuItem11.setForeground(new java.awt.Color(255, 255, 255));
        menuItem11.setText("Detalle de Entradas");
        menuItem11.setBorder(null);
        menuItem11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItem11.setFocusable(false);
        menuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem11ActionPerformed(evt);
            }
        });

        menuItem12.setBackground(new java.awt.Color(11, 58, 82));
        menuItem12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menuItem12.setForeground(new java.awt.Color(255, 255, 255));
        menuItem12.setText("Detalle de Salidas");
        menuItem12.setBorder(null);
        menuItem12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItem12.setFocusable(false);
        menuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panMenuLayout = new javax.swing.GroupLayout(panMenu);
        panMenu.setLayout(panMenuLayout);
        panMenuLayout.setHorizontalGroup(
            panMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuItem1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuItem3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuItem4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuItem5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuItem6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuItem7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuItem8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuItem9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuItem10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuItem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panMenuLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(sepMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labNameSystem)
                .addGap(97, 97, 97))
            .addComponent(menuItem11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuItem12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panMenuLayout.setVerticalGroup(
            panMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labNameSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(sepMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuItem3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuItem4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuItem11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuItem5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuItem12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuItem6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuItem7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuItem8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuItem9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuItem10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panHeader.setBackground(new java.awt.Color(30, 150, 210));

        labNameEmpresa.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labNameEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        labNameEmpresa.setText("labNameEmpresa");

        labFechaActual.setBackground(new java.awt.Color(255, 255, 255));
        labFechaActual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labFechaActual.setForeground(new java.awt.Color(255, 255, 255));
        labFechaActual.setText("labFechaActual");

        labUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labUsername.setForeground(new java.awt.Color(255, 255, 255));
        labUsername.setText("labUsername");

        javax.swing.GroupLayout panHeaderLayout = new javax.swing.GroupLayout(panHeader);
        panHeader.setLayout(panHeaderLayout);
        panHeaderLayout.setHorizontalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHeaderLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panHeaderLayout.createSequentialGroup()
                        .addComponent(labNameEmpresa)
                        .addGap(0, 612, Short.MAX_VALUE))
                    .addGroup(panHeaderLayout.createSequentialGroup()
                        .addComponent(labFechaActual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labUsername)))
                .addContainerGap())
        );
        panHeaderLayout.setVerticalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHeaderLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labNameEmpresa)
                .addGap(18, 18, 18)
                .addGroup(panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labUsername)
                    .addComponent(labFechaActual))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panContent.setBackground(new java.awt.Color(224, 224, 224));
        panContent.setMinimumSize(new java.awt.Dimension(900, 0));

        javax.swing.GroupLayout panContentLayout = new javax.swing.GroupLayout(panContent);
        panContent.setLayout(panContentLayout);
        panContentLayout.setHorizontalGroup(
            panContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panContentLayout.setVerticalGroup(
            panContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panContainerLayout = new javax.swing.GroupLayout(panContainer);
        panContainer.setLayout(panContainerLayout);
        panContainerLayout.setHorizontalGroup(
            panContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panContainerLayout.createSequentialGroup()
                .addComponent(panMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panContainerLayout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(panHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panContainerLayout.setVerticalGroup(
            panContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panContainerLayout.createSequentialGroup()
                .addComponent(panHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem1ActionPerformed
        formClientes clt = new formClientes(sysUser);
        clt.setSize(900,700);
        clt.setLocation(0,0);

        panContent.removeAll();
        panContent.add(clt,BorderLayout.CENTER);
        panContent.revalidate();
        panContent.repaint();
    }//GEN-LAST:event_menuItem1ActionPerformed

    private void menuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem2ActionPerformed
       formProveedores prv = new formProveedores(sysUser);
        prv.setSize(900, 700);
        prv.setLocation(0,0);

        panContent.removeAll();
        panContent.add(prv,BorderLayout.CENTER);
        panContent.revalidate();
        panContent.repaint();
    }//GEN-LAST:event_menuItem2ActionPerformed

    private void menuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem3ActionPerformed
        formProductos prd = new formProductos(sysUser);
        prd.setSize(900,700);
        prd.setLocation(0,0);

        panContent.removeAll();
        panContent.add(prd,BorderLayout.CENTER);
        panContent.revalidate();
        panContent.repaint();
    }//GEN-LAST:event_menuItem3ActionPerformed

    private void menuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem4ActionPerformed
        formRegistroEntradas entr = new formRegistroEntradas(sysUser);
        entr.setSize(900,700);
        entr.setLocation(0,0);

        panContent.removeAll();
        panContent.add(entr,BorderLayout.CENTER);
        panContent.revalidate();
        panContent.repaint();
    }//GEN-LAST:event_menuItem4ActionPerformed

    private void menuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem5ActionPerformed
        formRegistroSalidas sld = new formRegistroSalidas(sysUser);
        sld.setSize(900,700);
        sld.setLocation(0,0);

        panContent.removeAll();
        panContent.add(sld,BorderLayout.CENTER);
        panContent.revalidate();
        panContent.repaint();
    }//GEN-LAST:event_menuItem5ActionPerformed

    private void menuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem6ActionPerformed
        formInventario inv = new formInventario();
        inv.setSize(900,700);
        inv.setLocation(0,0);

        panContent.removeAll();
        panContent.add(inv,BorderLayout.CENTER);
        panContent.revalidate();
        panContent.repaint();
    }//GEN-LAST:event_menuItem6ActionPerformed

    private void menuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem7ActionPerformed
        formCategorias ctg = new formCategorias(sysUser);
        ctg.setSize(900,700);
        ctg.setLocation(0,0);

        panContent.removeAll();
        panContent.add(ctg,BorderLayout.CENTER);
        panContent.revalidate();
        panContent.repaint();
    }//GEN-LAST:event_menuItem7ActionPerformed

    private void menuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem8ActionPerformed
        formMedidas mdd = new formMedidas(sysUser);
        mdd.setSize(900,700);
        mdd.setLocation(0,0);

        panContent.removeAll();
        panContent.add(mdd,BorderLayout.CENTER);
        panContent.revalidate();
        panContent.repaint();
    }//GEN-LAST:event_menuItem8ActionPerformed

    private void menuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem9ActionPerformed
        formUsuarios usu = new formUsuarios(sysUser);
        usu.setSize(900,700);
        usu.setLocation(0,0);

        panContent.removeAll();
        panContent.add(usu,BorderLayout.CENTER);
        panContent.revalidate();
        panContent.repaint();
    }//GEN-LAST:event_menuItem9ActionPerformed

    private void menuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem10ActionPerformed
        formRoles rl = new formRoles(sysUser);
        rl .setSize(900,700);
        rl .setLocation(0,0);

        panContent.removeAll();
        panContent.add(rl ,BorderLayout.CENTER);
        panContent.revalidate();
        panContent.repaint();
    }//GEN-LAST:event_menuItem10ActionPerformed

    private void menuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem11ActionPerformed
        formDetalleEntrada1 entr = new formDetalleEntrada1(sysUser);
        entr.setSize(900,700);
        entr.setLocation(0,0);

        panContent.removeAll();
        panContent.add(entr,BorderLayout.CENTER);
        panContent.revalidate();
        panContent.repaint();
    }//GEN-LAST:event_menuItem11ActionPerformed

    private void menuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem12ActionPerformed
        formDetalleSalida entr = new formDetalleSalida(sysUser);
        entr.setSize(900,700);
        entr.setLocation(0,0);

        panContent.removeAll();
        panContent.add(entr,BorderLayout.CENTER);
        panContent.revalidate();
        panContent.repaint();
    }//GEN-LAST:event_menuItem12ActionPerformed

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
            java.util.logging.Logger.getLogger(formHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labFechaActual;
    private javax.swing.JLabel labNameEmpresa;
    private javax.swing.JLabel labNameSystem;
    private javax.swing.JLabel labUsername;
    private javax.swing.JButton menuItem1;
    private javax.swing.JButton menuItem10;
    private javax.swing.JButton menuItem11;
    private javax.swing.JButton menuItem12;
    private javax.swing.JButton menuItem2;
    private javax.swing.JButton menuItem3;
    private javax.swing.JButton menuItem4;
    private javax.swing.JButton menuItem5;
    private javax.swing.JButton menuItem6;
    private javax.swing.JButton menuItem7;
    private javax.swing.JButton menuItem8;
    private javax.swing.JButton menuItem9;
    private javax.swing.JPanel panContainer;
    private javax.swing.JPanel panContent;
    private javax.swing.JPanel panHeader;
    private javax.swing.JPanel panMenu;
    private javax.swing.JSeparator sepMenu;
    // End of variables declaration//GEN-END:variables
}
