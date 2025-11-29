package Chapter4;

import java.util.Scanner;

public class task7 {
public static void main(String[] args) {
    Scanner scann = new Scanner(System.in);

    System.out.print("Enter First Number: ");
        int fnum = scann.nextInt();

    System.out.print("Enter Second Number: ");
        int snum = scann.nextInt();

        int m = fnum*snum, d = fnum/snum, a = fnum+snum, s = fnum-snum;

    System.out.println(fnum+" x "+snum+" = "+m);
    System.out.println(fnum+" / "+snum+" = "+d);
    System.out.println(fnum+" + "+snum+" = "+a);    
    System.out.println(fnum+" - "+snum+" = "+s);


}

    
}
