
import java.io.File;

public class Pessoa {    
    private File arquivo = new File("aluno.txt");
    private ArquivoTxt txt = new ArquivoTxt();
    private int id;
    protected String nome;
    protected String CPF;
    protected String dataDeNascimento;
    protected Double pesoInicial;
    private String pago;
    private String diadePagamento;
    private boolean matriculado;
    
    private String ultimoMespago;
    
    
    public Pessoa() {
        //this.id = 0;
        this.nome ="Default";
        this.CPF ="Default";
        this.dataDeNascimento = "Default";        
        this.matriculado = false;
    }   
    
    public String getDatadePagamento(){
        return this.diadePagamento;
    }

    public void cadastraPessoa(String nome,String CPF,
            String datadeNascimento,String dataDePagamento,double Peso) {
        this.id = txt.existArquivos(arquivo);
        txt = new ArquivoTxt();
        this.nome = nome;
        this.CPF = CPF;
        this.dataDeNascimento = datadeNascimento;
        this.pesoInicial = Peso;
        this.matriculado = true;
        this.diadePagamento = dataDePagamento;
        this.ultimoMespago = "";
        this.pago = "pago";
        String texto;
        texto=this.id+1+" "+nome+" "+CPF+" "+datadeNascimento+" "+dataDePagamento+" "+Peso+" "+this.pago;
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
        System.out.print("Data de Pagamento:"+this.diadePagamento);
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
        texto +="Data de Pagamento:"+this.diadePagamento;        
        return texto;

    }
    
    public void Paga(){
        
    
    }

}
