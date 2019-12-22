package ch10.inheritance;

import ch10.inheritance.ChildCasting;
import ch10.inheritance.ParentCasting;

public class InheritanceCasting{
    public static void main(String[] args) {
        InheritanceCasting inheritance = new InheritanceCasting();
        //inheritance.objectCast();
        inheritance.objectCast2();

    }
    public void objectCast(){
        ParentCasting parent = new ParentCasting();
        ChildCasting child = new ChildCasting();

        ParentCasting parent2 = child;
        ChildCasting child2 = (ChildCasting)parent;
    }

    public void objectCast2(){
        ChildCasting child = new ChildCasting();

        ParentCasting parent2 = child;
        ChildCasting child2 = (ChildCasting)parent2;
    }
}