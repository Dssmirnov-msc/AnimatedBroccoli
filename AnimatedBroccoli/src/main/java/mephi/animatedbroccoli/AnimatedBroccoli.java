/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mephi.animatedbroccoli;

/**
 *
 * @author test2023
 */
public class AnimatedBroccoli {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Broccoli broccoli = new Broccoli();
        System.out.println(broccoli.toString());
        Cabbage bage = new Cabbage(0, 0);
        System.out.println(bage.toString());
        Cabbage cab = new Cabbage();
        System.out.println(cab.toString());
    }
}
