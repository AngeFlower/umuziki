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
public class Clients {
    private String nom_client,adresse,info,numero_tel;
    private int Id_client;

    public Clients(String nom_client, String adresse, String numero_tel) {
        this.nom_client = nom_client;
        this.adresse = adresse;
        this.numero_tel = numero_tel;
    }

    public Clients() {
    }

    public Clients(String nom_client) {
        this.nom_client = nom_client;
    }

    
    
    public String getNom_client() {
        return nom_client;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getId_client() {
        return Id_client;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return  nom_client ;
    }
    
   

    public void creerClients(){
        if(connect.updateBD("insert into Clients(nom_client,adresse,numero_tel)values('"+this.nom_client+"','"+this.adresse+"','"+this.numero_tel+"')")>0) 
            info="enregistrer avec succes";
        else info="enregistrer echoue";          
            }
    public static void Tous_Clients(javax.swing.JComboBox list) {
      list.removeAllItems();
      ResultSet rs;
      rs=connect.interrogerBD("select * from clients");
      list.addItem(new Clients());
        try {
      while(rs.next()){
        
              list.addItem(new Clients(rs.getString("nom_client")));
      }
      } catch (SQLException ex) {
              Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
          }
  }
}
