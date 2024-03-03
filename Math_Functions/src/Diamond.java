
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class Diamond {
    public static void main(String[] args) {
        //String x=JOptionPane.showInputDialog("Enter no of Star");
        int N = 10;//Integer.parseInt(x);

        for (int i = -N; i <= N; i++) {
            for (int j = -N; j <= N; j++) {
                if (Math.abs(i) + Math.abs(j) <= N) System.out.print("* ");
                else                                System.out.print("  ");
            }
            System.out.println();
        } 
    }
}


