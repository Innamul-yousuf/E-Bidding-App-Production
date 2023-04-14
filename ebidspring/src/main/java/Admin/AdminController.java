package Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adminC")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/admin")
	public List<Admin> getAllSeller(){
		return adminService.getAllAdmins();
	}
	
	@GetMapping("/admin/{id}")
	public Admin getAdminById(@PathVariable Long id) {
		return adminService.getAdminById(id);
	}
	
	@PostMapping("/admin")
	public Admin createSeller(@RequestBody Admin admin) {
		return adminService.createAdmin(admin);
	}
	
	@PutMapping("/admin/{id}")
	public Admin updateAdmin(Admin admin) {
		return adminService.updateAdmin(admin);
	}
	
	@DeleteMapping("/admin/{id}")
	public void deleteAdmin(@PathVariable Long id) {
		adminService.deleteAdmin(id);
	}
	@PostMapping("/adminLogin/{aid}/{apass}")
	public int checkAdminLogin(@PathVariable Long aid,@PathVariable String apass) {
		int i=adminService.checkAdminLogin(aid, apass);
		if(i==1) {
			System.out.println("Admin C pass");
			return 1;
		}else {
			return 0;
		}
	}
}
