public class Lists1Exercises {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
        int count = L.size();
        /*创建一个新的list，直到count计数为0 */
        IntList P = new IntList(L.get(count-1) + x, null);
        count -=1;
        while(count >=0){
          
          P = new IntList(L.get(count) + x,P);
          count -=1;
        }
        return P;        
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
        IntList P = L;
        while(P.rest!=null){
          P.first += x;
          P = P.rest;
          
        }
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        System.out.println(L.get(0));
        System.out.println(incrList(L, 3).get(0));
        System.out.println(dincrList(L, 3).get(0));        
    }
}