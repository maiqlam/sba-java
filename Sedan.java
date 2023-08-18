public class Sedan extends Car {
    int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    double getSalePrice() {
        if (length > 20) {
            return regularPrice * .95;
        } else {
            return regularPrice * .90;
        }
    }
}
