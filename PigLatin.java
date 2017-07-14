public class PigLatin {
  public static void main(String[] args){
  String original = IO.readString();
  String pigLatin = translate(original);
  System.out.println(pigLatin);
  }
   
  public static String translate (String original){
           
    original = original.toLowerCase();
       

    char firstLetter = original.charAt(0);
    String translate = "Niharika";

    if(firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u'){
      translate = original + "way";
    }
           
    else{
      translate = original.substring(1) + firstLetter + "ay";
    }
            
    char first = translate.charAt(0);
    first = Character.toUpperCase(first);
    translate = first + translate.substring(1);
            
    return translate;

   }
}
