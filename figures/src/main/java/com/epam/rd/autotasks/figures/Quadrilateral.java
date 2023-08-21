package com.epam.rd.autotasks.figures;

class Quadrilateral extends Figure {
    private final Point A, B, C, D;

    private final double AX, AY;
    private final double BX, BY;
    private final double CX, CY;
    private final double DX, DY;

    public Quadrilateral(Point A, Point B, Point C, Point D) {
        this.A = A; this.B = B; this.C = C; this.D = D;

        this.AX = A.getX(); this.AY = A.getY();
        this.BX = B.getX(); this.BY = B.getY();
        this.CX = C.getX(); this.CY = C.getY();
        this.DX = D.getX(); this.DY = D.getY();
    }

    @Override
    public double area() {
        return Math.abs((AX * BY - AY * BX) + (BX * CY - BY * CX) + (CX * DY - CY * DX) + (DX * AY - DY * AX)) / 2;
    }

    @Override
    public String pointsToString() {
        return String.format("(%s,%s)(%s,%s)(%s,%s)(%s,%s)", Double.toString(AX), Double.toString(AY), Double.toString(BX), Double.toString(BY), Double.toString(CX), Double.toString(CY), Double.toString(DX), Double.toString(DY));
    }

    @Override
    public Point leftmostPoint() {
        return (AX < BX) ? (AX < CX ? (AX < DX ? A : D) : (CX < DX ? C : D)) : (BX < CX ? (BX < DX ? B : D) : (CX < DX ? C : D));
    }
}
