public class Student{
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private boolean lulus;
    private static int banyakObjek = 0;
    public Student(){
        banyakObjek++;
        name = "";
        address = "";
        age = 0;
    }
    public Student(String n, String a, int ag){
        banyakObjek++;
        name = n;
        address = a;
        age = ag;
    }
    public Student(double math, double english, double science){
        banyakObjek++;
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
    }
    public void setName(String n){
        name = n;
    }
    public void setAddress(String a){
        address = a;
    }
    public void setAge(int ag){
        age = ag;
    }
    public void setMath(double math){
        mathGrade = math;
    }
    public void setEnglish(double english){
        englishGrade = english;
    }
    public void setScience(double science){
        scienceGrade = science;
    }
    private double getAverage(){
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade)/3;
        return result;
    }
    public int getbanyakObjek(){
        return banyakObjek;
    }
    public void displayMessage(){
        System.out.println("Siswa dengan nama "+name); 
        System.out.println("beramalat di "+address); 
        System.out.println("berumur "+age); 
        System.out.println("mempunyai nilai rata rata "+getAverage());
        lulus = statusAkhir();
        if(lulus) System.out.println(name + " dinyatakan lulus!!!");
        else System.out.println(name + " dinyatakan tidak lulus :("); 
    }
    public boolean statusAkhir(){
        double nilaiAkhir = getAverage();
        if(nilaiAkhir >= 61) return true;
        else return false;
    } 
}