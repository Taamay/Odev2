package Odev2;

import javax.swing.JOptionPane;

public class Soru11 {

    public static void main(String[]agrs){

       
/*                      (widht ve height değeri 1/2 oranlı olmayınca şekil bozuluyor)
 
 |*     |        widht = 5
 | *    |        height= 10
 |  *   |
 |    * |
 |     *|
 |    * |
 |   *  |
 |  *   |
 | *    |
 |*     |
 
 */
 

String height = JOptionPane.showInputDialog( "Height");
String width = JOptionPane.showInputDialog( "Width");
int h =Integer.parseInt(height);
int w =Integer.parseInt(width);
if(w*2!=h){
     
    String question = JOptionPane.showInputDialog( "şekil düzgün çıkmayabilir. Yine de devam edecek misiniz?");
    switch(question){
        case "evet":
        
        break;
        case "hayır":
        System.exit(0);   //internetten stop command in java diye arattım ve sanırım işe yaradı
        break;

       
    }
}
for(int j=0;j<h/2;j++){
    System.out.print("|");
    for(int i=0;i<j;i++){
        System.out.print(" ");
    }
    System.out.print("*");
    for(int i=1;i<w-j;i++){
        System.out.print(" ");
    }
    System.out.println("|");
}
for(int j=0;j<(h/2)-1;j++){
    System.out.print("|");
    for(int i=0;i<w-j-2;i++){
        System.out.print(" ");
    }
    System.out.print("*");
    for(int i=0;i<j+1;i++){
        System.out.print(" ");
    }
    System.out.println("|");
}


    }
    
}
