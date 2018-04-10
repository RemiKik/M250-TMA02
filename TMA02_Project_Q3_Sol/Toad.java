import ou.*;
/**
 * The class Toad defines an amphibian with the characteristics of a toad.
 *
 * @author M250 Module Team
 * @version 2.0
 */
public class Toad extends Amphibian
{
   /**
    * Constructor for objects of class Toad with the default characteristics
    * (colour brown and position of 11).
    */
   public Toad()
   {
      super(OUColour.BROWN, 11);
   }

   /* instance methods */    

   /**
    * Resets the receiver to its "home" position of 11.
    */
   @Override
   public void home()
   {
      this.setPosition(11);
   }

   /**
    * Decrements the position of the receiver by 2.
    */
   @Override
   public void left()
   {
      this.setPosition(this.getPosition() - 2);
   }

   /**
    * Increments the position of the receiver by 2.
    */
   @Override
   public void right()
   {
      this.setPosition(this.getPosition() + 2);
   }
}
