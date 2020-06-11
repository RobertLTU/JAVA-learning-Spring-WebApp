package com.robertidr.ExamRealTest.controllers;

import com.robertidr.ExamRealTest.models.Darbuotojas;
import com.robertidr.ExamRealTest.repositories.DarbuotojasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    private DarbuotojasRepository darbuotojasRepository;

    @GetMapping("/")
    public String main(Model model) {
        List<Darbuotojas> darbuotojai = darbuotojasRepository.findAll(Sort.by(Sort.Direction.ASC, "skyrius", "pareigos", "vardas"));
        model.addAttribute("darbuotojai", darbuotojai);
        return "main";
    }

    @PostMapping("/main/{id}/remove")
    public String removeDarbuotojas(@PathVariable(value = "id") int id, Model model) {
        Darbuotojas darbuotojas = darbuotojasRepository.findById(id).orElse(null);
        darbuotojasRepository.delete((Darbuotojas) darbuotojas);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String editDarbuotojas(@PathVariable(value = "id") int id, Model model) {
        if(!darbuotojasRepository.existsById(id)){
            return "redirect:/";
        }
        Darbuotojas darbuotojas = darbuotojasRepository.findById(id).orElse(null);
        model.addAttribute(darbuotojas);
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String updateDarbuotojas(
            @PathVariable(value = "id") int id,
            @RequestParam String vardas,
            @RequestParam String pavarde,
            @RequestParam int gimimoMetai,
            @RequestParam String pareigos,
            @RequestParam String skyrius){
        Darbuotojas darbuotojas = darbuotojasRepository.findById(id).orElse(null);
        darbuotojas.setVardas(vardas);
        darbuotojas.setPavarde(pavarde);
        darbuotojas.setGimimoMetai(gimimoMetai);
        darbuotojas.setPareigos(pareigos);
        darbuotojas.setSkyrius(skyrius);
        darbuotojasRepository.save(darbuotojas);
        return "redirect:/";
    }

    @GetMapping("/create")
    public String createDarbuotojas(Model model) {


        return "create";
    }

    @PostMapping("/create")
    public String saveDarbuotojas(
            @RequestParam String vardas,
            @RequestParam String pavarde,
            @RequestParam int gimimoMetai,
            @RequestParam String pareigos,
            @RequestParam String skyrius,
            Model model) {
        Darbuotojas darbuotojas = new Darbuotojas();
        darbuotojas.setVardas(vardas);
        darbuotojas.setPavarde(pavarde);
        darbuotojas.setGimimoMetai(gimimoMetai);
        darbuotojas.setPareigos(pareigos);
        darbuotojas.setSkyrius(skyrius);
        darbuotojasRepository.save(darbuotojas);
        return "redirect:/";
    }
}
