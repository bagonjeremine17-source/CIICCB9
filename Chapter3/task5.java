package Chapter3;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.print("Enter First Number: ");
        int fnum = s.nextInt();
        System.out.print("Enter Second Number: ");
        int fnum2 = s.nextInt();
        System.out.print("Enter Third Number: ");
        int fnum3 = s.nextInt();


        if(fnum>fnum2&&fnum>fnum3){
            System.out.println("The Larges Number is "+fnum);
           
        }
        if (fnum2>fnum&&fnum2>fnum3) {
            System.out.println("The Larges Number "+fnum2);
            
        }
        if (fnum3>fnum&&fnum3>fnum2) {

            System.out.println("The Larges Number is "+fnum3);
            
        }

       else{

            System.out.println("All numbers are equals");
        }


    }



    
}
