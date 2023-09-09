package wrapperclass;

import java.util.ArrayList;

public class wrapperfloat {
    public static void main(String[] args) {
        ArrayList<Float> FList=new ArrayList<Float>();

        Float F1=Float.valueOf(2.3f);
        Float F2=Float.valueOf(4.5f);
        Float F3=Float.valueOf(5.6f);
        Float F4=Float.valueOf(28.2f);
        Float F5=Float.valueOf(21.3f);
        Float F6=Float.valueOf(12.3f);
        Float F7=Float.valueOf(78.3f);
        Float F8=Float.valueOf(26.3f);
        Float F9=Float.valueOf(2.31f);
        Float F10=Float.valueOf(12.35f);

        FList.add(F1);
        FList.add(F2);
        FList.add(F3);
        FList.add(F4);
        FList.add(F5);
        FList.add(F6);
        FList.add(F7);
        FList.add(F8);
        FList.add(F9);
        FList.add(F10);

        Float returnvalue1= FList.get(0);
        Float returnvalue2= FList.get(1);
        Float returnvalue3= FList.get(2);
        Float returnvalue4= FList.get(3);
        Float returnvalue5= FList.get(4);
        Float returnvalue6= FList.get(5);
        Float returnvalue7= FList.get(6);
        Float returnvalue8= FList.get(7);
        Float returnvalue9= FList.get(8);
        Float returnvalue10= FList.get(9);



        System.out.println(returnvalue1);
        System.out.println(returnvalue2);
        System.out.println(returnvalue3);
        System.out.println(returnvalue4);
        System.out.println(returnvalue5);
        System.out.println(returnvalue6);
        System.out.println(returnvalue7);
        System.out.println(returnvalue8);
        System.out.println(returnvalue9);
        System.out.println(returnvalue10);
    }
}
