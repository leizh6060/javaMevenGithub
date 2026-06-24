/*
package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}
*/
package hello;

import org.joda.time.LocalTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
  private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    logger.info("The current local time is: " + currentTime);
    Greeter greeter = new Greeter();
    logger.info(greeter.sayHello( Lei));
  }
}
