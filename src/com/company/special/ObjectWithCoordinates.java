package com.company.special;

import java.util.Objects;

public abstract class ObjectWithCoordinates {
    private int x;
    private int y;

    public ObjectWithCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCoords(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    @Override
    public String toString() {
        return "Объект с координатами{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectWithCoordinates that = (ObjectWithCoordinates) o;
        return x == that.x &&
                y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
