/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MUSIC;

import safi.connect;

/**
 *
 * @author ULT
 */
public class Vente_music {
    private int ID_vente;
    private Music ID_music;
    private Clients ID_client;
    private String info,prix;

    public Vente_music(Music ID_music, Clients ID_client , String prix) {
        this.ID_client = ID_client;
        this.ID_music = ID_music;
        this.prix = prix;
    }

    public String getInfo() {
        return info;
    }
    
    
    @Override
    public String toString() {
        return "Vente_music{" + "ID_music=" + ID_music + ", ID_client=" + ID_client + ", prix=" + prix + ", ID_vente=" + ID_vente + '}';
    }
    
    public void creerVente_music(){
        if(connect.updateBD("insert into ventes (ID_music, ID_client,prix)values('"+this.ID_music.getId_music()+"','"+this.ID_client.getId_client()+"','"+this.prix+"')")>0)
            info="enregistrer avec succes";
        else info="enregistrement echoue";
    }
    
}
