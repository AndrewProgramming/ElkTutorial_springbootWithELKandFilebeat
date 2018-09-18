//For more tutorial please visit
// www.andrew-programming.com
package com.test.springbootwithelk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootWithElkApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootWithElkApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Logger logger = LoggerFactory.getLogger(SpringbootWithElkApplication.class);
    logger.info("测试log");

    for (int i = 100; i < 110; i++) {
      logger.error("Andrew Deng is coming " + i);
    }
  }
}
