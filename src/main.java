import java.util.Scanner;
import static java.lang.System.out;


public class main {
    public  static void main(String[] args) {

        out.println("Inserindo por parametro");
        Data dataParemetro = new Data(1999,2,05);
        out.println(dataParemetro.mostra1());

        out.println("Mostrando os retornos da variaveis");

        out.println("Dia : "+dataParemetro.retDia());
        out.println("Mes : "+dataParemetro.retMes());
        out.println("Ano : "+dataParemetro.retAno());
        out.println("Ano é bisexta "+dataParemetro.bisexto());

        out.println(dataParemetro.mostra1());
        out.println(dataParemetro.mostra2());


        out.println("Inserindo via interação usuario ");
        Data dataVar = new Data();




    }

}
