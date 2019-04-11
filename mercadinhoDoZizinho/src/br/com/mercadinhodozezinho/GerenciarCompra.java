package br.com.mercadinhodozezinho;

import java.util.Scanner;

public class GerenciarCompra {

    public Fornecedor fornecedor;
    public Produto[] produtos = new Produto[10];
    public int index = 0;
    public Cesta cesta;

    public static void main(String[] args) {
        GerenciarCompra gc = new GerenciarCompra();
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        gc.cesta = new Cesta();
        do{
            System.out.print(
                "1. Cadastrar Fornecedor\n" +
                "2. Cadastrar Produto\n" +
                "3. Abrir Carrinho\n" +
                "4. Fechar Carrinho\n\n" +
                "9. Sair\n\n" +
                "Digite sua opcao: ");
            opcao = Integer.parseInt(scan.nextLine());
            switch (opcao) {
                case 1:
                    gc.exercCadastraFornecedor();
                    break;
                case 2:
                    gc.exercCadastraProduto();
                    break;
                case 3:
                    gc.exercAbrirCarrinho();
                    break;
                case 4:
                    gc.exercFecharCarrinho();
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }while(opcao != 9);
    }

    public void exercCadastraFornecedor(){
        fornecedor = new Fornecedor();
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o ID do fornecedor: ");
        fornecedor.setIdFornecedor(Integer.parseInt(scan.nextLine()));
        System.out.print("\nDigite o nome do fornecedor: ");
        fornecedor.setNome(scan.nextLine());
        System.out.print("\nDigite o contato do fornecedor: ");
        fornecedor.setContato(scan.nextLine());
        System.out.print("\nDigite o fone do fornecedor: ");
        fornecedor.setTelefone(scan.nextLine());
        System.out.print("\nDigite o email do fornecedor: ");
        fornecedor.setEmail(scan.nextLine());
    }

    public void exercCadastraProduto(){
        if (index < 10){
            Produto produto = new Produto();
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite o codigo do produto: ");
            produto.setCodProduto(Integer.parseInt(scan.nextLine()));
            System.out.print("\nDigite a descricao do produto: ");
            produto.setDescricao(scan.nextLine());
            System.out.print("\nDigite o preco do produto: ");
            produto.setPreco(Double.parseDouble(scan.nextLine()));
            produto.setFornecedor(fornecedor);
            produtos[index++] = produto;
        } else {
            System.out.println("Carrinho cheio!");
        }
    }

    public void exercAbrirCarrinho(){
        int opcao = 0;
        Scanner scan = new Scanner(System.in);
        while(opcao != 2){
            System.out.print(
                    "1. Adicionar Produto ao carrinho" +
                    "\n2. Sair" +
                    "\nDigite sua resposta: ");
            opcao = Integer.parseInt(scan.nextLine());
            switch (opcao){
                case 1:
                    addProduto();
                    break;
            }
        }
    }

    private void addProduto(){
        int cod;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o codigo do produto: ");
        cod = Integer.parseInt(scan.nextLine());
        Produto produto = encontrarProduto(cod);
        if(produto == null){
            System.out.println("Produto não encontrado!");
        }else{
            cesta.adicionarItem(produto);
        }
    }


    private Produto encontrarProduto(int cod){
        for(Produto p: produtos){
            if(p.getCodProduto() == cod){
                return p;
            }
        }
        return null;
    }

    public void exercFecharCarrinho(){
        if(cesta.getIndice() == 0){
            System.out.println("Não Há Produtos na cesta");
        }else{
            cesta.exibirLista();
            System.out.println("---------------------------");
            cesta.calcularTotal();
        }
    }
}
