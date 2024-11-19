//PCCE 기출문제 10번
package note;
import java.util.*;

    public class Park {
        public static int Solution(int[] mats, String[][] park) {
            int n = park.length; // 공원의 행 길이
            int m = park[0].length; // 공원의 열 길이

            // 돗자리 크기를 내림차순 정렬
            Arrays.sort(mats);
            for (int i = mats.length - 1; i >= 0; i--) {
                int size = mats[i]; // 처음 반복 가장 큰 돗자리부터 가능한지 메서드 돌림.
                if (canPlaceMat(size, park, n, m)) {
                    return size; // 가장 큰 돗자리 크기를 반환
                }
            }
            return -1; // 깔 수 있는 돗자리가 없으면 -1 반환
        }

        private static boolean canPlaceMat(int size, String[][] park, int n, int m) {
            // 공원의 모든 위치에서 size x size 돗자리를 깔 수 있는지 확인
            for (int i = 0; i <= n - size; i++) {
                for (int j = 0; j <= m - size; j++) {
                    if (canFit(i, j, size, park)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private static boolean canFit(int x, int y, int size, String[][] park) {
            // x, y를 시작으로 size x size 영역이 빈 공간인지 확인
            for (int i = x; i < x + size; i++) {
                for (int j = y; j < y + size; j++) {
                    if (!park[i][j].equals("-1")) {
                        return false; // 빈 공간이 아닌 경우
                    }
                }
            }
            return true;
        }

    }



