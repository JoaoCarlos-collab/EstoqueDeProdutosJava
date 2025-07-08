public class Produto{

    private String nome;
    private double preco;
    private int id;

    public Produto (String nome, double preco, int id){

        if (nome != null && !nome.trim().isEmpty()){
            this.nome = nome;

        }else{
            throw new IllegalArgumentException("NOME INVÁLIDO");

        }if (preco >= 0){
            this.preco = preco;

        }else{
            throw new IllegalArgumentException("PREÇO INVÁLIDO");
        
        }if (id >= 0){
            this.id = id;

        }else{
            throw new IllegalArgumentException("ID INVÁLILDO");

        }

    }public String getNome(){
        return this.nome;

    }public double getPreco(){
        return this.preco;

    }public int getId(){
        return this.id;

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

    }@Override
    public String toString(){
        return "ID: " + id + " | " + "NOME: " + nome + " | " + "PREÇO: " + preco;
    }
}