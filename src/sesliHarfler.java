import java.util.Scanner;

public class sesliHarfler {
    public static void main(String[] args) {



        int sayac=0;
        String metin;
        String sesliler="aeıioöuü";
        Scanner tara=new Scanner(System.in);
        System.out.println("Metini giriniz :");
        metin=tara.nextLine();

        for(int i=0; i<=metin.length()-1;i++)
        {

            for(int j= 0 ; j<=7;j++)
            {


                if(metin.charAt(i)==sesliler.charAt(j))
                {
                    sayac++;
                }

            }
        }




        System.out.println("sesli sayisi :" + sayac);



    }
}
