/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event;

import Interface.MusicUI;
import MUSIC.Chanteur;
import MUSIC.Music;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ULT
 */
public class MusicEvent implements ActionListener{
    private MusicUI mu=null;

    public MusicEvent(MusicUI mus) {
        mu=mus;
    }
    
    public void actionPerformed(ActionEvent e) {
        MUSIC.Music music= new Music((Chanteur) mu.getChanteur().getSelectedItem(),mu.getmusic().getText());
        music.creer_Music();
         JOptionPane.showMessageDialog(null, music.getInfo());
    }
    
}
