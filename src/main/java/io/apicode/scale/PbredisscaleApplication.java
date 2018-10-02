package io.apicode.scale;

import java.net.UnknownHostException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import redis.clients.jedis.Jedis;

@SpringBootApplication
@EnableAspectJAutoProxy
public class PbredisscaleApplication {

  public static void main(String[] args) {
    SpringApplication.run(PbredisscaleApplication.class, args);
  }

  @Bean
  ProtobufHttpMessageConverter protobufHttpMessageConverter() {
    return new ProtobufHttpMessageConverter();
  }

  @Bean
  public Jedis jedisConnection() throws UnknownHostException {
    Jedis jedis = new Jedis("127.0.0.1", 6379);
    return jedis;
  }
}
