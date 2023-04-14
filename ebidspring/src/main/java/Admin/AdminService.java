package Admin;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EbidspringApplicationMain;

import Bidder.Bidder;
@Service
public class AdminService {
	@Autowired
	private AdminRespository adminRespository=EbidspringApplicationAdmin.ars;
	
	public Admin createAdmin(Admin admin) {
		return adminRespository.save(admin);
	}
	public Admin updateAdmin(Admin admin) {
		return adminRespository.save(admin);
	}
	public void deleteAdmin(Long id) {
		adminRespository.deleteById(id);
	}
	public List<Admin> getAllAdmins(){
		return adminRespository.findAll();
	}
	public Admin getAdminById(Long id){
		return adminRespository.findById(id).get();
	}
	public int checkAdminLogin(Long aid, String pass) {
		Optional<Admin> admin =adminRespository.findById(aid);

		// bidder = bidderRespository.findById(bid);
		try {
			if (admin.isPresent()) {
				Admin adminobj = admin.get();
				String adminPass = adminobj.getApass();

				if (adminPass.equals(pass)) {
					System.out.println("Admin Available");
					return 1;
				}else {
					System.out.println("Wrong Password");
					return 0;
				}
			} else {
				System.out.println("Admin Not Available");
				return 0;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
}
