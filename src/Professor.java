import java.io.File;

public class Professor extends Pessoa{
    static private int qtdEspecialidade;
    //private String especialidade[];
    private int id;
    private String datadeRecebimento;    
    private String pago;
    private Pessoa a;
    private File arquivo = new File("professor.txt");
    private ArquivoTxt txt = new ArquivoTxt();
    
    public Professor(){
        //this.especialidade= new String [5];
        
        
        
    }
    
//    @Override
    public void cadastraPessoa(String nome,String CPF,
            String datadeNascimento,String dataDePagamento,double Peso) {
        this.id = txt.existArquivos(arquivo);
        super.CPF= CPF;
        super.nome = nome;
        super.dataDeNascimento = dataDeNascimento;
        this.datadeRecebimento = dataDePagamento;
        super.pesoInicial = Peso;
        String texto;
        this.pago = "apagar";
        texto=this.id+1+" "+nome+" "+CPF+" "+datadeNascimento+" "+dataDePagamento+" "+Peso+" "+this.pago;
        txt.criaArquivoTxt(texto,arquivo);      
    }
   
    
    @Override
    public String getDatadePagamento(){
        return this.datadeRecebimento;
    }
    
    
}
