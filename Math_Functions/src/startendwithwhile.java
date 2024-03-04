/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import javax.swing.JOptionPane;


public class startendwithwhile {
    public static void main(String Args[]){

        int start,end,i,b;
        String x1 =JOptionPane.showInputDialog(null, "Enter start number");
       start=Integer.parseInt(x1);

       String x2=JOptionPane.showInputDialog(null,"Enter end number");
       end=Integer.parseInt(x2);
       String output="";
       i=start;

       while (i<end){

            output+=i+"\n";
            //System.out.println(+i);
      //
    i++;
}
       JOptionPane.showMessageDialog(null,output);
}
}
