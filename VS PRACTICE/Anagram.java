import java.util.Arrays;

public class Anagram{
    public static void main(String[] args) {
        String string1="silent";
        String string2="listen";
        if(isAnagram(string1,string2)){
            System.out.println(string1+" is Anagram of "+string2);
        }else{
            System.out.println(string1+" is not an Anagram of "+string2);
        }
    }   
    static boolean isAnagram(String string1,String string2){
        if(string1.length()!=string2.length()) return false;

        char[] str1=string1.toCharArray();
        char[] str2=string2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1,str2);
    }
}