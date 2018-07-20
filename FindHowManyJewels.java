import java.util.*;
public class FindHowManyJewels{
    
    //since j is a string array contains all the distinctive jewels
    //and s is a string array contains stones
    //we'll match string s to see if each element (stone) with those in j to see if s contains any jewels mentioned in j
    public int findJewel(String J, String S){
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int count=0;
        //1st step we store every jewel as a key in HashMap, we don't care much about the value, but we know each jewel in j is dintinctive, so they're good to be "keys" in map.
        for (int i=0; i<J.length(); i++) {
            hm.put(J.charAt(i), i);
        }
        
        //2nd we're going through each stone in s to see if it matches a "key" (jewel) saved in the map, if so, we increase the counter 
        for (int i=0; i<S.length(); i++) {
            if (hm.containsKey(S.charAt(i))) {
                count++; 
            }  
        }
        return count; 
    }

    public static void main(String []args){
        int numOfJewels=0; 
        String jewel = "aAGMs";
        String stone = "aAAbbbgs";
        FindHowManyJewels fhmj = new FindHowManyJewels(); 
        numOfJewels=fhmj.findJewel(jewel, stone); 
        System.out.println("Total number of jewels: "+numOfJewels+"\n");
    }
}