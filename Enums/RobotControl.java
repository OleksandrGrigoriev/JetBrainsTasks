package Enums;

public class RobotControl {
    public static void main(String[] args) {

    }
}

class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        // Variant 1: destination point is located on the same axis with robot: up direction
        if (robot.getX() == toX && robot.getY() < toY) {
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            }
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        }

        // Variant 2: destination point is located on the same axis with robot: down direction
        if (robot.getX() == toX && robot.getY() > toY) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }

        // Variant 3: destination point is located on the same axis with robot: right direction
        if (robot.getY() == toY && robot.getX() < toX) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            }
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        }

        // Variant 4: destination point is located on the same axis with robot: left direction
        if (robot.getY() == toY && robot.getX() < toX) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            }
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }

        // Variant 5: destination point is located on upper right quarter
        if (robot.getX() < toX && robot.getY() < toY) {
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            }
            while (robot.getY() <= toY) {
                robot.stepForward();
            }
            robot.turnRight();
            while (robot.getX() <= toX) {
                robot.stepForward();
            }
        }

        // Variant 6: destination point is located on down right quarter
        if (robot.getX() < toX && robot.getY() > toY) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getY() >= toY) {
                robot.stepForward();
            }
            robot.turnLeft();
            while (robot.getX() <= toX) {
                robot.stepForward();
            }
        }

        // Variant 7: destination point is located on upper left quarter
        if (robot.getX() > toX && robot.getY() < toY) {
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            }
            while (robot.getY() <= toY) {
                robot.stepForward();
            }
            robot.turnLeft();
            while (robot.getX() >= toX) {
                robot.stepForward();
            }
        }

        // Variant 8: destination point is located on down left quarter
        if (robot.getX() > toX && robot.getY() > toY) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getY() >= toY) {
                robot.stepForward();
            }
            robot.turnRight();
            while (robot.getX() >= toX) {
                robot.stepForward();
            }
        }
    }
}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}