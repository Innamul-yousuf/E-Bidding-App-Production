package SellerProduct;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Product.ProductRespository;

@Service
public class SellerProductService {

	@Autowired
	private SellerProductRespository sellerProductRespository;

	@Autowired
	public SellerProductDao sellerProductDao;

	public SidPid createSidPid(SidPid product) {
		return sellerProductRespository.save(product);
	}

//	public BidPid updateBidPid(BidderProduct bidderProductId,BidderProduct bidderProduct) {
//		BidPid bp=bidderProductRespository.findById(bidderProduct).orElse(null);
//		bp.setBid_amt(bidderProductId.getBid_amt());
//		bp.setBname(bidderProductId.getBname());
//		bp.setFlag(bidderProductId.getFlag());
//		bp.setPname(bidderProductId.getPname());
//		return bidderProductRespository.save(bidderProduct);
//	}
	public SidPid updateSellerProduct(SellerProduct bidderProductId, SidPid bidderProductDetails) {
		SidPid bidderProduct = sellerProductRespository.findById(bidderProductId).orElse(null);

		bidderProduct.setSid_amt(bidderProductDetails.getSid_amt());
		bidderProduct.setPname(bidderProductDetails.getPname());
		bidderProduct.setSname(bidderProductDetails.getSname());
		bidderProduct.setFlag(bidderProductDetails.getFlag());

		return sellerProductRespository.save(bidderProduct);
	}

	public void deleteSidPid(SellerProduct bidderProduct) {
		sellerProductRespository.deleteById(bidderProduct);
	}

	public List<SidPid> getAllSidPids() {
		return sellerProductRespository.findAll();
	}

	public SidPid getSidPidById(SellerProduct bp) {
		return sellerProductRespository.findById(bp).orElse(null);
	}

	public void updateSellerProductPrice(Long bidderId, Long productId, Long price) {
		SellerProduct sellerProduct = new SellerProduct(bidderId, bidderId);
		sellerProductDao.updateBidderProductPrice(bidderId, productId, price);
	}
}
