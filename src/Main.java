import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.print("1. kenarı girin: ");
        int s1= input.nextInt();
        System.out.print("2. kenarı girin: ");
        Scanner inputt=new Scanner(System.in);
        int s2=inputt.nextInt();
        double s3 =Math.sqrt((s1*s1)+(s2*s2));
        System.out.println("hipotenüs: "+s3);





    }
}






