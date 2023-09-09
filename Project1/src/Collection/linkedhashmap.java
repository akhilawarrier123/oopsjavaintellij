package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class linkedhashmap  {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> hashmap=new LinkedHashMap<>();//empty
        hashmap.put("Java",4);
        hashmap.put("Python",6);
        hashmap.put("c++",3);
        hashmap.put("Scala",5);
        Set<String> setofkeys=hashmap.keySet();
        Iterator<String> keyiterator= setofkeys.iterator();
        while(keyiterator.hasNext()){
            String key=keyiterator.next();//now java and again it changes
            System.out.print(key+" ");
            System.out.println(hashmap.get(key));
        }

    }
    }

