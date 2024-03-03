
import javax.swing.JOptionPane;

public class factorsofnumber {
    public static void main(String Args[]){
        int y,i;
        String output="";
        String x=JOptionPane.showInputDialog("Enter Integer");
        y= Integer.parseInt(x);
        for(i=2;i<=y;i++)

        if (y%i==0){
            output+= "Factors are="+i+"\n";
        
}
        JOptionPane.showMessageDialog(null,output);
}}
