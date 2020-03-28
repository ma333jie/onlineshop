package onlineShop.log;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import onlineShop.log.Logger;

@Configuration
public class ApplicationConfig {

    @Bean
    public Logger getLogger() {
        return new ServerLogger();
    }

    @Bean(name= "paymentAction")
    public  PaymentAction getPaymentAction() {
         return new PaymentAction();
    }
}
