public class MyOwnAutoShop {
    
    public static void main(String[] args) {
        Sedan redSedan = new Sedan(75, 28000, "Red", 14);

        Ford silverFord = new Ford(90, 45000, "Silver", 2021, 3000);
        Ford blackFord = new Ford(110, 60000, "Black", 2023, 1500);

        Car car = new Car(60, 18000, "Blue");

        System.out.println(redSedan.color + " Sedan | Regular price: $" + String.format("%.2f", redSedan.regularPrice) + " | Promotional price: $" + String.format("%.2f", redSedan.getSalePrice()));
        System.out.println(silverFord.year + " " + silverFord.color + " Ford | Regular price: $" + String.format("%.2f", silverFord.regularPrice) + " | Promotional price: $" + String.format("%.2f", silverFord.getSalePrice()));
        System.out.println(blackFord.year + " " + blackFord.color + " Ford | Regular price: $" + String.format("%.2f", blackFord.regularPrice) + " | Promotional price: $" + String.format("%.2f", blackFord.getSalePrice()));
        System.out.println(car.color + " Car | Regular price: $" + String.format("%.2f", car.getSalePrice()));
    }
}
