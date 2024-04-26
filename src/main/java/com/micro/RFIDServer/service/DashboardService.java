package com.micro.RFIDServer.service;
import com.micro.RFIDServer.model.DashboardIngreso;
import java.util.Optional;
import java.util.List;


public interface DashboardService{
    public List<DashboardIngreso> getDashboardIngresos();
}