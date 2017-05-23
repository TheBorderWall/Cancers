class Search
{
  
  public static void main(String[]args)
  {
   String string;
  System.out.println("Type your sentence please.");
  string = In.getString();

String[] sentenceArray = string.split(" ");
Boolean found = false; //This will initialize the boolean found to false
for (int i = 0; i<sentenceArray.length; i++){ //This goes through each word in the sentence
 
  if (sentenceArray[i].equals("Canada")){ //Locates any words "Canada" in array
       found = true;
       System.out.println("Keyword matched the string");
       System.out.println("The word 'Canada' was found");
       break; //This will exit the for loop since the word Canada was found
   }
    
    
}

  
    //if (found) { //When found is "true" this code will execute (i.e. The word Canada was found
     // System.out.println("Canada found"); //Seems redundant but o.k.
   // break;
  }
}




  

