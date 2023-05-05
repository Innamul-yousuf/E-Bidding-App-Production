package Seller;

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
@RequestMapping("/sellerC")
public class SellerController {

	@Autowired
	private SellerService sellerService;

	@GetMapping("/seller")
	public List<Seller> getAllSeller() {
		return sellerService.getAllSellers();
	}

	@GetMapping("/seller/{id}")
	public Seller getSellerById(@PathVariable Long id) {
		return sellerService.getSellerById(id);
	}

	@PostMapping("/seller")
	public Seller createSeller(@RequestBody Seller seller) {
		return sellerService.createSeller(seller);
	}

	@PutMapping("/seller/{id}")
	public Seller updateSeller(Seller seller) {
		return sellerService.updateSeller(seller);
	}

	@DeleteMapping("/seller/{id}")
	public void deleteSeller(@PathVariable Long id) {
		sellerService.deleteSeller(id);
	}
}
