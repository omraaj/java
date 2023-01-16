import java.util.Hashmap;
import java.util.Iterator;
import java.util.LinkedhashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo{

public static void main(String[] args) {

LinkedHashMapDemo<Integer,String>lhMap=new LinkedHashMap<Integer,String>();

lhMap.put(1,"Mumbai,Maharashtra");
lhMap.put(2,"Delhi,NCT");
lhMap.put(3,"Bengaluru,Karnataka");
lhMap.put(4,"Kolkata,West Bengal");

System.out.println("The Second Largest populated city is"+lhMap.get(2));
System.out.println("traverse using foreach Loop");
for (Map.Entry m :lhMap.entrySet()) {
System.out.println("Population wise Rank:"+m.getkey()+"City"+m.getValue());
}

System.out.println("\ntraverse using iterator");

Set set = lhMap.entrySet();
Iterator<Map.Entry>iterator = set.iterator();
while(iterator.hasNext()){
Map.Entry entry = iterator.next();
System.out.println("Population wise Rank :"+entry.getKey()+"City"+entry.getValue());
}
}
}
