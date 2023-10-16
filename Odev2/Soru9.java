package Odev2;

import javax.swing.JOptionPane;

public class Soru9 {

    public static void main(String[]agrs){

        
String screen = JOptionPane.showInputDialog( "seconds"); //String tipinde ekrana değer giriliyor
long seconds = Long.parseLong(screen); // ekrandaki değer istendiği şekilde long type'a convert ediliyor
String time= displayDuration( seconds ); // belirttiğim fonk.'u çağırılıp saniye üzerinde kullanılıyor'
System.out.println(seconds  + " seconds = "+ time ); 

}

private static String displayDuration(long i) { // displayDuration adında bir fonk. belirttim
    long j =0;
    long k =0;
    if(i>60 && i<3600)
     return ( j = i/60) + " mins" + (i-j*60 )+ " seconds";
    if (i<60)
     return i + " seconds";
    if(i>3600)
     return (k = i/3600) + "hours " + (j=(i-k*3600)/60) + " minutes " + (i-k*3600 - j*60) + " seconds";  
    return "";
}


}
    

