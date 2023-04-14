package Bidder;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BidderDAO {
	@Autowired
	public  DataSource dataSource;
	@Autowired
	BidderService bidderService;
	
}
