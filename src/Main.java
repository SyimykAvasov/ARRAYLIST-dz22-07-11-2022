import java.util.ArrayList;
import java.util.Random;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> takSAn = new ArrayList<>();
        ArrayList<Integer> Jupsan = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i <= 50; i++) {
            arrayList1.add(random.nextInt(1, 100));

        }
        System.out.println(arrayList1);
        for (Integer integer: arrayList1){
            if (integer%2==0){
                Jupsan.add(integer);
            }else {
                takSAn.add(integer);
            }
        }
        System.out.println("Жупсан"+Jupsan);
        System.out.println("Таксан"+takSAn);
    }


}

