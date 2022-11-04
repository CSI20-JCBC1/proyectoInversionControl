package com.app.ioc;

public class UsuarioFactory {
	
	IUsuario usr;
	
	public UsuarioFactory(IUsuario usr) {
		this.usr=usr;
	}

	public void getInsertaUsuario() {

		usr.insertaUsuario();
	}

	public void getEliminaUsuarioById(int id) {
		
		usr.eliminaUsuarioById(id);

	}
}
