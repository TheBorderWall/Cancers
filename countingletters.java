class Demo 
{

public static void main(String[] args) throws Exception {
    final String sentence = "   Insert your sentence here. If you press run, the program will count this sentence.";
    System.out.println(countletters(sentence));
}

public static int countletters(String sentence) {
    final String onlyLetters = sentence.replaceAll("[^\\p{L}]", "");
    return onlyLetters.length();
}

}







