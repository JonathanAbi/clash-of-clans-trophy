
package COC;
import java.util.Scanner;

public class COC {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String status;
        int shield, bintang, trophyAkhir;
        
        System.out.print("Trophy yang dipertaruhkan : ");
        int trophy = sc.nextInt();
        System.out.print("Persentase Kehancuran : ");
        int kehancuran = sc.nextInt();
        System.out.println("Status Townhall");
        System.out.println("(1) Hancur");
        System.out.println("(2) Tidak Hancur");
        int th = sc.nextInt();
        if(kehancuran<40){
            if(th == 1){
                status = "Defeat";
                shield = 2;
                bintang = 1;
            }else{
                status = "Victory";
                shield = 0;
                bintang = 0;
            }
                
            }
        else if(kehancuran<=49){
            if(th == 2){
                status = "Victory";
                shield = 2;
                bintang = 0;
            }else{
                status = "Defeat";
                shield = 2;
                bintang = 1;
            }
         
        }
        else if(kehancuran <=99){
            if(th == 1){
                status = "Defeat";
                shield = 4;
                bintang = 2;
            }else{
                status = "Defeat";
                shield = 2;
                bintang = 1;
            } 
                  
            
        }
        else{
            status = "Defeat";
            shield = 6;
            bintang = 3;
        }
        if(bintang > 0){
            trophyAkhir=(trophy * bintang / 3)* -1;
           
        }else{
             trophyAkhir = trophy; 
        }
        System.out.println("Trophy yang didapat : " + trophyAkhir);
        System.out.println("Status serangan : " + status);
        System.out.println("Jumlah bintang : "+ bintang);
    }
    
}
