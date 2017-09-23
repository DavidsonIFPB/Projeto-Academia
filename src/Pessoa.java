
import java.io.File;

public class Pessoa {
    public Pessoa() {
        this.nome ="Default";
        this.CPF ="Default";
        this.dataDeNascimento = "Default";        
        this.matriculado = false;
    }   
    private File arquivo = new File("arquivo.txt");
    static int id;
    protected String nome;
    protected String CPF;
    protected String dataDeNascimento;
    protected Double pesoInicial;
    protected Double pesoAtual;
    private String datadePagamento;
    private boolean matriculado;
    private String horario;
    private ArquivoTxt txt;
    
    public String getDatadePagamento(){
        return this.datadePagamento;
    }

    public void cadastraPessoa(String nome,String CPF,
            String datadeNascimento,String dataDePagamento,double Peso) {
        txt = new ArquivoTxt();
        this.nome = nome;
        this.CPF = CPF;
        this.dataDeNascimento = datadeNascimento;
        this.pesoInicial = Peso;
        this.matriculado = true;
        this.datadePagamento = dataDePagamento;
        String texto;
        texto=nome+" "+CPF+" "+datadeNascimento+" "+dataDePagamento+" "+Peso;
        txt.criaArquivoTxt(texto,arquivo);              
  
     
    }
    public boolean situacao(){        
        if(this.matriculado){           
            return true; }                  
        return false;      
        
    }
    
    public void Relatorio(double Peso){
        if(situacao())
            System.out.print("Matriculado | ");
        else
            System.out.print("Nao matriculado |");    
        System.out.print("Nome:"+this.nome);
        System.out.print("Data de Pagamento:"+this.datadePagamento);
        if(Peso-this.pesoInicial>0)
            System.out.print("Ganhou: "+(Peso-this.pesoInicial)+"Kg");
        else
            System.out.print("Perdeu "+(Peso-this.pesoInicial)*-1+"Kg");        
    
    }
    
    public String Relatorio(){
        String texto;
        if(situacao())
            texto = "Matriculado | ";
        else
            texto = "Nao matriculado |";    
        texto += "Nome:"+this.nome+ "|";
        texto +="Data de Pagamento:"+this.datadePagamento;        
        return texto;

    }
    
    public void Paga(){
        
    
    }

}
