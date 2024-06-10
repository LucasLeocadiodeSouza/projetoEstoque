public class Main {

	public static void main(String[] args) {
		
       estoque estoque = new estoque();
       diu mirena = new diu();
       mirena.setModel("Mirena");
       mirena.setLote("TKE9MCZ8");
       mirena.setValidade(062025);
       estoque.cadastrarDiu(mirena);
       
       diu kyleena = new diu();
       kyleena.setModel("kyleena");
       kyleena.setLote("CMIFW9Q2");
       kyleena.setValidade(022026);
       estoque.cadastrarDiu(kyleena);
       
       diu cobre_prata = new diu();
       cobre_prata.setModel("cobre_prata");
       cobre_prata.setLote("NJIVD9W8");
       cobre_prata.setValidade(012025);
       estoque.cadastrarDiu(cobre_prata);
       
       diu cobre = new diu();
       cobre.setModel("cobre");
       cobre.setLote("MJKICVBW");
       cobre.setValidade(052025);
       estoque.cadastrarDiu(cobre);
       
       solicitacao solicitacao1 = new solicitacao();
       solicitacao1.setLocal("HOSPITAL REDE CROSS");
       solicitacao1.dataAgendamento(2024, 6, 25, 14, 00);
       solicitacao1.setSenha(67400000 + (int) (Math.random() * 100000));
       solicitacao1.setNomePac("EDUARDO COSTA JR");
       solicitacao1.setNomeMed("DR. FELIPE DE MELO PRAJIANTE");
       solicitacao1.setDiu(mirena);
       solicitacao1.setPendencia(true);
       estoque.adicionarSolicitacao(solicitacao1);
       
       solicitacao solicitacao2 = new solicitacao();
       solicitacao2.setLocal("HOSPITAL REDE CROSS");
       solicitacao2.dataAgendamento(2024, 6, 12, 9, 00);
       solicitacao2.setSenha(67400000 + (int) (Math.random() * 100000));
       solicitacao2.setNomePac("XORORO DE MELO");
       solicitacao2.setNomeMed("DR. MARIA FERNANDA PIFFER");
       solicitacao2.setDiu(kyleena);
       solicitacao2.setPendencia(true);
       estoque.adicionarSolicitacao(solicitacao2);
       
        solicitacao solicitacao3 = new solicitacao();
       solicitacao3.setLocal("PAM CASCAVEL");
       solicitacao3.dataAgendamento(2024, 6, 14, 7, 15);
       solicitacao3.setSenha(67400000 + (int) (Math.random() * 100000));
       solicitacao3.setNomePac("MARCIANO DE SOUZA");
       solicitacao3.setNomeMed("DR. MARIA FERNANDA PIFFER");
       solicitacao3.setDiu(mirena);
       solicitacao3.setPendencia(true);
       estoque.adicionarSolicitacao(solicitacao3);
      
    
       for(int j = 0; j < estoque.tamanhoSolicitacao(); j++){
          if(estoque.verSolicitacao(j).isPendencia()){
               System.out.println("Modelo: " + estoque.verSolicitacao(j).getDiu().getModel());
               System.out.println("Numero de protocolo: " + estoque.verSolicitacao(j).getSenha());
               System.out.println("Paciente: " + estoque.verSolicitacao(j).getNomePac());
               System.out.println("Medico: " + estoque.verSolicitacao(j).getNomeMed());
               System.out.println("Local: " + estoque.verSolicitacao(j).getLocal());
               System.out.println("Data e hora: " + estoque.verSolicitacao(j).toString());
          }
           System.out.println(" ");
        } 
		
	}

}
