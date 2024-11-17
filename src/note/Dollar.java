// PCCE 기출문제 9번
package note;

public class Dollar {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int wallet_big = Math.max(wallet[0], wallet[1]);
        int bill_big = Math.max(bill[0], bill[1]);
        int wallet_small = Math.min(wallet[0], wallet[1]);
        int bill_small = Math.min(bill[0], bill[1]);

            // 30 15 26 17 -> 13 17
        // 50 50 100 241
        while(wallet_small<bill_small || wallet_big<bill_big) {
            if(bill_big>wallet_big) {
                bill_big /=2;
                answer++;
            } else if (bill_small>wallet_small) {
                bill_small /=2;
                answer++;
            }

            if(bill_big<bill_small) {
                int temp = bill_big;
                bill_big = bill_small;
                bill_small = temp;
            }
        }


        return answer;
    }
}
