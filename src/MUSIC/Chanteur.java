/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MUSIC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import safi.connect;

/**
 *
 * @author ULT
 */
public class Chanteur {
    private String nom,info;
    private int Id_chanteur;

    public Chanteur(String nom) {
        this.nom = nom;
    }

    public Chanteur() {
    }
    public String getNom() {
        return nom;
    }

    public int getId_chanteur() {
        return Id_chanteur;
    }

    @Override
    public String toString() {
        return nom ;
    }

    public String getInfo() {
        return info;
    }
    
    public void creerChanteur(){
        if(connect.updateBD("insert into chanteur(nom) values('"+this.nom+"')")>0)
            info="Enregistre Avec SUCCES";
        else info="Enregistre ne pas Reussi";
    }
  public static void Tous_Chanteurs(javax.swing.JComboBox list) {
      list.removeAllItems();
      ResultSet rs;
      rs=connect.interrogerBD("select * from chanteur");
      list.addItem(new Chanteur());
        try {
      while(rs.next()){
        
              list.addItem(new Chanteur(rs.getString("nom")));
      }
      } catch (SQLException ex) {
              Logger.getLogger(Chanteur.class.getName()).log(Level.SEVERE, null, ex);
          }
  }
}
