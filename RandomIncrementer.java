import java.util.Random;

public class RandomIncrementer implements Incrementable {

   private int value;

   private static Random rand = new Random();

   public RandomIncrementer() {

      

       value = rand.nextInt(100);

   }

  

   public void increment() {

       value = rand.nextInt(100);

   }

  

   public int getValue() {

       return value;

   }

}