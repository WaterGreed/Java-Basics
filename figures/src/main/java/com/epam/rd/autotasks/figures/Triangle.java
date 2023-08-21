package com.epam.rd.autotasks.figures;

class Triangle extends Figure {
    private final Point A, B, C;

    private final double AX, AY;
    private final double BX, BY;
    private final double CX, CY;

    public Triangle(Point A, Point B, Point C) {
        this.A = A; this.B = B; this.C = C;

        this.AX = A.getX(); this.AY = A.getY();
        this.BX = B.getX(); this.BY = B.getY();
        this.CX = C.getX(); this.CY = C.getY();
    }

    @Override
    public double area() {
        return Math.abs((AX * BY - AY * BX) + (BX * CY - BY * CX) + (CX * AY - CY * AX)) / 2;
    }

    @Override
    public String pointsToString() {
        return String.format("(%s,%s)(%s,%s)(%s,%s)", Double.toString(AX), Double.toString(AY), Double.toString(BX), Double.toString(BY), Double.toString(CX), Double.toString(CY));
    }

    @Override
    public Point leftmostPoint() {
        return (AX < BX) ? (AX < CX ? A : C) : (BX < CX ? B : C);
    }
}
