package Odev2;

import javax.swing.JOptionPane;

public class Soru8 {
    public static void main(String[]agrs){


/*   
 
        n = 6 için aşağıdaki şekil çizilecek ()


      * 
                       n=6 
     ***

    *****

   *******

  ********* 
                 n - satır numarası  tane " " + satır numarası*2 -1 tane "*" 
 ***********

  ********* 
                 satır numarası kadar  " "   ve     2*(n-satır no)-1 tane "*"  
   *******

    ***** 

     *** 

      * 

      */


String number = JOptionPane.showInputDialog( "write a number ");

int n = Integer.parseInt(number);

for(int j=1; j<n+1; j++){    //satır no = j
    System.out.println("\n");  
    for(int i=0; i<n-j; i++)         
    {
        System.out.print(" ");
    }
    for(int x=0; x<2*j-1; x++){
        System.out.print("*");    
    }
    
}
for(int m=1; m<n+1; m++){        // dörtgenin yarısından itibaren satır no = m 
    System.out.println("\n");
    for(int i=0; i<m; i++){
        System.out.print(" ");
     }
    for(int x=0; x<2*(n-m)-1; x++){
        System.out.print("*");
    }
}
      

 }
    
}
