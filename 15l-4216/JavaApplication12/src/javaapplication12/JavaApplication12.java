/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author HamXa
 */


interface vehicle_actions{

 public void movecar();
public void applybreak();
public void startcar();
public void showstatus();
}
interface honda_actions{

 public void fill_petrol();
}
interface  tesla_actions{

 public void charge_battery();
}

abstract class vehicle implements vehicle_actions{
       final String owner="Hamza Usman";       
  // protected boolean fuel_full;
   protected boolean car_stopped;
    protected boolean ignition_started;
    abstract void manufacturer();

    abstract void fuel();
     void getowner(){
     
     System.out.println("this vehicle is owned by"+owner+".");
     } 
    
}
class hondacar extends vehicle implements honda_actions{
         boolean has_petrol;
        static String hmodel="civic";
        static String reg_no="L1234";
         hondacar(){
     this.car_stopped=true;
     this.has_petrol=false;
     this.ignition_started=false;
    
    } 
        public static class showregistrationNo//static nested class
        {
            void display(){
        
             System.out.println("the registration number of this honda car is"+reg_no+".");
    
        }
         }
        public class showModel//non static inner class
        {
          void displaymodel(){
          
          System.out.println("the model of this honda car is"+hmodel+".");
          
          
          }
          
        }
    @Override
    void manufacturer() {
     System.out.println("this vehicle is manufactured by HONDA MOTORS");
    }

    @Override
    void fuel() {
     System.out.println("this vehicle runs on petrol");
     
    
      
    
    }

@Override
    public void movecar() {
      if(car_stopped){
          car_stopped=false;
        System.out.println("car has started moving");
     
      
      }
      else{
          
       System.out.println("car is already moving");
     
      }
    
    }

    @Override
    public void applybreak() {
    if(car_stopped){
        System.out.println("car is already not moving.");
     
      
      }
      else{
          car_stopped=true;
       System.out.println("car is stopped now.");
     
      }
    
    }

    @Override
    public void startcar() {
        if(ignition_started){
        System.out.println("car ignition is already on");
     
      
      }
      else{
          ignition_started=true;
       System.out.println("car ignition is started now.");
     
      } }   

    @Override
    public void showstatus() {
      System.out.println("The current status of car is:");
        
       
      if(ignition_started)
      {
       System.out.println("the ignition of car is on");
      
      }
      else{
      
      System.out.println("the ignition of car is off");
      
      }
      if(car_stopped)
      {
       System.out.println("the car is not moving");
      
      }
      else{
      
      System.out.println("the car is moving");
      
      }
      
    
    
    }

    @Override
    public void fill_petrol() {
       
    if(has_petrol){
        System.out.println("petrol tank is already full");
     
      
      }
      else{
          has_petrol=true;
       System.out.println("petrol is filled now.");
     
      }
    
    }
 

}
class bmwcar extends vehicle implements tesla_actions,honda_actions{
         boolean has_charging;
        boolean has_petrol;
         static String bmodel="i8";
        static String reg_no="L4444";
       
    bmwcar(){
     this.car_stopped=true;
      this.has_petrol=false;
     this.has_charging=false;
     this.ignition_started=false;
    
    } 
    
 public static class showregistrationNo//static nested class
        {
            void display(){
        
             System.out.println("the registration number of this honda car is"+reg_no+".");
    
        }
         }
        public class showModel//non static inner class
        {
          void displaymodel(){
          
          System.out.println("the model of this honda car is"+bmodel+".");
          
          
          }
          
        } 
    @Override
    void manufacturer() {
     System.out.println("this vehicle is manufactured by BMW MOTORS");
    }

    @Override
    void fuel() {
     System.out.println("this vehicle can run on electricity and petrol");
     
    
      
    
    }

@Override
    public void movecar() {
      if(car_stopped){
          car_stopped=false;
        System.out.println("car has started moving");
     
      
      }
      else{
          
       System.out.println("car is already moving");
     
      }
    
    }

    @Override
    public void applybreak() {
    if(car_stopped){
        System.out.println("car is already not moving.");
     
      
      }
      else{
          car_stopped=true;
       System.out.println("car is stopped now.");
     
      }
    
    }

    @Override
    public void startcar() {
        if(ignition_started){
        System.out.println("car ignition is already on");
     
      
      }
      else{
          ignition_started=true;
       System.out.println("car ignition is started now.");
     
      } }   

    @Override
    public void showstatus() {
      System.out.println("The current status of car is:");
        
       
      if(ignition_started)
      {
       System.out.println("the ignition of car is on");
      
      }
      else{
      
      System.out.println("the ignition of car is off");
      
      }
      if(car_stopped)
      {
       System.out.println("the car is not moving");
      
      }
      else{
      
      System.out.println("the car is moving");
      
      }
      
    
    
    }

