
import javax.swing.JOptionPane;
import java.util.Scanner;

public class onetohunderd{
    public static void main(String[]args){
 Scanner s=new Scanner(System.in);
    System.out.println("enter the number");
    int b=s.nextInt();
    int ab,bc;    ab=0;bc=0;

    if(b>=10){ab=(b/10); bc=(b-(ab*10));} else{bc=b;}
    if(b==11){bc=0;System.out.println("eleven");}
    if(b==12){bc=0;System.out.println("twelve");}
    if(b==13){bc=0;System.out.println("thirteen");}
    if(b==15){bc=0;System.out.println("fifteen");}
    if(ab==2)System.out.print("twenty ");if(ab==3)System.out.print("thirty ");
    if(ab==4)System.out.print("fourty ");if(ab==5)System.out.print("fifty ");
    if(ab==6)System.out.print("sixty ");if(ab==7)System.out.print("seventy ");
    if(ab==8)System.out.print("eighty ");if(ab==9)System.out.print("ninety ");
    if(bc==1)System.out.println("one");if(bc==2)System.out.println("two");
    if(bc==3)System.out.println("three");if(bc==4)System.out.print("four");
    if(bc==5)System.out.println("five");if(bc==6)System.out.print("six");
    if(bc==7)System.out.print("seven");if(bc==8)System.out.print("eight");
    if(bc==9)System.out.print("nine");if(b>13&&b<20){if(bc==4|bc==6|bc==7|bc==8|bc==9)System.out.println("teen");}
    if(b==10)System.out.println("ten");System.out.println();
    }
}