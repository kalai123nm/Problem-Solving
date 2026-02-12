public class ReverseOfVowelsQ03 {
    public static void main(String[] args) {
        String s1="trieducation";
        System.out.println("before: "+s1);
        String result=method01(s1);
        System.out.println("after : "+result);
    }
    static String method01(String s1){
        char[] chars=s1.toCharArray();
        int left=0; int right=chars.length-1;
        while(left<right){
            while (left<right && !isVowel(chars[left])) {
                left++;
            }
            while(left<right && !isVowel(chars[right])){
                right--;
            }
            if(left<right){
                char temp=chars[left];
                chars[left]=chars[right];
                chars[right]=temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
    static boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch) !=-1;
    }
}
