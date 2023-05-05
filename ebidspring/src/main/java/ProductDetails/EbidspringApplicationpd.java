package ProductDetails;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import Bidder.BidderService;

@SpringBootApplication
public class EbidspringApplicationpd {
	public static ProductDetailsRespository pdr;

	
	public static void main(String[] args) {
		ConfigurableApplicationContext pro=
		SpringApplication.run(EbidspringApplicationpd.class, args);
		
		ProductDetailsRespository productDetailsRespository=(ProductDetailsRespository) pro.getBean("productDetailsRespository");
		pdr=productDetailsRespository;
	}
}
