public class ReferenceReturn{
    public static void main(String[] args) {
        ReferenceReturn reference = new ReferenceReturn();
        System.out.println(reference.intReturn());
        System.out.println(reference.intArraryReturn());
        System.out.println(reference.stringReturn());
    }
    public int intReturn(){
        int returnInt = 0;
        return returnInt;
    }
    public int[] intArraryReturn(){
        int returnArray[] = new int[10];
        return returnArray;
    }
    public String stringReturn(){
        String returnString = "Return value";
        return returnString;
    }
}