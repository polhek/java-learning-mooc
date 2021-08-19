
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
    }

    public static int sum(ArrayList<Integer> array){
        int sum = 0;
        
        for(int item: array) {
            sum= sum + item;
        }
        return sum;
    }
}
