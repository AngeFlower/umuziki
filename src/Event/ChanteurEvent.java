/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event;

import Interface.ChanteurUI;
import MUSIC.Chanteur;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


/**
 *
 * @author ULT
 */
public class ChanteurEvent implements ActionListener{
    private ChanteurUI ch=null;

    public ChanteurEvent(ChanteurUI chant) {
        ch = chant;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        MUSIC.Chanteur cht = new Chanteur(ch.getnom_chant().getText());
        cht.creerChanteur();
        JOptionPane.showMessageDialog(null, cht.getInfo());
    }
    
}
