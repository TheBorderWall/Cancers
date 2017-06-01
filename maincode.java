import java.util.Scanner;

class Codes
{
  public static void main (String[] args)
  {
//here's a comment
    //* and here's another comment //*
 
    
//chestor code 1
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String result = "";
        char firstChar = input.charAt(0);
        result = result + Character.toUpperCase(firstChar);
        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char previousChar = input.charAt(i - 1);
            if (previousChar == ' ') {
                result = result + Character.toUpperCase(currentChar);
            } else {
                result = result + currentChar;
            }
        }
        System.out.println(result);
    }
}
Contact GitHub API Training Shop Blog About
© 2017 GitHub, Inc. Terms Privacy Sec
//chestor code 2
public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String sentence = input.nextLine();
    String[] words = sentence.split(" ");
    for (int i = words.length - 1; i >= 0; i--) {
    System.out.print(" "+ words[i]);

    }
}
 }
  }







