import java.util.Locale;

public class strings_tutorials {
    public static void main(String[] args) {

//      chatAtMethod();
      length();
//      startWith();
//      endWith();
//      contains();
        //   indexOF();
        //  lastIndexOf();
        //  upperCase();
        // lowerCase();
        //  doubleCustom();
        //  stringFormat();
        // subString();
        // compareTo();
     //   compareToIgnoreCase();

    }

    public static void compareToIgnoreCase() {
        String a = "navana";
        String b = "NAVANA";
        //  System.out.println(b.compareTo(a));

        if (a.compareToIgnoreCase(b) == 0) {
            System.out.println("match");
        } else {
            System.out.println("not match");
        }

    }

    public static void compareTo() {
        String a = "navana1";
        String b = "navana";
        //  System.out.println(b.compareTo(a));

        if (a.compareTo(b) == 0) {
            System.out.println("match");
        } else {
            System.out.println("not match");
        }

    }

    public static void subString() {
        String txt = "thisIsAcow";
        System.out.println(txt.substring(3, 5));

        String s = "SachinTendulkar";
        System.out.println("Original String: " + s);
        System.out.println("Substring starting from index 6: " + s.substring(6));//Tendulkar
        System.out.println("Substring starting from index 0 to 6: " + s.substring(0, 7)); //Sachin

    }

    public static void stringFormat() {

        int num = 5;
        int count = 0;
        while (count <= 10) {
            System.out.println(String.format("%d x %2d = %2d", num, count, (num * count)));
            count++;
        }

    }

    public static void doubleCustom() {
        double num = 123.223332223;
        System.out.println(String.format("output is %.3f", num));

    }

    public static void length() {
        String myName = "Sabbir hasan";
        System.out.println("total length: " + myName.length());
        int namelen = myName.length();
        for (int i = 0; i < namelen; i++) {
            System.out.println(i);
        }
    }

    public static void chatAtMethod() {
        String myName = "Sabbir hasan";
        System.out.println(myName.charAt(6));

    }

    public static void startWith() {
        String myName = "Sakib al hasan";
        if (myName.startsWith("Sa")) {
            System.out.println(" ok");
        } else {
            System.out.println("not ok");
        }

        if (myName.startsWith("a", 1)) {
            System.out.println(" ok");
        } else {
            System.out.println("not ok");
        }

    }

    public static void endWith() {

        String msg = "java new language";
        if (msg.endsWith("ge")) {
            System.out.println("its ok");
        } else {
            System.out.println("not okk");
        }
    }

    public static void contains() {

        String msg2 = "He is best in class";
        if (msg2.contains("best")) {
            System.out.println("best contains");
        } else {
            System.out.println("not found");
        }

    }

    public static void indexOF() {

        String text = "this is our home";
        System.out.println(text.indexOf("i"));

    }

    public static void lastIndexOf() {

        String text2 = "mirror of life";
        System.out.println(text2.lastIndexOf("i"));

    }

    public static void upperCase() {

        String text2 = "mirror of life";
        System.out.println(text2.toUpperCase());

    }

    public static void lowerCase() {

        String text2 = "mirror of life";
        System.out.println(text2.toLowerCase());

    }


}
