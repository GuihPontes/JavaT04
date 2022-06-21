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
        if(a<0) {
            out.println("Ano informado está fora do escopo");
            return;
        }
        this.ano =a;

    }

    public void entraAno(){
        int a;
        out.println("Ano:");
        a = ler.nextInt();
        if(a<0) {
            out.println("Ano informado está fora do escopo");
            return;
        }
        this.ano = a;

    }

    public void entraMes(int m){
        if(m<0 || m > 12) {
            out.println("Mês informado está fora do escopo");
            return;
        }

        this.mes = m;
    }

    public void entraMes(){
        int m;


            out.println("Mes : (em número) ");
            m = ler.nextInt();
        if(m<0 || m > 12) {
            out.println("Mês informado está fora do escopo");
            return;
        }


        this.mes = m;
    }

    public void entraDia(int d) {
            checandoDia(d);
        }

    public void entraDia() {
        int d;
        out.println("Dia :");
        d = ler.nextInt();
        checandoDia(d);
    }


    public void checandoDia(int d) {
        switch (retMes()) {
            case 1 :
                if(d<1 || d>30)
                {
                    out.println("Dia fora do escopo");
                    break;
                }
                this.dia = d;
                break;
            case 2:
                if(bisexto()== true) {
                    if(d<1 || d>29) {
                        out.println("Dia fora do escopo (Esse ano é bissexto)");
                        break;
                    }
                    this.dia =d;
                    break;
                }
                if(d<1 || d>28) {
                    out.println("Dia fora do escpo");
                }
                this.dia =d;
                break;
            case 3:
        }
    }

// gets
    public int retDia(){return  this.dia;}

    public  int retMes() {return  this.mes;}
    public int retAno(){
        return this.ano;
    }


    public boolean bisexto(){
        boolean anoBisexto;
        double bisexto = retAno()%4;
        if(bisexto !=0) {

            return anoBisexto = false;
        }
        return  anoBisexto = true;

      }




    }


