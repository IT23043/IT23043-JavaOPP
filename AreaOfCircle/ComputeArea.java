public class ComputeArea {
    private Double Radius;
    public Double area;

    public void setRadius(Double Rad) {
        Radius = Rad;
    }

    public Double getRadius() {
        return Radius;
    }

    public Double computeArea() {
        return Math.PI * Radius * Radius;
    }

}
