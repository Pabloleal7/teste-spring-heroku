package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {

    @GetMapping()
    public String chama(){
        return" ai meu deuss";
    }
    @GetMapping("test/{nome}")
    public String chama2(@PathVariable String nome){
        return "meu deus meu senho me ajuda por favorres" + nome;
    }
}
