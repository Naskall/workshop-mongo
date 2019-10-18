package br.com.naskall.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.naskall.workshopmongo.domain.User;
import br.com.naskall.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... arg0) throws Exception {
		userRepository.deleteAll();

		User maria = new User(null, "Maria Brown", "maria@email.com");
		User alex = new User(null, "Alex Green", "alex@email.com");
		User bob = new User(null, "Bob Grey", "bob@email.com");
		User sam = new User(null,"Sam Blue","sam@email.com");
		userRepository.saveAll(Arrays.asList(maria,alex,bob,sam));
	}

}
