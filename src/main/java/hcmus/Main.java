package hcmus;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hcmus.service.UserService;

@SpringBootApplication
@RequiredArgsConstructor
public class Main implements CommandLineRunner {

  final UserService userService;

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

  @Bean
  public ModelMapper modelMapper() {
    return new ModelMapper();
  }

  @Override
  public void run(String... params) throws Exception {
  }

}
