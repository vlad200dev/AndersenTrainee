package task_10.travel_agency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import task_10.travel_agency.entities.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan("task_10.travel_agency")
@PropertySource("")
public class SpringConfig {
    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("classpath:jdbc/schema.sql")
                .addScript("classpath:jdbc/test-data.sql").build();
    }

    @Bean
    public Client client(){
        return new Client();
    }

    @Bean
    public Comments comments(){
        return new Comments();
    }

    @Bean
    public Destination destination(){
        return new Destination();
    }

    @Bean
    public Hotel hotel(){
        return new Hotel();
    }

    @Bean
    public Identification identification(){
        return new Identification();
    }

    @Bean
    public Tour tour(){
        return new Tour();
    }

}
