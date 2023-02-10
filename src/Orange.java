public class Orange extends Fruits {
    private String orangeVitamin1;
    private String orangeVitamin2;
    private String orangeVitamin3;

    public Orange(String orangeVitamin1, String orangeVitamin2, String orangeVitamin3) {
        this.orangeVitamin1 = orangeVitamin1;
        this.orangeVitamin2 = orangeVitamin2;
        this.orangeVitamin3 = orangeVitamin3;
    }

    public String getOrangeVitamin1() {
        return orangeVitamin1;
    }

    public void setOrangeVitamin1(String orangeVitamin1) {
        this.orangeVitamin1 = orangeVitamin1;
    }

    public String getOrangeVitamin2() {
        return orangeVitamin2;
    }

    public void setOrangeVitamin2(String orangeVitamin2) {
        this.orangeVitamin2 = orangeVitamin2;
    }

    public String getOrangeVitamin3() {
        return orangeVitamin3;
    }

    public void setOrangeVitamin3(String orangeVitamin3) {
        this.orangeVitamin3 = orangeVitamin3;
    }

    @Override
    public String toString() {
        return "Orange:   " +
                "orangeVitamin1:  " + orangeVitamin1 + ";      " +
                "orangeVitamin2:  " + orangeVitamin2 + ";      " +
                "orangeVitamin3:  " + orangeVitamin3 + ";      " +
                '}';
    }
}
