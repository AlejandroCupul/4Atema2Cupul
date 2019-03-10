
package Pkg4Atema2Tuz;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
       frmPrincipal frm = new frmPrincipal();
       frm.setTitle("Metodos de Solución de Ecuaciones");
       frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frm.setExtendedState(JFrame.MAXIMIZED_BOTH); //maximizar
       frm.setLocationRelativeTo(null); //centrar
       frm.setVisible(true);
       
    }
    
}
