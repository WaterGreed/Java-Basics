package com.epam.rd.autotasks.intersection;

public class Line {
    private final int k, b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        if (other.k == this.k) {
            return null;
        }
        final int x = (other.b - this.b) / (this.k - other.k);
        final int y = x * this.k + this.b;
        return new Point(x, y);
    }
}
