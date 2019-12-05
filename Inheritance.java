class Car  
{ 
    public int gear; 
    public int speed; 

 	public Car(int gear, int speed) 
    { 
        this.gear = gear; 
        this.speed = speed; 
    }

        public void applyBrake(int decrement) 
    { 
        speed -= decrement; 
    } 
          
    public void accelerate(int increment) 
    { 
        speed += increment; 
    }  
    
    public String toString()  
    { 
        return("No of gears are "+ gear +"\n" + "speed of Car is "+ speed); 
    }

}

class ElectricCar extends Car  
{ 
	public int battery;

	public ElectricCar(int gear,int speed, int battery) 
    { 
		super(gear, speed); 
        battery = battery; 
	}
	public void Charge(int newValue) 
    { 
        battery = newValue; 
    }  
        public String toString() 
    { 
        return (super.toString()+"\nBattery is "+battery); 
    } 
}

public class Test  
{ 
    public static void main(String args[])  
    { 
          
        ElectricCar ec = new ElectricCar(3, 100, 50); 
        System.out.println(ec.toString()); 
              
    } 
} 
