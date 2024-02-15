package ejercicio;

public class Serie {
    //atributos

    private int n; //tamaño array
    private double numR[] = new double[n];

    //Metodos get y set
    public void setN(int N) {
        this.n = N;
    }

    public int getN() {
        return this.n;
    }

    public void setNumR(double numRR[]) {
        this.numR = numRR;
    }

    public double[] getNumR() {
        return this.numR;
    }

    public String toString() {
        return "";
    }
}
