import javax.swing.JOptionPane;

public class Oddnumber {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int i;
     int t=1;
     System.out.println("Odd Numbers Are:");
       for(i=1;i<=15;i++)
       {
                        if(i%2==0){
                 //        JOptionPane.showMessageDialog(null,"Even number");
                                    }
                        else{
                       t=t*i ;
                       System.out.println(i);
                                    }
       }
JOptionPane.showMessageDialog(null,"Product of Odd Numbers is= "+t);
    }
    }

  