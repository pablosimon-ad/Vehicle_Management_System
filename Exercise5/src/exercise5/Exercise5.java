/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise5;

/**
 *
 * @author AM8-PC42
 */
public class Exercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String customerName="";
        
         Reservable car1=new Car("asd1234","Carlos");
        System.out.println(car1.getReservationInfo());
        System.out.println(car1.reserve(customerName));
    }
    
}
