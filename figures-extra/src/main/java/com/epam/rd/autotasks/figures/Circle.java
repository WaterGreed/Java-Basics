package com.epam.rd.autotasks.figures;

class Circle extends Figure {
    private final Point O;

    private final double OX, OY;
    private final double R;

    public Circle(Point O, double R) {
        if(O != null) {
            if(R > 0) {
                this.O = O;

                this.OX = O.getX();
                this.OY = O.getY();
                this.R = R;
            }
            else {
                throw new IllegalArgumentException("circle is degenerative");
            }
        }
        else {
            throw new IllegalArgumentException("argument is null");
        }
    }

    @Override
    public Point centroid() {
        return O;
    }

    @Override
    public boolean isTheSame(Figure figure) {
        if(super.isTheSame(figure)) {
            Circle anotherCircle = (Circle)figure;
            return isTheSame(this.R, anotherCircle.R) && isTheSame(this.OX, anotherCircle.OX) && isTheSame(this.OY, anotherCircle.OY);
        }
        return false;
    }
}
