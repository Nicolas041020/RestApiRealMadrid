package Soccer.Players;



import Soccer.Players.PlayerRepository;
import Soccer.Players.Player;
import java.time.LocalDate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PlayersApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlayersApplication.class, args);
    }
    
//    @Bean
//    public CommandLineRunner commandLineRunner(PlayerRepository rep) {
//        return args -> {
//        var player = Player.builder().name("J.Bellingham").age(21).country("England").team("Real Madrid").debutYear(2020).birthDate("29-06-2003").height(186).weight(75).position("MC").build();
//        rep.save(player);
//        };
//    }

}
