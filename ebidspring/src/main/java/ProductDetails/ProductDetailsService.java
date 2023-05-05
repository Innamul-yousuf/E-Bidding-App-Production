package ProductDetails;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EbidspringApplicationMain;

@Service
public class ProductDetailsService {
	
	@Autowired
	private ProductDetailsRespository productDetailsRespository=EbidspringApplicationMain.pdr;
	
	public ProductDetails createProductDetails(ProductDetails details) {
		return productDetailsRespository.save(details);
	}
	public ProductDetails updateProductDetails(ProductDetails details) {
		return productDetailsRespository.save(details);
	}
	public void deleteProductDetails(Long id) {
		productDetailsRespository.deleteById(id);
	}
	public List<ProductDetails> getAllProductDetails(){
		return productDetailsRespository.findAll();
	}
	public ProductDetails getProductDetailsById(Long id){
		return productDetailsRespository.findById(id).get();
	}
	
}
