public class Rasional{
    private int pembilang, penyebut;
    public Rasional(){
        pembilang=0;
        penyebut=0;
    }
    public Rasional(int pbl, int pyb){
        pembilang=pbl;
        penyebut=pyb;
    }
    public boolean isRasional(){
        return (penyebut!= 0);
    }
    public void Sederhana(){
        int temp, A, B;
        if (penyebut == 0){
            return;
        }
        A = (pembilang < penyebut) ? penyebut : pembilang;
        B = (pembilang < penyebut) ? pembilang : penyebut;
        for(;B!=0;){
            temp=A%B;
            A = B;
            B = temp;
        }
        pembilang /= A;
        penyebut /= A;
    }
    public double Cast(){
        return (penyebut==0.0) ? 0.0 : (double)pembilang/(double)penyebut;
    }
    //oprator >
    public boolean moreThan(Rasional A){
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }
    public boolean moreThanEqual(Rasional A){
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }
    public boolean lessThan(Rasional A){
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }
    public boolean lessThanEqual(Rasional A){
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }
    public boolean notEqual(Rasional A){
        return (pembilang * A.penyebut != penyebut * A.pembilang);
    }

    //operator unary- ---> A = -A
    public void negasi(){
        pembilang = - pembilang;
    }
    //operator unary +=
    public void unaryPlus(Rasional A){
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }
    public void unaryMinus(Rasional A){
        pembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }
    public void unaryKali(Rasional A){
        pembilang = pembilang * A.pembilang;
        penyebut *= A.penyebut;
    }
    public void  unaryBagi(Rasional A){
        pembilang = pembilang * A.penyebut;
        penyebut *= A.pembilang;
    }
    public void cetak(){
        System.out.println(pembilang + "/" + penyebut);
    }
}