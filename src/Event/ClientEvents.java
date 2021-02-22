/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event;

import Interface.ClientsUI;
import MUSIC.Clients;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ULT
 */
public class ClientEvents implements ActionListener{
   private ClientsUI cl=null;

    public ClientEvents(ClientsUI clt) {
        cl=clt;
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       MUSIC.Clients clie = new Clients(cl.getnomclient().getText(),cl.getadre().getText(),cl.getnume_tel().getText());
       clie.creerClients();
       JOptionPane.showMessageDialog(null, clie.getInfo());
    }
    
}
