package vista;

import conexion.ConexionBD;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sql.EntidadProducto;
import sql.ProductoSQL;

/**
 *
 * @author basti
 */
public class Ventana_Ingreso_Producto extends javax.swing.JInternalFrame {

    ConexionBD conexion = new ConexionBD();
    ProductoSQL ps = new ProductoSQL();
    DefaultTableModel modelo = new DefaultTableModel();
    String cod;

    public Ventana_Ingreso_Producto() {
        initComponents();
        listar();
    }

    void listar() {
        List<EntidadProducto> lista = ps.listar();
        modelo = (DefaultTableModel) table_in_pro.getModel();
        Object[] ob = new Object[3];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getCodigo();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getPrecio();
            modelo.addRow(ob);
        }
        table_in_pro.setModel(modelo);
    }
      

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_in_pro_precio = new javax.swing.JTextField();
        txt_in_pro_codigo = new javax.swing.JTextField();
        txt_in_pro_nombre = new javax.swing.JTextField();
        btn_in_pro_limpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_in_pro_agregar = new javax.swing.JButton();
        btn_in_pro_modificar = new javax.swing.JButton();
        btn_in_pro_eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_in_pro = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Ingreso Producto");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Bicon.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 249, 249));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Ingreso Producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Bytes50.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 260, 70));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Bytes50.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 30, 260, 70));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Codigo");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(190, 70, 50, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Nombre");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(190, 140, 57, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Precio");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(190, 210, 43, 20);

        txt_in_pro_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_in_pro_precioKeyTyped(evt);
            }
        });
        jPanel2.add(txt_in_pro_precio);
        txt_in_pro_precio.setBounds(100, 240, 240, 30);
        jPanel2.add(txt_in_pro_codigo);
        txt_in_pro_codigo.setBounds(100, 90, 240, 30);
        jPanel2.add(txt_in_pro_nombre);
        txt_in_pro_nombre.setBounds(100, 170, 240, 30);

        btn_in_pro_limpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_in_pro_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpiar32.png"))); // NOI18N
        btn_in_pro_limpiar.setText("Limpiar");
        btn_in_pro_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_in_pro_limpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_in_pro_limpiar);
        btn_in_pro_limpiar.setBounds(90, 360, 120, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/productivo.png"))); // NOI18N
        jLabel6.setText("Datos Productos");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(140, 20, 170, 40);

        btn_in_pro_agregar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_in_pro_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mas.png"))); // NOI18N
        btn_in_pro_agregar.setText("Agregar");
        btn_in_pro_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_in_pro_agregarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_in_pro_agregar);
        btn_in_pro_agregar.setBounds(90, 300, 120, 40);

        btn_in_pro_modificar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_in_pro_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar-documento.png"))); // NOI18N
        btn_in_pro_modificar.setText("Modificar");
        btn_in_pro_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_in_pro_modificarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_in_pro_modificar);
        btn_in_pro_modificar.setBounds(220, 300, 120, 40);

        btn_in_pro_eliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_in_pro_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton-eliminar.png"))); // NOI18N
        btn_in_pro_eliminar.setText("Eliminar");
        btn_in_pro_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_in_pro_eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_in_pro_eliminar);
        btn_in_pro_eliminar.setBounds(220, 360, 120, 40);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 450, 420));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        table_in_pro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        table_in_pro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_in_pro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_in_proMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_in_pro);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 20, 800, 380);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 840, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_in_pro_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_in_pro_agregarActionPerformed
        Agregar();
        
        LimpiarTabla();
        listar();
    }//GEN-LAST:event_btn_in_pro_agregarActionPerformed

    private void btn_in_pro_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_in_pro_modificarActionPerformed
        Modificar();
        LimpiarTabla();
        listar();
    }//GEN-LAST:event_btn_in_pro_modificarActionPerformed

    private void table_in_proMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_in_proMouseClicked
        int fila = table_in_pro.getSelectedRow();
        if (fila == -1) {
            Icon icono = new ImageIcon(getClass().getResource("/iconosjoption/seleccionar.png"));
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila",
                    "Alerta", JOptionPane.DEFAULT_OPTION, icono);
        } else {
            cod = table_in_pro.getValueAt(fila, 0).toString();
            String nombre_prod = table_in_pro.getValueAt(fila, 1).toString();
            String precio_prod = table_in_pro.getValueAt(fila, 2).toString();
            txt_in_pro_codigo.setText(cod);
            txt_in_pro_nombre.setText(nombre_prod);
            txt_in_pro_precio.setText(precio_prod);
            txt_in_pro_codigo.setEditable(false);

        }
    }//GEN-LAST:event_table_in_proMouseClicked

    private void btn_in_pro_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_in_pro_limpiarActionPerformed
        Limpiar();
        LimpiarTabla();
        listar();
    }//GEN-LAST:event_btn_in_pro_limpiarActionPerformed

    private void btn_in_pro_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_in_pro_eliminarActionPerformed
        Eliminar();
        LimpiarTabla();
        listar();
    }//GEN-LAST:event_btn_in_pro_eliminarActionPerformed

    private void txt_in_pro_precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_in_pro_precioKeyTyped
         char C = evt.getKeyChar();

        if (Character.isLetter(C)) {
            getToolkit().beep();
            evt.consume();
            Icon icono = new ImageIcon(getClass().getResource("/iconosjoption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "No se admiten caracterez \n"
                    + "Solo se permiten numeros", "Alerta", JOptionPane.DEFAULT_OPTION, icono);
            txt_in_pro_precio.setCursor(null);
        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            Icon icono = new ImageIcon(getClass().getResource("/iconosjoption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "No se admiten caracterez \n"
                    + "Solo se permiten numeros", "Alerta", JOptionPane.DEFAULT_OPTION, icono);
            txt_in_pro_precio.setCursor(null);
        }
    }//GEN-LAST:event_txt_in_pro_precioKeyTyped

    void Agregar() {
        if (txt_in_pro_codigo.getText().equals("") || txt_in_pro_nombre.getText().equals("")
                || txt_in_pro_precio.getText().equals("")) {
            Icon icono = new ImageIcon(getClass().getResource("/iconosjoption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Hay campos vacios", "Alerta", JOptionPane.DEFAULT_OPTION, icono);
        } else {
            String codigo = txt_in_pro_codigo.getText();
            String nombre = txt_in_pro_nombre.getText();
            String precio = txt_in_pro_precio.getText();

            Object[] ob = new Object[3];
            ob[0] = codigo;
            ob[1] = nombre;
            ob[2] = precio;
            ps.add(ob);
            Icon icono = new ImageIcon(getClass().getResource("/iconosjoption/agregar.png"));
            JOptionPane.showMessageDialog(null, "Producto Agregado Exitosamente!!", "Confirmacion", JOptionPane.DEFAULT_OPTION, icono);
            Limpiar();
        }
    }
    
     void Modificar() {
        if (txt_in_pro_codigo.getText().equals("") || txt_in_pro_nombre.getText().equals("") || 
                txt_in_pro_precio.getText().equals("")) {
            Icon icono = new ImageIcon(getClass().getResource("/iconosjoption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Hay campos vacios", "Alerta", JOptionPane.DEFAULT_OPTION, icono);
        } else {
            String nombre_pro = txt_in_pro_nombre.getText();
            String precio_pro = txt_in_pro_precio.getText();

            Object[] ob = new Object[3];
            ob[0] = nombre_pro;
            ob[1] = precio_pro;
            ob[2] = cod;
            ps.actualizar(ob);
            Icon icono = new ImageIcon(getClass().getResource("/iconosjoption/modificar.png"));
            JOptionPane.showMessageDialog(null, "Producto actualizado", "Confirmacion", JOptionPane.DEFAULT_OPTION, icono);
            Limpiar();
        }
    }

     void Eliminar(){
         if (txt_in_pro_codigo.getText().equals("")) {
            Icon icono = new ImageIcon(getClass().getResource("/iconosjoption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Codigo erroneo", "Alerta", JOptionPane.DEFAULT_OPTION, icono);
        } else {
             String codigo = txt_in_pro_codigo.getText();

            Object[] ob = new Object[1];
            ob[0] = codigo;
            ps.eliminar(codigo);
            
            ps.eliminar(cod);
            Icon icono = new ImageIcon(getClass().getResource("/iconosjoption/eliminar.png"));
            JOptionPane.showMessageDialog(null, "Producto eliminado Exitosamente!!", "Confirmacion", JOptionPane.DEFAULT_OPTION, icono);
            Limpiar();
        }
     }
     
    void Limpiar() {
        txt_in_pro_codigo.setText("");
        txt_in_pro_nombre.setText("");
        txt_in_pro_precio.setText("");
        txt_in_pro_codigo.setEditable(true);
    }

    void LimpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_in_pro_agregar;
    private javax.swing.JButton btn_in_pro_eliminar;
    private javax.swing.JButton btn_in_pro_limpiar;
    private javax.swing.JButton btn_in_pro_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_in_pro;
    private javax.swing.JTextField txt_in_pro_codigo;
    private javax.swing.JTextField txt_in_pro_nombre;
    private javax.swing.JTextField txt_in_pro_precio;
    // End of variables declaration//GEN-END:variables
}
