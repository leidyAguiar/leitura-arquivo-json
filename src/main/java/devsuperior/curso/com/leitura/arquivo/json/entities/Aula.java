package devsuperior.curso.com.leitura.arquivo.json.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Aula {

    private Long id;
    private String title;
    private String media;
    private Instant timestamp;
}
