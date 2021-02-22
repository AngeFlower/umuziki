/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event;

import Interface.VentsUI;
import MUSIC.Clients;
import MUSIC.Music;
import MUSIC.Vente_music;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ULT
 */
public class VentEvent implements ActionListener{
    
    private VentsUI vent=null;

    public VentEvent(VentsUI ev) {
        vent=ev;
    }
    
    public void actionPerformed(ActionEvent e) {
        MUSIC.Vente_music VM =new Vente_music((Music) vent.getMusic().getSelectedItem(),(Clients)vent.getClient().getSelectedItem(),vent.getPrix().getText());
        VM.creerVente_music();
        JOptionPane.showMessageDialog(null,VM.getInfo());
    }
    
}
