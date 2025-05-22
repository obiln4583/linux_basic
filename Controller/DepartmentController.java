package com.dailycodebuffer.Springboot.tutorial.Controller;

import com.dailycodebuffer.Springboot.tutorial.Entity.Department;
import com.dailycodebuffer.Springboot.tutorial.Error.DepartmentNotFoundException;
import com.dailycodebuffer.Springboot.tutorial.Service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.util.List;


import static org.slf4j.LoggerFactory.getLogger;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    private String name;
   // private final Logger logger = getLogger(name:DepartmentController.class);
  // private final Logger logger= getLogger(DepartmentController.class);
   private final Logger logger = getLogger(DepartmentController.class);
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        /*when it hits the postapi it logs the info*/

        logger.info("Inside savedepartment of department controller");
        System.out.println(">>>> INSIDE saveDepartment METHOD <<<<");
        //  Logger.info("Inside savedepartment of department controller\"");
        return departmentService.savedepartment(department);

    }
    /*
    @PostMapping("/departments/bulk")
    public List<Department> saveMultipleDepartments(@RequestBody List<Department> departments) {
        return departmentService.saveDepartments(departments);
    }*/

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){

        return departmentService.fetchDepartmentList();
    }


    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {

        return departmentService.fetchDepartmentById(departmentId);
    }
   @DeleteMapping("/departments/{id}")
   public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "department deleted successfully";
   }
   @PutMapping("/departments/{id}")
  public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {
          return departmentService.updateDepartment(departmentId,department);
   }
    @GetMapping("/departmentName/name/{name}")
   public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
        return departmentService.fetchDepartmentByName(departmentName);
   }

}
