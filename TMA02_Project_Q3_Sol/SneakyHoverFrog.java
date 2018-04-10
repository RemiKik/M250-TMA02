import ou.*;
/**
 * The class SneakyHoverFrog is a subclass of HoverFrog with the addition of the 
 * instance variable isSneaking and the accessors setIsSneaking() and getIsSneaking().
 * @author (Remi Kik) 
 * @version (14/01/2018)
 */
public class SneakyHoverFrog extends HoverFrog
{
   // instance variables 
   private Boolean isSneaking;

   /**
    * Constructor for objects of class SneakyHoverFrog
    */
   public SneakyHoverFrog()
   {
      super();
      isSneaking = false;
   }

   /**
    * Setter method for the booloean isSneaking
    * 
    */
   public void setIsSneaking(Boolean aSneak)
   {
      this.isSneaking = aSneak;
   }
   
   /**
    * Getter method for the booloean isSneaking
    * 
    */
   public Boolean getIsSneaking()
   {
      return this.isSneaking;
   }
   
   /**
    * Set colour of SneakHoverFrog
    * If is sneaking you cannot change colour
    */
   @Override
   public void setColour(OUColour aColour)
   {
      if (!this.isSneaking)
      {
         super.setColour(aColour);
      }
   }
   
   /**
    * method set the value of the receiver's isSneaking variable to true 
    * and its colour to white.
    */
   public void startSneaking()
   {
      this.setIsSneaking(true);
      super.setColour(OUColour.WHITE);
      
   }
   
   /**
    * method set the value of the receiver's isSneaking variable to false 
    * and its colour to green.
    */
   public void stopSneaking()
   {
      this.setIsSneaking(false);
      super.setColour(OUColour.GREEN);
   }
   
   /**
    * method which check whether the sneakyHoverFrog is at same position what other Amphibian,
    * and whether the height is bigger than three.
    * If both arguments evaluates to true the SneakyHoverFrog change colour to red, croak 3 times and
    * lower the height until height = 0
    */
   public void panicIfCanBeSeen(Amphibian amp)
   {
      if (this.getPosition() == amp.getPosition() && this.getHeight() <= 3)
      {
         super.setColour(OUColour.RED);
         this.croak();
         while (this.getHeight() != 0)
            {
                 this.setHeight(this.getHeight() - 1);
            }
            this.stopSneaking();
      }
   }
}
