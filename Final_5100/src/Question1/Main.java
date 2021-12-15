package Question1;

public class Main {
//    public enum Direction{
//        Up,
//        DOWN,
//        LEFT,
//        RIGHT
//    }

    public static void main(String[] args) {
        int[][] room = {
                {0,0,0,0},
                {0,0,0,0},
                {-1,0,0,0},
                {0,0,-1,0}
        };
        Roomba roomba = new Roomba(room);
        iRobot.Direction direction = iRobot.Direction.DOWN;
    }
}
