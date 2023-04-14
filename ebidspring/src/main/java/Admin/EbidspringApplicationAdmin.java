package Admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EbidspringApplicationAdmin {
	public static AdminRespository ars;
	public static void main(String[] args) {
		ConfigurableApplicationContext pro=
		SpringApplication.run(EbidspringApplicationAdmin.class, args);
		AdminRespository adminRespository=(AdminRespository) pro.getBean("adminRespository");
		ars=adminRespository;
	}

}
