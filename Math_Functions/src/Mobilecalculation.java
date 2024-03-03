
import javax.swing.JOptionPane;


public class Mobilecalculation {

    public static void main(String Args[]){
        double a,b,c,d, e, f, i,j,k,l,value;
    String s1,s2;

   for(int t=1;t<=4;t++){
        s1=JOptionPane.showInputDialog(null,"Enter minuts");
    a=Double.parseDouble(s1);
    s2=JOptionPane.showInputDialog(null,"Enter seconds");
    b=Double.parseDouble(s2);
        d=a*60;
        e=d+b;
        f=e*0.02;
        i=e*0.04;
        j=e*0.05;
        k=e*0.1;
    s2=JOptionPane.showInputDialog(null,"tell network");
    c=Double.parseDouble(s2);
   if(c==1)
       JOptionPane.showMessageDialog(null,"call rate="+f);
     else if(c==2)
          JOptionPane.showMessageDialog(null,"call rate="+i);
     else if(c==3)
        JOptionPane.showMessageDialog(null,"call rate="+j);
     else if(c==4)
         JOptionPane.showMessageDialog(null,"call rate="+k);
     else  JOptionPane.showMessageDialog(null,"invalid entry");
        }
}}
