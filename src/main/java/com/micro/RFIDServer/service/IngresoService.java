package com.micro.RFIDServer.service;
import com.micro.RFIDServer.model.Ingreso;
import java.util.Optional;


public interface IngresoService{
    public Ingreso createIngreso(Ingreso ingreso);

    public Ingreso updateIngresoById(Ingreso new_ingreso, int id);

    public void deleteIngresoById(int id);

    public Optional<Ingreso> getIngresoById(int id);
}