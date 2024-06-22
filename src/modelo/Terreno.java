package modelo;

public class Terreno extends Financiamento{
    public Terreno(double valorImovel, int prazoFinanciamentoAnos, double taxaJurosAnual){
        super(valorImovel,prazoFinanciamentoAnos,taxaJurosAnual);
    }
    public double calcularPagamentoMensal(){//calcular parcelas
        return ((this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12)))*1.02;
    }
}
//((this.taxaJurosAnual+2) / 12))
//((this.taxaJurosAnual / 12) + 2)