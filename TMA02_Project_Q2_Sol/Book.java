
/**
 * Write a description of class Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Book
{
   // instance variables
 
   private String title;
   private String type;
   private String publicationDate;
   private Author author;
   
   //Constructors
   
   /**
    * Constructor for objects of class Book
    * where we know all atributes
    */
   public Book(String aTitle, String aType, String aYear, Author theAuthor)
   {
      // initialise instance variables
      this.title = aTitle;
      this.type = aType;
      this.publicationDate = aYear;
      this.author = theAuthor;
   }
   
   
      /**
    * Constructor for objects of class Book
    * where we know minimum attributes (just book title)
    */
   public Book(String aTitle)
   {
      // initialise instance variables
      this.title = aTitle;
      this.type = null;
      this.publicationDate = null;
      this.author = new Author();
   }
   
   //Setter methods are provided for all the instance variable
   
   /**
    * Setter for a book's author's name.
    */
   public void setAuthorName(String aName)
   {
      this.author.setName(aName);
   }
   
   /**
    * Setter for a book's type.
    */
   public void setBookType(String aType)
   {
      this.type = aType;
   }
    
   /**
    * Setter for a book's publication date.
    */
   public void setPublicationDate(String aYear)
   {
      this.publicationDate = aYear;
   }
   
   //Getter methods are provided for all the instance variable
   
   /**
    * Getter for a book's title.
    */
   public String getTitle()
   {
      return this.title;
   }
   
   /**
    * Getter for a book's type.
    * Return unknown if we dont know the type
    */
   public String getType()
   {
      if (this.type == null)
      {
         return "Unknown";
      }

      return this.type;
   }
   
   /**
    * Getter for a book's publication date.
    * Returns unknown if we dont know the year.
    */
   public String getPublicationDate()
   {
      if (this.publicationDate == null)
      {
         return "Unknown";
      }

      return this.publicationDate;
   }
   
   /**
    * Getter for a book's author.
    * Return unattributed if we dont know the author name.
    */
   public String getAuthor()
   {
      if (this.author == null || this.author.getName() == null )
      {
         return "Unattributed";
      }

      return this.author.getName();
   }
   
   //Method which send message to component object and make use of obtained information in computation 
   
   /**
    * This method returns true if the book was writen by modern artist.
    * If the author was born after 1900 is the modern author.
    * And if we dont have information about his yearofbirth the method will return string: not enough information
    */public boolean isModern()
   {
   if (this.author.getYearOfBirth() == null)
   {
      return false;
   }
   
   return(Integer.parseInt(this.author.getYearOfBirth()) >= 1900);
   
   }
   
   //Methods which return description of the class
   
   /**
    * Returns a string describing this object.
    */
   public String toString()
   {
      return "Title: " + this.title + " (" + this.publicationDate + ") - " 
               + "the " + this.getType() + " written by: " + this.getAuthor();                
   }
   
   /**
    * Returns a string describing this object.
    * Including information obtained from component object.
    */
   public String toString2()
   {
      if (this.author.getYearOfBirth() == null)
      {
         return this.title + " written by: " + this.getAuthor() + "(Unknown).";
      }
      return this.title + " written by: " + this.getAuthor() + "(" + this.author.getYearOfBirth() + ").";      
   }
}
