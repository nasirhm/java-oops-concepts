class Multiplication { 
  
    static int Multiply(int a, int b) 
    { 
        return a * b; 
    } 
  
    static int Multiply(int a, int b,int c) 
    { 
        return a * b * c; 
    } 
  
    static double Multiply(double a, double b) 
    { 
        return a * b; 
    } 
    
    static double Multiply(double a, double b, double c) 
    { 
        return a * b * c; 
    } 

} 
  
class Main { 
    public static void main(String[] args) 
    { 
  
        System.out.println(Multiplication.Multiply(2, 4)); 
        System.out.println(Multiplication.Multiply(2, 4, 8)); 
        System.out.println(Multiplication.Multiply(5.5, 6.3)); 
        System.out.println(Multiplication.Multiply(5.5, 6.3,9.9)); 
    } 
} 