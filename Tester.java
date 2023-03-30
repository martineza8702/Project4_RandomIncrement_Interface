
public class Tester {

		   public static void main(String[] args) {

		       SequentialIncrementer inc1 = new SequentialIncrementer();

		       RandomIncrementer inc2 = new RandomIncrementer();

		      

		       System.out.println("Intitial value of sequential incrementer : " + inc1.getValue());

		       System.out.println("Intitial value of random incrementer : " + inc2.getValue());

		      

		       System.out.println("\nCalling increment for both incrementers......");

		       for(int i=1; i<=10; i++) {

		           System.out.println("Increment " + (i) + " : ");

		           inc1.increment();

		           inc2.increment();

		           System.out.println("Value of sequential incrementer : " + inc1.getValue());

		           System.out.println("Value of random incrementer : " + inc2.getValue());

		           System.out.println();

		       }

		   }

		}


