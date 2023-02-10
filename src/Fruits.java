public class Fruits {
    private Orange orange;
    private Apple apple;
    private Banana banana;

    public Fruits(Orange orange, Apple apple, Banana banana) {
        this.orange = orange;
        this.apple = apple;
        this.banana = banana;
    }
    public Fruits() {

    }
    public Orange getOrange() {
        return orange;
    }

    public void setOrange(Orange orange) {
        this.orange = orange;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public Banana getBanana() {
        return banana;
    }

    public void setBanana(Banana banana) {
        this.banana = banana;
    }

    @Override
    public String toString() {
        return "Fruits:      " +"\n"+
                "orange:     " + orange +"\n"+
                "apple:      " + apple +"\n"+
                "banana:     " + banana +"\n"+
                '}';
    }
}
