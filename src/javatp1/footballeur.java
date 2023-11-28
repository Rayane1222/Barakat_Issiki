/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatp1;

/**
 *
 * @author mac
 */
public class footballeur extends Athlète{
      
    int NB_cdm;
    int NB_de_but;
    String possition;

    public footballeur(int NB_cdm, int NB_de_but, String possition, String nom, int age, String sport) {
        super(nom, age, sport);
        this.NB_cdm = NB_cdm;
        this.NB_de_but = NB_de_but;
        this.possition = possition;
    }

    

    

    
      
      
}
