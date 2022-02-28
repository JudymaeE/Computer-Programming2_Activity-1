package RemovingWhiteSpaceFromAString;

public class RemovingWhiteSpaceFromAString {

  public static void main(String[] args)
  
  {
  
    String str = "FIGHTING";
    
   
    str = str.replaceAll("\\s", ""); 

       

        System.out.println(str); 

 
  }
}