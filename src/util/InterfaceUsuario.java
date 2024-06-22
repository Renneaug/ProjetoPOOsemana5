package util; //referencia da pasta

import java.util.Scanner;//import do java

public class InterfaceUsuario {
    Scanner scanner = new Scanner(System.in);//instancia o scanner para entrada de dados

    public double pedirValorImovel(){//pede o valor do imovel
        double valorImovel = -1;//declara variavel
        do{//sistema de repetição do
            System.out.println("Digite o valor do imóvel: ");// pede o valor do imovel
            valorImovel = scanner.nextDouble();//entrada de dados
            if(valorImovel <= 0  || valorImovel > 100000000000L){//compara se o valor está no intervalo
                System.out.println("Valor inválido, digite novamente!");//fala pro usuario que está fora do intervalo
            }
        }while (valorImovel <= 0  || valorImovel > 100000000000L);//se a taxa tiver fora desses valores repete
        return valorImovel; //retorna valor do imovel
    }
    public int pedirPrazoFinanciamento(){//metodo pede o prazo
        int prazoFinaciamento = -1;//declara variavel
        do{//sistema de repetição do
            System.out.println("Digite o prazo do financiamento (maximo 30 anos): ");//pede o prazo
            prazoFinaciamento = scanner.nextInt();//entrada de dados
            if(prazoFinaciamento <= 0  || prazoFinaciamento > 30){//compara se o valor está no intervalo
                System.out.println("Valor inválido, digite novamente!");//fala pro usuario que está fora do intervalo
            }
        }while(prazoFinaciamento <= 0  || prazoFinaciamento > 30);//se a taxa tiver fora desses valores repete
        return prazoFinaciamento;//retorna prazo
    }
    public double pedirTaxaJuros(){//metodo pede a taxa de juros
        double taxaJuros = -1;//declara variavel
        do{//sistema de repetição do
            System.out.println("Digite a taxa de juros (maximo 1000%): ");//pede a taxa
            taxaJuros = scanner.nextDouble();//entrada de dados
            if(taxaJuros <= 0  || taxaJuros > 1000){//compara se o valor está no intervalo
                System.out.println("Valor inválido, digite novamente!");//fala pro usuario que está fora do intervalo
            }
        } while(taxaJuros <= 0  || taxaJuros > 1000);//se a taxa tiver fora desses valores repete
        return taxaJuros/100; //retorna a taxa de juros
    }
    public boolean maisFinaciamento(){//pergunta se quer mais financiameno!
        String resposta = "z";//declara variavel
        System.out.println("Deseja adicionar outro Financiamento? s/n");//mensagem na tela
        resposta = scanner.next();//entrada da resposta
        if(resposta.equalsIgnoreCase("s")){//compara resposta igual "s"
            return true;//retorna verdadeiro se "s"
        }
        scanner.close();
        return false;//retorna falso se não "s"
    }
    public String escolherImovel() {
        System.out.println("Escolha um tipo de imóvel:");
        System.out.println("1. Casa");
        System.out.println("2. Apartamento");
        System.out.println("3. Terreno");
        System.out.print("Digite o número da sua escolha: ");
        int escolha = scanner.nextInt();
        String tipoImovel = "";
        switch (escolha) {
            case 1:
                tipoImovel = "Casa";
                break;
            case 2:
                tipoImovel = "Apartamento";
                break;
            case 3:
                tipoImovel = "Terreno";
                break;
            default:
                System.out.println("Escolha inválida.");
                System.exit(0);
        }

        return tipoImovel;
    }
}

