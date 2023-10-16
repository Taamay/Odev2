package Odev2;

import javax.swing.JOptionPane;

public class Soru4 {

     public static void main(String[]agrs){
String no1 = JOptionPane.showInputDialog( "First number");
String no2 = JOptionPane.showInputDialog( "Second number"); 
String choise = JOptionPane.showInputDialog("Which operation you choose ");
// Klavyeden bir sayı alıyoruz
double answer = 0;
double number1 = Double.parseDouble(no1); // ekrana girdiğimiz değerlerin tipi string olduğundan dolayı, type converting yapıldı
double number2 = Double.parseDouble(no2);

switch (choise){
    case "addition":
    answer = number1 + number2;
    break;
    case "subtraction":
    answer = number1 - number2;
    break;
    case "multiplication":
    answer = number1*number2;
    break;
    case "division":
    answer = number1/number2;
    break;
}
// switch ile seçilen işlemleri belirliyoruz

JOptionPane.showMessageDialog(null, answer, "answer =", 1);

// sonuç ekrana veriliyor  

    }
}
