/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.dao;

import mx.uaemex.dto2.*;
import java.util.List;
import java.util.ArrayList;

public class grupodao {
    
    List<Grupo> grupos = new ArrayList<Grupo>();
	int id=0; 

	public void agregarGrupo(Grupo grupo) {
		grupo.setId(id+1);
		grupos.add(grupo);
		id++;	
	}

	public void actualizarGrupo (Grupo grupo) {
		  for (int i = 0; i < grupos.size(); i++) {
	          if(grupos.get(i).getId()== grupo.getId()){
	              grupos.get(i).setId(grupo.getId());
	              	grupos.get(i).setNombre(grupo.getNombre());
	          }
		  }
	}


	public void eliminarGrupo(Grupo grupo) {
		grupos.remove(grupo);

	}
	 public List<Grupo> MostrarListaDeGrupos() {
		 return grupos;
		 }
    
}
