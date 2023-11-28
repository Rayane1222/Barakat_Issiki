/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatp1;

import java.util.Comparator;

/**
 *
 * @author mac
 */
public class ComparatorSport implements Comparator<Athlète>{
   
    @Override
    public int compare(Athlète o1, Athlète o2) {
        return o1.getSport().compareTo(o2.getSport()); 
    }

}
