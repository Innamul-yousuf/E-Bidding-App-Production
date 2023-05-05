package com.example.demo;



import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import Admin.AdminRespository;
import Bidder.BidderService;
import Product.ProductDAO;
import Product.ProductRespository;
import Product.ProductService;
import ProductDetails.ProductDetails;
import ProductDetails.ProductDetailsRespository;


@SpringBootApplication(scanBasePackages={
"Product","Seller","Bidder","Admin","ProductDetails"})
public class EbidspringApplicationMain {
	//public static ConfigurableApplicationContext proc;
	public static ProductService pso;
	public static ProductDAO pDAO;
	public static ProductRespository prso;
	public static AdminRespository ars;
	public static ProductDetailsRespository pdr;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext pro=
		SpringApplication.run(EbidspringApplicationMain.class, args);
		ProductService ps=(ProductService) pro.getBean("productService");
		pso=ps;
		ProductDAO productDAO=(ProductDAO) pro.getBean("productDAO");
		pDAO=productDAO;
		ProductRespository productRespository=(ProductRespository) pro.getBean("productRespository");
		prso=productRespository;
		AdminRespository adminRespository=(AdminRespository) pro.getBean("adminRespository");
		ars=adminRespository;
		ProductDetailsRespository productDetailsRespository=(ProductDetailsRespository) pro.getBean("productDetailsRespository");
		pdr=productDetailsRespository;
		//SpringApplication.run(Admin.EbidspringApplication.class, "--server.port=8085");

		//SpringApplication.run(Bidder.EbidspringApplication.class, "--server.port=8081");
		//SpringApplication.run(Seller.EbidspringApplication.class, "--server.port=8082");
		//SpringApplication.run(EbidspringApplication.class, "--server.port=8083");
		//SpringApplication.run(SellerProduct.EbidspringApplication.class, "--server.port=8084");
	}
//public ConfigurableApplicationContext getProMain(String[] args) {
//	ConfigurableApplicationContext pro=
//			SpringApplication.run(EbidspringApplication.class,args);
//	return pro;
//}
}
