import java.util.Scanner;

public class Farm
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      String color;
      int fed, washed, exercised, other;


// create animals
// create cow
      System.out.print("What color is your cow? ");
      color = kb.nextLine();
      System.out.print("How many times per day does your cow need to be fed? ");
      fed = kb.nextInt();
      System.out.print("How many times per week does your cow need to be washed? ");
      washed = kb.nextInt();
      System.out.print("How many times per month does your cow"
                       + " need to be exercised? ");
      exercised = kb.nextInt();
      Cow cw = new Cow(color, fed, washed, exercised);
// create pig
      System.out.print("What color is your pig? ");
      kb.nextLine();
      color = kb.nextLine();
      System.out.print("How many times per day does your pig need to be fed? ");
      fed = kb.nextInt();
      System.out.print("How many times per week does your pig need to be washed? ");
      washed = kb.nextInt();
      System.out.print("How many times per month does your pig"
                       + " need to be exercised? ");
      exercised = kb.nextInt();
      Pig pg = new Pig(color, fed, washed, exercised);
// create chicken
      System.out.print("What color is your chicken? ");
      kb.nextLine();
      color = kb.nextLine();
      System.out.print("How many times per day does your chicken need to be fed? ");
      fed = kb.nextInt();
      System.out.print("How many times per week does your chicken need to be washed? ");
      washed = kb.nextInt();
      System.out.print("How many times per month does your chicken"
                       + " need to be exercised? ");
      exercised = kb.nextInt();
      Chicken ckn = new Chicken(color, fed, washed, exercised);
// create sheep
      System.out.print("What color is your sheep? ");
      kb.nextLine();
      color = kb.nextLine();
      System.out.print("How many times per day does your sheep need to be fed? ");
      fed = kb.nextInt();
      System.out.print("How many times per week does your sheep need to be washed? ");
      washed = kb.nextInt();
      System.out.print("How many times per month does your sheep"
                       + " need to be exercised? ");
      exercised = kb.nextInt();
      Sheep sh = new Sheep(color, fed, washed, exercised);
// create horse
      System.out.print("What color is your horse? ");
      kb.nextLine();
      color = kb.nextLine();
      System.out.print("How many times per day does your horse need to be fed? ");
      fed = kb.nextInt();
      System.out.print("How many times per week does your horse need to be washed? ");
      washed = kb.nextInt();
      System.out.print("How many times per month does your horse"
                       + " need to be exercised? ");
      exercised = kb.nextInt();
      Horse hrs = new Horse(color, fed, washed, exercised);

      System.out.println();


// record how often cow has been fed/washed/exercised/milked
      System.out.print("How many times has your cow been fed? ");
      fed = kb.nextInt();
      cw.setFed(fed);
      System.out.print("How many times has your cow been washed? ");
      washed = kb.nextInt();
      cw.setWashed(washed);
      System.out.print("How many times has your cow been exercised? ");
      exercised = kb.nextInt();
      cw.setExercised(exercised);
      System.out.print("How many times has your cow been milked? ");
      other = kb.nextInt();
      cw.setMilked(other);
// record how often pig has been fed/washed/exercised and played in mud
      System.out.print("How many times has your pig been fed? ");
      fed = kb.nextInt();
      pg.setFed(fed);
      System.out.print("How many times has your pig been washed? ");
      washed = kb.nextInt();
      pg.setWashed(washed);
      System.out.print("How many times has your pig been exercised? ");
      exercised = kb.nextInt();
      pg.setExercised(exercised);
      System.out.print("How many times has your pig played in mud? ");
      other = kb.nextInt();
      pg.setPlayed(other);
// record how often chicken has been fed/washed/exercised and how many eggs laid
      System.out.print("How many times has your chicken been fed? ");
      fed = kb.nextInt();
      ckn.setFed(fed);
      System.out.print("How many times has your chicken been washed? ");
      washed = kb.nextInt();
      ckn.setWashed(washed);
      System.out.print("How many times has your chicken been exercised? ");
      exercised = kb.nextInt();
      ckn.setExercised(exercised);
      System.out.print("How many eggs has your chicken been laid? ");
      other = kb.nextInt();
      ckn.setEggs(other);
// record how often sheep has been fed/washed/exercised/sheared
      System.out.print("How many times has your sheep been fed? ");
      fed = kb.nextInt();
      sh.setFed(fed);
      System.out.print("How many times has your sheep been washed? ");
      washed = kb.nextInt();
      sh.setWashed(washed);
      System.out.print("How many times has your sheep been exercised? ");
      exercised = kb.nextInt();
      sh.setExercised(exercised);
      System.out.print("How many times has your sheep been sheared? ");
      other = kb.nextInt();
      sh.setSheared(other);
// record how often horse has been fed/washed/exercised/combed
      System.out.print("How many times has your horse been fed? ");
      fed = kb.nextInt();
      hrs.setFed(fed);
      System.out.print("How many times has your horse been washed? ");
      washed = kb.nextInt();
      hrs.setWashed(washed);
      System.out.print("How many times has your horse been exercised? ");
      exercised = kb.nextInt();
      hrs.setExercised(exercised);
      System.out.print("How many times has your horse been combed? ");
      other = kb.nextInt();
      hrs.setCombed(other);

      System.out.println();


// display data on each animal
      cw.done();
      pg.done();
      ckn.done();
      sh.done();
      hrs.done();
   }
}
