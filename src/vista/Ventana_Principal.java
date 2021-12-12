/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import sql.EntidadPersonal;
import sql.InicioSesion;
import sql.MysqlExcelReportes;

/**
 *
 * @author basti
 */
public class Ventana_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Principal
     */
    public Ventana_venta vent = null;
    public Ventana_Consulta_Producto vcp = null;
    public Ventana_Reporte_Rango_Fechas vrrf = null;
    public Ventana_Ingreso_Producto vip = null;
    public Ventana_Ingreso_Usuario viu = null;
    public Ventana_Reporte_Producto_Vendidos vrpv = null;

    public Ventana_Principal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/iconos/Bicon.png")).getImage());
        setExtendedState(MAXIMIZED_BOTH);
    }


//    public Ventana_Principal(EntidadPersonal mod)
//    {
//        initComponents();
//        setExtendedState(MAXIMIZED_BOTH);
//        this.mod=mod;
//        if (mod.getRol()==1) {
//            
//        }else if (mod.getRol()==2) {
//            jMenuItem2.setVisible(false);
//        }
//    }
    void ventanaventas() {
        if (vent == null || vent.isClosed()) {
            vent = new Ventana_venta();
            this.Ventana_general.add(vent);
            //agrandar internalframe al tamaño de la pantalla 
            try {
                vent.setMaximum(true);
                vent.show();
            } catch (Exception e) {
            }
        } else {
            Icon icono = new ImageIcon(getClass().getResource("/iconosjoption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Ventana abierta", "Error", JOptionPane.ERROR_MESSAGE, icono);
        }

    }

    void ventaingresoproducto() {
        if (vip == null || vip.isClosed()) {
            vip = new Ventana_Ingreso_Producto();
            this.Ventana_general.add(vip);
            //agrandar internalframe al tamaño de la pantalla 
            try {
                vip.setMaximum(true);
                vip.show();
            } catch (Exception e) {
            }
        } else {
            Icon icono = new ImageIcon(getClass().getResource("/iconosjoption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Ventana abierta", "Error", JOptionPane.ERROR_MESSAGE, icono);
        }

    }

    //Centrar JINTERNALFRAME en pantalla JDESKTOPPANE
    void ventanaconsultaproductos() {
        if (vcp == null || vcp.isClosed()) {
            vcp = new Ventana_Consulta_Producto();
            this.Ventana_general.add(vcp);
            vcp.setVisible(true);
            Dimension desktopSize = Ventana_general.getSize();
            Dimension FrameSize = vcp.getSize();
            vcp.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
            vcp.show();
        } else {
            Icon icono = new ImageIcon(getClass().getResource("/iconosjoption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Ventana abierta", "Error", JOptionPane.ERROR_MESSAGE, icono);
        }
    }

    void ventanareporterangofechas() {
        if (vrrf == null || vrrf.isClosed()) {
            vrrf = new Ventana_Reporte_Rango_Fechas();
            this.Ventana_general.add(vrrf);
            vrrf.setVisible(true);
            Dimension desktopSize = Ventana_general.getSize();
            Dimension FrameSize = vrrf.getSize();
            vrrf.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
            vrrf.show();
        } else {
            Icon icono = new ImageIcon(getClass().getResource("/iconosjoption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Ventana abierta", "Error", JOptionPane.ERROR_MESSAGE, icono);
        }
    }
//     Ventana_Ingreso_Usuario viu= new Ventana_Ingreso_Usuario();
//        viu.setVisible(true);

    void ventanaingresousuario() {
        if (viu == null || viu.isClosed()) {
            viu = new Ventana_Ingreso_Usuario();
            this.Ventana_general.add(viu);
            viu.setVisible(true);
            Dimension desktopSize = Ventana_general.getSize();
            Dimension FrameSize = viu.getSize();
            viu.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
            viu.show();
        } else {
            Icon icono = new ImageIcon(getClass().getResource("/iconosjoption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Ventana abierta", "Error", JOptionPane.ERROR_MESSAGE, icono);
        }
    }

    void ventanaproductorangofechas() {
        if (vrpv == null || vrpv.isClosed()) {
            vrpv = new Ventana_Reporte_Producto_Vendidos();
            this.Ventana_general.add(vrpv);
            vrpv.setVisible(true);
            Dimension desktopSize = Ventana_general.getSize();
            Dimension FrameSize = vrpv.getSize();
            vrpv.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
            vrpv.show();
        } else {
            Icon icono = new ImageIcon(getClass().getResource("/iconosjoption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Ventana abierta", "Error", JOptionPane.ERROR_MESSAGE, icono);
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

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/fondo2.jpg"));
        Image image = icon.getImage();
        Ventana_general = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        }
        ;
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_Ventas = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        Menu_Ingreso_Producto = new javax.swing.JMenuItem();
        Menu_Consulta_Producto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Menu_Reporte_Rango_Fechas = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jmNuevoUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        javax.swing.GroupLayout Ventana_generalLayout = new javax.swing.GroupLayout(Ventana_general);
        Ventana_general.setLayout(Ventana_generalLayout);
        Ventana_generalLayout.setHorizontalGroup(
            Ventana_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );
        Ventana_generalLayout.setVerticalGroup(
            Ventana_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Menu_Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/caja-registradora48.png"))); // NOI18N
        Menu_Ventas.setText("Venta");
        Menu_Ventas.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Menu_Ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_VentasMouseClicked(evt);
            }
        });
        jMenuBar1.add(Menu_Ventas);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cajaproducto.png"))); // NOI18N
        jMenu2.setText("Productos");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        Menu_Ingreso_Producto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Menu_Ingreso_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/inventario.png"))); // NOI18N
        Menu_Ingreso_Producto.setText("Ingreso Productos");
        Menu_Ingreso_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Ingreso_ProductoActionPerformed(evt);
            }
        });
        jMenu2.add(Menu_Ingreso_Producto);

        Menu_Consulta_Producto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        Menu_Consulta_Producto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Menu_Consulta_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/informacion.png"))); // NOI18N
        Menu_Consulta_Producto.setText("Datos Productos");
        Menu_Consulta_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Consulta_ProductoActionPerformed(evt);
            }
        });
        jMenu2.add(Menu_Consulta_Producto);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/reporte-de-negocios.png"))); // NOI18N
        jMenu3.setText("Reportes");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        Menu_Reporte_Rango_Fechas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Menu_Reporte_Rango_Fechas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/calendario.png"))); // NOI18N
        Menu_Reporte_Rango_Fechas.setText("Rango De Fecha");
        Menu_Reporte_Rango_Fechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Reporte_Rango_FechasActionPerformed(evt);
            }
        });
        jMenu3.add(Menu_Reporte_Rango_Fechas);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/reporte_diario.png"))); // NOI18N
        jMenuItem3.setText("Reporte Diario");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/grafico.png"))); // NOI18N
        jMenuItem2.setText("Productos Mas Vendidos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/configuraciones.png"))); // NOI18N
        jMenu4.setText("Ajustes");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salidausuario.png"))); // NOI18N
        jMenuItem1.setText("Cerrar Sistema");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrar-sesionuser.png"))); // NOI18N
        jMenuItem4.setText("Cerrar Sesion");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jmNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevousuario.png"))); // NOI18N
        jmNuevoUsuario.setText("Nuevo Usuario");
        jmNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmNuevoUsuarioActionPerformed(evt);
            }
        });
        jMenu4.add(jmNuevoUsuario);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ventana_general, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ventana_general)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_VentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_VentasMouseClicked
        ventanaventas();
    }//GEN-LAST:event_Menu_VentasMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void Menu_Consulta_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Consulta_ProductoActionPerformed
        ventanaconsultaproductos();
    }//GEN-LAST:event_Menu_Consulta_ProductoActionPerformed

    private void Menu_Reporte_Rango_FechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Reporte_Rango_FechasActionPerformed
        ventanareporterangofechas();
    }//GEN-LAST:event_Menu_Reporte_Rango_FechasActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Inicio_sesion inse = new Inicio_sesion();
        inse.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void Menu_Ingreso_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Ingreso_ProductoActionPerformed
        ventaingresoproducto();
    }//GEN-LAST:event_Menu_Ingreso_ProductoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        MysqlExcelReportes mer = new MysqlExcelReportes();
        mer.reporteventas();
        Icon icono = new ImageIcon(getClass().getResource("/iconosjoption/excel.png"));
        JOptionPane.showMessageDialog(null, "Reporte Generado con exito", "Confirmacion", JOptionPane.ERROR_MESSAGE, icono);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jmNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmNuevoUsuarioActionPerformed
        ventanaingresousuario();
    }//GEN-LAST:event_jmNuevoUsuarioActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ventanaproductorangofechas();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Menu_Consulta_Producto;
    private javax.swing.JMenuItem Menu_Ingreso_Producto;
    private javax.swing.JMenuItem Menu_Reporte_Rango_Fechas;
    private javax.swing.JMenu Menu_Ventas;
    private static javax.swing.JDesktopPane Ventana_general;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private static javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    public static javax.swing.JMenuItem jmNuevoUsuario;
    // End of variables declaration//GEN-END:variables
}
