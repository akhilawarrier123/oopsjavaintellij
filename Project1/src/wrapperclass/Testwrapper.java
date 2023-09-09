package wrapperclass;

import java.util.ArrayList;

public class Testwrapper {

    public static void main(String[] args) {
        Integer Iobj1 = Integer.valueOf(89);
        Integer Iobj2 = Integer.valueOf(20);

        ArrayList<Integer> Integerlist= new ArrayList<Integer>();
        Integerlist.add(Iobj1);
        Integerlist.add(Iobj2);
        Integer Iobj3= Integer.valueOf(20);
        Integerlist.add(Iobj3);
        Integer returnvalue=  Integerlist.get(0);
        Integer returnvalue1=  Integerlist.get(1);
        Integer returnvalue2=  Integerlist.get(2);
        System.out.println(returnvalue);
        System.out.println(returnvalue1);
        System.out.println(returnvalue1);

    }

}
