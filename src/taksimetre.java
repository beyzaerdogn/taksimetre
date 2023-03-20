import java.util.Scanner;

public class taksimetre {
    public void main (){
    int km;
    double herkm =3.5;
    int ilk =10;

     Scanner giris = new Scanner(System.in);
     System.out.print("km giriniz:");
     km = giris.nextInt();

     double total =( km * herkm);
     total += ilk;
     total = (total <30 ) ? 30 : total;
     System.out.print("toplam tutar :"+total);
}}
