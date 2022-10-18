public class Main
{
    public static void main (String[] args) {
        Pessoa P = new Pessoa();
        P.setNome("italo");
        System.out.println( P.getNome());
            
        PessoaFisica p1 = new PessoaFisica();
        p1.setNome("pedro");
        p1.setCpf (123456);
        System.out.println( p1.getNome()+ " " + p1.getCpf() );  
                    
        
    }
}        
class Pessoa{
    private String nome;
    private int idade;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }}

class PessoaFisica extends Pessoa{
    private int cpf;
    
    public int getCpf(){ 
        return this.cpf;
    }
    
    public void setCpf(int cpf){
         this.cpf = cpf;
    }}
