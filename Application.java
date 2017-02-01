/**
 * Created by Lori on 1/31/2017.
 */
public class Application
{

    private void missingChar(String str, int index)
    {
        int i = 0;

        if (str != null && !str.isEmpty())
        {
           while (i <= str.length()-1)
           {
               if (i == index)
                   i++;
               System.out.print(str.charAt(i));
               i++;
           }
        }
    }
    public static void main (String []args)
    {
        Application application = new Application();

        application.missingChar("kitten",4);
    }
}
