import java.util.HashMap;
import java.util.Set;

/**
 * Created by Rohith on 6/4/2017.
 */
public class Permutation {

    public boolean compute(String s1, String s2){
        int count = 1;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        if (s1.length() != s2.length()){
            return false;
        }

        for(char data : s1.toCharArray()){
            if (map.containsKey(data)){
                count = count + 1;
                map.put(data,count);
            }
            else{
                map.put(data,count);
            }
        }
        System.out.print(map + "After Insertion " + "\n" );

        for(char data : s2.toCharArray()){
            int x = 0;
            if (map.containsKey(data)){
                count = count - 1;
                x = map.get(data);
                x= x - 1;
                map.put(data,x);
            }
            else{
                count = count -1;
                map.put(data,count);
            }
        }

        System.out.print(map + "After Deletion" + "\n");
        Set<Character> keys = map.keySet();
        for(Character elements: keys){
            if (map.get(elements)!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){
        String s1 = "tesla";
        String s2 = "slate";

        Permutation obj = new Permutation();
        System.out.print(obj.compute(s1,s2));
    }
}
