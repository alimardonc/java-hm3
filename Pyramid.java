public class Pyramid {
    private String p, yuzi;

    public Pyramid(int k1, int k2, int gp) {
        int p = k1 + k2 + gp, yuzi = k1 * k2 / 2;
        this.p = p + "";
        this.yuzi = yuzi + "";
    }

    public Pyramid(double k1, double k2, double gp) {
        double p = k1 + k2 + gp, yuzi = k1 * k2 / 2;
        this.p = p + "";
        this.yuzi = yuzi + "";
    }

    public Pyramid(float k1, float k2, float gp) {
        float p = k1 + k2 + gp, yuzi = k1 * k2 / 2;
        this.p = p + "";
        this.yuzi = yuzi + "";
    }

    public Pyramid(long k1, long k2, long gp) {
        long p = k1 + k2 + gp, yuzi = k1 * k2 / 2;
        this.p = p + "";
        this.yuzi = yuzi + "";
    }

    public void print() {
        System.out.println("Piramida perimetri " + p + " va yuzi " + yuzi);
    }
}