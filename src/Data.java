import java.util.Scanner;
import static java.lang.System.out;

public class Data {

    Scanner ler = new Scanner(System.in);

    private int dia;
    private  int mes ;
    private int ano;


    public Data() {
         this.entraDia();
         this.entraMes();
         this.entraAno();
    }
    public Data(int a, int m, int d) {
        this.entraDia(d);
        this.entraMes(m);
        this.entraAno(a);
    }

    public void entraAno(int a) {

        this.ano =a;

    }

    public void entraAno(){
        int a;
        out.println("Ano:");
        a = ler.nextInt();
        this.ano = a;

    }

    public void entraMes(int m){
        this.mes = m;
    }

    public void entraMes(){
        int m;
        do {
            out.println("Mes : (em número) ");
            m = ler.nextInt();
            out.println();
        } while (m < 1 || m>12);

        this.mes = m;
    }


// gets
    public int retDia(){return  this.dia;}

    public  int retMes() {return  this.mes;}
    public int retAno(){
        return this.ano;
    }


    public boolean bisexto(int ano){
        boolean anoBisexto;
        double bisexto = retAno()%4;
        if(bisexto !=0) {

            return anoBisexto = false;
        }
        return  anoBisexto = true;

      }




    }


