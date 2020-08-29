
package piramide2d;

import javax.swing.JOptionPane;
public class Piramide2D {

    
    public static void main(String[] args) {
        int i,j,e,a;
        i= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de filas de la piramide: "));
        
        
        for(a=1; a<=i; a++){
            for(e=a;e<=i;e++){
                System.out.print(" ");
            }
            for(j=1;j<=(a*2)-1;j++){
                System.out.print("*");            
            }
                System.out.print("\n");        
        }
    }
    
}
