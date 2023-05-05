package Bidder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EbidspringApplicationBidder {
	public static BidderRespository br;
	public static void main(String[] args) {
		ConfigurableApplicationContext bsa=
		SpringApplication.run(EbidspringApplicationBidder.class, args);
		BidderRespository bidderRespository=(BidderRespository) bsa.getBean("bidderRespository");
		br=bidderRespository;
		BidderService bs=new BidderService();
		BidderController bc=new BidderController(bs);
		bc.getCountdown();
	}

}
