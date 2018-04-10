
/**
 * Author is a component class of the class Book
 * @author (Remi Kik) 
 * @version (14/01/2018)
 */
public class Author
{
   // instance variables
   private String name; // an artist has-a name, e.g. "Vermeer"
   private String yearOfBirth; // an artist has-a year of birth, e.g. "1903"

   //Constructors
   /**
    * zero-argument constructor: if we don’t know the author’s attributes.    
    */
   public Author()
   {
      this.name = null;
      this.yearOfBirth = null; 
   }

   /**
    * A constructor for objects of class Author if we know their name
    * but not their year of birth.
    */
   public Author(String aName)
   {
      this.name = aName;
      this.yearOfBirth = null; 
   }

   /**
    * A constructor for objects of class Author
    * if we know their name and their year of birth.
    */
   public Author(String aName, String aYear)
   {
      this.name = aName;
      this.yearOfBirth = aYear;
   }

   //Setter methods for all atributes
   
   /**
    * Setter for an author's name.
    */
   public void setName(String aName)
   {
      this.name = aName;
   }

   /**
    * Setter for an author's year of birth.
    */
   public void setYearOfBirth(String aYear)
   {
      this.yearOfBirth = aYear;
   }

   //Getter methods for all atributes
   
   /**
    * Getter for an author's name.
    * return a string "unattributed" if we dont know the name
    */
   public String getName()
   {
      if (this.name == null )
      {
         return "Unattributed";
      }

      return this.name;
   }

   /**
    * Getter for an author's year of birth. 
    */
   public String getYearOfBirth()
   {
      return this.yearOfBirth;
   }  

   //To string method
   
   /**
    * Returns a description of this object as a string.
    */
    public String toString()
    {
      if (this.name == null && this.yearOfBirth == null)
      {
         return "Unattributed";
      }
      else if (this.name == null)
      {
         return "Author was born in " + this.yearOfBirth;
      }
      else if (this.yearOfBirth == null)
      {
         return this.name;
      }
      else 
      {
         return this.name + "(Born " + this.yearOfBirth + ")";
      }
    }
}
