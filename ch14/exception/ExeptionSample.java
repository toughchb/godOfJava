package ch14.execption;

public class ExeptionSample {
    public static void main(String[] args) {
        ExeptionSample sample = new ExeptionSample();
        sample.arrayOutOfBoundsTryCatch();
    }
    public void arrayOutOfBounds(){
        int[] intArray = new int[5];
        System.out.println(intArray[5]);
    }
    public void arrayOutOfBoundsTryCatch(){
        try{
        int[] intArray = new int[5];
        System.out.println(intArray[5]);
        System.out.println("Should Run??");
        }
        catch (Exception e){

        }
    }
}