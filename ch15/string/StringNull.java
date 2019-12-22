package ch15.string;

public class StringNull{
    public static void main(String[] args) {
        StringNull sample = new StringNull();
        sample.nullCheck(null);
    }
    public boolean nullCheck(String text) {
        int textLength = text.length();
        System.out.println(textLength);
        if(text == null) return true;
        else return false;
    }
}