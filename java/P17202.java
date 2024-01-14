import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class P17202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input_a = sc.nextLine();
        String input_b = sc.nextLine();

        String[] firsta_temp = input_a.split("");
        String[] firstb_temp = input_b.split("");

        List<Integer> first = new ArrayList<Integer>();
        List<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < firsta_temp.length; i++) {
            first.add(Integer.parseInt(firsta_temp[i]));
            first.add(Integer.parseInt(firstb_temp[i]));
        }
        temp = adder(first);
        for (int i = 0; i < 13; i++) {
            temp = adder(temp);
        }
        System.out.println(Integer.toString(temp.get(0)) + Integer.toString(temp.get(1)));
        sc.close();
        
    }

    static List<Integer> adder(List<Integer> list) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i <= (list.size() - 2); i++) {
            int temp = list.get(i) + list.get(i + 1);
            if (temp >= 10)
                temp = temp % 10;
            result.add(temp);
        }
        return result;
    }
}