package HomeWork;

public class Mortgage {
    public static void main(String[] args) {

        double rate = 4.4;
        int price = 100000;

        if(rate < 4.5){
            System.out.println("The user will consider buying");
            if(price < 200000){
                System.out.println("Will pay cash");
            }else{
                System.out.println("Will take out a loan");
            }
        }else{
            System.out.println("Will not buy a house");
        }



    }
}
