package modelo;

public class Apartamento extends Financiamento{
    public Apartamento(double valorImovel, int prazoFinanciamentoAnos, double taxaJurosAnual) {
        super(valorImovel, prazoFinanciamentoAnos, taxaJurosAnual);
    }
    public double calcularPagamentoMensal() {//calcular parcelas
        double taxaMensal = this.taxaJurosAnual / 12;
        double meses = this.prazoFinanciamento * 12;
        double numerador = valorImovel * taxaMensal * Math.pow(1 + taxaMensal, meses);
        double denominador = Math.pow(1 + taxaMensal, meses) - 1;
        return numerador / denominador;
    }
    /*
    public double calcularPagamentoMensal() {//calcular parcelas
        double taxaMensal = this.taxaJurosAnual / 12;
        double meses = this.prazoFinanciamento * 12;
        return (this.valorImovel * (Math.pow(1 + taxaMensal, meses))) / (Math.pow(1 + taxaMensal, meses - 1));
    }*/

}
