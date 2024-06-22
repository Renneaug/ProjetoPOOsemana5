package modelo;//referencia a pasta

public class Financiamento {
    //atributos
    protected double valorImovel;

    protected int prazoFinanciamento;

    protected double taxaJurosAnual;
    //construtor
    public Financiamento(double valorImovel, int prazoFinanciamentoAnos, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamentoAnos;
        this.taxaJurosAnual = taxaJurosAnual;
    }
    //métodos
    public double calcularPagamentoMensal(){//calcular parcelas
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12));
    }
    public double calcularTotalPagamento(){//valor com juros
        return this.calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }
    public double getValorImovel(){//pega o valor do imovel
        return this.valorImovel;
    }
    public int getPrazoFinanciamento(){// pega o prazo
        return this.prazoFinanciamento;
    }
    public double getTaxaJurosAnual(){//pega a taxa de juros
        return this.taxaJurosAnual;
    }
    public void mostrarNaTela(){  //mostra mensagens na tela de valores
        System.out.println("Valor total do Finaciamento: "+calcularTotalPagamento());
        System.out.println("Valor do imóvel: "+getValorImovel());
    }

}
