import java.util.Scanner;


public class P24039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 0;
        int temp1 = 0, temp2 = 0;
        while (true) {
            if (isPrime(i)) {
                temp1 = i;
            }
            i++;
            if (isPrime(i)) {
                temp2 = i;
            }
            int tempResult = temp1 * temp2;
            if (tempResult > n && temp1 != temp2) {
                System.out.println(tempResult);
                break;
            }
        }
    }
    
    static boolean isPrime(int num) {
        if (num == 1)
            return false;
        if(num == 2 || num == 3)
            return true;
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
