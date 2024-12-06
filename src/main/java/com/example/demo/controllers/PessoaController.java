package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.PessoaRequestDto;
import com.example.demo.dtos.PessoaResponseDto;
import com.example.demo.services.interfaces.PessoaService;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;
	
	@PostMapping
	public PessoaResponseDto post(@RequestBody PessoaRequestDto request) {
		return pessoaService.cadastrarPessoa(request);
	}
}
