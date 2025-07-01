import java.util.ArrayList;
import java.util.Scanner;

public class Produto_test{

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        ArrayList <Produto> Estoque = new ArrayList<>();

        int opcao;

        do { 

            System.out.println("ESTOQUE DE PRODUTOS");
            System.out.println(" ");
            System.out.println("1 - ADICIONAR PRODUTO");
            System.out.println("2 - LISTAR PRODUTOS");
            System.out.println("3 - REMOVER PRODUTOS (POR NOME)");
            System.out.println("0 - SAIR");

            try { 

                System.out.println(" ");
                System.out.print("DIGITE O NÚMERO DA OPÇÃO QUE DESEJA: ");
                opcao = input.nextInt();
                input.nextLine();

                switch (opcao) {
                    case 1:

                        System.out.println(" ");
                        System.out.println("ADICIONAR PRODUTOS");
                        System.out.println(" ");
                        System.out.print("NOME DO PRODUTO: ");
                        String Nome_Produto = input.nextLine();
                        
                        System.out.print("PREÇO DO PRODUTO: ");
                        double Preco_Produto = input.nextDouble();
                        input.nextLine();

                        Produto novo_produto = new Produto(Nome_Produto, Preco_Produto);

                        Estoque.add(novo_produto);

                        System.out.println("NOVO PRODUTO ADICIONADO");
                        System.out.println(" ");
                        System.out.println("PRODUTO: " + novo_produto.getNome());
                        System.out.println("PREÇO: " + novo_produto.getPreco());
                        System.out.println(" ");

                        break;

                    case 2:

                        System.out.println(" ");
                        System.out.println("LISTA DE PRODUTOS");
                        System.out.println(" ");
                        System.out.println(Estoque);

                        if (Estoque.isEmpty()){
                            System.out.println("ESTOQUE VAZIO");

                        }else{
                            for(int i = 0; i < Estoque.size(); i++){
                                Estoque.get(i).Exibicao();

                            }
                        }break;
                    
                }

                
            } catch (Exception e) {
            }
            
        } while (true);
    }
}