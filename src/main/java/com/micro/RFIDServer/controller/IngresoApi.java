package com.micro.RFIDServer.controller;
import com.micro.RFIDServer.model.Ingreso;
import com.micro.RFIDServer.service.impl.IngresoServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;

@RestController
public class IngresoApi{
    @Autowired private IngresoServiceImpl ingresoService;

    @PostMapping("/ingreso")
    public Ingreso createIngreso(@RequestBody Ingreso ingreso)
    {
        return ingresoService.createIngreso(ingreso);
    }

    @GetMapping("/ingreso/{id}")
    public Optional<Ingreso> getIngresoById(@PathVariable("id") int id)
    {
        return ingresoService.getIngresoById(id);
    }

    @PutMapping("/ingreso/{id}")
    public Ingreso updateIngresoById(@RequestBody Ingreso ingreso,
                                                 @PathVariable("id") int id)
    {
        return ingresoService.updateIngresoById(ingreso, id);
    }

    @DeleteMapping("/ingreso/{id}")
    public String deleteIngresoById(@PathVariable("id") int id) {
        ingresoService.deleteIngresoById(id);
        return "Deleted Successfully";
    }
}