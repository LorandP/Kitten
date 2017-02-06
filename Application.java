/**
 * Created by Lori on 1/31/2017.
 */
public class Application
{
    /**
     * This method returns a string from which a specific character was removed from.
     * @param str the original string.
     * @param index the index that specifies which character to be removed from the string.
     */
    private String missingChar(String str, int index)
    {
        StringBuilder finalWord = new StringBuilder();

        if (str != null && !str.isEmpty())
        {
            for (int counter = 0; counter <= str.length()-1;counter++)
            {
                if (counter == index)
                    counter++;
                finalWord.append(str.charAt(counter));
            }
        }
        else
            return "Please enter a valid string.";
        return finalWord.toString();
    }
    public static void main (String []args)
    {
        Application application = new Application();

        System.out.println(application.missingChar("kitten",4));
    }
}
