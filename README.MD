# BayronCoin

![Java](https://img.shields.io/badge/Java-17-blue?logo=java)
![Maven](https://img.shields.io/badge/Maven-4.0.0-red?logo=apache-maven)
![License](https://img.shields.io/badge/License-MIT-yellow.svg)

Conversor de moneda interactivo para la consola, desarrollado como parte del Challenge de Conversor de Moneda de Alura Latam. Esta aplicación permite a los usuarios convertir valores entre 10 de las principales divisas del mundo, obteniendo tasas de cambio en tiempo real a través de la API de ExchangeRate-API.


## Características Principales

-   **Conversión Flexible:** Convierte cualquier cantidad entre un numero de monedas seleccionadas por el usuario.

-   **Tasas de Cambio Reales:** Utiliza una API externa para obtener datos actualizados al momento de la consulta.

-   **Menú Dinámico:** Permite elegir entre 10 monedas populares, incluyendo:
    -   ARS (Peso argentino)
    -   BRL (Real brasileño)
    -   CLP (Peso chileno)
    -   CNY (Yuan chino)
    -   COP (Peso colombiano)
    -   EUR (Euro)
    -   GBP (Libra Esterlina)
    -   JPY (Yen Japonés)
    -   MXN (Peso mexicano)
    -   USD (Dólar estadounidense)

-   **Interfaz de Consola Amigable:** Guía al usuario a través del proceso de conversión de forma clara y sencilla.

## Tecnologías Utilizadas

-   **Lenguaje:** Java 17
-   **Gestor de Dependencias:** Maven
-   **Librerías:**
    -   `Gson 2.10.1`: Para parsear (convertir) las respuestas JSON de la API a objetos Java.
    -   `Java 11+ HTTP Client`: Cliente HTTP nativo de Java para realizar las peticiones a la API de forma moderna y eficiente.
-   **API Externa:** [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener las tasas de cambio.

## Cómo Ejecutar el Proyecto

1.  **Descarga el repositorio** en tu máquina local.

2.  **Abre el proyecto** desde IntelliJ IDEA. Maven se encargará de descargar las dependencias automáticamente.

3.  **Ejecuta la aplicación:**
    -   Busca la clase `Principal.java`.
    -   Ejecuta el método `main()` para iniciar el programa en la consola.


## Autor
Desarrollado por **Bayron Llanos**.

## Licencia.
Uso libre con fines educativos.


