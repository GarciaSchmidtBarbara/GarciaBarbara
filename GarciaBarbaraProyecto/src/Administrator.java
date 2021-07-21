
public class Administrator {

	private String name;
	private String mail;
	private String password;
	
	public Administrator(String name, String mail, String password) {
		this.name=name;
		//comprobar correo
		this.mail=mail;
		//comprobar contraseña
		this.password=password;
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
	
}
