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
public class Music {
    private String title_music,info;
    private int Id_music;
    private Chanteur Id_chanteur;

    public Music(Chanteur Id_chanteur, String title_music) {
        this.title_music = title_music;
        this.Id_chanteur = Id_chanteur;
    }

    public String getInfo() {
        return info;
    }

    public String getTitle_music() {
        return title_music;
    }

    public int getId_music() {
        return Id_music;
    }

    public Chanteur getId_chanteur() {
        return Id_chanteur;
    }

    public Music() {
    }

    public Music(String title_music) {
        this.title_music = title_music;
    }

    @Override
    public String toString() {
        return title_music ;
    }
    public void creer_Music(){
        if(connect.updateBD("insert into music(title_music,Id_chanteur)values('"+this.title_music+"','"+this.Id_chanteur.getId_chanteur()+"')")>0)
            info="enregistrer avec succes";
        else info="enregistrement echoue";
    }
    public static void Tous_Music(javax.swing.JComboBox list) {
      list.removeAllItems();
      ResultSet rs;
      rs=connect.interrogerBD("select * from music");
      list.addItem(new Music());
        try {
      while(rs.next()){
        
              list.addItem(new Music(rs.getString("title_music")));
      }
      } catch (SQLException ex) {
              Logger.getLogger(Music.class.getName()).log(Level.SEVERE, null, ex);
          }
  }
}
