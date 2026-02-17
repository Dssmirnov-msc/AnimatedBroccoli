/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.animatedbroccoli;

/**
 *
 * @author test2023
 */
public class Cabbage {
    private int weight;
    private double volume;

    public Cabbage() {
    }
    
    public Cabbage(int weight, double volume) {
        this.weight = weight;
        this.volume = volume;
    }

    public int getWeight() {
        return weight;
    }

    public double getVolume() {
        return volume;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Это Капуста";
    }
    
    
    
}
