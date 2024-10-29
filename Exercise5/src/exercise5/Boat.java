/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise5;

/**
 *
 * @author AM8-PC42
 */
public class Boat implements Reservable{
    
     String boatname;
     String reservedBy;

    public Boat(String boatname, String reservedBy) {
        this.boatname = boatname;
        this.reservedBy = reservedBy;
    }

    public String getBoatname() {
        return boatname;
    }

    public void setBoatname(String boatname) {
        this.boatname = boatname;
    }

    public String getReservedBy() {
        return reservedBy;
    }

    public void setReservedBy(String reservedBy) {
        this.reservedBy = reservedBy;
    }
    
    @Override
    public String getReservationInfo() {
        
         String devolucion="El que reservó la bici es: "+reservedBy+" el nombdre del barco es: "+boatname;
         return devolucion;
        
    }

    @Override
    public String reserve(String customerName) {
        
         return "el nombre del cliente es: "+customerName;
  }
}
