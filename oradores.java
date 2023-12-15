import com.sun.jdi.connect.spi.Connection;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;



public class oradores extends javax.swing.JFrame {
   conexion cn1 = new conexion();       
   java.sql.Connection conet;
   DefaultTableModel modelo;
   java.sql.Statement st;
   ResultSet res;
   int idc;
   public void generarXML() throws IOException, SQLException {
   String directoryPath = "C:\\Users\\Vaio\\Documents\\NetBeansProjects\\Exponentes\\";
   String fileName = "oradores.xml";
   String filePath = directoryPath + fileName;

   try {
       Path path = Paths.get(filePath);
       Files.deleteIfExists(path);

       FileWriter fileWriter = new FileWriter(filePath);
       BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

       bufferedWriter.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
       bufferedWriter.newLine();
       bufferedWriter.write("<oradores>");
       bufferedWriter.newLine();

       Statement st = conet.createStatement();
       ResultSet res = st.executeQuery("SELECT * FROM oradores_tp");

       while (res.next()) {
           String line = "<orador><nombre>" + res.getString("nombre") + "</nombre><apellido>"
                  + res.getString("apellido") + "</apellido><tema>"
                  + res.getString("tema") + "</tema></orador>";
           bufferedWriter.write(line);
           bufferedWriter.newLine();
       }

       bufferedWriter.write("</oradores>");
       bufferedWriter.newLine();

       bufferedWriter.close();
       fileWriter.close();

       JOptionPane.showMessageDialog(null, "Archivo XML creado exitosamente.");
   } catch (IOException | SQLException e) {
       JOptionPane.showMessageDialog(null, "Error al crear el archivo XML: " + e.getMessage());
   }
}

  
    public oradores() {
       initComponents();
       setLocationRelativeTo(null);
       consultar();
          
   }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTema = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnElimina = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemaActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        jLabel3.setText("NOMBRE");

        jLabel4.setText("APELLIDO");

