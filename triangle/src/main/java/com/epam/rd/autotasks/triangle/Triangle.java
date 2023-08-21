package com.epam.rd.autotasks.triangle;

class Triangle {
    private final double aX, aY;
    private final double bX, bY;
    private final double cX, cY;
    private final double AB, AC, BC;

    public Triangle(Point a, Point b, Point c) {
        this.aX = a.getX(); this.aY = a.getY();
        this.bX = b.getX(); this.bY = b.getY();
        this.cX = c.getX(); this.cY = c.getY();

        this.AB = GetLength (aX, aY, bX, bY);
        this.AC = GetLength (aX, aY, cX, cY);
        this.BC = GetLength (bX, bY, cX, cY);

        if (AB + BC <= AC || AC + BC <= AB || AC + AB <= BC) {
            throw new IllegalArgumentException();
        }
    }

    public double area() {
        double p = (AB + BC + AC) / 2;
        double S = Math.sqrt(p * (p-AB) * (p-BC) * (p-AC));
        return S;
    }

    public Point centroid(){
        Point centerAB = new Point((aX + bX) / 2, (aY + bY) / 2);
        Point centroid = new Point((2 * centerAB.getX() + cX) / 3, (2 * centerAB.getY() + cY) / 3);
        return centroid;
    }

    private double GetLength (double firstX, double firstY, double secondX, double secondY) {
        double length = Math.sqrt(Math.pow(firstX - secondX, 2) + Math.pow(firstY - secondY, 2));
        return length;
    }

}
