# Exercício de API - Aceleração de Orientação a Objetos com Java

Este projeto é um exercício de API desenvolvido para a aceleração de Orientação a Objetos com Java. Ele consiste em uma API simples que fornece informações sobre feriados em um determinado ano.

## Funcionalidades

A API oferece os seguintes endpoints:

- **GET** `/holidays`: Retorna uma lista de feriados no formato `data => descrição` para o ano de 2024.
- **GET** `/holidays/:date`: Verifica se a data fornecida corresponde a um feriado. Retorna uma mensagem indicando se a data é um feriado ou não.

## Utilização

Para utilizar a API, você pode fazer requisições HTTP para os endpoints listados acima.

### Exemplo de uso:

- Requisição para obter a lista de feriados:
GET /holidays

- Requisição para verificar se uma data é um feriado:
GET /holidays/13-02-2024


### Resposta:

- Para a requisição `GET /holidays`:
```json
[
  "01-01-2024 => Confraternização Mundial",
  "12-02-2024 => Carnaval",
  "13-02-2024 => Carnaval",
  "29-03-2024 => Sexta-feira Santa",
  "21-04-2024 => Tiradentes",
  "01-05-2024 => Dia do Trabalho",
  "30-05-2024 => Corpus Christi",
  "07-09-2024 => Independência do Brasil",
  "12-10-2024 => Nossa Senhora Aparecida",
  "02-11-2024 => Finados",
  "15-11-2024 => Proclamação da República",
  "20-11-2024 => Dia Nacional de Zumbi e da Consciência Negra",
  "25-12-2024 => Natal"
]
  ```

Para a requisição GET /holidays/13-02-2024:
"Dia 13-02-2024 é Carnaval!"

Para a requisição GET /holidays/25-03-2024:
"Dia 25-03-2024 não é feriado."

Contribuindo
Sinta-se à vontade para contribuir com melhorias para este projeto. Basta fazer um fork do repositório, realizar as alterações e enviar um pull request.

Licença
Este projeto está licenciado sob a MIT License.
