
package com.mycompany.app_agua_clara;

import Vista.FrmLogin;
import Vista.FrmPrincipal;

public class App_Agua_Clara {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
                new FrmLogin().setLocationRelativeTo(null);
            }
        });
    }
}
