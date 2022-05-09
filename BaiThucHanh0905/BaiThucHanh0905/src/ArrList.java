import java.util.ArrayList;

public class ArrList {
    public static void main(String[] aStrings) {
        
        ArrayList<String> colors = new ArrayList<String>(3);

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.remove("Green");
        colors.add("Pink");
        colors.add("Yellow");

        System.out.println(color.get(1));
        System.out.println(color.contains("Orange"));
        System.out.println(color.size());
        System.out.println(colors);
    }
}