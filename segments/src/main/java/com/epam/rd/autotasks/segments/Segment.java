package com.epam.rd.autotasks.segments;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

class Segment {
    private final Point start, end;

    public Segment(Point start, Point end) {
        if ((start.getX() != end.getX() || start.getY() != end.getY()) && start != null && end != null) {
            this.start = start;
            this.end = end;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    double length() {
        final double length = sqrt(pow(end.getX() - start.getX(), 2) + pow(end.getY() - start.getY(), 2));
        return length;
    }

    Point middle() {
        final Point middlePoint = new Point((start.getX() + end.getX()) / 2, (start.getY() + end.getY()) / 2);
        return middlePoint;
    }

    Point intersection(Segment another) {
        final double k1 = GetK(this);
        final double b1 = GetB(this);
        final double k2 = GetK(another);
        final double b2 = GetB(another);

        if (k1 != k2) {
            final double x = (b2 - b1) / (k1 - k2);
            final double y = k1 * x + b1;

            boolean isBelongToTheFirstSegment = (this.start.getX() <= x && x <= this.end.getX()) || (this.end.getX() <= x && x <= this.start.getX());
            boolean isBelongToTheSecondSegment = (another.start.getX() <= x && x <= another.end.getX()) || (another.end.getX() <= x && x <= another.start.getX());
            if (isBelongToTheFirstSegment && isBelongToTheSecondSegment) {
                return new Point(x, y);
            }
        }
        return null;
    }

    private double GetK(Segment segment) {
        final double k = (segment.end.getY() - segment.start.getY()) / (segment.end.getX() - segment.start.getX());
        return k;
    }

    private double GetB(Segment segment) {
        final double b = (segment.end.getY() * segment.start.getX() - segment.start.getY() * segment.end.getX()) / (segment.start.getX() - segment.end.getX());
        return b;
    }

}
