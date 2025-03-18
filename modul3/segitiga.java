public class segitiga{
int alas, tinggi; 
public segitiga(String a, String b){
    parse(a,b);
}
public void parse(String a, String b){
    alas = Integer.parseInt(a);
    tinggi = Integer.parseInt(b);
}
public segitiga(int alas){ 
this.alas = alas; 
} 
public segitiga(int alas, int tinggi){ 
this.alas = alas; 
this.tinggi = tinggi; 
} 
public void setAlas(int alas){ 
this.alas = alas; 
} 
public void setTinggi(int tinggi){ 
this.tinggi = tinggi; 
} 
public int getAlas(){ 
return alas; 
} 
public int getTinggi(){ 
return tinggi; 
} 
public double hitungLuas(){ 
double hasil = (double)(getTinggi()*getAlas())/2; 
return hasil; 
}
public void displayMessage(){
System.out.println("Hitung Luas : "+hitungLuas()); } 
}

