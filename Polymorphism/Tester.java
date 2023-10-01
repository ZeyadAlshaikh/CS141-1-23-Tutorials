

public class Tester {

    public static void main(String[] args) {
        // Animal a1 = new Fish(); 
        // Animal a2 = new Bird(); 
        // Animal a3 = new Frog();


        // a1.move();
        // a2.move();
        // a3.move();


        Animal[] animals = new Animal[3];
        animals[0]= new Fish();
        animals[1] = new Bird();
        animals[2] = new Frog();

        for (Animal animal : animals) {
            animal.move();
            if( animal instanceof Frog)
                ((Frog)animal).eat();
            
        }

        //Animal a = new Animal() ;

    }

    
    
}
