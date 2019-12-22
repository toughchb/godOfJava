package ch13.enums;

public class OverTimeManager3 {

    public static void main(String[] args) { 
        OverTimeValues2 []valuelist = OverTimeValues2.values();
        for(OverTimeValues2 value:valuelist){
            System.out.println(value);
        }

    }
}