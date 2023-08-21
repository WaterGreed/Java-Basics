package com.epam.rd.autotasks.figures;

class Quadrilateral extends Figure {
    private final double AX, AY;
    private final double BX, BY;
    private final double CX, CY;
    private final double DX, DY;

    public Quadrilateral(Point A, Point B, Point C, Point D) {
        if(A != null && B != null && C != null && D != null) {
            this.AX = A.getX();
            this.AY = A.getY();
            this.BX = B.getX();
            this.BY = B.getY();
            this.CX = C.getX();
            this.CY = C.getY();
            this.DX = D.getX();
            this.DY = D.getY();
            new Triangle(A, B, C);
            new Triangle(D, B, C);
            new Triangle(A, B, D);
            new Triangle(A, D, C);
        }
        else {
            throw new IllegalArgumentException("argument is null");
        }
    }

    @Override
    public Point centroid() {
        return new Point((AX + BX + CX + DX) / 4, (AY + BY + CY + DY) / 4);
    }

    @Override
    public boolean isTheSame(Figure figure) {
        if(super.isTheSame(figure)) {
            Quadrilateral anotherTriangle = (Quadrilateral)figure;
            return isTheSame(this.AX, anotherTriangle.AX) && isTheSame(this.AY, anotherTriangle.AY) && isTheSame(this.BX, anotherTriangle.BX) && isTheSame(this.BY, anotherTriangle.BY) &&
                   isTheSame(this.CX, anotherTriangle.CX) && isTheSame(this.CY, anotherTriangle.CY) && isTheSame(this.DX, anotherTriangle.DX) && isTheSame(this.DY, anotherTriangle.DY);
        }
        return false;
    }
}
