package com.epam.rd.autotasks.figures;

class Circle extends Figure {
    private final Point O;

    private final double OX, OY;
    private final double R;

    public Circle(Point O, double R) {
        this.O = O;

        this.OX = O.getX(); this.OY = O.getY();
        this.R = R;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(R, 2);
    }

    @Override
    public String pointsToString() {
        return String.format("(%s,%s)", OX, OY);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + R + "]";
    }

    @Override
    public Point leftmostPoint() {
        return new Point(OX - R, OY);
    }
}
