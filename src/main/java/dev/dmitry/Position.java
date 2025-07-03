package dev.dmitry;

import java.util.Objects;

public class Position {

    private final int pointX;
    private final int pointY;

    public Position(int pointX, int ponitY){
        this.pointX = pointX;
        this.pointY = ponitY;
    }

    public int getPointX() {
        return pointX;
    }

    public int getPointY() {
        return pointY;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Position position)) return false;
        return pointX == position.pointX && pointY == position.pointY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }
}
