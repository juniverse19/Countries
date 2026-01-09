public class Country
{
  // add private instance variables for the name, capital, language, and image file.
    private String name;
    private String capital;
    private String language;
    private String imageFileName;
  // add constructors

    public Country(String name, String Capital, String language, String imageFileName) {
      
    }

    public Country() {

    }

  // Write accessor/get methods for each instance variable that returns it.
    public String getName() { return name; }
    public String getCapital() { return capital; }
    public String getLanguage() {  return language; }
    public String getImgF() { return imageFileName; }

  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
 


  
}