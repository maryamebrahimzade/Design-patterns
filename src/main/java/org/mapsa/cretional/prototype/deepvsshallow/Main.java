package org.mapsa.cretional.prototype.deepvsshallow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a Honda car object
        List<String> hondaColors = new ArrayList<>();
        hondaColors.add("Red");
        hondaColors.add("Blue");
        Car honda=new Car("Honda",hondaColors);

        // Deep copy of Honda
        Car deepCopyHonda=new Car(honda.name,new ArrayList<>(honda.colors));
        deepCopyHonda.colors.add("Green");
        System.out.print("Deep Copy: ");
        for(String color:deepCopyHonda.colors){
            System.out.print(color+ ",");
        }
        System.out.print("\nOriginal: ");
        for(String color:honda.colors){
            System.out.print(color+",");
        }
        System.out.println("\n");
        // Shallow Copy of Honda
        Car copyHonda=honda;
        copyHonda.colors.add("Green");
        System.out.print("Shallow Copy: ");
        for(String color:copyHonda.colors){
            System.out.print(color+ ",");
        }
        System.out.print("\nOriginal: ");
        for(String color:honda.colors){
            System.out.print(color+",");
        }
    }
}
