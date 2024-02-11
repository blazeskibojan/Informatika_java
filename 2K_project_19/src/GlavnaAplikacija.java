public class GlavnaAplikacija {
    public static void main(String[] args) {
                int brojA = 5;
        int brojB = 10;

       
        Broevi moiteBroevi = new Broevi(brojA, brojB);

      
        int vrednostBroj1 = moiteBroevi.getBroj1();
        int vrednostBroj2 = moiteBroevi.getBroj2();

        
        int rezultat = vrednostBroj1 + vrednostBroj2;

       
        System.out.println("Zbirot na " + vrednostBroj1 + " i " + vrednostBroj2 + " e: " + rezultat);
    }
}