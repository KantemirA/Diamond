package test.Diamond;

import java.util.Hashtable;
import java.util.Map;

import static java.lang.Math.pow;

public class Example {
    public static void main(String[] args) {
        Map<Character, Integer> map = new Hashtable<>();
        map.put('a', 97);
        map.put('b', 98);
        map.put('c', 99);
        map.put('d', 100);
        map.put('e', 101);
        map.put('f', 102);
        map.put('g', 103);
        map.put('h', 104);
        map.put('i', 105);
        map.put('j', 106);
        map.put('k', 107);
        map.put('l', 108);
        map.put('m', 109);
        map.put('n', 110);
        map.put('o', 111);
        map.put('p', 112);
        map.put('q', 113);
        map.put('r', 114);
        map.put('s', 115);
        map.put('t', 116);
        map.put('u', 117);
        map.put('v', 118);
        map.put('w', 119);
        map.put('x', 120);
        map.put('y', 121);
        map.put('z', 122);
        System.out.println(traslateToInt("cats", (Hashtable<Character, Integer>) map));
    }

    public static int traslateToInt(String s,Hashtable<Character,Integer> map) {
        char[] arr = s.toLowerCase().toCharArray();
        int sLength = s.length()-1;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += map.get(arr[i])* pow(27,sLength--);
        }
        return result;
    }
}
