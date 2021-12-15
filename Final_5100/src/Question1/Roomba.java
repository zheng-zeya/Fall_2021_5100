package Question1;

public class Roomba implements iRobot{
    int[][] room;
    Direction direction;
    int row = 0;
    int col = 0;

    public Roomba(int[][] room) {
        this.room = room;
        direction = Direction.DOWN;
    }

    int rows = room.length;
    int cols = room[0].length;

    @Override
    public boolean move() {
        if(direction == Direction.UP){
            if(row -1 < 0 || room[row-1][col] == -1){
                return false;
            }
            row --;
        }
        if(direction == Direction.DOWN){
            if(row + 1 > rows || room[row + 1][col] == -1){
                return false;
            }
        }
        if(direction == Direction.LEFT){
            if(col - 1 < 0 || room[row][col -1 ]==-1){
                return false;
            }
        }
        if(direction == Direction.RIGHT){
            if(col + 1 > cols || room[row][col+1] == -1){
                return false;
            }
        }
        return true;
    }

    @Override
    public void turnLeft() {
        if(direction == Direction.LEFT){
            direction = Direction.DOWN;
        }
        else if(direction == Direction.RIGHT){
            direction = Direction.UP;
        }

    }

    @Override
    public void turnRight() {
        if(direction == Direction.LEFT){
            direction = Direction.UP;
        }
        else if(direction == Direction.RIGHT){
            direction = Direction.DOWN;
        }
    }

    @Override
    public void clean() {
        room[row][col] = 1;
    }
}
