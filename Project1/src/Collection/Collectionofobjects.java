package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Collectionofobjects {
    public static void main(String[] args) {
       /* HashSet<String>setofstring=new HashSet<>(); //empty

        // storing the values in hashset


        setofstring.add("java");
        setofstring.add("Python");
        setofstring.add("C++");
        setofstring.add("C Sharp");
        setofstring.add("Ruby");
        setofstring.add("Go");
        setofstring.add("Scala");

       Iterator<String> iterator= setofstring.iterator();
//inside the hashset
        //iterator.hasnext() // check whether hashset contains element or not
        //iterator.next() // gives the current value pointed by iterator
        while(iterator.hasNext()){
            String currentvalue=iterator.next();
            System.out.println(currentvalue);
        }
    }*/

        LinkedHashSet<String> setofstring = new LinkedHashSet<>();
        setofstring.add("java");
        setofstring.add("Python");
        setofstring.add("C++");
        setofstring.add("C Sharp");
        setofstring.add("Ruby");
        setofstring.add("Go");
        setofstring.add("Scala");

        Iterator<String> iterator = setofstring.iterator();
        while (iterator.hasNext()) {
            String currentvalue = iterator.next();
            System.out.println(currentvalue);
        }
    }}