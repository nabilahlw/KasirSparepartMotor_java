package kasirSparepart;
import java.util.Scanner;
public class KasirSparepart {
public static void main(String[] args) {

int OM, KR, BM, BL, AM, KK, AR, CR;
OM = 65000; //OLI MOTOR
KR = 30000; // KAMPAS REM BELAKANG  
BM = 25000; //BUSI MOTOR
BL = 250000; // BAN LUAR
AM = 280000; //AKI MOTOR
KK =135000; //KAMPAS KOPLING
AR =40000; //AIR RADIATOR
CR =185000; //CAKRAM REM

int tonderdil1, tonderdil2, tonderdil3, tonderdil4, tonderdil5, tonderdil6, tonderdil7, tonderdil8;
tonderdil1 = 0;
tonderdil2 = 0;
tonderdil3 = 0;
tonderdil4 = 0;
tonderdil5 = 0;
tonderdil6 = 0;
tonderdil7 = 0;
tonderdil8 = 0;
int total,bayar;



int onderdil;
int totalOnderdil;

String mulai = "N";
int jumlah;

Scanner input = new Scanner(System.in);
do{
do{
System.out.println(" -- Bengkel Motor Gasss -- ");
System.out.println("Onderdil Motor");
System.out.println(" 1. Oli Motor");
System.out.println(" 2. Kampas Rem");
System.out.println(" 3. Busi Motor");
System.out.println(" 4. Ban Luar");
System.out.println(" 5. Aki Motor");
System.out.println(" 6. Kampas Kopling");
System.out.println(" 7. Air Radiator");
System.out.println(" 8. Cakram Rem");
System.out.print("Pilih Onderdil Motor Nomer: ");
onderdil = input.nextInt();

if(onderdil == 1){
System.out.println("Oli Motor = Rp. " + OM);
System.out.print("jumlah = ");
jumlah = input.nextInt();

tonderdil1 = jumlah*OM;

System.out.println("Total Onderdil = Rp. "+ tonderdil1);
}
else if(onderdil ==2){
System.out.println("Kampas Rem = Rp. " + KR);
System.out.print("jumlah = ");
jumlah = input.nextInt();

tonderdil2 = jumlah*KR;

System.out.println("Total Onderdil = Rp. "+ tonderdil2);
}
else if(onderdil ==3){
System.out.println("Busi Motor = Rp. " + BM);
System.out.print("jumlah = ");
jumlah = input.nextInt();

tonderdil3 = jumlah*BM;

System.out.println("Total Onderdil = Rp. "+ tonderdil3);
}

else if(onderdil ==4){
System.out.println("Ban Luar = Rp. " + BL);
System.out.print("jumlah = ");
jumlah = input.nextInt();

tonderdil4 = jumlah*BL;

System.out.println("Total Onderdil = Rp. "+ tonderdil4);
}

else if(onderdil ==5){
System.out.println("Aki Motor = Rp. " + AM);
System.out.print("jumlah = ");
jumlah = input.nextInt();

tonderdil5 = jumlah*AM;

System.out.println("Total Onderdil = Rp. "+ tonderdil5);
}

else if(onderdil ==6){
System.out.println("Kampas Kopling = Rp. " + KK);
System.out.print("jumlah = ");
jumlah = input.nextInt();

tonderdil6 = jumlah*KK;

System.out.println("Total Onderdil = Rp. "+ tonderdil6);
}

else if(onderdil ==7){
System.out.println("Air Radiator = Rp. " + AR);
System.out.print("jumlah = ");
jumlah = input.nextInt();

tonderdil7 = jumlah*AR;

System.out.println("Total Onderdil = Rp. "+ tonderdil2);
}

else if(onderdil ==8){
System.out.println("Cakram Rem = Rp. " + CR);
System.out.print("jumlah = ");
jumlah = input.nextInt();

tonderdil8 = jumlah*CR;

System.out.println("Total Onderdil = Rp. "+ tonderdil8);
}

else{
System.out.println("Maaf, nomer pesanan anda tidak ada di daftar barang");

}
}while(onderdil >8);
totalOnderdil = tonderdil1 + tonderdil2 + tonderdil3 + tonderdil4 + tonderdil5 + tonderdil6 + tonderdil7 + tonderdil8;

total = totalOnderdil;

System.out.print("Total = Rp. "+total);


do{
System.out.print(" Bayar = ");
bayar = input.nextInt();
if ( bayar < total){

int kurang2 = bayar - total;
System.out.print("Maaf, uang anda tidak cukup Rp. "+ kurang2);


}
}while(bayar <total);



int Kembalian2 = bayar - total;

System.out.print("Kembalian= " + Kembalian2);


System.out.print(" Mulai Lagi ? (y/n)");
mulai = input.next();

}while(mulai.equals("y"));
System.out.println("Terima Kasih");
}

}
