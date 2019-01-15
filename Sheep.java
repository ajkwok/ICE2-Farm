public class Sheep
{
   private String color;
   private int needsFed;
   private int needsWashed;
   private int beenFed;
   private int beenWashed;
   private int needsExercised;
   private int beenExercised;
   private int beenSheared;

   Sheep(String colored, int feed, int wash, int exercise)
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
   public void setSheared(int sheared)
   {
      beenSheared = sheared;
   }
   public void done()
   {
      System.out.println("The sheep is " + color + " and has been fed " + beenFed
                         + " times, washed " + beenWashed + " times, exercised "
                         + beenExercised + " times, and sheared " + beenSheared
                         + " times.");
   }
}
