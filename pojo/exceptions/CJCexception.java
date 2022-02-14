package com.mv.pojo.exceptions;
//Cliente ja cadastrado
public class CJCexception extends Exception {

    public CJCexception(){
        super("Cliente já cadastrado");
    }
}
