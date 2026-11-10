import java.util.Arrays;

public class ArrayBilangan18 {
    public static void main(String[] args) {
        // Deklarasi array dengan kapasitas 4 elemen
        int[] bil = new int[4];
        
        // Mengisi elemen array
        bil[0] = 5;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;
        
        // Menampilkan elemen array dengan for loop
        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }
        
        // Menampilkan dengan foreach loop
        for (int nilai : bil) {
            System.out.println(nilai);
        }
        
        // Menampilkan dengan Arrays.toString()
        System.out.println(Arrays.toString(bil));
    }
}
