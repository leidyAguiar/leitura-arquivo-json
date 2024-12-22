package devsuperior.curso.com.leitura.arquivo.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import devsuperior.curso.com.leitura.arquivo.json.entities.Aula;
import devsuperior.curso.com.leitura.arquivo.json.entities.Curso;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		ObjectMapper objectMapper = new ObjectMapper();

		objectMapper.registerModule(new JavaTimeModule());

		try {
			File jsonFile = new File("src/main/resources/file.json");
			List<Curso> courses = objectMapper.readValue(jsonFile, new TypeReference<List<Curso>>() {});

			for (Curso curso : courses) {
				System.out.println("Curso Id: " + curso.getId());
				System.out.println("Curso Title: " + curso.getTitle());

				List<Aula> aulas = curso.getLessons();

				for (Aula aula : aulas) {
					System.out.println();
					System.out.println("	id: " + aula.getId());
					System.out.println("	title: " + aula.getTitle());
					System.out.println("	media: " + aula.getMedia());
					System.out.println("	timestamp: " + aula.getTimestamp());
				}
				System.out.println();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}