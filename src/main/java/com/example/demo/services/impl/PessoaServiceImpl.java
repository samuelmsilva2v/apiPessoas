package com.example.demo.services.impl;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.PessoaRequestDto;
import com.example.demo.dtos.PessoaResponseDto;
import com.example.demo.entities.Pessoa;
import com.example.demo.repositories.PessoaRepository;
import com.example.demo.services.interfaces.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public PessoaResponseDto cadastrarPessoa(PessoaRequestDto request) {
		
		var pessoa = modelMapper.map(request, Pessoa.class);
		pessoa.setId(UUID.randomUUID());
		
		pessoaRepository.save(pessoa);
		
		return modelMapper.map(pessoa, PessoaResponseDto.class);
	}

}
