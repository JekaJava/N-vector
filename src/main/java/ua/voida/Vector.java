package ua.voida;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vector {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String first, second;
        int n;
        System.out.print("Please, input size vectors : ");
        n = Integer.parseInt(bufferedReader.readLine());
        double[] arr1 = new double[n];
        double[] arr2 = new double[n];
        System.out.print("Please, input name and coordinates for first vector,");
        System.out.print("name = ");
        first = bufferedReader.readLine();
        System.out.println("coordinates :");
        for (int i = 0; i < n ; i++) {
            arr1[i] = Double.parseDouble(bufferedReader.readLine());
        }
        System.out.print("Please, input name and coordinates for second vector,");
        System.out.print("name = ");
        second = bufferedReader.readLine();
        System.out.println("coordinates :");
        for (int i = 0; i < n ; i++) {
            arr2[i] = Double.parseDouble(bufferedReader.readLine());
        }
        System.out.println(first + " * " + second + " = " + product(arr1, arr2));
    }

    public static double product ( double[] arr1, double[] arr2) {
        double value = 0;
        for (int i = 0; i < arr1.length ; i++) {
            value += arr1[i] * arr2[i];
        }
        return value;
    }
}
