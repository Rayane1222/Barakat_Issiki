/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatp1;

/**
 *
 * @author mac
 */
public class basketteur extends Athlète{
      int NB_titre_NBA;

    public basketteur(int NB_titre_NBA, String nom, int age, String sport) {
        super(nom, age, sport);
        this.NB_titre_NBA = NB_titre_NBA;
    }

    public void marquerPanier() {
        System.out.println(nom + " marque un panier !");
    }

    @Override
    public String toString() {
        return "basketteur{" + "NB_titre_NBA=" + NB_titre_NBA + '}';
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
        final basketteur other = (basketteur) obj;
        return this.NB_titre_NBA == other.NB_titre_NBA;
    }
    
    
      
    
}
