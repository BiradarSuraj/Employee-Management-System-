package Employee.Managment.Project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllData() {
		return employeeRepository.findAll();
	}
	
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public Employee getById(int id) {
		java.util.Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee = null;
		if(optional.isPresent()) 
			employee = optional.get();
		else
			throw new RuntimeException("Employee not found for id: " + id);
		return employee;
	}
	
	public void deleteData(int id) {
		employeeRepository.deleteById(id);
	}
}
