//package ClassesAndObjects;

 class Car{

}

class A{

}

public class Person {
    // instance variables 
    private String name; 
    private int age; 
    private String id; 

    // methods 
    // argumentative constructor
    public Person(String name, int age, String id){
        this.name = name; 
        this.age = age ; 
        this.id = id; 
    }
    // no argument constructor
    public Person(){
        this("NA", 0, "000000");
    }

    public Person(Person p){
        this(p.name, p.age, p.id);
        // this.name = p.name; 
        // this.age = p.age; 
        // this.id = p.id; 
    }

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

    public void setId(String newId){
        if(newId.length() >=5){
            id = newId;
        }else {
            System.out.println("Id must be >= 5 digits");
            id = "000000";
        }
    }

    public String getId(){
        return id.substring(0, 3)+"-"+id.substring(4);
    }

    public String toString(){
        return "Name: "+ name + " Age: "+ age + " ID: "+ id; 
    }
}
