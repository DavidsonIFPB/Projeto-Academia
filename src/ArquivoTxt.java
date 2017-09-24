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
                if(a==0 && array[0].equals(compara)){
                    
                    frase = array[0]+" "+array[1]+" "+
                            array[2]+" "+array[3]+" "+array[4]+" "+array[5];
                    return frase;
                }
                else
                    if(a==9)
                        linha = array[0];
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
                    if(a==4 && array[6].equals("pago"))
                        //retorna dataDePagamento
                       linha+=array[0]+" - "+array[1]+" - "+array[6]+"\n";
                else
                    if(a==5 && compara.equals(array[5]))
                       //retorna Peso
                       linha+=frase+"\n";
                else
                    if(a==6 && compara.equals(array[5]))
                        linha+=frase+"\n";
                else
                    if(a==7 && array[6].equals("apagar")){                       
                       linha+=array[0]+" - "+array[1]+" - "+array[6]+"\n";
                    }
                else 
                    if(a==8)
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
        String texto ="";
        if(a.exists()){ 
           texto = lerArquivosTxt(9,"", a);
           if(texto!="" || texto != " "){ 
//               System.out.println("aqui");
               id = Integer.parseInt(texto);
           }
           return id;            
        }        
        return 0;       
        
    }
    
    public void modificaPessoa(String id,String nome,String CPF,
            String datadeNascimento,String dataDePagamento,String Peso,String pago,String texto_2){
        
        String texto = id+" "+nome+" "+CPF+" "+datadeNascimento+" "+dataDePagamento+" "+Peso+" "+pago;
        String linha = "";
        String frase = "";
        String array[] = new String[20];
        File arquivo = new File(texto_2);
        String buffer = lerArquivosTxt(8, "", arquivo);
        
        try{                        
            FileReader fr = new FileReader(arquivo); 
            BufferedReader br = new BufferedReader(fr);           
            
           FileWriter fw = new FileWriter(arquivo,false);;
           fw = new FileWriter(arquivo,true);
            
            BufferedWriter bw = new BufferedWriter(fw);                          
            String array2[] = new String[100];
            
            int i = 0;
            while (i<3) {
                array2 = buffer.split("\n");
                
                if(array2[i]!=" " ||array2[i]!="")
                    array = array2[i].split(" ");
//                System.out.println(array[0]);
                
                if(array[0].equals(id)){                     
                     bw.write(texto);
                     bw.newLine();                    
                }
                else{                    
                    bw.write(array2[i]);                    
                    bw.newLine();                                    
                }
                i+=1;
            }             
            bw.close();            
            fw.close();            
            br.close();
            fr.close();                              
        } catch (IOException ex) {            
        }        

    }  
    
    public void apaga_linha(String id,String nome,String CPF,
            String datadeNascimento,String dataDePagamento,String Peso,String pago,String texto_2){
        String texto = id+" "+nome+" "+CPF+" "+datadeNascimento+" "+dataDePagamento+" "+Peso+" "+pago;
        String linha = "";
        String frase = "";
        String array[] = new String[20];
        File arquivo = new File(texto_2);
        String buffer = lerArquivosTxt(8, "", arquivo);
        
        try{                        
            FileReader fr = new FileReader(arquivo); 
            BufferedReader br = new BufferedReader(fr);           
            
           FileWriter fw = new FileWriter(arquivo,false);;
           fw = new FileWriter(arquivo,true);
            
            BufferedWriter bw = new BufferedWriter(fw);                          
            String array2[] = new String[100];
            
            int i = 0;
            while (i<3) {
                array2 = buffer.split("\n");
                
                if(array2[i]!=" " ||array2[i]!="")
                    array = array2[i].split(" ");
         
                if(!array[0].equals(id)){                     
                     bw.write(array2[i]);                    
                    bw.newLine();                    
                }                
                i+=1;
            }             
            bw.close();            
            fw.close();            
            br.close();
            fr.close();                              
        } catch (IOException ex) {            
        } 
    
    }

}

   
    

