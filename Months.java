
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Months {
    public static void main(String[] args) {
        /*nje Map<Integer, String> muajt dhe mbusheni me muajt e vitit.
        Printoni listen e muajve. pastaj modifikoni vleren e key = 3 dhe vendosni "Shtator",
        printoni serisht vlerat.
         */
        Map<Integer, String> map = new LinkedHashMap<>(); //adding the map with keys and values
        map.put(1, "January");
        map.put(2, "February");
        map.put(3, "March");
        map.put(4, "April");
        map.put(5, "May");
        map.put(6, "June");
        map.put(7, "July");
        map.put(8, "August");
        map.put(9, "September");
        map.put(10, "October");
        map.put(11, "November");
        map.put(12, "December");

/*
        map.put(3, "September");     //changing/updating the object
        map.remove(9,"September");     // removing
        map.put(9,"March");           //changing/updating
        System.out.println("The map after changing the third key");
*/

        Set<Map.Entry<Integer, String>> months = map.entrySet(); //gives us a set of all the entries
        System.out.println("The months" + "  =>");
        for (Map.Entry<Integer, String> entry : months) { //loops through the list
            System.out.println("    " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
