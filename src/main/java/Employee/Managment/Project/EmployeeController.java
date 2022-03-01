package Employee.Managment.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String getAllData( Model model ) {
		model.addAttribute("employeeDetails",employeeService.getAllData());
		return "EmployeeUI";
	}
	
	@GetMapping("/addnew")
	public String addEmployee( Model model) {
		
		Employee employee = new Employee();
		model.addAttribute(employee);
		return "addNewEmployee";
	}
	
	@PostMapping("/save")
	public String addData(@ModelAttribute("student") Employee employee) {
		employeeService.addEmployee(employee);
		return "redirect:/";
	}
	
	@GetMapping("/updateEmployee/{id}")
	public String updateEmployee(@PathVariable int id, Model model) {
		
		model.addAttribute("employee", employeeService.getById(id));
		return "updateEmployee";
	}
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		
		employeeService.deleteData(id);
		return "redirect:/";
	}
}
