package br.com.leosilvadev.pizzaria.propertyEditors;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.leosilvadev.pizzaria.modelo.entidades.Ingrediente;
import br.com.leosilvadev.pizzaria.modelo.repositorios.IngredienteRepositorio;

@Component
public class IngredientePropertyEditor extends PropertyEditorSupport{
    
    @Autowired private IngredienteRepositorio ingredienteRepositorio;
    
    @Override
    public void setAsText(String text) throws IllegalArgumentException{
        
        long idIngrediente = Long.parseLong(text);
       // System.out.println("papa "+idIngrediente);
        Ingrediente ingrediente =  ingredienteRepositorio.findOne(idIngrediente);
        setValue(ingrediente);
    
    }
}