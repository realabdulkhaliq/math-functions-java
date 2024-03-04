
import javax.swing.JOptionPane;
public class over {
     public static void main(String[] args){

  int w,s,b,i,f,g,e;
  f=0;
  g=0;
   i=1;
  while(i<=6){

      String x =JOptionPane.showInputDialog("Enter ball ");
        b=Integer.parseInt(x);

        String x1 =JOptionPane.showInputDialog("Enter Score ");
        s=Integer.parseInt(x1);

          String x2 =JOptionPane.showInputDialog("Enter Wicket ");
        w=Integer.parseInt(x2);

              f=s+f;
              g=w+g;

i++;
         }
   String x3 =JOptionPane.showInputDialog("Enter Extras ");
        e=Integer.parseInt(x3);

JOptionPane.showMessageDialog(null,"Scores        Wickets         Extras\n"+"     "+f+"               "+g+"                      "+e);
      
}}
