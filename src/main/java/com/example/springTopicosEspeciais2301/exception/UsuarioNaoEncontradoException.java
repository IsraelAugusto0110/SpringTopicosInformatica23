package com.example.springTopicosEspeciais2301.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsuarioNaoEncontradoException extends IllegalArgumentException{
    public UsuarioNaoEncontradoException(){
        super();
    }
    public UsuarioNaoEncontradoException(String msg){
        super(msg);

    }
}
