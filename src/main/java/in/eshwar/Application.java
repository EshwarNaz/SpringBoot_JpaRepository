package in.eshwar;

import java.util.List;

import javax.transaction.Synchronization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

import ch.qos.logback.classic.net.SyslogAppender;
import in.eshwar.entity.Player;
import in.eshwar.repository.PlayerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		PlayerRepository repo = ctxt.getBean(PlayerRepository.class);
		/*
		 * Player p = new Player(07, "MsDhoni", "CSK"); Player p1 = new Player(18,
		 * "Virat", "RCB"); Player p2 = new Player(33, "Hardik", "GT"); Player p3 = new
		 * Player(43, "Surya", "MI"); Player p4 = new Player(99, "Bumrah", "MI");
		 * 
		 * repo.saveAll(Arrays.asList(p, p1, p2, p3, p4));
		 */

		/*
		 * List<Player> players = repo.findAll(); for (Player player : players) {
		 * System.out.println(player); }
		 */

		/*
		 * Sort s = Sort.by("pteam").descending(); List<Player> findAll =
		 * repo.findAll(s); for (Player player : findAll) { System.out.println(player);
		 * }
		 */
		/*
		 * int page = 1; PageRequest page1 = PageRequest.of(page - 1, 3); Page<Player>
		 * findAll = repo.findAll(page1); List<Player> content = findAll.getContent();
		 * for (Player player : content) { System.out.println(player); }
		 */

		/*
		 * Player p = new Player(); p.setPid(18); p.setPname("virat"); Example<Player>
		 * exmp = Example.of(p); List<Player> findAll = repo.findAll(exmp); for (Player
		 * player : findAll) { System.out.println(player); }
		 */

		//repo.updatePlayerName("Surya", 43);

		//repo.DeletePlayer(43);
		
		repo.insertPlayer(360, "ABD", "RCB");
	}

}
