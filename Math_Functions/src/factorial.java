
import javax.swing.JOptionPane;

public class factorial {
    public static void main(String Args[]){
   String x=JOptionPane.showInputDialog("Enter Integer");

                int y= Integer.parseInt(x);
                int fact=1;
                for (int i=1;i<=y;i++){
                            fact= fact*i;}
                JOptionPane.showMessageDialog(null,+y+"!=" +fact,"Factorial",JOptionPane.INFORMATION_MESSAGE);


}}