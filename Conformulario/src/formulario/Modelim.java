
package formulario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Modelim extends javax.swing.JFrame {

   Conexion cc = new Conexion();
   Connection cn = cc.con;
    public Modelim() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("MODIFICAR/ELIMINAR");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel4.setText("POR FAVOR SELECCIONE EL REGISTRO QUE DESEA MODIFICAR O ELIMINAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(169, 169, 169)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton3)
                .addGap(142, 142, 142)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(260, 260, 260))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llenarCampos(){
        
 
            String sql = "SELECT * FROM respuestas";
            Statement st;
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Id");
            model.addColumn("Nombre");
            model.addColumn("Edad");
            model.addColumn("Sexo");
            model.addColumn("Codigo");
            model.addColumn("conoce");
            model.addColumn("Opinion");
            model.addColumn("Favorito");
            model.addColumn("Mas practicado");
            model.addColumn("Futbol Practica");
            model.addColumn("Basquetbol Practica");
            model.addColumn("Voleibol Practica");
            model.addColumn("Tenis practica");
            model.addColumn("Dias");
            
            jTable1.setModel(model);
            String[]dato = new String[14];
        try {
            st = cn.createStatement();
            ResultSet result  = st.executeQuery(sql);
            
            while (result.next()){
                dato[0] = result.getString(1);
                dato[1] = result.getString(2);
                dato[2] = result.getString(3);
                dato[3] = result.getString(4);
                dato[4] = result.getString(5);
                dato[5] = result.getString(6);
                dato[6] = result.getString(7);
                dato[7] = result.getString(8);
                dato[8] = result.getString(9);
                dato[9] = result.getString(10);
                dato[10] = result.getString(11);
                dato[11] = result.getString(12);
                dato[12] = result.getString(13);
                dato[13] = result.getString(14);
                model.addRow(dato);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Modelim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizarDatos(){
        int fila = jTable1.getSelectedRow();
        
        if(fila<1){
            JOptionPane.showMessageDialog(null, "Seleccione el registro a modificar antes de presionar el boton");
        }
        
        int Id = Integer.parseInt(this.jTable1.getValueAt(fila, 0).toString());
        String Nombre = jTable1.getValueAt(fila, 1).toString();
        String Edad = jTable1.getValueAt(fila, 2).toString();
        String Sexo = jTable1.getValueAt(fila, 3).toString();
        String Codigo = jTable1.getValueAt(fila, 4).toString();
        String Depconoce = jTable1.getValueAt(fila, 5).toString();
        String Opinion = jTable1.getValueAt(fila, 6).toString();
        String Depfavorito = jTable1.getValueAt(fila, 7).toString();
        String Maspracti = jTable1.getValueAt(fila, 8).toString();
        String Practifutbol = jTable1.getValueAt(fila, 9).toString();
        String Practibasquetbol = jTable1.getValueAt(fila, 10).toString();
        String Practivoleibol = jTable1.getValueAt(fila, 11).toString();
        String Practitenis = jTable1.getValueAt(fila, 12).toString();
        String Diaspracti = jTable1.getValueAt(fila, 13).toString();  
        
        try {
            PreparedStatement actu = cn.prepareStatement("UPDATE respuestas SET Nombre='"+Nombre+"',Edad='"+Edad+"',Sexo='"+Sexo+"',Codigo='"+Codigo+"',Deportes_conoce='"+Depconoce+"',Opinion_deportes='"+Opinion+"',Deporte_favorito='"+Depfavorito+"',Deporte_maspracti='"+Maspracti+"',Futbol_practica='"+Practifutbol+"',Basquetbol_practica='"+Practibasquetbol+"',Voleibol_practica='"+Practivoleibol+"',Tenis_practica='"+Practitenis+"',Dias_practica='"+Diaspracti+"' WHERE Id_respuesta='"+Id+"'");
            actu.executeUpdate();
            llenarCampos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "no se ha actualizado correctamente");
        }
        
    }
    
    public void eliminarDatos(){
        
        int fila = jTable1.getSelectedRow();
        
        if(fila<1){
            JOptionPane.showMessageDialog(null, "Seleccione el registro a eliminar antes de presionar el boton");
        }
        
        String valor = jTable1.getValueAt(fila, 0).toString();
        try {
            PreparedStatement elimi = cn.prepareStatement("DELETE FROM respuestas WHERE Id_Respuesta='"+valor+"'");
            elimi.executeUpdate();
            llenarCampos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "No se elimino");
        }
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       eliminarDatos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        formula ver = new formula();
    ver.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    actualizarDatos();
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
