package excepciones;

import java.util.ResourceBundle;

public class Aplicacion {
	public Usuario login(String usrname, String password){
		try{
			ResourceBundle rb = ResourceBundle.getBundle("usuario");
			
			String usr = rb.getString(usrname);
			
			String pwd = rb.getString(password);
			
			Usuario u = null;
			
			if(usr.equals(usrname) && pwd.equals(password)){
				u = new Usuario();
				u.setUsrname(usr);
				u.setPassword(pwd);
				u.setNombre(rb.getString("nombre"));
				u.setEmail(rb.getString("email"));
			}
			return u;
		} catch (Exception e){
			throw new RuntimeException("Error verificando datos",e);
		}
	}

}
