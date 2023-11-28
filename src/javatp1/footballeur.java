/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatp1;

import java.util.Objects;

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
    
    public void marquerBut() {
        System.out.println(nom + " marque un but !");
    }

    @Override
    public String toString() {
        return "footballeur{" + "NB_cdm=" + NB_cdm + ", NB_de_but=" + NB_de_but + ", possition=" + possition + '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final footballeur other = (footballeur) obj;
        if (this.NB_cdm != other.NB_cdm) {
            return false;
        }
        if (this.NB_de_but != other.NB_de_but) {
            return false;
        }
        return Objects.equals(this.possition, other.possition);
    }

    

    

    
      
      
}
