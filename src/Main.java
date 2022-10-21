import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        int toplam=1,sayi;
        Scanner inp=new Scanner(System.in);
        System.out.print("Faktöriyeli alınacak pozitif sayıyı giriniz:");
        sayi= inp.nextInt();
        while (sayi>0){
            toplam=toplam*sayi;
            sayi-=1;
        }
        System.out.println("Girdiğniz sayının faktöriyeli: "+toplam);
         */

        //N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
        //Java ile kombinasyon hesaplayan program yazınız.
        //Kombinasyon formülü
        //C(n,r) = n! / (r! * (n-r)!)

        int n,r,ntoplam=1,rtoplam=1,nrfark,nrfarktoplam=1;
        int sonuc;
        Scanner inp=new Scanner(System.in);
        System.out.print("Kaçın kombinasyonu: ");
        n= inp.nextInt();
        System.out.print("\nKaçlı kombinasyonu: ");
        r= inp.nextInt();
        nrfark=n-r;
        while (n>0){
            ntoplam=ntoplam*n;
            n-=1;
        }
        while (r>0){
            rtoplam=rtoplam*r;
            r-=1;
        }
        while (nrfark>0){
            nrfarktoplam=nrfarktoplam*nrfark;
            nrfark-=1;
        }
        sonuc=(ntoplam/(rtoplam*nrfarktoplam));
        System.out.println("C(n,r)="+sonuc);
    }
}