    @Override
    public void charge_battery() {
       
    if(has_charging){
        System.out.println(" battery charging is already full");
     
      
      }
      else{
          has_charging=true;
       System.out.println("battery charging is complete now.");
     
      }
    
    }
     @Override
    public void fill_petrol() {
       
    if(has_petrol){
        System.out.println("petrol tank is already full");
     
      
      }
      else{
          has_petrol=true;
       System.out.println("petrol is filled now.");
     
      }
    
    }

}

class teslacar extends vehicle implements tesla_actions{
         boolean has_charging;
         static String tmodel="roadster";
        static String reg_no="L1222";
    teslacar(){
     this.car_stopped=true;
     this.has_charging=false;
     this.ignition_started=false;
    
    } 
       public static class showregistrationNo//static nested class
        {
            void display(){
        
             System.out.println("the registration number of this honda car is"+reg_no+".");
    
        }
         }
        public class showModel//non static inner class
        {
          void displaymodel(){
          
          System.out.println("the model of this honda car is"+tmodel+".");
          
          
          }
          
        }
        

     
    @Override
    void manufacturer() {
     System.out.println("this vehicle is manufactured by TESLA MOTORS");
    }

    @Override
    void fuel() {
     System.out.println("this vehicle runs on electricity");
     
    
      
    
    }

@Override
    public void movecar() {
      if(car_stopped){
          car_stopped=false;
        System.out.println("car has started moving");
     
      
      }
      else{
          
       System.out.println("car is already moving");
     
      }
    
    }

    @Override
    public void applybreak() {
    if(car_stopped){
        System.out.println("car is already not moving.");
     
      
      }
      else{
          car_stopped=true;
       System.out.println("car is stopped now.");
     
      }
    
    }

    @Override
    public void startcar() {
        if(ignition_started){
        System.out.println("car ignition is already on");
     
      
      }
      else{
          ignition_started=true;
       System.out.println("car ignition is started now.");
     
      } }   

    @Override
    public void showstatus() {
      System.out.println("The current status of car is:");
        
       
      if(ignition_started)
      {
       System.out.println("the ignition of car is on");
      
      }
      else{
      
      System.out.println("the ignition of car is off");
      
      }
      if(car_stopped)
      {
       System.out.println("the car is not moving");
      
      }
      else{
      
      System.out.println("the car is moving");
      
      }
      
    
    
    }

    @Override
    public void charge_battery() {
       
    if(has_charging){
        System.out.println(" battery charging is already full");
     
      
      }
      else{
          has_charging=true;
       System.out.println("battery charging is complete now.");
     
      }
    
    }
 

}


public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
      vehicle d=new hondacar();
      vehicle a=new teslacar();
       vehicle b=new bmwcar();
       // 1.non abstract method of abstract class vehicle//////////////////////////////////////
       d.getowner(); 
       a.getowner();
       b.getowner();
       // 2.abstract methods of abstract class vehicle//////////////////////////////////////
       // implementation done in class hondacar which is extends vehicle class///////////////////
       d.fuel(); 
       a.fuel();
       b.fuel();
       
       d.manufacturer();
       a.manufacturer();
       b.manufacturer();
      //3. Methods implemented in honda vehicle class present in interface vehicle_actions//////
       d.showstatus();
       d.startcar();
      d.applybreak();
      d.showstatus();
      //4. Methods implemented by hondacar class present in interface honda_actions/////
      hondacar h=new hondacar();
      h.fill_petrol();
      //5. Methods implemented by teslacar class present in interface tesla_actions/////
      teslacar t=new teslacar();
      t.charge_battery();
      //5. Methods implemented by bmwcar class present in interface tesla_actions and honda_actions/////
            bmwcar j=new bmwcar();
            j.charge_battery();
            j.fill_petrol();
      //6. method present in static nested class showregistrationNo displaying static string registrion number      
         hondacar.showregistrationNo reg_info= new hondacar.showregistrationNo();
              reg_info.display();
             teslacar.showregistrationNo reg_info2= new teslacar.showregistrationNo();
              reg_info2.display();
              bmwcar.showregistrationNo reg_info3= new bmwcar.showregistrationNo();
              reg_info3.display();
       //7. method present in non-static inner class showModel displaying static string model of car
         hondacar q=new hondacar();            
         hondacar.showModel m=q.new showModel();
         m.displaymodel();
              
         teslacar w=new teslacar();            
       teslacar.showModel m2=w.new showModel();
      m2.displaymodel();
    
      bmwcar e=new bmwcar();            
       bmwcar.showModel m3=e.new showModel();
      m3.displaymodel();
    
              
              
    
    }
    
}
