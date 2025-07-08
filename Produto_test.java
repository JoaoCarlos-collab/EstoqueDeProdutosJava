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

                        System.out.print("ID DO PRODUTO: ");
                        int Id_Produto = input.nextInt();
                        input.nextLine();

                        Produto novo_produto = new Produto(Nome_Produto, Preco_Produto, Id_Produto);

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

                        if (Estoque.isEmpty()){
                            System.out.println("ESTOQUE VAZIO");
                            System.out.println(" ");

                        }else{
                            for(int i = 0; i < Estoque.size(); i++){
                                System.out.println(Estoque.get(i));

                            }
                        }break;

                    case 3:
                        
                        System.out.println("REMOVER PRODUTOS (POR NOME)");
                        System.out.println(" ");
                        System.out.println("DIGITE O NOME DO PRODUTO QUE VOCÊ DESEJA REMOVER");
                        String remover_produto = input.nextLine();

                        if (Estoque.isEmpty()){
                            System.out.println("O ESTOQUE ESTÁ VAZIO");
                            System.out.println(" ");
                            break;

                        }boolean produto_removido = false;

                        for (int i = Estoque.size() - 1; i >= 0; i --){
                            if (Estoque.get(i).getNome().equalsIgnoreCase(remover_produto)){
                                Produto removeu_produto = Estoque.remove(i);
                                System.out.println("PRODUTO: "+ removeu_produto.getNome());
                                System.out.println("REMOVIDO COM SUCESSO");
                                System.out.println(" ");
                                produto_removido = true;
                                break;
                            }
                        }if (!produto_removido){
                            System.out.println("PRODUTO: "+ remover_produto);
                            System.out.println("NÃO ENCONTRADO NO SEU ESTOQUE");
                            System.out.println(" ");
                            break;
                        }
                    case 0:
                        System.out.println("OPERAÇÃO FINALIZADA");
                        break;
                
                    default:
                        System.out.println("ERRO: OPÇÃO INVÁLIDA, TENTE USAR NÚMEROS QUE ESTÃO ENTRE 0 E 3");
                }
                
            } catch (java.util.InputMismatchException excessão) {
                System.out.println("ESSE VALOR NÃO É VÁLIDO. APERTE UMA TECLA PARA CONTINUAR.");
                input.nextLine();
                opcao = -1;
            }
            
        } while (opcao != 0);
    }
}