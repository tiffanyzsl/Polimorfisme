public abstract class Shape implements Comparable<Shape> {

    // Mètode abstracte
    public abstract double area();

    // Mètode per ordenar les figures per la seva àrea (de menor a major)
    @Override
    public int compareTo(Shape other) {
        return Double.compare(this.area(), other.area());
    }
}