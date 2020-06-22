package it.dstech.formazione.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Videogioco {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
private String titolo;
@Enumerated(EnumType.STRING)
private Pegi pegi;
@Enumerated(EnumType.STRING)
private Categoria categoria;
@Enumerated(EnumType.STRING)
private Prezzo prezzo;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getTitolo() {
	return titolo;
}
public void setTitolo(String titolo) {
	this.titolo = titolo;
}
public Pegi getPegi() {
	return pegi;
}
public void setPegi(Pegi pegi) {
	this.pegi = pegi;
}
public Categoria getCategoria() {
	return categoria;
}
public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}
public Prezzo getPrezzo() {
	return prezzo;
}
public void setPrezzo(Prezzo prezzo) {
	this.prezzo = prezzo;
}





}
