package com.micro.RFIDServer.controller;
import com.micro.RFIDServer.model.DashboardIngreso;
import com.micro.RFIDServer.service.impl.DashboardServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import java.util.List;

@RestController
public class DashboardApi{
    @Autowired DashboardServiceImpl dashboardService;

    @GetMapping("/dashboardIngresos")
    public List<DashboardIngreso> getDashboardIngresos(){
        return dashboardService.getDashboardIngresos();
    }
}