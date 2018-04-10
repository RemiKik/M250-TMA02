import ou.*;
/**
 * Class Rocket allows a representation of a rocket to be created in the Shapes
 * Window, and for it to move up the screen.
 * 
 * This class is complete.
 * 
 * @Remi Kik (M250 Course Team) 
 * @version (1.0)
 */
public class Rocket
{   
   private Triangle nose;      // represents the rocket's nose cone
   private Square body;        // represents the rocket's body
   private Circle jet;         // represents the blast from the rocket's engine

   /**
    * Constructor for objects of class Rocket
    */
   public Rocket(Triangle t, Square s, Circle c)
   {
      //first, we store references to the workspace shape objects
      this.nose = t;
      this.body = s; 
      this.jet = c;    

      //sets the initial positions of the nose.
      //The other parts need to be set relative to these positions.
      this.nose.setXPos(50);
      this.nose.setYPos(300);

      //sets the body relative to the nose, using the helper methods
      this.body.setXPos(getBodyXPos());
      this.body.setYPos(getBodyYPos());      

      //The jet is invisible to begin with, because it uses
      //the background colour of WHITE, but you can use BLACK
      //to help you see it while testing
      this.jet.setColour(OUColour.WHITE); 
      this.jet.setDiameter(10);           

      //sets the jet position relative to the body, using the helper methods
      this.jet.setXPos(getJetXPos()); 
      this.jet.setYPos(getJetYPos()); 
      
      // 

   }

   private int getBodyXPos()
   {
     //to be written in Q1(a)(i)
          
      return this.nose.getXPos();
   }

   private int getBodyYPos()
   {
     //to be written in Q1(a)(ii)
     
     return this.nose.getYPos() + this.nose.getHeight();
   }
   
   private int getJetXPos()
   {
      //to be written in Q1(a)(iii)
      
      return this.body.getXPos() + (this.body.getLength() / 2) - (this.jet.getDiameter() / 2);
   }

   private int getJetYPos()
   {
     //to be written in Q1(a)(iv)
     
     return this.body.getYPos() + this.body.getLength();
   }

   /**
    * Moves the nose of the receiver 
    * by anInt units.
    * Moves other rocket components relative to the 
    * position of the nose.
    */
   public void moveRocketBy(int anInt)
   {
      //to be written in Q1(b)
      this.nose.setYPos(this.nose.getYPos() - anInt);
      this.body.setYPos(getBodyYPos());
      this.jet.setYPos(getJetYPos());
     
   }

   /**
    * Sets the diameters of the receiver's jets to 
    * 6 and sets their colour to red.
    */
   public void pulse1()
   {
      //to be written in Q1(c)(i)
      this.jet.setDiameter(6);
      this.jet.setXPos(getJetXPos());
      this.jet.setColour(OUColour.RED);
   }

   /**
    * Sets the diameters of the receiver's jets to 
    * 12, decrements their xPos by 3 and sets 
    * their colour to orange.
    */      
   public void pulse2()
   {
      //to be written in Q1(c)(ii)
      this.jet.setDiameter(12);
      this.jet.setXPos(getJetXPos());
      this.jet.setColour(OUColour.ORANGE);
   }

   /**
    * Sets the diameters of the receiver's jets to 
    * 24, decrements their xPos by 6 and sets 
    * their colour to red.
    */    
   public void pulse3()
   {
      //to be written in Q1(c)(iii)
      this.jet.setDiameter(24);
      this.jet.setXPos(getJetXPos());
      this.jet.setColour(OUColour.RED);
   }

   /**
    * Simulates the ignition of the rocket's jets
    */
   public void ignition()
   {
      //to be written in Q1(d)
      for (int i = 0; i < 5; i++) 
      {
         this.pulse1();
         this.delay(200);
         this.pulse2();
         this.delay(200);
         this.pulse3();
         this.delay(200);
      }
   }

   /**
    * Moves the entire rocket by speed units upwards, repeated 
    * 100 times, animating the jet as it goes.
    */
   public void animateRocket(int speed)
   {
      //to be written in Q1(e)
      Boolean p1 = true;
      Boolean p2 = false;
      Boolean p3 = false;
      Boolean upp = false;
      
      for (int i = 0; i < 100; i++)
      {
        if (p1 == true) 
        {
          this.pulse1();
          this.delay(200);
          p1 = false;
          p2 = true;
        }
        else if (p2 == true) 
        {
          this.pulse2();
          this.delay(200);
          p2 = false;
          p3 = true;
        }
        else if (p3 == true) 
        {
          this.pulse3();
          this.delay(200);
          p3 = false;
          upp = true;
        }
        else 
        {
         this.moveRocketBy(speed);
         upp = false;
         p1 = true;
        }   
      }
   }

   /**
    * Prompts the user to enter the number of units they want the  
    * rocket to move upwards at a time (speed)
    * 
    * If the number of units provided would eventually cause the tip of the  
    * nose to go past the top of the Graphical Display, the user 
    * is informed via a dialogue box that the rocket will not launch.  
    * 
    * Otherwise the rocket launches as required. 
    */
   public void launch()
   {
      //to be written in Q1(f) 
     String inputSpeed = OUDialog.request("At what speed you want the rocket to move?");
     int Speed = Integer.parseInt(inputSpeed);
     if (this.nose.getYPos() - (Speed * 25) < 0 )
     {
        OUDialog.alert("The rocket won't start. The number you've entered is too large");
     }
     else 
     {
        this.ignition();
        this.animateRocket(Speed);
     }
   }

   /**
    * Causes execution to pause by time number of milliseconds
    */
   public void delay(int time)
   {
      try
      {
         Thread.sleep(time); 
      }
      catch (Exception e)
      {
         System.out.println(e);
      } 
   }
}   