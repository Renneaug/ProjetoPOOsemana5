package main;// referencia a pasta
import modelo.Apartamento;
import modelo.Casa;
import modelo.Financiamento;//importa classe finaciamento
import modelo.Terreno;
import util.InterfaceUsuario;// importa classe interfaceusuario

import java.util.ArrayList;//importa arraylist


public class Main{
    public static void main(String[] args){
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();//instancia interfaceusuario
        ArrayList<Financiamento> financiamentos = new ArrayList<Financiamento>();//instancia uma lista
        do {
            String tipoImovel = interfaceUsuario.escolherImovel();//escolhe qual tipo de imovel
            double valorImovel = interfaceUsuario.pedirValorImovel();//chama uma entrada de valor
            int prazoFinaciamento = interfaceUsuario.pedirPrazoFinanciamento();//chama uma entrada de prazo
            double taxaJuros = interfaceUsuario.pedirTaxaJuros();//chama uma entrada de taxa de juros
            if ("Casa".equals(tipoImovel)) {
                financiamentos.add(new modelo.Casa(valorImovel, prazoFinaciamento, taxaJuros));//cria e adiciona um finaciamento na lista finaciamentos
            } else if ("Apartamento".equals(tipoImovel)) {
                financiamentos.add(new modelo.Apartamento(valorImovel, prazoFinaciamento, taxaJuros));//cria e adiciona um finaciamento na lista finaciamentos
            } else if ("Terreno".equals(tipoImovel)) {
                financiamentos.add(new modelo.Terreno(valorImovel, prazoFinaciamento, taxaJuros));//cria e adiciona um finaciamento na lista finaciamentos
            }
        }while(financiamentos.size() < 1);// repete até 4 //while(interfaceUsuario.maisFinaciamento());

        String[] escolhas = {"Casa", "Apartamento", "Apartamento", "Terreno"};
        double[] valoresImovel = {500000, 500000, 500000, 500000};
        int[] prazosFinanciamento = {10, 10, 10, 10}; // prazos em anos
        double[] taxasJuros = {0.1, 0.1, 0.1, 0.1}; // taxas de juros anuais

        for (int i = 0; i < escolhas.length; i++) {
            String tipoImovel = escolhas[i];
            double valorImovel = valoresImovel[i];
            int prazoFinanciamento = prazosFinanciamento[i];
            double taxaJuros = taxasJuros[i];

            System.out.println("Você escolheu: " + tipoImovel);

            if ("Casa".equals(tipoImovel)) {
                financiamentos.add(new modelo.Casa(valorImovel, prazoFinanciamento, taxaJuros)); // cria e adiciona um financiamento na lista financiamentos
            } else if ("Apartamento".equals(tipoImovel)) {
                financiamentos.add(new modelo.Apartamento(valorImovel, prazoFinanciamento, taxaJuros)); // cria e adiciona um financiamento na lista financiamentos
            } else if ("Terreno".equals(tipoImovel)) {
                financiamentos.add(new modelo.Terreno(valorImovel, prazoFinanciamento, taxaJuros)); // cria e adiciona um financiamento na lista financiamentos
            }
        }

        double totalFin = 0.0; // cria uma variavel para total de todos os valores dos imoveis sem juros
        double totalComJuro = 0.0; // cria uma variavel para total com juros
        for (int i = 0; i < financiamentos.size(); ++i) { // percorre a lista de financiamentos para mostrar os valores
            Financiamento fin = financiamentos.get(i); // cria uma variavel do tipo financiamento para guardar o financiamento da iteração
            double valorImovel = fin.getValorImovel(); // cria uma variavel que pega o valor do imovel atual da iteração
            double valorFinanciamento = fin.calcularTotalPagamento(); // cria um variavel do valor do financiamento que pega o valor do financiamento da iteração atual
            totalFin += fin.getValorImovel(); // adiciona o valor do imovel atual no total de valor sem juros
            totalComJuro += fin.calcularTotalPagamento(); // adiciona o valor de imovel com juros no total com juros

            // Determina a subclasse do financiamento
            String imovelEscolhido = "";
            if (fin instanceof Casa) {
                imovelEscolhido = "Casa";
            } else if (fin instanceof Apartamento) {
                imovelEscolhido = "Apartamento";
            } else if (fin instanceof Terreno) {
                imovelEscolhido = "Terreno";
            }


            System.out.println(String.format("Financiamento %d (%s) – valor do imóvel: R$ %.2f, valor do financiamento: R$ %.2f.", (i + 1), imovelEscolhido, valorImovel, valorFinanciamento)); // mostra os valores da iteração do financiamento atual
            //double mensal = fin.calcularPagamentoMensal();
            //System.out.println("Mensal: " + mensal);
        }
        System.out.println(String.format("Total de todos os imóveis: R$ %.2f, total de todos os financiamentos: R$ %.2f.", totalFin, totalComJuro)); // mostra o valor total dos financiamentos
    }
}
/*
System.out.println("Valor finaciamneto: " + fin.getValorImovel());
            System.out.println("Prazo em anos: " + fin.getPrazoFinanciamento());
            System.out.println("Taxa de juros: " + fin.getTaxaJurosAnual());
            System.out.println("Valor total do finaciamento: " + fin.calcularTotalPagamneto());
            System.out.println("Valor parcela: " + fin.calcularPagamentoMensal());
 */