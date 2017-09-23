import java.io.File;

public class Professor extends Pessoa{
    static private int qtdEspecialidade;
    //private String especialidade[];    
    private String datadeRecebimento;    
    private boolean pago;
    private Pessoa a;
    private File arquivo = new File("professor.txt");
    private ArquivoTxt txt = new ArquivoTxt();
    
    public Professor(){
        //this.especialidade= new String [5];
        this.pago = true;
    }
    
    @Override
    public void cadastraPessoa(String nome,String CPF,
            String datadeNascimento,String dataDePagamento,double Peso) {        
        super.CPF= CPF;
        super.nome = nome;
        super.dataDeNascimento = dataDeNascimento;
        this.datadeRecebimento = dataDePagamento;
        super.pesoAtual = Peso;
        String texto;
        texto=nome+" "+CPF+" "+datadeNascimento+" "+dataDePagamento+" "+Peso;
        txt.criaArquivoTxt(texto,arquivo);         
    }
    public boolean getPago(){
        return this.pago;
    }
    
    @Override
    public String getDatadePagamento(){
        return this.datadeRecebimento;
    }
    
    
}
