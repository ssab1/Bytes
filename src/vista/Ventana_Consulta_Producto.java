
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

/**
 *
 * @author basti
 */
public class Ventana_Consulta_Producto extends javax.swing.JInternalFrame {

    ConexionBD conexion = new ConexionBD();
    ProductoSQL ps = new ProductoSQL();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public Ventana_Consulta_Producto() {
        initComponents();
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
        cunsulta_datos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
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
                "Codigo", "Nombre", "Precio", "Descuento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_consulta.setEnabled(false);
        jScrollPane1.setViewportView(table_consulta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 187, 640, 350));

        cunsulta_datos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cunsulta_datos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cunsulta_datosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cunsulta_datosKeyTyped(evt);
            }
        });
        jPanel1.add(cunsulta_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 150, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Codigo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cunsulta_datosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cunsulta_datosKeyTyped
         if("".equals(cunsulta_datos.getText())){
            listar();
        }
    }//GEN-LAST:event_cunsulta_datosKeyTyped

    private void cunsulta_datosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cunsulta_datosKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
        try
        {
           listar();
            
        }
        catch(Exception e){
    
}
        }
    }//GEN-LAST:event_cunsulta_datosKeyPressed


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
