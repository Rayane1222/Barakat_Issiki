/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatp1;

/**
 *
 * @author mac
 */
public class Athlète {
    String nom;
    int age;
    String sport;
    
     public Athlète(String nom, int age, String sport) {
        this.nom = nom;
        this.age = age;
        this.sport = sport;
    }

    public void entrainement() {
        System.out.println(nom + " s'entraîne pour améliorer ses performances.");
    }

}
