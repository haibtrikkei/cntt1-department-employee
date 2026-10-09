package ra.demo.init_data;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ra.demo.model.entity.Department;
import ra.demo.repository.DepartmetRepository;
import ra.demo.repository.EmployeeRepository;

import java.util.List;

@Component
@RequiredArgsConstructor
public class InitDataForApp implements CommandLineRunner {
    private final DepartmetRepository  departmetRepository;
    private final EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        if(departmetRepository.findAll().isEmpty()){
            List<Department> departments = List.of(
                new Department("D001", "Human Resources", true, null),
                new Department("D002", "Information Technology", true, null),
                new Department("D003", "Finance", true, null)
            );
            departmetRepository.saveAll(departments);
        }
    }
}
