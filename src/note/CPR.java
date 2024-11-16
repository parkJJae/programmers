//PCCE 기출문제 5번

package note;

public class CPR {
    public int[] solution(String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

        for (int i = 0; i <answer.length; i++) {
            for (int j = 0; j < basic_order.length; j++) {
                if (cpr[i].equals(basic_order[j])) {
                    answer[i] =j;
                    break;
                }
            }
        }
        return answer;
    }
}