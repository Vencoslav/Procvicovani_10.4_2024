import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
       List<Integer> seznam = new ArrayList<>();

       for(int i =0; i>10;i++){
           Random random = new Random();
           int nahodna = random.nextInt(100)+1;
           seznam.add(nahodna);
       }
       
        System.out.println("Seznam náhodných čísel:"+seznam);

    }
}