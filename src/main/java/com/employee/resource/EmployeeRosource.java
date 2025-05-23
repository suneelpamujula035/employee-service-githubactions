//package com.employee.resource;
//
//import com.employee.entity.Employee;
//import com.employee.repository.EmployeeRepository;
//import jakarta.ws.rs.Consumes;
//import jakarta.ws.rs.GET;
//import jakarta.ws.rs.Path;
//import jakarta.ws.rs.Produces;
//import jakarta.ws.rs.core.MediaType;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//
//@Path("/api")
//public class EmployeeRosource {
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    @GET
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    @Path("/getAllEmployees")
//    public List<Employee> getAllEmployees()
//    {
//        return employeeRepository.findAll();
//    }
//}
