public class Chicken
{
   private String color;
   private int needsFed;
   private int needsWashed;
   private int beenFed;
   private int beenWashed;
   private int needsExercised;
   private int beenExercised;
   private int eggsLaid;

   Chicken(String colored, int feed, int wash, int exercise)
   {
      color = colored;
      needsFed = feed;
      needsWashed = wash;
      needsExercised = exercise;
   }

   public void setFed(int fed)
   {
      beenFed = fed;
   }
   public void setWashed(int washed)
   {
      beenWashed = washed;
   }
   public void setExercised(int exercised)
   {
      beenExercised = exercised;
   }
   public void setEggs(int eggs)
   {
      eggsLaid = eggs;
   }
   public void done()
   {
      System.out.println("The chicken is " + color + " and has been fed " + beenFed
                         + " times, washed " + beenWashed + " times, exercised "
                         + beenExercised + " times, and laid " + eggsLaid
                         + " eggs.");
   }
}
