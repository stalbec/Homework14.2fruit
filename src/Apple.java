public class Apple extends Fruits {
    private String appleVitamin1;
    private String appleVitamin2;
    private String appleVitamin3;

    public Apple(String appleVitamin1, String appleVitamin2, String appleVitamin3) {
        this.appleVitamin1 = appleVitamin1;
        this.appleVitamin2 = appleVitamin2;
        this.appleVitamin3 = appleVitamin3;
    }

    public String getAppleVitamin1() {
        return appleVitamin1;
    }

    public void setAppleVitamin1(String appleVitamin1) {
        this.appleVitamin1 = appleVitamin1;
    }

    public String getAppleVitamin2() {
        return appleVitamin2;
    }

    public void setAppleVitamin2(String appleVitamin2) {
        this.appleVitamin2 = appleVitamin2;
    }

    public String getAppleVitamin3() {
        return appleVitamin3;
    }

    public void setAppleVitamin3(String appleVitamin3) {
        this.appleVitamin3 = appleVitamin3;
    }

    @Override
    public String toString() {
        return "Apple:    " +
                "appleVitamin1:   " + appleVitamin1 +";      " +
                "appleVitamin2:  " + appleVitamin2 +";      " +
                "appleVitamin3:  " + appleVitamin3 +";      " +
                '}';
    }
}

