package ch15.string;

public class StringSample {
    public static void main(String[] args) {
        StringSample sample = new StringSample();
        sample.convert();
    }
    public void convert() {
        try {
            String korean = "자바의 신 최고!!";

            byte[] array1=korean.getBytes();
            for(byte data:array1) {
                System.out.print(data + " ");
            }
            System.out.println();
            String korean2 = new String(array1);
            System.out.println(korean2);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}