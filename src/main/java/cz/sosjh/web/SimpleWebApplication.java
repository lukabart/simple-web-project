package cz.sosjh.web;

import cz.sosjh.web.model.BlogEntry;
import cz.sosjh.web.repository.BlogRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class SimpleWebApplication {

    public static void main(String[] args) {
        initRepository();
        SpringApplication.run(SimpleWebApplication.class, args);
    }
    private static void initRepository(){
        BlogRepository.add(new BlogEntry(
                "Title #1",
                "Author #1",
                LocalDateTime.now().minusDays(2),
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
        ));
        BlogRepository.add(new BlogEntry(
                "Title #2",
                "Author #2",
                LocalDateTime.now().minusDays(1),
                "Nam molestie eu nulla vitae eleifend. Praesent tempus sagittis aliquam."
        ));
    }
}
