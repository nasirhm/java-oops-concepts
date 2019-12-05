public class Student 
{ 
    private String studentName; 
    private int studentRoll; 
    private int studentAge; 
  
    public int getAge()  
    { 
      return studentAge; 
    } 
   
    public String getName()  
    { 
      return studentName; 
    } 
      
    public int getRoll()  
    { 
       return studentRoll; 
    } 
   
    public void setAge( int newAge) 
    { 
      studentAge = newAge; 
    } 
   
    public void setName(String newName) 
    { 
      studentName = newName; 
    } 
      
    public void setRoll( int newRoll)  
    { 
      studentRoll = newRoll; 
    } 
} 
public class TestEncapsulation 
{     
    public static void main (String[] args)  
    { 
        Student obj = new Student(); 
          
        obj.setName("Nasir Hussaain"); 
        obj.setAge(14); 
        obj.setRoll(101); 
          
        System.out.println("Participant's name: " + obj.getName()); 
        System.out.println("Participant's age: " + obj.getAge()); 
        System.out.println("Student's roll: " + obj.getRoll()); 
          
    } 
}