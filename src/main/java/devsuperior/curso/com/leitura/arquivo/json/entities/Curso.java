package devsuperior.curso.com.leitura.arquivo.json.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Curso {

    private Long id;
    private String title;
    private List<Aula> lessons;
}