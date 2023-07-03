package Assessment.com.Day10_Activity2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<String> str = new ArrayList();
        str.add("Python");
        str.add("Java");
        str.add("ASP.NET");
        str.add("Salesforce");
        str.add("Generative AI");


    Comparator<String> comparator = new Comparator<String>() {
		public int compare(String str1, String str2) {
			return str1.compareToIgnoreCase(str2);
		}
	};
   
	str.sort(comparator);

    System.out.println(str);

    }

}
