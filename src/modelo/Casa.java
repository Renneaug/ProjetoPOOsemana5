package modelo;

public class Casa extends Financiamento{
    public Casa(double valorImovel, int prazoFinanciamentoAnos, double taxaJurosAnual){
        super(valorImovel,prazoFinanciamentoAnos,taxaJurosAnual);
    }
    public double calcularPagamentoMensal() {//calcular parcelas
        return super.calcularPagamentoMensal() + 80;
    }
}
