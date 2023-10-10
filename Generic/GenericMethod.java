
public class GenericMethod {
    

    public static void main(String[] args) {

        Integer[] integers = {1, 2, 3, 4, 5, 6};
        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        Character[] characters = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array of integers contains");
        printArray(integers);
        System.out.println("Smallest: "+ getMin(integers));
        
        System.out.println("Array of double contains");
        printArray(doubles);
        System.out.println( "Smallest: "+getMin(doubles));

        System.out.println("Array of characters contains");
        printArray(characters);
        System.out.println( "Smallest: "+getMin(characters));

    }

    public static <T extends Comparable<T>, Z, X > T getMin(T[] array){
        T min = array[0];
        for (int i = 0; i< array.length; i++) {
            if(array[i].compareTo(min) < 0)
                min = array[i];
        }
        return min ; 
    }
    private static <T> void printArray(T[] characters) {
        for (T character : characters) {
            System.out.print( character +", ");
        }
        System.out.println();
    }
    
    // compiler turned it to 
    //  private static void printArray(Object[] characters) {
    //     for (Object character : characters) {
    //         System.out.print( character +", ");
    //     }
    //     System.out.println();
    // }

    

    // public static  Comparable  getMin(Comparable[] array){
    //     Comparable min = array[0];
    //     for (int i = 0; i< array.length; i++) {
    //         if(array[i].compareTo(min) < 0)
    //             min = array[i];
    //     }
    //     return min ; 
    // }


    // private static void printArray(Double[] doubles) {
    //     for (Double _double : doubles) {
    //         System.out.print( _double + ", ");
    //     }
    //     System.out.println();
    // }

    // private static void printArray(Integer[] integers) {
    //     for (Integer integer : integers) {
    //         System.out.print(integer + ", ");
    //     }
    //     System.out.println();
    // }
   
   

    //  private static Comparable getMin(Comparable[] array){
    //     Comparable min = array[0];
    //     for (Comparable integer : array) {
    //         if( integer.compareTo(min) < 0) 
    //             min = integer; 
    //     }
    //     return min; 
    // }

    

    // private static <T> void printArray(T[] array) {
    //     System.out.println("Object method");
    //     for (T element : array) {
    //         System.out.print(element + ", ");
    //     }
    //     System.out.println();
    // }

    /* What actuall happend is  */
    // private static void printArray(Object[] array) {
    //     System.out.println("Object method");
    //     for (Object element : array) {
    //         System.out.print(element + ", ");
    //     }
    //     System.out.println();
    // }


    // private static <T extends Comparable> void smallestElement(T[] array) {
    //     System.out.print("Smallest element: ");
    //     T smallest = array[0];
    //     for (T element : array) {
    //         if (element.compareTo(smallest) < 0)
    //             smallest = element;
    //     }
    //     System.out.println(smallest);
    // }

    /* What actually  is */
    //  private static Comparable void smallestElement(Comparable[] array) {
    //     System.out.print("Smallest element: ");
    //     Comparable smallest = array[0];
    //     for (Comparable element : array) {
    //         if (element.compareTo(smallest) < 0)
    //             smallest = element;
    //     }
    //     System.out.println(smallest);
    // }

    
}
