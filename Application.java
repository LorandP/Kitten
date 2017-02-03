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
    private void missingChar(String str, int index)
    {
        if (str != null && !str.isEmpty())
        {
            for (int counter = 0; counter <= str.length()-1;counter++)
            {
                if (counter == index)
                    counter++;
                System.out.print(str.charAt(counter));
            }
        }
    }
    public static void main (String []args)
    {
        Application application = new Application();

        application.missingChar("kitten",0);
    }
}
