package problems.Sample_prgms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hashmapSample {

    public static void main(String[] args) {
        HashMap<Integer, String> HM = new HashMap<>();
        HM.put(1, "Java");
        HM.put(2, "C+");
        HM.put(3, "C++");
        HM.put(4, "Python");
        HM.put(5, "Scala");
        Set<Integer> keyset = HM.keySet();
        Iterator<Integer> Iteratorkey = keyset.iterator();

        while(Iteratorkey.hasNext()) {
            Integer key = Iteratorkey.next();
            System.out.println(HM.get(key));

        }

    }



    }

