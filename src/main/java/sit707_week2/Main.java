package sit707_week2;

import java.io.IOException;

/**
 * Hello world!
 * @author Ahsan Habib
 */
public class Main 
{
    public static void main( String[] args ) throws IOException
    {
        SeleniumOperations.officeworks_registration_page("https://www.officeworks.com.au/app/identity/create-account");
        //SeleniumOperations.skechers_registration_page("https://www.skechers.com.au/create-account");
        //ReletiveOperators.officeworks_registration_page_reletive_locator("https://www.officeworks.com.au/app/identity/create-account");
    }
}
