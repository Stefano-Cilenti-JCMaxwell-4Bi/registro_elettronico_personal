package registro_elettronico_ohm_v2;

public class User {
	private String Nome;
	private String Cognome;
	private String ID;
	private String Classe;
	private int Password;
	
	public User(String Nome, String Cognome, String ID, String Classe, int Password){
		this.Nome = Nome;
		this.Cognome = Cognome;
		this.ID = ID;
		this.Classe = Classe;
		this.Password = Password;
	}
	
	 public String getNome(){
		 return Nome;
	 }
	 public void setNome(String Nome){
		 this.Nome = Nome;
	 }
	 public String getCognome(){
		 return Cognome;
	 }
	 public void setCognome(String Cognome){
		 this.Cognome = Cognome;
	 }
	 public String ID(){
		 return ID;
	 }
	 public void setID(String ID){
		 this.ID = ID;
	 }
	 public String Classe(){
		 return Classe;
	 }
	 public void setClasse(String Classe){
		 this.Classe = Classe;
	 }
	 public int getPassword(){
		 return Password;
	 }
	 public void setPassword(int Password){
		 this.Password = Password;
	 }
}
