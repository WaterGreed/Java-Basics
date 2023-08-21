package com.epam.rd.autotasks.figures;

class Triangle extends Figure {
    private final double AX, AY;
    private final double BX, BY;
    private final double CX, CY;

    public Triangle(Point A, Point B, Point C) {
        if(A != null && B != null && C != null) {
            final double AB = getLength(A, B);
            final double AC = getLength(A, C);
            final double BC = getLength(B, C);

            if(AB + BC > AC + DELTA && AB + AC > BC + DELTA && AC + BC > AB + DELTA) {
                this.AX = A.getX(); this.AY = A.getY();
                this.BX = B.getX(); this.BY = B.getY();
                this.CX = C.getX(); this.CY = C.getY();
            }
            else {
                throw new IllegalArgumentException("triangle is degenerative");
            }
        }
        else {
            throw new IllegalArgumentException("argument is null");
        }
    }

    @Override
    public Point centroid() {
        return new Point((AX + BX + CX) / 3, (AY + BY + CY) / 3);
    }

    @Override
    public boolean isTheSame(Figure figure) {
        if(super.isTheSame(figure)) {
            Triangle anotherTriangle = (Triangle)figure;
            return isTheSame(this.AX, anotherTriangle.AX) && isTheSame(this.AY, anotherTriangle.AY) && isTheSame(this.BX, anotherTriangle.BX) && isTheSame(this.BY, anotherTriangle.BY) &&
                   isTheSame(this.CX, anotherTriangle.CX) && isTheSame(this.CY, anotherTriangle.CY);
        }
        return false;
    }

    private double getLength (Point a, Point b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
}
