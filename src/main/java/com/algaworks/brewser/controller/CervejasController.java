package com.algaworks.brewser.controller;

import com.algaworks.brewser.dto.CervejaDto;
import com.algaworks.brewser.model.Cerveja;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CervejasController {


    @GetMapping("/cervejas/novo")
    public String novo(CervejaDto cervejaDto){
        return "cerveja/CadastroCerveja";
    }

    @PostMapping("/cervejas/novo")
    public String cadastrar(@Valid CervejaDto cervejaDto, BindingResult result, Model model, RedirectAttributes attributes){
        if (result.hasErrors()){
            return novo(cervejaDto);
        }
        attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso!");
        System.out.println(">>>>> sku:" + cervejaDto.getSku());
        return "redirect:/cervejas/novo";
    }

}
