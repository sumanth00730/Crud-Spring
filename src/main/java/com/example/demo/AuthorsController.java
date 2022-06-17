package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")

public class AuthorsController {

    @Autowired ServiceCon service;

    @GetMapping
    public List<Model> getAllAuthors(){
        return service.listAll();
    }

    @PostMapping
    public Model postAuthor(@RequestBody Model model){
        service.storeRecord(model);
        return model;
    }

    @GetMapping(path="/{id}")
    public Model getOneAuthor(@PathVariable Integer id){
        return service.getByAuthorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteOneAuthor(@PathVariable Integer id){
        return service.deleteById(id);
    }

    @PutMapping("/{id}")
    public String updateAuthor(@PathVariable Integer id,@RequestBody Model model){
        service.updateById(id,model);
        return "Updated";
    }

}
