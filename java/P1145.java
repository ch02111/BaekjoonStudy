import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class P1145 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int temp = 0;
        int result = 0;
        int count;
        for (int i = 0; i < 5; i++) {
            numbers.add(sc.nextInt());
        }
        while (true) {
            count = 0;
            temp++;
            for (int j = 0; j < 5; j++) {
                if (temp % numbers.get(j) == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                result = temp;
                break;
            }
        }
        System.out.println(result);

    }

}
