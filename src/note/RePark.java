package note;

import java.util.Arrays;

public class RePark {
    public int solution(int[] mats, String[][] park) {
        int n = park.length; // 행
        int m = park[0].length; // 열

        Arrays.sort(mats); // 큰 돗자리부터 구하기 위해 내림차순
        for (int i = mats.length -1; i >=0; i--) {
            int size = mats[i]; // 큰 수부터 구하기 위한 size
            if (canmat(n, m, size, park)) {
                return size;
            }
        }
        return -1;
    }

    public boolean canmat( int x, int y, int size, String[][] park) {
        for (int i = 0; i <= x-size; i++) {
            for (int j = 0; j <= y-size; j++) {
                if(cansit(i, j,size,park, x, y)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean cansit(int x, int y, int size, String[][] park, int n, int m) {
        // x, y를 시작으로 size x size 영역이 빈 공간인지 확인
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                // 배열 범위를 초과하지 않도록 확인
                if (i >= n || j >= m || !park[i][j].equals("-1")) {
                    return false; // 빈 공간이 아닌 경우
                }
            }
        }
        return true;
    }

}

