
package Pkg4Atema2Tuz;

public class filaAproximaciones {
    private int i;
    private double xi, gxi, error;

    @Override
    public String toString() {
        return "filaAproximaciones{" + "i=" + i + ", xi=" + xi + ", gxi=" + gxi + ", error=" + error + '}';
    }
    
    public void setI(int i) {
        this.i = i;
    }
    public void setXi(double xi) {
        this.xi = xi;
    }

    public void setGxi(double gxi) {
        this.gxi = gxi;
    }

    public void setError(double error) {
        this.error = error;
    }
    
    public int getI() {
        return i;
    }

    public double getXi() {
        return xi;
    }

    public double getGxi() {
        return gxi;
    }

    public double getError() {
        return error;
    }
    
    
}
