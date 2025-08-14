package Day_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringExp {
    
    // WAP to reverse the words by keeping punchations intact;
    public static void reverseWordsKeepPunctuation(){
        String input = "Hello, world! This is Java";

        List<String> words = new ArrayList<>();
        for(String token:input.split("[^a-zA-z0-9]+")){
            if(!token.isEmpty()){
                words.add(token);
            }
        }

        Collections.reverse(words);

        for(String word: words){
            System.out.print(word + " ");
        }

        int wordIndex = 0;

        StringBuilder result = new StringBuilder();
        StringBuilder current = new StringBuilder();

        for(int i =0;i<input.length();i++){
            char ch = input.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                System.out.println("Char letter: "+ch);
                current.append(ch);
            }else{
                if(current.length()>0){
                    result.append(words.get(wordIndex++));
                    current.setLength(0);
                }
                result.append(ch);
            }
        }


    }

    public static void main(String[] args) {
        reverseWordsKeepPunctuation();
    }
}
