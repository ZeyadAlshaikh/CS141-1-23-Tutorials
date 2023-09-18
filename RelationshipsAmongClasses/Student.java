//package RelationshipsAmongClasses.Temp;

public class Student extends Person{
    private String major; 

    public Student(String name, _Date dob, int iD, String major){
        super(name, dob, iD);
        this.major = major; 

    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
        
    }

    @Override
    public String toString() {
        return  super.toString()+ " major=" + major + "";
    }
    

  

}
