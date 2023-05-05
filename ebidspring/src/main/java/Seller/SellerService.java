package Seller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

	@Autowired
	private SellerRespository sellerRespository;

	public Seller createSeller(Seller seller) {
		return sellerRespository.save(seller);
	}

	public Seller updateSeller(Seller seller) {
		return sellerRespository.save(seller);
	}

	public void deleteSeller(Long id) {
		sellerRespository.deleteById(id);
	}

	public List<Seller> getAllSellers() {
		return sellerRespository.findAll();
	}

	public Seller getSellerById(Long id) {
		return sellerRespository.findById(id).get();
	}

}
