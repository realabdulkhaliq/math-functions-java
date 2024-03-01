
import javax.swing.JOptionPane;

public class Table {
    public static void main(String[] args){
        int t,a;
        String output ="";
        String x =JOptionPane.showInputDialog("Enter Table....? ");
        t=Integer.parseInt(x);
if(t>3 && t<20){
        for(a=1;a<=10;a++)
        {
        //System.out.println(t+"*"+a+"="+(t*a));
        output += t+"*"+a+"="+(t*a)+ "\n";
        }
        JOptionPane.showMessageDialog(null, output);
}
 else
     JOptionPane.showMessageDialog(null,"Invalid Input");
}
}
