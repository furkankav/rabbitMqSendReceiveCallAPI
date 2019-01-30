package com.galvanize.rmq.conf;

import com.galvanize.rmq.receiver.RestaurantReceiver;
import com.galvanize.rmq.sender.RestaurantSender;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConf {

    @Bean
    public Queue restaurant() {
        return new Queue("restaurant");
    }


    @Bean
    public RestaurantSender sender() {
        return new RestaurantSender();
    }

    @Bean
    public RestaurantReceiver receiver() {
        return new RestaurantReceiver();
    }


}
