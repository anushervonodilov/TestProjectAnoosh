package HomeWork;

public class Diploma {
    public static void main(String[] args) {

        boolean dip = true;
        double gpa = 4.0;

        if(dip){
            System.out.println("Congratulations");
            if(gpa >= 3.5){
                System.out.println("You are eligible for scholarship");
            }else{
                System.out.println("You should have studied harder");
            }
        }else{
            System.out.println("Get a degree");
        }



    }
}
