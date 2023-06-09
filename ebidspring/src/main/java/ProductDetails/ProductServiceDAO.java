package ProductDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import Bidder.Bidder;
import Bidder.BidderService;

@Repository
public class ProductServiceDAO {
	@Autowired
	public DataSource dataSource;

//BidderService bidderService=EbidspringApplication.bs;

	public ProductServiceDAO() {
		// TODO Auto-generated constructor stub
	}
	public void updateSold(int i,long pid) {
		String sql = "UPDATE product_details SET sold=? WHERE pid = ?";
		try (Connection conn = dataSource.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, i);
			ps.setLong(2, pid);
			int count = ps.executeUpdate();

			if (count == 1) {
				// Update successful
				System.out.println("Sold updated ");

			} else {
				System.out.println("Product id not matching");
			}
		} catch (SQLException ex) {
			// Handle exception
			ex.printStackTrace();
		}
	}

	public void updateSoldTo300(Long productId) {
		String sql = "UPDATE product_details SET sold=300 WHERE pid = ?";
		try (Connection conn = dataSource.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setLong(1, productId);
			int count = ps.executeUpdate();

			if (count == 1) {
				// Update successful
				System.out.println("Sold updated to 0");

			} else {
				System.out.println("Product id not matching");
			}
		} catch (SQLException ex) {
			// Handle exception
			ex.printStackTrace();
		}
	}

	public void updateProductBidAmt(Long productId, Long pamt) {
		String sql = "UPDATE product SET pcost=? WHERE pid = ?";
		try (Connection conn = dataSource.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setLong(1, pamt);
			ps.setLong(2, productId);
			int count = ps.executeUpdate();

			if (count == 1) {
				// Update successful

				System.out.println("Bid Updated");

			} else {
				System.out.println("Product id not matching");
			}
		} catch (SQLException ex) {
			// Handle exception
			ex.printStackTrace();
		}
	}

	public int updateBidderName(Long productId, String bname) {

		String sql = "UPDATE product SET pbuyer=? WHERE pid = ?";
		try (Connection conn = dataSource.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, bname);
			ps.setLong(2, productId);
			int count = ps.executeUpdate();

			if (count == 1) {
				// Update successful

				System.out.println("Bid Updated");

			} else {
				System.out.println("Product id not matching");
			}
		} catch (SQLException ex) {
			// Handle exception
			ex.printStackTrace();
		}
		return 0;
	}
}
