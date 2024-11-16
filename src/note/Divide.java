//PCCE 기출문제 4번

package note;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        while(number != 0) {
            answer += number % 100;
            // answer = 59
            answer += (number /= 100);
            // number = 48
        }

        System.out.println(answer);
    }
}
