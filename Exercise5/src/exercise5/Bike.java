/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise5;

/**
 *
 * @author AM8-PC42
 */
public class Bike implements Reservable{

     String bikeld;
     String reservedBy;

    public Bike(String bikeld, String reservedBy) {
        this.bikeld = bikeld;
        this.reservedBy = reservedBy;
    }

    public String getBikeld() {
        return bikeld;
    }

    public void setBikeld(String bikeld) {
        this.bikeld = bikeld;
    }

    public String getReservedBy() {
        return reservedBy;
    }

    public void setReservedBy(String reservedBy) {
        this.reservedBy = reservedBy;
    }
    
    @Override
    public String getReservationInfo() {
        
         String devolucion="El que reservó la bici es: "+reservedBy+" la matricula es: "+bikeld;
         return devolucion;
        
    }

    @Override
    public String reserve(String customerName) {
        
         return "el nombre del cliente es: "+customerName;
        
    }
    
}
