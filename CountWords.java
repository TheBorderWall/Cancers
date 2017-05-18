public class CountWords 
{
    public static void main (String[] args)
    {

            System.out.println("Counting Words");

            String sentence;
  System.out.println("Type your sentence please.");
  sentence = In.getString();

            int wordCount = 1;

            for (int i = 0; i < sentence.length(); i++) 
            {
                if (sentence.charAt(i) == ' ') 
                {
                    wordCount++;
                } 
            }

            System.out.println("Word count is = " + wordCount);
    }
}