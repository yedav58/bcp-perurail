#language: es
@peru_rail

Característica: Comprar boletos de tren
  Yo como cliente
  Quiero ingresar a la web
  Para comprar un boleto de viaje en tren de manera satisfactoria

  Antecedentes:
    Dado ingreso a la pagina de PeruRail

  @test_boleto_ida
  Esquema del escenario:  [QA][PeruRail] C001 - Comprar un boleto de solo ida
    Cuando realizo busqueda de viaje solo ida
      | destino   | ruta   | tren |
      | <destino> | <ruta> |      |
    Y selecciono tren de ida
      | tren_ida |
      | <tren>   |
    Y completo los datos de los pasajeros
      | nombre | apellido | fec_nac    | nacionalidad | tipo_doc            | numero_doc | sexo   | telefono  | email                | recieve_offers |
      | Yefri  | Quevedo  | 17-03-1984 | Peru         | Identification Card | 42270466   | Male   | 977090368 | yedav58@hotmail.com  | true           |
      | Mery   | Perez    | 19-02-1982 | Peru         | Identification Card | 74847744   | Female | 954484656 | meryperezz@gmail.com | true           |
    Entonces verifico los montos obtenidos

    Ejemplos:
      | destino | ruta                 | tren                  |
      | Cusco   | Machu Picchu > Cusco | Expedition 32 (Poroy) |


  @test_boleto_ida_vuelta
  Esquema del escenario:  [QA][PeruRail] C002 - Comprar un boleto de ida y vuelta
    Cuando realizo busqueda de viaje de ida y vuelta
      | destino   | ruta   | tren |
      | <destino> | <ruta> |      |
    Y selecciono tren de ida y vuelta
      | tren_ida   | tren_vuelta   |
      | <tren_ida> | <tren_vuelta> |
    Y completo los datos de los pasajeros
      | nombre | apellido | fec_nac    | nacionalidad | tipo_doc            | numero_doc | sexo   | telefono  | email                | recieve_offers |
      | Yefri  | Quevedo  | 17-03-1984 | Peru         | Identification Card | 42270466   | Male   | 977090368 | yedav58@hotmail.com  | true           |
      | Mery   | Perez    | 19-02-1982 | Peru         | Identification Card | 74847744   | Female | 954484656 | meryperezz@gmail.com | true           |
    Entonces verifico los montos obtenidos

    Ejemplos:
      | destino | ruta                 | tren_ida              | tren_vuelta   |
      | Cusco   | Machu Picchu > Cusco | Expedition 32 (Poroy) | Expedition 34 |