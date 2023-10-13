/** Descrição
Durante uma reunião de acionistas, alguns pontos importantes são discutidos e com isso surge a necessidade do envolvimento da equipe de desenvolvedores. Com isso, você foi designado para criar uma interface que permitirá aos acionistas de uma empresa acessarem informações relevantes sobre as análises da organização bancária. Sua tarefa é implementar uma classe que representa essa interface e que fornece um método para consultar as análises de desempenho e outros tipos dentro de um determinado período.

Requisitos:
A classe deve ter um método chamado obterAnalisesDesempenho que recebe como parâmetros uma data inicial e uma data final.

Entrada
As datas inicial e final, no formato "dd/mm/aaaa", representando o intervalo de tempo desejado para consulta.

Entrada 	
01/04/2023
20/05/2023

Saída
Analise de Politicas e Regulamentacoes
Analise de Ativos

*/

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class ReuniaoAcionista {

  public static void main(String[] args) throws ParseException {
    // Lê os dados de Entrada conforme descrito neste Desafio.
    Scanner scanner = new Scanner(System.in);
    String dataInicial = scanner.nextLine();
    String dataFinal = scanner.nextLine();

    SistemaAcionistas sistemaAcionistas = new SistemaAcionistas();
    List < String > analises = sistemaAcionistas.obterAnalisesDesempenho(dataInicial, dataFinal);

    for (String analise: analises) {
      System.out.println(analise);
    }
  }
}

class SistemaAcionistas {
  public List < String > obterAnalisesDesempenho(String dataInicialStr, String dataFinalStr) throws ParseException {
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    Date dataInicial = df.parse(dataInicialStr);
    Date dataFinal = df.parse(dataFinalStr);

    // Simula uma base da dados em uma lista de análises:
    List < Analise > analises = new ArrayList < > ();
    analises.add(new Analise(df.parse("01/01/2023"), "Analise de Desempenho Financeiro"));
    analises.add(new Analise(df.parse("15/02/2023"), "Analise de Riscos e Exposicoes"));
    analises.add(new Analise(df.parse("31/03/2023"), "Analises Corporativas"));
    analises.add(new Analise(df.parse("01/04/2023"), "Analise de Politicas e Regulamentacoes"));
    analises.add(new Analise(df.parse("15/05/2023"), "Analise de Ativos"));
    analises.add(new Analise(df.parse("30/06/2023"), "Analise de Inovacao e Tecnologia"));

   //TODO: Implemente o filtro das análises dentro do período especificado. Dica: Crie uma lista para armazenar as análises filtradas e use um loop for para filtrar as análises.
    List<String> filtroAnalise = new ArrayList<>();
      for(Analise i : analises){
        if(i.data.compareTo(dataInicial) >= 0 && i.data.compareTo(dataFinal) <= 0){
          filtroAnalise.add(i.descricao);
        }
      }
    
   // TODO: Retorne a lista de análises filtradas.
    return filtroAnalise;
   
   // resolução com lambda
    // return analises.stream().filter(d -> d.data.compareTo(dataInicial) >=0).filter(d -> d.data.compareTo(dataFinal) <=0).map(d -> d.descricao).toList();
  }

  class Analise {
    Date data;
    String descricao;

    public Analise(Date data, String descricao) {
      this.data = data;
      this.descricao = descricao;
    }
  }
}
