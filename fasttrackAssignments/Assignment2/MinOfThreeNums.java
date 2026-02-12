public class MinOfThreeNums {
    public static void main(String[] args) {
        int numOne=15;
        int numTwo=6;
        int numThree=11;
        int minimum=numOne;
        if((numOne<numTwo)&&(numOne<numThree)){
            minimum=numOne;
        }else if(numTwo<numThree){
            minimum=numTwo;
        }else{
            minimum=numThree;
        }
        System.out.println("Minimum number is: "+minimum);

    }
}