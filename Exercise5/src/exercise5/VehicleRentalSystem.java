/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise5;


public class VehicleRentalSystem {
    int size=0;
   
    
 Reservable[] arrayreservable=new Reservable[10]; 
 
 public boolean addVehicles(Reservable vehicle){
     if(size>=arrayreservable.length){
         return false;
     }else{
         arrayreservable[size]=vehicle;
         return true;
     }
        
     
 }
 
 public void reserveVehicle(){
     
 }
}
