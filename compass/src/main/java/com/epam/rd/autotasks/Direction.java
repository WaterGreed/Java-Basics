package com.epam.rd.autotasks;

import java.util.Optional;

public enum Direction {
    N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);

    Direction(final int degrees) {
        this.degrees = degrees;
    }

    private int degrees;

    public static Direction ofDegrees(int degrees) {
        degrees = convertToCorrectDegrees(degrees);
        for(Direction direction : Direction.values()) {
            if(direction.degrees == degrees) {
                return direction;
            }
        }
        return null;
    }

    public static Direction closestToDegrees(int degrees) {
        degrees = convertToCorrectDegrees(degrees);
        for(Direction direction : Direction.values()) {
            if(Math.abs(direction.degrees - degrees) < 22) {
                return direction;
            }
        }
        return null;
    }

    public Direction opposite() {
        return closestToDegrees(convertToCorrectDegrees(this.degrees + 180));
    }

    public int differenceDegreesTo(Direction direction) {
        int difference = Math.abs(this.degrees - direction.degrees);
        return difference > 180? Math.abs(difference - 360) : difference;
    }

    private static int convertToCorrectDegrees(int degrees) {
        while(degrees <= 0) {
            degrees += 360;
        }
        while(degrees >= 360) {
            degrees -= 360;
        }
        return degrees;
    }
}
