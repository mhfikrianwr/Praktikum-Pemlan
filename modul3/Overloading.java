import java.util.Scanner;
public class Overloading {
public static void HitungLuas(int a,int b){ 

int nilai = a*b; 
if(a < 0 || b < 0) System.out.println("Error  ! panjang tidak boleh negatif");
else System.out.println("maka hasil luas : "+nilai); 
} 
public static void HitungLuas(double a,double b){ 
    if(a < 0 || b < 0){
        System.out.println("Error! value tidak boleh negatif");
    }
    else System.out.println("Maka hasil luas : " + a * b);
} 
public static void main(String[] args) { 
Scanner in = new Scanner(System.in); 
System.out.print("masukkan nilai integer 1 : "); 
int integer1 = in.nextInt(); 
System.out.print("masukkan nilai integer 2 : "); 
int integer2 = in.nextInt(); 
HitungLuas(integer1, integer2); 
System.out.print("masukkan nilai double 1 : "); 
double double1 = in.nextDouble(); 
System.out.print("masukkan nilai double 2 : "); 
double double2 = in.nextDouble(); 
HitungLuas(double1, double2);
in.close();
} 
}

