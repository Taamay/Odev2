package Odev2;

import javax.swing.JOptionPane;

public class Soru5 {
    public static void main(String[]agrs){ 
    

 /*5.-- */

String no1 = JOptionPane.showInputDialog( "First number");
String no2 = JOptionPane.showInputDialog( "Second number");
String no3 = JOptionPane.showInputDialog( "Third number");
int number1 = Integer.parseInt(no1);
int number2 = Integer.parseInt(no2);
int number3 = Integer.parseInt(no3); 
if(number1<number2){
    if(number2<number3){
        System.out.println(number1+"<"+number2+"<"+number3);  //1<2<3
    }
}
if(number1<number3){
    if(number3<number2){
        System.out.println(number1+"<"+number3+"<"+number2);//1<3<2
    }
}
if(number2<number1){
    if(number1<number3){
        System.out.println(number2+"<"+number1+"<"+number3); //2<1<3
    }
}
if(number2<number3){
    if(number3<number1){
        System.out.println(number2+"<"+number3+"<"+number1);//2<3<1
    }
}
if(number3<number2){
    if(number2<number1){
        System.out.println(number3+"<"+number2+"<"+number1);//3<2<1
    }
}
if(number3<number1){
    if(number1<number2){
        System.out.println(number3+"<"+number1+"<"+number2);//3<1<2
    }
}
if(number1==number2){
    if(number2<number3){
        System.out.println(number1+"="+number2+"<"+number3);//1=2<3
    }
}
if(number1==number3){
    if(number3<number2){
        System.out.println(number1+"="+number3+"<"+number2);//1=3<2
    }
}
if(number2==number3){
    if(number3<number1){
        System.out.println(number2+"="+number3+"<"+number1);//2=3<1
    }
}
if(number1<number2){
    if(number2==number3){
        System.out.println(number1+"<"+number2+"="+number1); //1<2=3
    }
}

if(number2<number3){
    if(number3==number1){
        System.out.println(number2+"<"+number3+"="+number1); //2<3=1
    }
}
if(number3<number2){
    if(number2==number1){
        System.out.println(number3+"<"+number2+"="+number1); //3<2=1
    }
}
if(number1==number2){
    if(number2==number3){
        System.out.println(number1+"="+number2+"="+number3); //1=2=3
    }

}


 
       
}


}