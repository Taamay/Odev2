package Odev2;

import javax.swing.JOptionPane;

public class Soru12 {
    public static void main(String[]agrs){

        String number = JOptionPane.showInputDialog( "number");
int no =Integer.parseInt(number);

for(int i=3;i<=no; i=i+1){
   if(asal(i)=="asal" && asal(no-i)=="asal"){          
    
      System.out.println(i + " + " + (no-i) + " = " + no);
       i=i+no;  // bu çıktı olarak aynı şeyi tersten yazmasın diye
   }
}


    }
    
    private static String asal(int i) {  // asal(i) : i asal ise "asal" değerini verir
        int c=0;
        for(int m=2;m<i;m++){
            if(i==(i/m)*m){
                c++;
            }    
        }
        if(c==0){
            return "asal"; 
        }
        else{
            return "asal değil";
        }

          
    }
}
