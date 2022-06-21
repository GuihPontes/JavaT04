import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.lang.Object;
import static java.lang.System.out;

/**
 * * @author Guilherme Pontes, Luiz Leals
 * O construtor Data() deverá permitir ao usuário digitar os valores de dia, mês e ano e com eles
 inicializar os atributos da classe. Os valores digitados deverão ser consistidos e só aceitos se válidos,
 caso contrário, redigitar;
  O construtor Data(int d, int m, int a) deverá receber os valores de dia, mês e ano e com eles inicializar
 as propriedades da classe;
  Os métodos entraDia(int d), entraMes(int m) e entraAno(int a) devem receber um valor e atribuí-lo às
 respectivas propriedades;

  Os métodos entraDia (),entraMes () e entraAno () devem permitir ao usuário digitar um valor e atribuí-
 lo a respectiva propriedade. Os valores digitados devem sofrer consistência e só aceitos quando válidos,

 caso contrário, solicitar ao usuário redigitar;
  Os métodos retDia(), retMes() e retAno() devem nos devolver as respectivas propriedades;
  O método mostra1() deve nos devolver a data no formato: dd/mm/aaaa;
  O método mostra2() deve nos devolver a data no formato: dd/mesPorExtenso/ano;
  O método bissexto() deve nos devolver um boolean informando se o ano é ou não bissexto;
  O método diasTranscorridos, deve retornar a quantidade de dias transcorridos no ano até a data
 digitada.
  O método apresentaDataAtual() deve imprimir a data atual, utilizando as classes Date e DateFormat, o
 DateFormat empregando o seguinte método: getDateInstance(DateFormat.FULL);
  Conveniente colocar tratamento de exceção para as possíveis inconsistências na entrada de dados.*/

public class Data {

    Scanner ler = new Scanner(System.in);

    private int ano;
    private  int mes ;
    private int dia;




    public Data() {
        this.entraAno();
        this.entraMes();
        this.entraDia();
    }
    public Data(int a, int m, int d) {
        this.entraAno(a);
        this.entraMes(m);
        this.entraDia(d);
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
            System.exit(1);
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
                    break;
                }
                this.dia =d;
                break;
            case 3:
                if(d<1 || d > 31) {
                    out.println("Dia fora do escpo");
                    break;
                }
                this.dia = d;
                break;
            case 4:
                if(d<1 || d > 30) {
                    out.println("Dia fora do escpo");
                    break;
                }
                this.dia = d;
                break;
            case 5:
                if(d < 1 || d>31) {
                    out.println("Dia fora do escpo, o mes de maio tem 31 dias");
                    break;
                }
                this.dia = d;
                break;
            case 6:
                if(d < 1 || d>30) {
                    out.println("Dia fora do escpo, o mes de junho tem 30 dias");
                    break;
                }
                this.dia = d;
                break;

            case 7:
                if(d < 1 || d>31) {
                    out.println("Dia fora do escpo, o mes de julho tem 31 dias");
                    break;
                }
                this.dia=d;
                break;
            case 8 :
                if(d < 1 || d>31) {
                    out.println("Dia fora do escpo, o mes de agosto tem 31 dias");
                    break;
                }
                this.dia = d;
                break;
            case 9 :
                if(d < 1 || d>30) {
                    out.println("Dia fora do escpo, o mes de setembro tem 31 dias");
                    break;
                }
                this.dia =d;
                break;
            case 10 :
                if(d < 1 || d>31) {
                    out.println("Dia fora do escpo, o mes de outubro tem 31 dias");
                    break;
                }
                this.dia=d;
                break;
            case 11:
                if(d < 1 || d>30) {
                    out.println("Dia fora do escpo, o mes de novembro tem 31 dias");
                    break;
                }
                this.dia =d;
                break;
            case 12:
                if(d < 1 || d>31) {
                    out.println("Dia fora do escpo, o mes de dezembro tem 31 dias");
                    break;
                }
                this.dia =d;
                break;



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

      public String mostra1() {
        String dia,mes,ano;
        dia = this.retDia()<10 ?"0" +this.retDia() : Integer.toString(retDia());
        mes = this.retMes()<10?"0" + this.retMes() : Integer.toString(retMes());
        ano = this.retAno()<10?"0" + this.retAno() : Integer.toString(retAno());

        return dia + "/" + mes + "/" + ano;
      }
      public String mostra2() {
        String mes,dia,ano;
          dia = this.retDia()<10 ?"0" +this.retDia() : Integer.toString(retDia());
          ano = this.retAno()<10?"0" + this.retAno() : Integer.toString(retAno());


          switch (retMes()) {
             case 1 :
                 mes = "Janeiro";
                 return dia + "/" + mes + "/" + ano;

              case 2:
                  mes = "Fevereiro";
                  return dia + "/" + mes + "/" + ano;

              case 3:
                  mes = "Março";
                  return dia + "/" + mes + "/" + ano;

              case 4:
                  mes = "Abril";
                  return dia + "/" + mes + "/" + ano;


              case 5:
                  mes = "Maio";
                  return dia + "/" + mes + "/" + ano;

              case 6:
                  mes = "Junho";
                  return dia + "/" + mes + "/" + ano;

              case 7:
                  mes = "Julho";
                  return dia + "/" + mes + "/" + ano;

              case 8:
                  mes = "Agosto";
                  return dia + "/" + mes + "/" + ano;

              case 9:
                  mes = "Setembro";
                  return dia + "/" + mes + "/" + ano;

              case 10:
                  mes = "Outubro";
                  return dia + "/" + mes + "/" + ano;

              case 11:
                  mes = "Novembro";
                  return dia + "/" + mes + "/" + ano;

              case 12:
                  mes = "Dezembro";
                  return dia + "/" + mes + "/" + ano;



          }
         return null;

      }

      public void apresentaDataAtual() {
          DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
          System.out.println("A data atual é : "+data.format(LocalDateTime.now()));

      }
      public void diasTranscorridos() {
          LocalDate begin = LocalDate.of(retAno(), Month.JANUARY, 01);
          LocalDate end = LocalDate.of(retAno(), retMes(), retDia());
          long days = ChronoUnit.DAYS.between(begin, end);
          out.println("Dias Transcorridos : "+days + " dias");
      }



    }