        jLabel5.setText("TEMA");

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnElimina.setText("ELIMINAR");
        btnElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaActionPerformed(evt);
            }
        });

        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .addGap(120, 120, 120))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTema)
                                    .addComponent(txtNombre)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAgregar)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnElimina)))
                        .addGap(0, 63, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btnNuevo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnElimina))
                .addGap(17, 17, 17)
                .addComponent(btnNuevo))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO", "TEMA"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTable, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTable, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("ORADORES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
         String nombre=txtNombre.getText();
         String apellido=txtApellido.getText();
         String tema=txtTema.getText();
   
   if (nombre.equals("")|| apellido.equals("")|| tema.equals("")){
       JOptionPane.showMessageDialog(null, "Faltan ingresar datos"); 
       limpiarTabla();
        
   } else{
       String sql= "insert into oradores_tp(nombre,apellido,tema) values ('"+nombre+"','"+apellido+"','"+tema+"')";
       try {
           conet = cn1.getConnetion();
           st = conet.createStatement();
           st.executeUpdate(sql);  
           JOptionPane.showMessageDialog(null, "Nuevo orador registrado");
           limpiarTabla();
           consultar();
        Nuevo();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error al agregar: " + e.getMessage());
       }
   }
      // Llamar al método generarXML después de agregar el nuevo registro
   try {
       generarXML();
   } catch (IOException | SQLException e) {
       JOptionPane.showMessageDialog(null, "Error al generar el archivo XML: " + e.getMessage());
   }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
         int filaSeleccionada = jTable1.getSelectedRow();

    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "Selecciona un orador para modificar");
        return;
    }

    String id = String.valueOf(jTable1.getValueAt(filaSeleccionada, 0));
    String nombre = txtNombre.getText();
    String apellido = txtApellido.getText();
    String tema = txtTema.getText();

    if (nombre.isEmpty() || apellido.isEmpty() || tema.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Completa todos los campos");
        return;
    }

    String sql = "UPDATE oradores_tp SET nombre = ?, apellido = ?, tema = ? WHERE id = ?";
    try {
        conet = cn1.getConnetion();
        PreparedStatement pstmt = conet.prepareStatement(sql);
        pstmt.setString(1, nombre);
        pstmt.setString(2, apellido);
        pstmt.setString(3, tema);
        pstmt.setInt(4, Integer.parseInt(id)); // Asumiendo que el ID es numérico

        int resultado = pstmt.executeUpdate();
        if (resultado > 0) {
            JOptionPane.showMessageDialog(null, "Orador modificado correctamente");
            limpiarTabla();
            consultar();
            Nuevo();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo modificar el orador");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al modificar: " + e.getMessage());
    }
     // Llamar al método generarXML después de agregar el nuevo registro
   try {
       generarXML();
   } catch (IOException | SQLException e) {
       JOptionPane.showMessageDialog(null, "Error al generar el archivo XML: " + e.getMessage());
   }   
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaActionPerformed
        // TODO add your handling code here:
        int fila = jTable1.getSelectedRow();
  if (fila < 0) {
      JOptionPane.showMessageDialog(null, "orador no seleccionado");
      return;
  }
  String id = String.valueOf(jTable1.getValueAt(fila, 0));
  String sql = "delete from oradores_tp where id = " + id;
  try {
      conet = cn1.getConnetion();
      st = conet.createStatement();
      int respuesta = st.executeUpdate(sql);
      if (respuesta == 1) {
          JOptionPane.showMessageDialog(null, "orador eliminado");
        limpiarTabla();
          consultar();
        Nuevo();
      } else {
          JOptionPane.showMessageDialog(null, "error al eliminar");
      }
  } catch (Exception e) {
      // Manejar la excepción
  }
  // Llamar al método generarXML después de agregar el nuevo registro
   try {
       generarXML();
   } catch (IOException | SQLException e) {
       JOptionPane.showMessageDialog(null, "Error al generar el archivo XML: " + e.getMessage());
   }
    }//GEN-LAST:event_btnEliminaActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        Nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int fila= jTable1.getSelectedRow();
   if (fila==-1){
       JOptionPane.showMessageDialog(null, "No se selecciono fila") ;
   } else{
       idc = Integer.parseInt(jTable1.getValueAt(fila, 0).toString());

       String nombre=(String)jTable1.getValueAt(fila,1);
       String apellido=(String)jTable1.getValueAt(fila,2);
       String tema=(String)jTable1.getValueAt(fila,3).toString();
       
       txtId.setText(""+idc);
       txtNombre.setText(nombre);
       txtApellido.setText(apellido);
       txtTema.setText(tema);
   }
    }//GEN-LAST:event_jTable1MouseClicked

 
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new oradores().setVisible(true);
        });
               
    }
    
 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnElimina;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTema;
    // End of variables declaration//GEN-END:variables

    private void limpiarTabla() {
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtTema.setText("");
    }

    private void consultar() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
    modelo.setRowCount(0); // Limpiar la tabla antes de agregar nuevos datos

        String sql = "select * from oradores_tp";
       try {
           conet = cn1.getConnetion();
           st = conet.createStatement();
           res = st.executeQuery(sql);
           
           while (res.next()) {
            Object[] fila = {
                res.getInt("ID"),
                res.getString("Nombre"),
                res.getString("Apellido"),
                res.getString("Tema")
            };
            modelo.addRow(fila);
        }
        jTable1.setModel(modelo);
    } catch (SQLException e) {
        e.printStackTrace(); // Manejar la excepción adecuadamente en tu aplicación
    }
    }

    private void Nuevo() {
    txtId.setText("");
    txtNombre.setText("");
    txtApellido.setText("");
    txtTema.setText("");
    txtId.requestFocus(); // Establecer el foco en el campo ID
    }
    
    
  
    
}