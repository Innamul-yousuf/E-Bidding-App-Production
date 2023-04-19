package Product;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.EbidspringApplicationMain;

import Bidder.Bidder;
import Bidder.BidderRespository;
import Bidder.BidderService;

@Service
public class ProductService {

	@Autowired
	public ProductRespository productRespository=EbidspringApplicationMain.prso;
//	public ProductService( ProductRespository productRespository) {
//		this.productRespository = productRespository;
//	}
//	public ProductService() {
//		// TODO Auto-generated constructor stub
//	}
//	@Autowired
//	DataSource dataSource;
//	public ProductService(DataSource dataSource) {
//		this.dataSource=dataSource;
//	}

//	EbidspringApplication pro=new EbidspringApplication();
//	public String[] args;
//	public ConfigurableApplicationContext procp=pro.getProMain(args);
	@Autowired
	public ProductDAO productDAO=com.example.demo.EbidspringApplicationMain.pDAO;
//	public ProductService(ProductDAO productDAO) {
//		this.productDAO=productDAO;
//	}
	public Product createProduct(Product product) {
		return productRespository.save(product);
	}
	public Product updateProduct(Product product) {
		return productRespository.save(product);
	}
	public void deleteProduct(Long id) {
		productRespository.deleteById(id);
	}
	public List<Product> getAllProducts(){
		return productRespository.findAll();
	}
	public Product getProductById(Long id){
		return productRespository.findById(id).get();
	}
public void updateSoldTo1(Long productId) {
	productDAO.updateProductFlagTo1(productId);
	}
public void updateSoldTo0(Long productId) {
	productDAO.updateProductFlagTo0(productId);
	}

public void updatePcostByPid(Long pid, Long pcost) {
	
	productDAO.updateProductBidAmt(pid, pcost);
}
public void updateBidderName(Long productId,String bname) {
	productDAO.updateBidderName(productId, bname);
	
}

public String checkValidBidAndUpdate(Long bid_amt, Long pid) {

	ProductService productService = new ProductService();
	Product product =new Product();
//	CheckValidBid cv=new CheckValidBid(ProductRespository productRespository);
	product = productRespository.findById(pid).get();
	Long currentCost = product.getPcost();
	
	if (currentCost < bid_amt) {
	
			if(product.getSold()==1) {
				productService.updatePcostByPid(pid, bid_amt);
				return "Done";
			}
			else {
				System.out.println("Bidding Time started or Ended!");
				return "Not Done";
			}
		
}
	 else {
		System.out.println("Low Bid Amount!");
		return "Not Done";
	}
	
}

}
