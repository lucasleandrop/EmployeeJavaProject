package com.lucasproject.projeto;

import com.lucasproject.projeto.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.lucasproject.projeto.services.SalaryService;

@SpringBootApplication
public class ProjetoApplication implements CommandLineRunner {
    @Autowired
    private SalaryService salaryService;





    public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee("Lucas",1000);
        System.out.println(salaryService.netSalary(employee));
    }
}
