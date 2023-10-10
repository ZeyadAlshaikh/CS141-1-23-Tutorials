public class Stack<T> {
    private final T[] stack; 
    private  int counter;
    //private final int size; 

    public Stack(T[] stack) {
        this.stack = stack;
        //this.size = stack.length;
    }
    public T[] getStack() {
        return stack;
    }
   
    public int getCounter() {
        return counter;
    }

    public T pop(){
        if(counter < 0 ){
            System.out.println("There is nothing to pop");
            return null; 
        }else{
            if(counter >= stack.length) counter--;
            return stack[counter--];
        }

    }

    public void push(T item){
        if(counter < stack.length){
            stack[counter++] = item;
            System.out.println("item: "+ item + " is pushed");
        }else{
            System.out.println("There is no space to push item");
        }
    }

    
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6};

        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};



        Stack<Integer> intStack = new Stack<>(new Integer[6]);


        for (Integer integer : integers) {
            intStack.push(integer);
        }
        for (int i = 0; i < integers.length; i++) {
            System.out.println(intStack.pop());
        }
        
        Stack<Double> doubleStack = new Stack<>(new Double[6]);
        for (Double _double : doubles) {
            doubleStack.push(_double);
        }
        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubleStack.pop());
        }
    }

  
    
}
