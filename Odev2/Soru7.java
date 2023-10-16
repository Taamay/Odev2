package Odev2;

public class Soru7 {
    public static void main(String[]agrs){

        

     int a =signum(10);  // 2) belirttiğim signum fonksiyonunu kütüphaneden çağırttım
     System.out.println(a);


    }
    
    private static int signum(int i) {  // 1) signum adında bir fonksiyon belirttim
        if(i<0)
          return -1;
        if(i==0)
          return  0;
        if(i>0)
          return  1;
        return 0;  
    }
}
