/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise5;
import java.util.Scanner;


public class Car implements Reservable{
    Scanner sc=new Scanner(System.in);
    
 String licensePlate;
 String reservedBy;

    public Car(String licensePlate, String reservedBy) {
        this.licensePlate = licensePlate;
        this.reservedBy = reservedBy;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getReservedBy() {
        return reservedBy;
    }

    public void setReservedBy(String reservedBy) {
        this.reservedBy = reservedBy;
    }
    
    
    @Override
    public String getReservationInfo() {
       String devolucion="El que reservó el coche es: "+reservedBy+" la matricula es: "+licensePlate;
     return devolucion;
       
    }

    @Override
    public String reserve(String customerName) {
      customerName=sc.nextLine();
     return "el nombre del cliente es: "+customerName;
        
    }
    
}
