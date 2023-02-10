public class Banana extends Fruits{
    private String bananasVitamin1;
    private String bananasVitamin2;
    private String bananasVitamin3;

    public Banana(String bananasVitamin1, String bananasVitamin2, String bananasVitamin3) {
        this.bananasVitamin1 = bananasVitamin1;
        this.bananasVitamin2 = bananasVitamin2;
        this.bananasVitamin3 = bananasVitamin3;
    }

    public String getBananasVitamin1() {
        return bananasVitamin1;
    }

    public void setBananasVitamin1(String bananasVitamin1) {
        this.bananasVitamin1 = bananasVitamin1;
    }

    public String getBananasVitamin2() {
        return bananasVitamin2;
    }

    public void setBananasVitamin2(String bananasVitamin2) {
        this.bananasVitamin2 = bananasVitamin2;
    }

    public String getBananasVitamin3() {
        return bananasVitamin3;
    }

    public void setBananasVitamin3(String bananasVitamin3) {
        this.bananasVitamin3 = bananasVitamin3;
    }

    @Override
    public String toString() {
        return "Banana:   " +
                "bananasVitamin1:  " + bananasVitamin1 +";    " +
                "bananasVitamin2:  " + bananasVitamin2 +";    " +
                "bananasVitamin3:  " + bananasVitamin3 +";    " +
                '}';
    }
}
