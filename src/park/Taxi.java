package park;

public class Taxi implements Meter{
        // Meter인터페이스의 start와 stop메소드를 구현해야 합니다.
        private int distance;

        @Override
        public int stop(int distance){
            this.distance = distance;
            return distance *2;
        }
        @Override
        public void start(){
            System.out.println("시작");
        }

    }
