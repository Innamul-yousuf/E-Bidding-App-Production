package Bidder;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import Product.Product;
import jakarta.persistence.EntityNotFoundException;

@Service
public class BidderService {
	@Autowired
	BidderRespository bidderRespository = EbidspringApplicationBidder.br;
//	

	// BidderDAO bidderDAO;
//	
	public BidderService(BidderRespository bidderRepository) {
		this.bidderRespository = bidderRepository;
	}

	public BidderService() {
		// TODO Auto-generated constructor stub
	}

	public Bidder createBidder(Bidder bidder) {
		return bidderRespository.save(bidder);
	}

	public Bidder updateBidder(Bidder bidder) {
		return bidderRespository.save(bidder);
	}

	public void deleteBidder(Long id) {
		bidderRespository.deleteById(id);
	}

	public List<Bidder> getAllBidders() {
		return bidderRespository.findAll();
	}

	public Bidder getBidderById(Long id) {
		return bidderRespository.findById(id).get();
	}

	public String getBidderNameSpam(Long Bid) {
		BidderService bidderService = new BidderService();
		Bidder bidder = bidderService.getBidderById(Bid);
		String bname = bidder.getBname();
		return bname;
	}

	public int checkValidBidder(Long bid) {
		// BidderService bidderService=new BidderService();
		// Bidder bidder=new Bidder();
		Optional<Bidder> bidder = bidderRespository.findById(bid);

		// bidder = bidderRespository.findById(bid);
		try {
			if (bidder.isPresent()) {
				System.out.println("Bidder Available");
				return 1;
			} else {
				System.out.println("Bidder NOt Available");
				return 0;
				// throw new EntityNotFoundException("Bidder with id " + bid + " not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public void getBidderName(Long bid) {
		BidderService bidderService = new BidderService();
		System.out.println(bidderService.getBidderNameSpam(bid));
	}

	public int checkBidderLogin(Long bid, String pass) {
		Optional<Bidder> bidder = bidderRespository.findById(bid);

		// bidder = bidderRespository.findById(bid);
		try {
			if (bidder.isPresent()) {
				Bidder bidderobj = bidder.get();
				String bidderPass = bidderobj.getBpass();

				if (bidderPass.equals(pass)) {
					System.out.println("Bidder Available");
					return 1;
				} else {
					System.out.println("Wrong Password");

					return 0;
				}
			} else {
				System.out.println("Bidder Not Available");
				return 0;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
