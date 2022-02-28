package FindingTheFirstNonReapetedCharacter;

public class FindingTheFirstNonReapetedCharacter {

  public static void main(String[] args) {

  String inputStr = "ariesleo";
  for(char i :inputStr.toCharArray()){
  if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)){
  System.out.println("First non-repeating character is; "+i);
     break;
     }
     }
  }
}
