public class Truck extends Car {
    int weight;

    public Truck (int speed, double regularPrice, String color, int weight) {
        super (speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    double getSalePrice() {
        if(this.weight > 2000) {
            return this.regularPrice * .90;
        } else {
            return this.regularPrice * .80;
        }
    }
}
