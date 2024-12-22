# Leitura e Navegação de Arquivo JSON

## 📚 Curso Estrutura de Dados e Algoritmos - DevSuperior

## Objetivo
O objetivo deste projeto é demonstrar como ler um arquivo JSON em modo texto e navegar pelos seus objetos. A implementação é fornecida em Java.

## Java

#### Adicionar dependência do Lombok

```Lombok``` é uma biblioteca que ajuda a reduzir o código ```boilerplate``` em Java, como getters, setters, construtores, etc.

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <optional>true</optional>
</dependency>
```

#### Adicionar dependência do Jackson ao projeto

```Jackson``` é uma biblioteca para serialização e desserialização de objetos Java para JSON e vice-versa.

```xml
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.13.0</version>
</dependency>
```

####  Lidar com campo do tipo timestamp

A lib do ```Jackson``` não está configurado para lidar com tipos de data/hora do Java 8 (java.time.Instant) por padrão, para corrigir, seguir os passos abaixo:

- Adicionar o módulo **jackson-datatype-jsr310** ao seu projeto.

    ```xml
    <dependency>
        <groupId>com.fasterxml.jackson.datatype</groupId>
        <artifactId>jackson-datatype-jsr310</artifactId>
        <version>2.13.0</version>
    </dependency>
    ```
- Configurar o **ObjectMapper** para registrar o módulo.

    ```java
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        
        objectMapper.registerModule(new JavaTimeModule());
        ...
    }
    ```

#### *Deserialize* um array JSON para um objeto

Você pode fazer isso usando o método readValue com a classe TypeReference

Utilizar o método **readValue** com a classe **TypeReference**, conforme exemplo abaixo:

```java
List<Course> courses = objectMapper.readValue(jsonFile, new TypeReference<List<Course>>() {});
```

## Clonar o Repositório

1. Para clonar este repositório, siga os passos abaixo:

   * Abra o terminal ou prompt de comando.
   * Navegue até o diretório onde você deseja clonar o repositório.
   * Execute o comando abaixo para clonar o repositório do GitHub:

```sh
git clone https://github.com/leidyAguiar/leitura-arquivo-json.git
```

2. Entre no Diretório do Projeto, use no terminal o comando abaixo:

```sh
cd leitura-arquivo-json
```