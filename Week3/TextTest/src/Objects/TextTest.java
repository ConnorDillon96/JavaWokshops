package Objects;
import java.util.Scanner;

/**
 * TextTest
 */
public class TextTest {
    public static void main(String[] args) {
        int count = 0;
        String word = "";
        Scanner sc = new Scanner(System.in);    
        System.out.println("Text \t:\t");
        String text  = sc.nextLine();
        sc.close();
        char[] textarray = text.toCharArray();

        for (int i = 0; i < textarray.length; i++) {
            word += textarray[i];
            if (textarray[i] == ' '){
                count += 1;
                System.out.println(word);
                word = "";
            }else if (count == textarray.length - 1){
                int lastWordCount = 0;
                for (int j  = textarray.length; j >= 0; j--) {
                    word += textarray[j];
                    if(textarray[j] == ' '){
                        lastWordCount = j;
                        count +=1;
                    }
                }
                while(lastWordCount < textarray.length){
                    word += textarray[lastWordCount];
                    lastWordCount ++;
                }  
            }                    

        }
        System.out.println(word);
        System.out.println("Amount : " + (count + 1)); 
    }

}
