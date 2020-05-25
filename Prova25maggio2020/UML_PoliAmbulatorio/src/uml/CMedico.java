/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml;

/**
 *
 * @author Prof
 */
public class CMedico {
    String specializzazione;
    CDate  dataLaurea;  
    int    orarioInizioVisite;
    int    orarioFineVisite;
    boolean setAmbulatorio(){
        boolean disponibile = true;
        CAmbulatorio c = new CAmbulatorio();
        disponibile = c.findAmbulatorio();
        return disponibile;
    }
}
