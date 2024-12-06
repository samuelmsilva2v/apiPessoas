package com.example.demo.services.interfaces;

import com.example.demo.dtos.PessoaRequestDto;
import com.example.demo.dtos.PessoaResponseDto;

public interface PessoaService {

	PessoaResponseDto cadastrarPessoa(PessoaRequestDto request);
}
