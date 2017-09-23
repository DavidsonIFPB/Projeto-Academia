import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoTxt { 
    public void criaArquivoTxt(String texto,File arquivo) {
        try{
            if(!arquivo.exists()){
                arquivo.createNewFile();
            }
            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);            
            bw.write(texto);
            bw.newLine();
            bw.close();
            fw.close();
        }
        catch (IOException ex){
        
        }
    
    }
    public String lerArquivosTxt(int a,String compara,File arquivo){
        String linha = "";
        String frase = linha;
        String array[] = new String[100];
        try{
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            
            //enquanto houver mais linhas
            while (br.ready()) {                
                frase = br.readLine();
                array = frase.split(" ");
                if(a==0)
                    linha=array[0];              
                    
                else
                    if(a==1 && compara.equals(array[1]))  
                        //Compara nomes                    
                        linha+=frase+"\n";
                else
                    if(a==2 && compara.equals(array[2]))                                          
                       linha+=frase+"\n";
                else
                    if(a==3 && compara.equals(array[3]))
                        //retorna dataDenascimento
                       linha+=frase+"\n";
                else
                    if(a==4 && compara.equals(array[4]) && array[6].equals("pago"))
                        //retorna dataDePagamento
                       linha+=frase+"\n";
                else
                    if(a==5 && compara.equals(array[5]))
                       //retorna Peso
                       linha+=frase+"\n";
                else
                    if(a==6 && compara.equals(array[5]))
                        linha+=frase+"\n";
                else
                    if(a==7 && compara.equals(array[4]) && array[6].equals("apaga"))
                        //retorna dataDePagamento
                       linha+=frase+"\n";
                
                        
                
                     
            }
            br.close();
            fr.close();
        
        } catch (IOException ex) {            
        }            
                
        return linha;
    } 
    
    public int existArquivos(File a){
        int id =0 ;
        if(a.exists()){           
           id=Integer.parseInt(lerArquivosTxt(0,"", a));           
           return id;            
        }        
        return 0;
        
        
    }
    
    public void modificaPessoa(){
    
    
    }
    
        
    
        
}
   
    

