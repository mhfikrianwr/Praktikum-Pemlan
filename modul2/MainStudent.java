import java.util.*;
public class MainStudent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int banyakMahasiswa;
        System.out.print("Masukkan jumlah mahasiswa : "); 
        banyakMahasiswa = in.nextInt();
        in.nextLine();
        Student students[] = new Student[banyakMahasiswa];
        for(int i=0; i<banyakMahasiswa; i++){
            students[i] = new Student();
            System.out.println("=== Meminta input student ke-"+(i+1)+" ===");
            String a;
            System.out.print("Name : "); a = in.nextLine();
            students[i].setName(a);
            System.out.print("Address : "); a = in.nextLine();
            students[i].setAddress(a);
            int c;
            System.out.print("Umur : "); c = in.nextInt();
            students[i].setAge(c);
            double b;
            System.out.print("Nilai Math : "); b =in.nextDouble();
            students[i].setMath(b);
            System.out.print("Nilai english : "); b =in.nextDouble();
            students[i].setEnglish(b);
            System.out.print("Nilai Science : "); b =in.nextDouble();
            students[i].setScience(b);
            System.out.println("====================================");
            in.nextLine();
        }
        for(int i=0; i<banyakMahasiswa; i++){
            students[i].displayMessage();
        }
        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20); 
        anna.setMath(100); 
        anna.setScience(89); 
        anna.setEnglish(80); 
        anna.displayMessage();

        //menggunakan constructor lain
        System.out.println("===================");
        Student chris = new Student("Chris", "Kediri", 21); chris.setMath(70); 
        chris.setScience(60); 
        chris.setEnglish(90); 
        chris.displayMessage();

        //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
        System.out.println("==================="); 
        anna = new Student("anna", "Batu", 18); 
        anna.displayMessage(); 
        //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method 
        System.out.println("==================="); 
        chris.setAddress("Surabaya"); 
        chris.setAge(22); 
        chris.displayMessage(); 

        //Membuat objek dengan constructor pengisi nilai
        System.out.println("===================");
        Student Fikri = new Student(90,95,100);
        Fikri.setName("Fikri");
        Fikri.setAge(18);
        Fikri.setAddress("Sulawesi");
        Fikri.displayMessage();
        in.close();     

        System.out.println("Banyak Objek : " + anna.getbanyakObjek());
    }
}
