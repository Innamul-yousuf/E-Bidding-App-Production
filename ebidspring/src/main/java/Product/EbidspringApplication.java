package Product;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import Bidder.BidderService;

@SpringBootApplication
public class EbidspringApplication {
	//public static ConfigurableApplicationContext proc;
	public static ProductService pso;
	public static ProductDAO pDAO;
	public static ProductRespository prso;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext pro=
		SpringApplication.run(EbidspringApplication.class, args);
		ProductService ps=(ProductService) pro.getBean("productService");
		pso=ps;
		ProductDAO productDAO=(ProductDAO) pro.getBean("productDAO");
		pDAO=productDAO;
		ProductRespository productRespository=(ProductRespository) pro.getBean("productRespository");
		prso=productRespository;
		//SpringApplication.run(Admin.EbidspringApplication.class, "--server.port=8085");

		//SpringApplication.run(Bidder.EbidspringApplication.class, "--server.port=8081");
		//SpringApplication.run(Seller.EbidspringApplication.class, "--server.port=8082");
		//SpringApplication.run(BidderProduct2.EbidspringApplication.class, "--server.port=8083");
		//SpringApplication.run(SellerProduct.EbidspringApplication.class, "--server.port=8084");
	}
//public ConfigurableApplicationContext getProMain(String[] args) {
//	ConfigurableApplicationContext pro=
//			SpringApplication.run(EbidspringApplication.class,args);
//	return pro;
//}
}
