public class Triangle {
    private double sideFirst;
    private double sideSecond;
    private double sideThird;

    public Triangle(double sideFirst, double sideSecond, double sideThird) {
        this.sideFirst = sideFirst;
        this.sideSecond = sideSecond;
        this.sideThird = sideThird;
    }

    public Triangle() {

    }

    public double getSideFirst() {
        return sideFirst;
    }

    public void setSideFirst(double sideFirst) {
        this.sideFirst = sideFirst;
    }

    public double getSideSecond() {
        return sideSecond;
    }

    public void setSideSecond(double sideSecond) {
        this.sideSecond = sideSecond;
    }

    public double getSideThird() {
        return sideThird;
    }

    public void setSideThird(double sideThird) {
        this.sideThird = sideThird;
    }

    public double areaTriangle () {
        double semiPerimeter = (sideFirst+sideSecond+sideThird)/2;
        return Math.sqrt(((semiPerimeter-sideFirst)*(semiPerimeter-sideSecond)*(semiPerimeter-sideThird))*semiPerimeter);

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideFirst=" + sideFirst +
                ", sideSecond=" + sideSecond +
                ", sideThird=" + sideThird +
                '}';
    }
}
