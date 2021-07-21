package modelo;

public class User {
	
	//private final int id;
	private String name;
	private String mail;
	private String password;
	private int strikes;
	
	public User() {
		strikes=0;
	}
	public User(String name, String mail, String password) {
		this.name=name;
		//comprobar correo
		this.mail=mail;
		//comprobar contraseña
		this.password=password;
		this.strikes=0;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getMail() {
		return mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public int getStrikes() {
		return strikes;
	}
	public void setStrike(String X) {
		//TODO añadir o quitar strike
	}
	public String toString() {
		return "Nombre: "+name;
	}
}
