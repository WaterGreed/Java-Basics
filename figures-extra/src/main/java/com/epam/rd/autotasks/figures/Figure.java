package com.epam.rd.autotasks.figures;

import static java.lang.Math.abs;

abstract class Figure{
    protected final double DELTA = 0.001;

    public abstract Point centroid();
    public boolean isTheSame(Figure figure) {
        return this.getClass() == figure.getClass();
    }

    protected boolean isTheSame(double a, double b) {
        return abs(a - b) < DELTA;
    }
}
