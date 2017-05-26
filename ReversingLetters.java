public class ReversingLetters {

  public static void main(String[] args)
  { 
 String sentence;
  System.out.println("Type your sentence please.");
  sentence = In.getString(); 
        
  String[] words = sentence.split(" ");
String invertedSentece = "";
for (String word : words){
    String invertedWord = "";
    for (int i = word.length() - 1; i >= 0; i--)
        invertedWord += word.charAt(i);
    invertedSentece += invertedWord;
    invertedSentece += " ";
    System.out.println(invertedSentece);
}
invertedSentece.trim();
        }
}