
public class SequentialIncrementer implements Incrementable {

   private int value;

   public SequentialIncrementer() {

       value = 0;

   }
   public void increment() {

       value ++;

   }

  

   public int getValue() {

       return value;

   }

}