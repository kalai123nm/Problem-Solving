import java.util.Scanner;

public class TenPeopleAge {
    public static void main(String[] args) {
        TenPeopleAge tenP=new TenPeopleAge();
        tenP.ageOfTenPeople();
        tenP.prints();
    }
    int age_18=0;
    int age18_60=0;
    int age_60=0;

    void ageOfTenPeople(){

        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the ten people's age: ");
        int age[]=new int[10];
        for(int i=0;i<10;i++){
            age[i]=sca.nextInt();
        }
        
        for(int j=0;j<10;j++){
            if(age[j]<18){
                age_18++;
            }if((age[j]>=18)&&(age[j]<=60)){
                age18_60++;
            }if(age[j]>60){
                age_60++;
            }
        }
        sca.close();
    }
    void prints(){
        System.out.println("Numbers of people below 18: "+age_18);
        System.out.println("Numbers of people between 18-60: "+age18_60);
        System.out.println("Numbers of people above 60: "+age_60);
    }
}
