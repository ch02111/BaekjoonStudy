import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class P1004 {
    public static void main(String[] args) {
        int testcase;
        int x1, y1, x2, y2;
        int planets;
        Scanner sc = new Scanner(System.in);
        testcase = sc.nextInt();
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        planets = sc.nextInt();
        int cx[] = new int[planets];
        int cy[] = new int[planets];
        int radius[] = new int[planets];
        for (int i = 0; i < planets; i++) {
            cx[i] = sc.nextInt();
            cy[i] = sc.nextInt();
            radius[i] = sc.nextInt();
        }

        System.out.println("테스트 갯수 : " + testcase + ", 출발지 : " + x1 + ", " + y1 + ", 도착지 : " + x2 + ", " + y2);
        for (int i = 0; i < planets; i++) {
            System.out.println("궤도의 중심 : " + cx[i] + ", " + cy[i] + ", 반지름 : " + radius[i]);
        }
    }
}
