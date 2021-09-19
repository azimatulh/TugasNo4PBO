import java.io.*;
import java.util.Arrays;

public class dragon {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("input number of Knight : ");
            int number = Integer.parseInt(input.readLine());
            int Knight[] = new int[number];
            for( int i = 0; i < Knight.length; i++ ){
                int y = i+1;
                System.out.print("Knight ke-" + y + ": ");
                Knight[i] = Integer.parseInt(input.readLine());
            }
            System.out.print("input number of Dragon : ");
            int numberin = Integer.parseInt(input.readLine());
            int[] dragon = new int[numberin];
            for( int i = 0; i < dragon.length; i++ ){
                int x = i+1;
                System.out.print("dragon ke-" + x + ": ");
                dragon[i] = Integer.parseInt(input.readLine());
            }
            Arrays.sort(Knight); 
            Arrays.sort(dragon); 
            int indeksDragon = 0; 
            int power = 0; 
            for (int x : Knight) {
                if (indeksDragon < dragon.length) {
                    if (x >= dragon[indeksDragon]) { // dragon[1]
                        power += x;
                        indeksDragon++;
                    }
                }
            }
            System.out.println("---------------------------");
            if (indeksDragon == dragon.length) { // len(dragon)
                System.out.println("Minimum power : " + power);
            } else {
                System.out.println("Knight Fall");
            }
        } catch (IOException exception) {
            System.out.println("Error input!");
        }

    }
}


