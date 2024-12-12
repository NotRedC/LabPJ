package com.exemplu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name="carti")

public class Carte {
	@Id private String isbn;
	private String titlul;
	private String autorul;
}