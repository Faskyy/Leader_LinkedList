import java.util.Queue;
import java.util.LinkedList;


/*******************************************************************************  
 * Stater code for homework assignment 2*  
 * Compilation:  javac Leader.java*  
 * Execution:    java Leader 7 3
 * 
 *  % java Leader 7 3
 *  *  3*  6*  2*  7*  5*  1*  leader:  4
 *  ******************************************************************************/


public class Leader {
    public static void main(String[] args) {
        int n = 9; //number of people
        int m = 5; //m-th person to be eliminated, in this case 3rd person

        // initialize the queue
        Queue<Integer> queue = new LinkedList<Integer>();
        
        //for loops makes queue
        for (int i = 1; i <= n; i++)
            queue.add(i);

        //removes every m value
        //loops through stack again
        while (queue.size() !=1) {
            for (int i = 1; i < m; i++)
                queue.add(queue.remove());
            System.out.print(queue.remove() + " ");
        } 
        //queue.remove is single remaining value
        System.out.println("The remaining value is: " + queue.remove());
    }
}
