<<<<<<< HEAD

package model;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabricio
 */
public class Usuario {
    private String nomeUsuario;
    private String senha;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public String paraJSONString(){
        JsonObjectBuilder construtorJson = Json.createObjectBuilder();
        construtorJson.add("nomeUsuario", this.getNomeUsuario());
        construtorJson.add("senha", this.getSenha());
        JsonObject objetoJson = construtorJson.build();
        
        /* Construção manual da String Json: */
        /*
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("{ \"nomeUsuario\": ");
        strBuilder.append("\""+this.getNomeUsuario() + "\" ,");
        strBuilder.append(" \"senha\": ");
        strBuilder.append("\""+this.getSenha() + "\" }");
        */
        
        return objetoJson.toString(); //strBuilder.toString();       
    } 
           
    
=======
package model;

import javax.persistence.*;
@Entity
@Table(name = "usuario")
public class Usuario {
   @Id
   @GeneratedValue
   private int id;
      
   @Column(name="nome")
   private String nome;
   
   @Column(name="email")
   private String email;
   
   @Column(name="senha")
   private String senha;
   
   @Column (name="apelido")
   private String apelido;
   
   @Column (name="permissao")
   private boolean permissao;
   
	public Usuario() {
		super();
	}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getSenha() {
	return senha;
}

public void setSenha(String senha) {
	this.senha = senha;
}

public String getApelido() {
	return apelido;
}

public void setApelido(String apelido) {
	this.apelido = apelido;
}

public boolean isPermissao() {
	return permissao;
}

public void setPermissao(boolean permissao) {
	this.permissao = permissao;
}
>>>>>>> update
}
