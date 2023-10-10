

public class Util {

    public static boolean compare(Pair p1, Pair p2){
        
        if(p1.getValue().equals(p2.getValue()) && p1.getKey().equals(p2.getKey()))
            return true; 

        return false; 
    }
}
