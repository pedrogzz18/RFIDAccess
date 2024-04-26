package com.micro.RFIDServer.service.impl;
import com.micro.RFIDServer.model.DashboardIngreso;
import com.micro.RFIDServer.service.DashboardService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import com.micro.RFIDServer.model.Ingreso;
import com.micro.RFIDServer.model.Residente;
import com.micro.RFIDServer.model.RfidArtifact;
import com.micro.RFIDServer.model.DashboardIngreso;
import com.micro.RFIDServer.repository.IngresoRepository;
@Service
public class DashboardServiceImpl implements DashboardService{
    @Autowired
    private IngresoRepository ingresoRepository;

    public List<DashboardIngreso> getDashboardIngresos(){

        return ingresoRepository.getDashboardIngresos();
    }

}