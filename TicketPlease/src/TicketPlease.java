/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Apoorva
 */
public class TicketPlease {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Startup start = new Startup();
                start.setVisible(true);
                start.setSize(1000,667);
            }
        });
    }
    
}
