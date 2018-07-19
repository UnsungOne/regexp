package regexp.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpTasks {

    public boolean getFirstLetterAsUppercase(String s) {

        Pattern pattern = Pattern.compile(s);
        Matcher matcher = pattern.matcher("Java");
        boolean b = matcher.matches();
        System.out.println("Task1: " + b);
        return b;
    }

    public boolean getCreditCardNumberPattern(String s) {

        Pattern pattern = Pattern.compile(s);
        Matcher matcher = pattern.matcher("9999 9999 9999 9999");
        boolean b = matcher.matches();
        System.out.println("Task2: " + b);
        return b;
    }

    public boolean getDataFromString(String s) {
        Pattern pattern = Pattern.compile(s);
        Matcher matcher = pattern.matcher("Jacek Rafał Karpiński urodził się 09.04.1927r,");
        boolean b = matcher.matches();
        System.out.println("\n" + "Task3: " + b);
        return b;
    }

    public boolean getIPFromString(String s) {
        Pattern pattern = Pattern.compile(s);
        Matcher matcher = pattern.matcher("192");
        boolean b = matcher.matches();
        System.out.println("Task7: " + b);
        return b;
    }

    public boolean getAlphanumericValueFronString(String s) {
        Pattern pattern = Pattern.compile(s);
        Matcher matcher = pattern.matcher("JavaIsNumber1");
        boolean b = matcher.matches();
        System.out.println("Task10: " + b);
        return b;
    }


    public boolean getTimeFromString(String s) {
        Pattern pattern = Pattern.compile(s);
        Matcher matcher = pattern.matcher("16:24:31");
        boolean b = matcher.matches();
        System.out.println("Task11: " + b);

        return b;
    }

    public boolean getIdentityNumberPatternFromString(String s) {
        Pattern pattern = Pattern.compile(s);
        Matcher matcher = pattern.matcher("22050926575");
        boolean b = matcher.matches();
        System.out.println("Task13: " + b);
        return b;
    }

    public boolean getColorHexCodePattern(String s) {
        Pattern pattern = Pattern.compile(s);
        Matcher matcher = pattern.matcher("#7A95AF");
        boolean b = matcher.matches();
        System.out.println("Task15: " + b);
        return b;
    }

}
