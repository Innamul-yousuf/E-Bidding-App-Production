package ProductDetails;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import com.example.demo.EbidspringApplicationMain;

import Product.ProductDAO;

@Service
public class ProductDetailsService {
	
	@Autowired
	private ProductDetailsRespository productDetailsRespository=EbidspringApplicationMain.pdr;
	
	@Autowired
	public ProductServiceDAO productDAO = com.example.demo.EbidspringApplicationMain.psdao;

	
	public ProductDetails createProductDetails(ProductDetails details) {
		return productDetailsRespository.save(details);
	}
	public ProductDetails updateProductDetails(ProductDetails details) {
		return productDetailsRespository.save(details);
	}
	public void deleteProductDetails(Long id) {
		productDetailsRespository.deleteById(id);
	}
	public List<ProductDetails> getAllProductDetails(){
		return productDetailsRespository.findAll();
	}
	public ProductDetails getProductDetailsById(Long id){
		return productDetailsRespository.findById(id).get();
	}
	public void changeSoldAsTime(Long pid) {
		int timer=300;
		while(timer!=0) {
			ProductDetailsService pds=new ProductDetailsService();
			ProductDetails ps= pds.getProductDetailsById(pid);
			int flag=ps.getFlag();
			if(flag==1) {
				productDAO.updateSold(timer, pid);	
				timer--;
			}else {
				break;
			}
			
		}
	}
}























































//	@CacheEvict(value = "productDetails", key = "#pid")
//	public void changeSoldAsTime(Long pid) {
//		
//		
//		//ExecutorService es=Executors.newFixedThreadPool(1);
////		int sec=300;
////		CountDownLatch latch = new CountDownLatch(sec);
////
////		while(sec!=0) {
////
////		es.execute(()->{
////			try {
////				Thread.sleep(2000);
////	            latch.countDown();
////
////			}catch(Exception e) {
////				e.printStackTrace();
////			}
////		});
////		sec=sec-1;
////
////		}
////
////		try {
////			latch.await();
////		} catch (InterruptedException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////		productDAO.updateSold(sec,pid);
//
////		int initialSold = 300;
////
////		ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
////		
////		scheduler.scheduleAtFixedRate(() -> {
////		    // Decrement the sold value
////		    initialSold--;
////
////		    // Update the product in the database
////		    productDAO.updateSold(initialSold, pid);
////
////		    // Check if the sold value has reached 0, and if so, cancel the scheduler
////		    if (initialSold == 0) {
////		        scheduler.shutdown();
////		    }
////		}, 0, 1, TimeUnit.SECONDS);
////		
////	}
//
//    	
////		int initialSold = 300;
////		ProductDetailsService pds=new ProductDetailsService();
////
////		ProductDetails pd= pds.getProductDetailsById(pid);
////		int sold = pd.getSold();
////		int flag=pd.getFlag();
////		while (sold > 0 && flag == 1) {
////			System.out.println(pds.getProductDetailsById(pid).getFlag());
////		    try {
////		    
////				
////				
////		    	Thread.sleep(1000); // sleep for 1 second
////		        sold--; // decrement the new variable
////		        productDAO.updateSold(sold, pid);
////								// update the database with the new value
////		    } catch (InterruptedException e) {
////		        e.printStackTrace();
////		    }
////		    ProductDetailsService pds2=new ProductDetailsService();
////
////			ProductDetails pd2= pds.getProductDetailsById(pid);
////		    flag=pd2.getFlag();
////		    System.out.println(flag);
////		    }
////		}
////		int initialSold = 300;
////	
//		int sold = 300;
//		while (sold > 0) {
//			for(int i=0;i<=1;i++) {
//				ProductDetailsService pds=new ProductDetailsService();
//
//				ProductDetails pd= pds.getProductDetailsById(pid);
//				int flag=pd.getFlag();
//	if(flag==1) {
//			    System.out.println(pds.getProductDetailsById(pid).getFlag());
//			    System.out.println("Flag value before sleep: " + flag);
//
//			    try {
//			        Thread.sleep(1000); // sleep for 1 second
//			        sold--; // decrement the new variable
//			        productDAO.updateSold(sold, pid); // update the database with the new value
//			    } catch (InterruptedException e) {
//			        e.printStackTrace();
//			    }
//			}
//			
//}
//		    ProductDetailsService pds2=new ProductDetailsService();
//		    ProductDetails pd2= pds2.getProductDetailsById(pid); // Retrieve the latest ProductDetails object from the database
//
//		}
//		
////		ProductDetailsService pds=new ProductDetailsService();
////		
////					ProductDetails pd= pds.getProductDetailsById(pid);
////					int flag=pd.getFlag();
////				    System.out.println(pds.getProductDetailsById(pid).getFlag());
//	}
//	}	
	