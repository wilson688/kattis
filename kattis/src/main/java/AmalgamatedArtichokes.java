import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AmalgamatedArtichokes {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] values = br.readLine().split(" ");
        int p = Integer.parseInt(values[0]);
        int a = Integer.parseInt(values[1]);
        int b = Integer.parseInt(values[2]);
        int c = Integer.parseInt(values[3]);
        int d = Integer.parseInt(values[4]);
        int n = Integer.parseInt(values[5]);

        double[] prices = new double[n];
        double newP = (double) p;
        for (int i = 0; i < n; i++) {

            prices[i] = (double) (p * (Math.sin(a * i + b) + Math.cos(c * i + d) + 2));
        }

        double maxDiff = 0L;
        double currentMax = prices[0];

        for (int i = 1; i < n; i++) {
           if (currentMax > prices[i])
           {
               maxDiff = Math.max(maxDiff, currentMax - prices[i]);
           }
           else
           {
               currentMax = prices[i];
           }
        }

        System.out.println(maxDiff);
    }
}