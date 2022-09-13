import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
/*method created  */
public class calculator {
    static int sum(int x ,int y){
        return x+y;
    }
    static int mul(int x ,int y){
        return x*y;
    }
    static int sub(int x ,int y){
        return x-y;
    }
    static int div(int x ,int y){
        return x/y;
    }
    public static void main(String[] args) {
        Scanner myVar = new Scanner(System.in);
       System.out.println("enter the first no");
        int a=myVar.nextInt();
        System.out.println("enter the second no");
        int b=myVar.nextInt();
        System.out.println("Choices=");
        System.out.println("1.sum=");
        System.out.println("2.mul");
        System.out.println("3.sub");
        System.out.println("4.div");
        System.out.println("enter your choice");
        final int choice=myVar.nextInt();
        
        if (choice==1){
            System.out.println("sum of no=");
            System.out.println(sum(a,b));

        }
        else if (choice==2) {
            System.out.println("mul of no=");
           System.out.println(mul(a,b)); 
        }
        else if (choice==3) {
            System.out.println("sub of no=");
            System.out.println(sub(a,b));}
            else if(choice==4){
                System.out.println("div of no=");
                System.out.println(div(a,b));
            }
            else{
                System.out.println("wrong input");
            }
            
        }
    }

