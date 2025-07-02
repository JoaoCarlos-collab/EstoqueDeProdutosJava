public class Produto{

    private String nome;
    private double preco;

    public Produto (String novo_nome, double novo_preco){

        if (novo_nome != null && !novo_nome.trim().isEmpty()){
            this.nome = novo_nome;

        }else{
            System.out.println("Nome inválido.");
            this.nome = "Sem nome";

        }if (novo_preco >= 0){
            this.preco = novo_preco;

        }else{
            System.out.println("Preço inválido.");
            this.preco = 0;}

    }public String getNome(){
        return this.nome;

    }public double getPreco(){
        return this.preco;

    }public void setNome(String adicionar_nome){
        if (adicionar_nome != null && !adicionar_nome.trim().isEmpty()){
            this.nome = adicionar_nome;

        }else{
            System.out.println("Nome inválido.");
            this.nome = "Sem nome";}

    }public void setPreco(double adicionar_preco){
        if (adicionar_preco >= 0){
            this.preco = adicionar_preco;

        }else{
            System.out.println("Preço inválido.");
            this.preco = 0;}

    }public void Exibicao(){
        System.out.println("Produto: " + this.nome + "\nPreço: " + this.preco);
    }
}