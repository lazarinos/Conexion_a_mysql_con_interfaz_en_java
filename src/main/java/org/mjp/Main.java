package org.mjp;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame objFP = new JFrame("ventana principal");
        objFP.setContentPane(new frmPrincipal().jpPrincipal);
        objFP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        objFP.pack();
        objFP.setLocationRelativeTo(null);
        objFP.setVisible(true);

      /*  Connection con;
        con = clsConexBD.getConnection();

        clsConexBD.finConexionDB();*/
    }
}
