package Odev2;

import javax.swing.JOptionPane;

public class Soru10 {

    public static void main(String[]agrs){


        /*10.---- */

 //BİR SAYININ ASAL ÇARPANLARINI EKRANA YAZAN PROGRAM   (her durumda son asal katı yazacak şekilde bulamadım) 


String no = JOptionPane.showInputDialog( "Write the number");   
int m = Integer.parseInt(no);
for(int i=2;i<=m; i=i+1){
    
    if(i!=2){
     if(m==m/(i-1)*(i-1)){
        i--;
     }
    
    }
     if(m==(m/i)*i){
        System.out.print(i+" " );
        m = m/i;
        
    }
     

}

    }
    
}
