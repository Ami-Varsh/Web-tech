/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrong;
import java.util.Scanner;
/**
 *
 * @author amirt
 */
public class Armstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if(num==1 || num==0)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            int sum=0;
            int n=num;int r;
            while(n>0)
            {
               r=n%10;
               sum=(int)(sum+Math.pow(r,3));
               n/=10;
            }
            if(sum==num){
                System.out.println("Armstrong Number");
            }
            else
                System.out.println("Not Armstrong Number");
        }
    }
    
}
