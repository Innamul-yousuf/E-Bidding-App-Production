package Product;

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
@RequestMapping("/productC")

public class ProductController {
	EbidspringApplication pro = new EbidspringApplication();
	@Autowired
	public ProductService productService;

	@GetMapping("/product")
	public List<Product> getAllProduct() {
		return productService.getAllProducts();
	}

	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable Long id) {
		return productService.getProductById(id);
	}

	@PostMapping("/product")
	public Product createProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}

	@PutMapping("/product/{id}")
	public Product updateProduct(Product product) {
		return productService.updateProduct(product);
	}

	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
	}

	@GetMapping("/productTo1/{pid}")
	public void updateSoldTo1(@PathVariable("pid") Long pid) {
		productService.updateSoldTo1(pid);
	}

	@GetMapping("/productTo0/{pid}")
	public void updateSoldTo0(@PathVariable("pid") Long pid) {
		productService.updateSoldTo0(pid);
	}

	@GetMapping("/service/{bamt}/{pid}")
	public int checkValidBidAndUpdate(@PathVariable Long bamt, @PathVariable Long pid) {
		String res = productService.checkValidBidAndUpdate(bamt, pid);
		if (res == "Done") {
			return 1;
		} else {
			return 0;
		}

	}

	@GetMapping("/service/uname/{pid}/{bname}")
	public int updateBname(@PathVariable Long pid, @PathVariable String bname) {
		productService.updateBidderName(pid, bname);
		return 6;
	}
//	@GetMapping("/service/getname/{bid}")
//	public void getBidderName(@PathVariable Long bid) {
//		productService.getBidderName(bid);
//	}
}
