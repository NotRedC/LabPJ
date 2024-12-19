package com.example.SpringBootLab12Real;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "evenimente")
public class Eveniment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String denumire;
	private String locatie;
	private LocalDate data;
	private LocalTime ora;
	private float pret;
	public Eveniment(int id, String denumire, String locatie, LocalDate data, LocalTime ora, float pret) {
		super();
		this.id = id;
		this.denumire = denumire;
		this.locatie = locatie;
		this.data = data;
		this.ora = ora;
		this.pret = pret;
	}
	
	public Eveniment() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public String getLocatie() {
		return locatie;
	}

	public void setLocatie(String locatie) {
		this.locatie = locatie;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getOra() {
		return ora;
	}

	public void setOra(LocalTime ora) {
		this.ora = ora;
	}

	public float getPret() {
		return pret;
	}

	public void setPret(float pret) {
		this.pret = pret;
	}
	
	
	

}
