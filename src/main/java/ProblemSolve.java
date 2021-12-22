import java.util.Locale;

public class ProblemSolve {
    public static void main(String[] args) {

//        startWithCheck(); //1
//        length(); //2
//        allCharacterPrint(); //3
//        contains(); //4
//        chatAt(); //5
//        indexOf(); //6
//        lastIndexOf(); // 7
//        lowerCase(); //8
//        upperCase(); //9
//        checkEndWith(); //10

    }


    public static void checkEndWith() {
        String name = "Bangladesh is a good country";
//        System.out.println(name.toUpperCase());

        if (name.endsWith("y")) {
            System.out.println("ok");
        } else {
            System.out.println("not ok");
        }

    }

    public static void upperCase() {
        String name = "Bangladesh is a good country";
        System.out.println(name.toUpperCase());

    }

    public static void lowerCase() {
        String name = "Bangladesh is a good country";
        System.out.println(name.toLowerCase());

    }

    public static void lastIndexOf() {
        String name = "Bangladesh is a good country";
        System.out.println(name.lastIndexOf("g"));

    }

    public static void indexOf() {
        String name = "Bangladesh is a good country";
        System.out.println(name.indexOf("g"));

    }

    public static void chatAt() {
        String name = "Bangladesh is a good country";
        System.out.println(name.charAt(17));
    }


    public static void contains() {
        String name = "Bangladesh is a good country";
//        System.out.println(name.contains("good"));

        if (name.contains("country")) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }

    public static void allCharacterPrint() {
        String txt = "Bangladesh is a good country";
        System.out.println("total length: " + txt.length());
        int num = txt.length();
        for (int i = 0; i < num; i++) {
            System.out.println(txt.charAt(i));
        }

    }

    public static void length() {
        String txt = "Bangladesh is a good country";
        System.out.println("total length: " + txt.length());

    }

    public static void startWithCheck() {
        String txt = "Bangladesh is a good country";

        if (txt.startsWith("B")) {
            System.out.println("ok");
        } else {
            System.out.println("not ok");
        }
    }
}
