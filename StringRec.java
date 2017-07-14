public class StringRec {

      public static String decompress(String compressedText){
        
        String finalResult = "";
        
        if (compressedText.length() == 1) {

            return compressedText;

        }

        else if (compressedText.charAt(0) == '1') {

            return decompress(compressedText.substring(1));

        }

        else if (Character.isLetter(compressedText.charAt(0)) == true) {

            return finalResult + compressedText.charAt(0) + decompress(compressedText.substring(1));

        }

        else if (Character.isDigit(compressedText.charAt(0)) == true) {

            char num = compressedText.charAt(0);

            char temporary = compressedText.charAt(1);

            if (num != '0'){

                num--;

                String number = finalResult + num;

                return decompress(number + temporary + compressedText.substring(1));

            }

        }
        
        return null;

    }
    public static void main(String[] args) {

        System.out.println(decompress("q9w5e2rt5y4qw2Er3T"));

    }
    
}