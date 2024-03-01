
import javax.swing.JOptionPane;

public class sumof10integers {
    public static void main(String Args[]){

int y=0,z=0;
for (int i=1;i<=10;i++){
    String x=JOptionPane.showInputDialog("Enter Integers");
 y= Integer.parseInt(x);
    z=z+y;

}
JOptionPane.showMessageDialog(null,"Sum Of Integers="+z);

}}
