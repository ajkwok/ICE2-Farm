import java.util.Scanner;

public class Farm
{
   public static void main (String[] args)
   {
      private int cows, pigs, chickens, sheep, horses;
      
      //create scanner for user input
      Scanner kb = new Scanner(System.in);
      
      //animals classes
      Cow cw = new Cow();
      Pig pg = new Pig();
      Chicken chkn = new Chicken();
      Sheep shp = new Sheep();
      Horse hrs = new Horse();
      
      //user input, asking for type and number of animals and number of weeks
      //while loop for inputting type of animals
      boolean have = false;
      while (!have)
      {
        System.out.print("What kind of animals do you have?(1-cow, 2-pig, 3-chicken, 4-sheep, 5-horse, 6-done) ");
        int type = kb.nextInt();
        switch (type)
        {
           case (1)
           {
              System.out.print("How many cows do you have? ");
              cows = kb.nextInt();
              System.out.print("How many weeks have you had these cows? ");
              int cowWeeks = kb.nextInt();
              break;
           }
           case (2)
           {
              System.out.print("How many pigs do you have? ");
              pigs = kb.nextInt();
              System.out.print("How many weeks have you had these pigs? ");
              int pigWeeks = kb.nextInt();
              break;
           }
           case (3)
           {
              System.out.print("How many chickens do you have? ");
              chickens = kb.nextInt();
              System.out.print("How many weeks have you had these chickens? ");
              int chknWeeks = kb.nextInt();
              break;
           }
           case (4)
           {
              System.out.print("How many sheep do you have? ");
              sheep = kb.nextInt();
              System.out.print("How many weeks have you had these sheep? ");
              int shpWeeks = kb.nextInt();
              break;
           }
           case (5)
           {
              System.out.print("How many horses do you have? ");
              horses = kb.nextInt();
              System.out.print("How many weeks have you had these horses? ");
              int hrsWeeks = kb.nextInt();
              break;
           }
           case (6)
           {
              have = true;
              break;
           }
           default
           {
              System.out.print("Invalid input. Please try again. (1-cows, 2-pigs, 3-chickens, 4-sheep, 5-horses, 6-done) ");
           }
        }
      }
      
      //check on animals, extra/forgot to do something, 
      boolean what = false;
      int 
      System.out.print("What would you like to do? (1-check on animals, 2-make corrections, 3-done) ");
      while (!what)
      {
        switch (type)
        {
           case (1)
           {
              //check cows
              System.out.printf("You have had %d cows for %d weeks.\n", cows, cowWeeks);
              System.out.printf("In that time, they have been fed %d times, given water %d times, ", cw.getFed(), cw.getWatered());
              System.out.printf("taken out for exercise %d times, and milked %d times.\n", cw.getExercise(), cw.getMilk());
              //check pigs
              System.out.printf("You have had %d pigs for %d weeks.\n", pigs, pigWeeks);
              System.out.printf("In that time, they have been fed %d times, given water %d times, ", pg.getFed(), pg.getWatered());
              System.out.printf("taken out for exercise %d times, and played in the mud %d times.\n", pg.getExercise(), pg.getPlay());
              //check chickens
              System.out.printf("You have had %d chickens for %d weeks.\n", chickens, chknWeeks);
              System.out.printf("In that time, they have been fed %d times, given water %d times, ", chkn.getFed(), chkn.getWatered());
              System.out.printf("taken out for exercise %d times, and had %d eggs.\n", chkn.getExercise(), chkn.getEggs());
              //check sheep
              System.out.printf("You have had %d sheep, for %d weeks.\n", sheep, shpWeeks);
              System.out.printf("In that time, they have been fed %d times, given water %d times, ", shp.getFed(), shp.getWatered());
              System.out.printf("taken out for exercise %d times, and sheared %d times.\n", shp.getExercise(), shp.getWool());
              //check horses
              System.out.printf("You have had %d horses, for %d weeks.\n", horses, hrsWeeks);
              System.out.printf("In that time, they have been fed %d times, given water %d times, ", hrs.getFed(), hrs.getWatered());
              System.out.printf("taken out for exercise %d times, and combed %d times.\n", hrs.getExercise(), hrs.getCombed());
              break;
           }
           case (2)
           {
              //make corrections using .set methods
           }
           case (3)
           {
              what = true;
              break;
           }
           default
           {
              System.out.print("Invalid input. Please try again. (1-check on animals, 2-make corrections, 3-done) ");
           }
        }
      }
   }
}
public class Cow
{
   //include number of times fed, watered, and exercised(daily) + milked
   private int fed;
   private int watered;
   private int exercised;
   private int milked;
   
   //methods .get/setFed, .get/setWatered, .get/setExercise(non-static?) .get/setMilk (static?)

}
public class Pig
{
   //include number of times fed, watered, and exercised(daily) + played in mud
   private int fed;
   private int watered;
   private int exercised;
   private int play;
}
public class Chicken
{
   //include number of times fed, watered, and exercised(daily) + eggs
   private int fed;
   private int watered;
   private int exercised;
   private int eggs;
   
}
public class Sheep
{
   //include number of times fed, watered, and exercised(daily) + sheared
   private int fed;
   private int watered;
   private int exercised;
   private int sheared;
}
public class Horse
{
   //include number of times fed, watered, and exercised(daily) + combed
   private int fed;
   private int watered;
   private int exercised;
   private int combed;
}
