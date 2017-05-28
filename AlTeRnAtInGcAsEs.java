

import java.util.Scanner; 

 class AlTeRnAtInGcAsEs{ 

public static void main(String[] args) { 

  
  System.out.print("Enter String: ");
Scanner sc = new Scanner(System.in); 
String sentence = sc.nextLine();
String newSentence = ""; 
boolean nextIsCapital = true; 

for(int i=0; i < sentence.length(); i++) 
{ 
if(sentence.charAt(i) == ' ') 
{ 
newSentence += sentence.charAt(i); 
} 
else 
{ 
if(nextIsCapital == true) 
{ 
newSentence += 
String.valueOf(sentence.charAt(i)). 
toUpperCase(); 
nextIsCapital = false; // If all the letter entered are capital the next one will be lowercased
} 
else 
{ 
newSentence += 
String.valueOf(sentence.charAt(i)). 
toLowerCase(); 
nextIsCapital = true; // If all the letter entered are capital the next one will be uppercased
} 
} 
} 

System.out.println(newSentence); 
} 
}