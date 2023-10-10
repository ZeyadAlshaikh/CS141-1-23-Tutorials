

public class Tester {


    public static <T extends Comparable>int countGreaterThan(T[] array, T e){
        int count = 0;

        for (T t : array) {
            if(t.compareTo(e)> 0)
                count++; 
        }

        // for (int i = 0; i < array.length; i++) {
        //      if(array[i].compareTo(e)> 0)
        //         count++; 
        // }

        return count; 
    }



    public static void main(String[] args) {
        OrderedPair<String, Integer> op1 = new OrderedPair<>("Key1", 12345);
        OrderedPair<Integer,Integer> op2 = new OrderedPair<Integer,Integer>(1234, 9876);
        OrderedPair<String, Integer> op3 = new OrderedPair<>("Key1", 12345);

        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);

        System.out.println(Util.compare(op1, op2));
        System.out.println(Util.compare(op1, op3));


        Integer[] array = {1,2,3,4,5,6,7,8,9,10};
        String[] names = {"Ali", "Ahmad", "Khaled", "Muhammad", "Zeyad"};

        System.out.println(countGreaterThan(array, 5));
        System.out.println(countGreaterThan(names,"Ibraheam"));
    }
}
