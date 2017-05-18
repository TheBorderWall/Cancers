class CountingLetters 
{

public static void main(String[] args) throws Exception {
  String sentence;
  System.out.println("Type your sentence please.");
  sentence = In.getString();
    
    System.out.println(countletters(sentence));
}

public static int countletters(String sentence) {
    final String onlyLetters = sentence.replaceAll("[^\\p{L}]", "");
    return onlyLetters.length();
}

}







