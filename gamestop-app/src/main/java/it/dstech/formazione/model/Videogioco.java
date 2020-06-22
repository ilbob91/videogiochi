package it.dstech.formazione.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Videogioco {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
private String titolo;
private String pegi;
private String categoria;
private Long prezzo;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}


public Long getPrezzo() {
	return prezzo;
}
public void setPrezzo(Long prezzo) {
	this.prezzo = prezzo;
}
public String getTitolo() {
	return titolo;
}
public void setTitolo(String titolo) {
	this.titolo = titolo;
}
public String getPegi() {
	return pegi;
}
public void setPegi(String pegi) {
	this.pegi = pegi;
}
public String getCategoria() {
	return categoria;
}
public void setCategoria(String categoria) {
	this.categoria = categoria;
}



}
