public class Main {
    public static void main(String[] args) {
        Fruits fruits = new Fruits(new Orange("Beta Carotene", "Vitamin C", "Folic acid"),
                new Apple("Iron", "Sinc", "Fosfor"), new Banana("Calcium","Potassium","Fluorine"));

        System.out.println(fruits);
    }
}