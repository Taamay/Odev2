package Odev2;



public class Soru6 {
    public static void main(String[]agrs){

    

int t = mid(1, 12, 24);  // 2) belirttiğim mid fonksiyonunu kütüphaneden çağırttım
System.out.println("Median of these three numbers : "+ t);

    
    }

    private static int mid(int i, int j, int k) {  // 1) mid adında bir fonksiyon belirttim
        if(k<j && j<i)
           return j;
        if(i<j && j<k)
           return j;
        if(j<k && k<i)
           return k;
        if(i<k && k<j)
           return k;      
        if(k<i && i<j)
           return i;
        if(j<i && i<k)
           return i;
        return 0;}
}
