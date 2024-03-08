import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a palavra pra ser invertida: ");
        String s = sc.nextLine();
        String resultado = "";
        for(int i = s.length()-1; i>=0; i--){
             resultado += s.charAt(i);
        }
        System.out.println(resultado);
        

    

        sc.close();
    }
}
