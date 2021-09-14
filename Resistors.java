import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Resistors{
    public static void main(String[] args) {
        
        //Initializing all Variables
        final Scanner scanner = new Scanner(System.in);
        Map<String, String> data = new HashMap<>();
        int N;
        String temp = "";
        String cNumber = new String();

        //Assigning the color values 
        data.put("black", "0");
        data.put("brown", "1");
        data.put("red", "2");
        data.put("orange", "3");
        data.put("yellow", "4");
        data.put("green", "5");
        data.put("blue", "6");
        data.put("violet", "7");
        data.put("grey", "8");
        data.put("white", "9");

        System.out.println("Enter the number of colors: ");
        N = scanner.nextInt();
        System.out.println("Enter colors in order, from left to right. ");
        for(int i = 0; i < N - 1; i++){
            System.out.print("Enter color " + (i+1) + ": ");
            temp = scanner.next().toLowerCase();
            cNumber = cNumber + data.get(temp);
        }
        System.out.print("Enter color " + N + ": ");
        String y = scanner.next();
        int g = Integer.parseInt(data.get(y));
        double x = Integer.parseInt(cNumber) * Math.pow(10, g);
        System.out.println("Resistance value of the given colors are " + x);
    }
}