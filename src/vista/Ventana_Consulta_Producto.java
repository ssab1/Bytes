package vista;

import conexion.ConexionBD;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import sql.EntidadProducto;
import sql.ProductoSQL;
import conexion.ConexionBD;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author basti
 */
public class Ventana_Consulta_Producto extends javax.swing.JInternalFrame {

    ConexionBD conexion = new ConexionBD();
    ProductoSQL ps = new ProductoSQL();
    DefaultTableModel modelo = new DefaultTableModel();
    EntidadProducto ep = new EntidadProducto();
    ProductoSQL psql = new ProductoSQL();
    String codigobarra;

    public Ventana_Consulta_Producto() {
        initComponents();
        listar();
    }

    void listar() {
        List<EntidadProducto> lista = ps.listar();
        modelo = (DefaultTableModel) table_consulta.getModel();
        Object[] ob = new Object[3];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getCodigo();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getPrecio();
            modelo.addRow(ob);
        }
        table_consulta.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_consulta = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cunsulta_datos = new javax.swing.JTextField();

        setClosable(true);
        setResizable(true);
        setTitle("Consulta Producto");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Bicon.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 249, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Consulta De Datos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Bytes7575.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        table_consulta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        table_consulta.setModel(new javax.swing.table.DefaultTableModel(
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
        table_consulta.setEnabled(false);
        jScrollPane1.setViewportView(table_consulta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 187, 640, 350));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Codigo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, 30));

        cunsulta_datos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cunsulta_datosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cunsulta_datosKeyTyped(evt);
            }
        });
        jPanel1.add(cunsulta_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cunsulta_datosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cunsulta_datosKeyPressed
           String [] titulos = {"Codigo","Nombre","Precio"};
        String [] registros = new String[50];
        
        String sql = "select * from table_producto where codigo_producto_PK like '%"+cunsulta_datos.getText()+"%'" ;
        modelo = new DefaultTableModel(null, titulos);
        Connection conect = conexion.getconnection();
        try{
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                registros[0] = rs.getString("codigo_producto_PK");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("precio");
                modelo.addRow(registros);
                
            }
            table_consulta.setModel(modelo);
        }catch(Exception e){
            
        }
        
        
    }//GEN-LAST:event_cunsulta_datosKeyPressed

    private void cunsulta_datosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cunsulta_datosKeyTyped
          char C = evt.getKeyChar();

        if (Character.isLetter(C)) {
            getToolkit().beep();
            evt.consume();
            Icon icono = new ImageIcon(getClass().getResource("/iconosjoption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "No se admiten caracterez \n"
                    + "Solo se permiten numeros", "Alerta", JOptionPane.DEFAULT_OPTION, icono);
            cunsulta_datos.setCursor(null);
        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            Icon icono = new ImageIcon(getClass().getResource("/iconosjoption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "No se admiten caracterez \n"
                    + "Solo se permiten numeros", "Alerta", JOptionPane.DEFAULT_OPTION, icono);
            cunsulta_datos.setCursor(null);
        }
    }//GEN-LAST:event_cunsulta_datosKeyTyped

 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cunsulta_datos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_consulta;
    // End of variables declaration//GEN-END:variables
}
