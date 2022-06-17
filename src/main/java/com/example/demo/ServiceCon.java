package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceCon {
    @Autowired private ModelRepository repo1;

    public List<Model> listAll(){
        return (List<Model>) repo1.findAll();
    }

    public Model storeRecord(@RequestBody Model record){
        repo1.save(record);
        return  record;
    }
    public Model getByAuthorId(Integer id){
        Optional<Model> result = repo1.findById(id);
        return result.get();
    }
    public String deleteById(Integer id) {
        repo1.deleteById(id);
        return "Deletion Successfull";
    }

    public Model updateById(int id,@RequestBody Model record) {
        Model mc = repo1.findById(id).orElse(null);
        mc.setDescription(record.getDescription());
        mc.setEmail(record.getEmail());
        mc.setName(record.getName());
        repo1.save(mc);
        return mc;
    }
}
