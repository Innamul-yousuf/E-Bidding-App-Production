package SellerProduct;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface SellerProductRespository extends JpaRepository<SidPid, SellerProduct> {

//	BidPid save(BidderProduct product);
//
//	 @Modifying
//	    @Query("UPDATE BidderProduct1 e SET e.bid_amt = :bid_amt WHERE e.id = :id")
//	    int updateFieldById(@Param("id")Long id, Long bid_amt);

}

//@Component
//class BidderProductDAO {
// 
//    @Autowired
//    public	 JdbcTemplate jdbcTemplate;
//    @Autowired
//    public BidderProductDAO(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//    public BidderProductDAO() {
//		// TODO Auto-generated constructor stub
//	}
//    
//    public void updateBidderProductPrice(Long bidderId, Long productId,Long bid_amt) {
//        String sql = "UPDATE bidder_product SET bid_amt = ? WHERE bidder_id = ? AND product_id = ?";
//        int count = jdbcTemplate.update(sql, bid_amt, bidderId, productId);
//        if (count == 1) {
//           	// Update successful
//        	System.out.println("Bidding amout updated");
//        } else {
//            // Update failed
//        }
//    }
// 
//}
//class Example {
//    private DataSource dataSource;
//
//    public Example() {
//        BasicDataSource basicDataSource = new BasicDataSource();
//        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        basicDataSource.setUrl("jdbc:mysql://localhost/mydatabase");
//        basicDataSource.setUsername("root");
//        basicDataSource.setPassword("mypassword");
//        this.dataSource = basicDataSource;
//    }
@Component
class SellerProductDao {
	@Autowired
	public final DataSource dataSource;

	public SellerProductDao(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void updateBidderProductPrice(Long sellerId, Long productId, Long price) {
		String sql = "UPDATE seller_product SET sid_amt = ? WHERE sid = ? AND pid = ?";
		try (Connection conn = dataSource.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setLong(1, price);
			ps.setLong(2, sellerId);
			ps.setLong(3, productId);
			int count = ps.executeUpdate();

			if (count == 1) {
				// Update successful
				System.out.println("Bidding amout updated for Seller");

			} else {
				System.out.println("No Seller and product id matching available");
			}
		} catch (SQLException ex) {
			// Handle exception
			ex.printStackTrace();
		}
	}

}