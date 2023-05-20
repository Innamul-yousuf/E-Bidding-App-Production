package ProductDetails;

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

import Product.EbidspringApplication;

@RestController
@RequestMapping("/productDetailsC")

public class ProductDetailsController {
	EbidspringApplication pro=new EbidspringApplication();
	@Autowired
	public ProductDetailsService productDetailsService;
	
	@GetMapping("/product")
	public List<ProductDetails> getAllProductDetails(){
		return productDetailsService.getAllProductDetails();
	}
	
	@GetMapping("/product/{id}")
	public ProductDetails getProductDetailsById(@PathVariable Long id) {
		return productDetailsService.getProductDetailsById(id);
	}
	
	@PostMapping("/product")
	public ProductDetails createProductDetails(@RequestBody ProductDetails product) {
		return productDetailsService.createProductDetails(product);
	}
	
	@PutMapping("/product/{id}")
	public ProductDetails updateProductDetails(ProductDetails product) {
		return productDetailsService.updateProductDetails(product);
	}
	
	@DeleteMapping("/product/{id}")
	public void deleteProductDetails(@PathVariable Long id) {
		productDetailsService.deleteProductDetails(id);
	}
	
	@GetMapping("/product/timer/{id}")
	public void startTimer(@PathVariable Long id) {
		productDetailsService.changeSoldAsTime(id);
	}
}
