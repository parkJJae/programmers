//PCCE 기출문제 6번
package note;

public class WaterShortage {
    public int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for(int i=0; i<change.length; i++){
            usage += usage * (change[i] / 100.0); // 실수형 계산이기 때문 형변환 or .0 붙여주기
            total_usage += usage;
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }
}
