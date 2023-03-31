import java.util.Scanner;

public class Method_Class {
    String std_names = "David";

    public void MyId() {
        int std_id = 521542;
        System.out.println("Student id is:" + std_id);
    }

    public void MyGender() {
        String gender = "male";
        System.out.println("The gender is" + gender);
    }
    public void sum(int x,int y){

        int sum = x+y;
        System.out.println("The sum is"+ sum);
    }
    public void multiplication(int x,int y){

        int mul= x*y;
        System.out.println("The multiplication is"+ mul);
    }
    public void substraction(int x,int y){

        int sub= x-y;
        System.out.println("The substraction is"+ sub);
    }
    public void division(int x,int y){

        int div= x/y;
        System.out.println("The division is"+ div);
    }

    public static void main(String args[]) {
        int a ;
        int b ;
        Scanner sc = new Scanner(System.in);
        Method_Class myobj = new Method_Class();
        System.out.println(myobj.std_names);
        myobj.MyId();
        myobj.MyGender();
        System.out.println("Enter two values");
        a=sc.nextInt();
        System.out.println("The number is" + a);
        b=sc.nextInt();
        System.out.println("The number is" + b);
        myobj.sum(a,b);
        System.out.println("Enter two values");
        a=sc.nextInt();
        System.out.println("The number is" + a);
        b=sc.nextInt();
        System.out.println("The number is" + b);
        myobj.multiplication(a,b);
        System.out.println("Enter two values");
        a=sc.nextInt();
        System.out.println("The number is" + a);
        b=sc.nextInt();
        System.out.println("The number is" + b);
        myobj.substraction(a,b);
        System.out.println("Enter two values");
        a=sc.nextInt();
        System.out.println("The number is" + a);
        b=sc.nextInt();
        System.out.println("The number is" + b);
        myobj.division(a,b);

    }

}