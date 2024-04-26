package com.micro.RFIDServer.controller;
import com.micro.RFIDServer.model.Residente;
import com.micro.RFIDServer.service.impl.ResidenteServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import java.util.List;


@RestController
public class ResidenteApi{
    @Autowired private ResidenteServiceImpl residenteService;

    @PostMapping("/residente")
    public Residente createResidente(@RequestBody Residente residente)
    {
        return residenteService.createResidente(residente);
    }

    @GetMapping("/residentes")
    public List<Residente> getResidentes()
    {
        return residenteService.getResidentes();
    }


    @GetMapping("/residente/{id}")
    public Optional<Residente> getResidenteById(@PathVariable("id") int id)
    {
        return residenteService.getResidenteById(id);
    }

    @PutMapping("/residente/{id}")
    public Residente updateResidenteById(@RequestBody Residente residente,
                                                 @PathVariable("id") int id)
    {
        return residenteService.updateResidenteById(residente, id);
    }

    @DeleteMapping("/residente/{id}")
    public String deleteResidenteById(@PathVariable("id") int id) {
        residenteService.deleteResidenteById(id);
        return "Deleted Successfully";
    }
}