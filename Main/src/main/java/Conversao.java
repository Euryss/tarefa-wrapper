import java.util.Locale;
import java.util.Scanner;

public class Conversao {
    public static void main(String [] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um valor com casas decimais: ");
        double valor =  input.nextDouble();
        Double valorConvertido = valor;

        System.out.println(" Saída: "+valorConvertido);
    }
}
