//import the necessary packages if needed
import java.util.*;
     
@SuppressWarnings("unchecked")//Do not delete this line
public class UniqueWords
{
         public static void main (String [] args) {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter Student's Article");
             String sentence = sc.nextLine();
             sentence = sentence.replaceAll("[,;:.?!]*","");
             String [] sentenceArray = sentence.split(" ");
             List<String> list = new ArrayList<>();
             for (int i=0; i<sentenceArray.length; i++) {
                 sentenceArray[i] = sentenceArray[i].toLowerCase();
                 if (sentenceArray[i].trim().isEmpty())
                    continue;
                else
                    list.add(sentenceArray[i]);
             }
             Set<String> unique = new HashSet<>();
             for (String words: list) {
                    unique.add(words);
             }
             System.out.println("Number of words " + list.size());
             System.out.println("Number of unique words " + unique.size());
             List<String> newList = new ArrayList<>();
             for (String word: unique)
                newList.add(word);
             Collections.sort(newList);
             System.out.println("The words are");
             for (int i=0; i<newList.size(); i++) {
                 System.out.println(i+1 + ". " + newList.get(i));
             }
             
             
         }
}
