package com.example.demo.entities;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Pessoa {

	@Id
	private UUID id;
	private String nome;
	private Date dataNascimento;
	private String email;
	private String telefone;
}
