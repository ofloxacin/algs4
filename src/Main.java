import edu.princeton.cs.algs4.StdDraw;

public class Main {
    public static void main(String[] args) {
        int N = 100;
        StdDraw.setXscale(0.0D, (double) N);
        StdDraw.setYscale(0.0D, (double) (N * N));
        StdDraw.setPenRadius(0.01D);

        for (int i = 0; i <= N; ++i) {
            StdDraw.point( i, i);
            StdDraw.point( i,  i * i);
            StdDraw.point( i,  i * Math.log( i));
        }

    }

    public static double binomial(int N, int k, double p) {
        if (N == 0 && k == 0) {
            return 1.0D;
        } else {
            return N < 0 && k < 0 ? 0.0D : (1.0D - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
        }
    }
}