package Diu;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class solicitacao {
	
	   private String local;
	   private int senha;
	   private String nomePac;
	   private SimpleDateFormat agendado;
	   private String nomeMed;
	   private boolean pendencia;
	   private diu diu;
	   
	   //contrutores
	   public solicitacao() {
		   agendado = new SimpleDateFormat("d MMM y - h:mm a ");
	   }
	   
	   //para mostrar a data e hora certinho
	   private Calendar data;
		public void dataAgendamento(int y, int M, int d, int min, int seg) {
			data = new GregorianCalendar(y, M, d, min, seg);
		}
	    @Override
		public String toString() {
			return agendado.format(data.getTime());
		}
	    
	    
		//o resto normalmente
		public boolean isPendencia() {
	        return pendencia;
	    }

	    public void setPendencia(boolean pendencia) {
	        this.pendencia = pendencia;
	    }
	   
	    public diu getDiu() {
	        return diu;
	    }

	    public void setDiu(diu diu) {
	        this.diu = diu;
	    }

	    public String getNomePac() {
	        return nomePac;
	    }

	    public void setNomePac(String nomePac) {
	        this.nomePac = nomePac;
	    }

	    public String getNomeMed() {
	        return nomeMed;
	    }

	    public void setNomeMed(String nomeMed) {
	        this.nomeMed = nomeMed;
	    }

	    public String getLocal() {
	        return local;
	    }

	    public void setLocal(String local) {
	        this.local = local;
	    }

	    public int getSenha() {
	        return senha;
	    }

	    public void setSenha(int senha) {
	        this.senha = senha;
	    }
}
