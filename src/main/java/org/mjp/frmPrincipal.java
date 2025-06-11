package org.mjp;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class frmPrincipal {
    public JPanel jpPrincipal;
    private JLabel lblClientes;
    private JTable jtClientes;
    private DefaultTableModel modelo;

    public frmPrincipal() {
        modelo = (DefaultTableModel) jtClientes.getModel();
        modelo.addColumn("Id Cliente");
        modelo.addColumn("Nombres");
        modelo.addColumn("Correo electronico");

        cargarDatos();
    }

    private void cargarDatos(){
        modelo.setRowCount(0);
        String sql = "select * from clientes";

        try {
            Connection con = clsConexBD.getConexBD();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                modelo.addRow(new Object[]{

                        rs.getInt("id_cliente"),
                rs.getString("nombre"),
                rs.getString("email")
            });
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al acargar datos" + e.getMessage());
        }finally {
            clsConexBD.finConexBD();
        }




    }
}
