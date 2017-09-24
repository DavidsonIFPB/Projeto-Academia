import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class updateEdelete extends javax.swing.JFrame {
    private ArquivoTxt txt;
    private String pago = "";
    private int i = 0;
 
    public updateEdelete() {
        txt = new ArquivoTxt();
        
        
        initComponents();
    }
    public void lerArquivosTxt(int opcao,String arquivo,String id){
        File a = new File(arquivo);
        String linha = "";
        String frase = linha;
        String array[] = new String[100];
        
        try{
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);          
            while (br.ready()) {                
                frase = br.readLine();
                array = frase.split(" ");
                if(opcao==1) {                  
                    id_combo.addItem(array[0]);
                    
                }
                else
                    if(opcao==2 && id.equals(array[0])){
                        nome.setText(array[1]);
                        cpf.setText(array[2]);
                        nascimento.setText(array[3]);
                        pagamento.setText(array[4]);
                        peso.setText(array[5]);
                        pago = array[6];
                    }
                
            }
            br.close();
            fr.close();
        
        } catch (IOException ex) {            
        }           
        
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        id_combo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        nascimento = new javax.swing.JTextField();
        pagamento = new javax.swing.JTextField();
        peso = new javax.swing.JTextField();
        aluno_radio = new javax.swing.JRadioButton();
        professor_radio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        id_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_comboActionPerformed(evt);
            }
        });

        jButton1.setText("Apagar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("ID :");

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Data de Nascimento:");

        jLabel5.setText("Data de Pagamento:");

        jLabel6.setText("Peso:");

        buttonGroup1.add(aluno_radio);
        aluno_radio.setText("Alunos");
        aluno_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aluno_radioActionPerformed(evt);
            }
        });

        buttonGroup1.add(professor_radio);
        professor_radio.setText("Professor");
        professor_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professor_radioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                .addComponent(nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(aluno_radio)
                                .addGap(66, 66, 66)
                                .addComponent(professor_radio))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jButton2)
                                .addGap(40, 40, 40)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aluno_radio)
                    .addComponent(professor_radio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aluno_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aluno_radioActionPerformed
        
        lerArquivosTxt(1,"aluno.txt","");
    }//GEN-LAST:event_aluno_radioActionPerformed

    private void professor_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professor_radioActionPerformed
        
        lerArquivosTxt(1,"professor.txt","");
        
    }//GEN-LAST:event_professor_radioActionPerformed

    private void id_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_comboActionPerformed
        if(aluno_radio.isSelected())            
            lerArquivosTxt(2, "aluno.txt", (String) id_combo.getSelectedItem());
        else
            if(professor_radio.isSelected()){                              
                lerArquivosTxt(2, "professor.txt", (String) id_combo.getSelectedItem());
            
            }
    }//GEN-LAST:event_id_comboActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(aluno_radio.isSelected())            
            txt.modificaPessoa((String)id_combo.getSelectedItem(),nome.getText(),cpf.getText(),nascimento.getText(), pagamento.getText()
                    ,peso.getText(),pago,"aluno.txt");
        else
            if(professor_radio.isSelected()){                              
               txt.modificaPessoa((String)id_combo.getSelectedItem(),nome.getText(),cpf.getText(),nascimento.getText(), pagamento.getText()
                    ,peso.getText(),pago,"professor.txt");
            
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(aluno_radio.isSelected())            
            txt.apaga_linha((String)id_combo.getSelectedItem(),nome.getText(),cpf.getText(),nascimento.getText(), pagamento.getText()
                    ,peso.getText(),pago,"aluno.txt");
        else
            if(professor_radio.isSelected()){                              
               txt.apaga_linha((String)id_combo.getSelectedItem(),nome.getText(),cpf.getText(),nascimento.getText(), pagamento.getText()
                    ,peso.getText(),pago,"professor.txt");
            
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateEdelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton aluno_radio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cpf;
    private javax.swing.JComboBox id_combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nascimento;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField pagamento;
    private javax.swing.JTextField peso;
    private javax.swing.JRadioButton professor_radio;
    // End of variables declaration//GEN-END:variables
}
