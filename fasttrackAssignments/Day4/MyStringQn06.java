import java.util.Scanner;
public class MyStringQn06 {
    public static void main(String[] args) {
        //Scanner scan=new Scanner(System.in);
        MyStringQn06 myStr=new MyStringQn06();
        numChar=myStr.numOfChar();
        System.out.println("Total numbers of Characters: "+numChar);
        
        myStr.charAtIndex(index, str1);


        boolean otherResult=myStr.isEqual(myString);
        System.out.println("\nAre both String same? "+otherResult);

        
        System.out.println("\nUPPERCASE: "+myStr.upperCase(str1));

        System.out.println("\nlowercase: "+myStr.lowerCase(str1));

        System.out.println("\nsubString: "+myStr.subString(str1, index, index));

        System.out.println("\nConcatenation of two String: "+myStr.conCat(str1,myString));

        System.out.println(myStr.isContains());

        System.out.println(myStr.indexOfChar());

        System.out.println(myStr.replaceMyString());

        scan.close();
    }


    
    static Scanner scan=new Scanner(System.in);
    static String str1;
    int length;
    static int numChar;
    static int index;
    static String myString,otherString;
    
    char[] arr;

    int numOfChar(){
        length=0;
        System.out.print("Enter the String: ");
        str1=scan.nextLine();
        arr=str1.toCharArray();
        try {
            while(true){
            str1.charAt(length);
            length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            //System.out.println(e);
        }
        return length;
    }


    char charAtIndex(int index, String str1){
        System.out.print("Enter the index value: ");
        index=scan.nextInt();
        char character = 0;
        try{
            for(int i=0;i<str1.length();i++){
                if((index<=length)&&(arr[index]==arr[i])){
                    character=arr[i];
                    break;
                }
            }System.out.println("Letter of the index "+index+" is "+character);  
        }
        catch(StringIndexOutOfBoundsException f){
            System.out.println();
        }return character;
    }


    boolean isEqual(String myString){
        scan.nextLine();
        System.out.print("Enter the Other String: ");
        String str02=scan.nextLine();
        try {
            if((str1.length()!=str02.length())) return false;   
            else{for(int i=0;i<str1.length();i++){    
                if(str1.charAt(i)!=str02.charAt(i)) return false;}
            }
        }catch (StringIndexOutOfBoundsException s) {
            s.getMessage();
        }
        return true;
    }


    StringBuffer upperCase(String str1){
        StringBuffer str1Uppercase=new StringBuffer();
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)>='a' && str1.charAt(i)<='z'){
                str1Uppercase.append((char)(str1.charAt(i)-32));
            }else{
                str1Uppercase.append(str1.charAt(i));
            }
        }
        return str1Uppercase;
    }


    StringBuffer lowerCase(String str1){
        StringBuffer str1Lowercase=new StringBuffer();
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)>='A' && str1.charAt(i)<='Z'){
                str1Lowercase.append((char)(str1.charAt(i)+32));
            }else{
                str1Lowercase.append(str1.charAt(i));
            }
        }
        return str1Lowercase;
    }
    StringBuffer subString(String str1, int indexNum1, int indexNum2){
        System.out.print("Enter starting indexPlace: ");
        int str01=scan.nextInt();
        System.out.print("Enter ending indexPlace: ");
        int str02=scan.nextInt();
        StringBuffer str1SubStr=new StringBuffer();
        try {
            for(int i=str01;i<str02;i++){
            str1SubStr.append(str1.charAt(i));
            }
        }catch (StringIndexOutOfBoundsException s) {
            s.getMessage();
        }
        return str1SubStr;
    }
    StringBuffer conCat(String str1, String myString){
        StringBuffer conCat2Str=new StringBuffer();        
        System.out.print("Enter the Other String: ");
        String str02=scan.nextLine();
        scan.nextLine();
        conCat2Str.append(str1);
        conCat2Str.append(str02);
        return conCat2Str;
    }
    boolean isContains(){
        System.out.println("Enter the substring: ");
        String sub=scan.nextLine();
        if(sub.length()<=str1.length()){
            for(int i=0;i<str1.length()-sub.length();i++){
                if(str1.substring(i,(i+sub.length())).equals(sub)) return true;
            }
        }
        return false;
    }
    int indexOfChar(){
        System.out.println("Enter the character: ");
        char c=scan.next().charAt(0);
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)==c) return i;
        }
        return -1;
    }
    StringBuffer replaceMyString(){
        System.out.println("Enter the character you want to replace: ");
        char c=scan.next().charAt(0);
        System.out.println("Enter the char u want to replace with: ");
        char ch=scan.next().charAt(0);
        StringBuffer strReplace=new StringBuffer();
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)==c){
                strReplace.append(ch);
            }else strReplace.append(str1.charAt(i));
        }
        return strReplace;
    }
}