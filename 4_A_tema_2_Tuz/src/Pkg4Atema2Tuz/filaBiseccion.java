
package Pkg4Atema2Tuz;

public class filaBiseccion {
    private int i;
    private double xi, xs, xr, fxi,fxs,fxr, error;

    @Override
    public String toString() {
        return "filaBiseccion{" + "i=" + i + ", xi=" + xi + ", xs=" + xs + ", xr=" + xr + ", fxi=" + fxi + ", fxs=" + fxs + ", fxr=" + fxr + ", error=" + error + '}';
    }
    

    public void setI(int i) {
        this.i = i;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public void setXs(double xs) {
        this.xs = xs;
    }

    public void setXr(double xr) {
        this.xr = xr;
    }

    public void setFxi(double fxi) {
        this.fxi = fxi;
    }

    public void setFxs(double fxs) {
        this.fxs = fxs;
    }

    public void setFxr(double fxr) {
        this.fxr = fxr;
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

    public double getXs() {
        return xs;
    }

    public double getXr() {
        return xr;
    }

    public double getFxi() {
        return fxi;
    }

    public double getFxs() {
        return fxs;
    }

    public double getFxr() {
        return fxr;
    }

    public double getError() {
        return error;
    }
    
    
}
