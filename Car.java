public class Car { 
  // Example of Plymorphism - Same Name of Functions, Different Parameters
    public int Run(int speed, int velocity) 
    { 
        return (speed + velocity); 
    } 
  
    public double Run(double speed, double velocity) 
    { 
        return (speed  + velocity); 
    } 

  
  
    // Driver code 
    public static void main(String args[]) 
    { 
        Sum s = new Sum(); 
        System.out.println("Integer" +s.Run(9,5));
        System.out.println("Double" +s.Run(10.5, 20.5)); 
        System.out.println("Tesla Restart" + Tesla.Restart(5));
    } 
} 
// Example of Inheritance Parent Class and Child Class
    public class Tesla extends Car{
        public int Restart(int speed){
           return(Codein.Run(speed,1));
        }
    }
// Expample of Encapsulation
