import java.util.Scanner;

/*
 Crea una aplicación que nos pida un número por teclado y 
con una función se lo pasamos por parámetro para que nos indique si es o no 
un número primo,
debe devolver true si es primo, sino false.
 */
public class NewClass2 {
        public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        boolean comp=true;
        int n=0;
            System.out.println("Ingrese un numero,en caso de ser primo se le devolvera true,caso contrario se le devolvera false");
            n=Leer.nextInt();
            comprobar(n,comp);
            
        }
        public static boolean comprobar(int n,boolean comp){
            int d=0,c=0;
            for(d=1;d<=n;d++){
                if(n%d==0){
                c++;
                }
            }
            if(c>2){
                comp=false;
                System.out.println(comp);
            }else{
                comp=true;
                System.out.println(comp);
            }
            return comp;
        }
}
