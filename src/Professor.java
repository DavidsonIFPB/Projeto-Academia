import java.io.File;

public class Professor extends Pessoa{
    static private int qtdEspecialidade;
    //private String especialidade[];
    private int id;
    private String datadeRecebimento;    
    private boolean pago;
    private Pessoa a;
    private File arquivo = new File("professor.txt");
    private ArquivoTxt txt = new ArquivoTxt();
    
    public Professor(){
        //this.especialidade= new String [5];
        
        this.pago = false;
        
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
        texto=this.id+1+" "+nome+" "+CPF+" "+datadeNascimento+" "+dataDePagamento+" "+Peso;
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
