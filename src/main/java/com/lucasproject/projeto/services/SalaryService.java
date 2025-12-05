package com.lucasproject.projeto.services;


import com.lucasproject.projeto.entities.Employee;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

private TaxService taxService;
private Previd previd;

    public SalaryService(TaxService taxService, Previd previd) {
        this.taxService = taxService;
        this.previd = previd;
    }

    public double netSalary(Employee employee){
        return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary())
                - previd.previdence(employee.getGrossSalary());
    }


}
