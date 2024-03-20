import java.util.Random;

public class Main {
  public static void main(String[] args) {
 Random random = new Random();
    int[] numbers = new int[5];
    for(int i=0; i<numbers.length; i++){
      numbers[i] = random.nextInt(101); 
    }
    int suma =0;
    for(int number : numbers) {
      suma += number;
    }
    System.out.println("Wygenerowane liczby: ");
    for(int number : numbers) {
      System.out.print(number + " " );
    }
    
    System.out.println("Suma tych liczb =: " + suma);
    
      
  }

}