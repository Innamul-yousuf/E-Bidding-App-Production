package Parent;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import Product.EbidspringApplication;


//@SpringBootApplication
public class ParentApplication {
public static void main(String[] args) {
	//SpringApplication.run(EbidspringApplication.class, "--server.port=8081");
	//SpringApplication.run(Admin.EbidspringApplication.class, "--server.port=8085");

			SpringApplication.run(Bidder.EbidspringApplicationBidder.class, "--server.port=8085");
			SpringApplication.run(Seller.EbidspringApplicationSeller.class, "--server.port=8082");
//			SpringApplication.run(BidderProduct2.EbidspringApplication.class, "--server.port=8083");
//			SpringApplication.run(SellerProduct.EbidspringApplication.class, "--server.port=8084");
}
}
