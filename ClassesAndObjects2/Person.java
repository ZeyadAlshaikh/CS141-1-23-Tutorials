//package ClassesAndObjects2;



public class Person {
    // instance variables 
    private String name; // composition 
    private int age; 
    private  final String ID ; 
    public final double PI = 3.14; 

    // class variable
    private static int count ; 


    // methods 
    // argumentative constructor
    public Person(String name, int age, String id){
        this.name = name; 
        this.age = age ; 
        this.ID = id; 
        count++; 
       
    }
    // no argument constructor
    public Person(){

        this("NA", 0 , "00000");

    }

    public Person(Person p){
        this(p.name, p.age, p.ID);
        //   this.name = p.name; 
        //   this.age = p.age; 
        //   this.ID = p.ID; 
    }

    // instatance methods. 
    public void setName(String name){
        
        this.name = name; 
    }
    public String getName(){
        return name; 
    }

    public void setAge(int age){
        this.age = age; 
    }

    public int getAge(){
        return age; 
    }

    // public void setId(String newId){
    //     if(newId.length() >=5){
    //         ID = newId;
    //     }else {
    //         System.out.println("Id must be >= 5 digits");
    //         ID = "000000";
    //     }
    // } 

    public String getId(){
        return ID.substring(0, 3)+"-"+ID.substring(4);
    }

    // class methods
    public static void increamentCount(){
        count++;
    }
    public static int getCount(){
       
        return count;
    }
    

    @Override
    public String toString(){
        return "Name: "+ name + " Age: "+ age + " ID: "+ getId(); 
    }
}
