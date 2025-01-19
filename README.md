# 🌍 Conversor de Monedas

¡Bienvenidos al **Conversor de Monedas**! 🤑 Este es un proyecto en Java que te permitirá convertir monedas de manera sencilla y rápida. Si alguna vez te preguntaste cuántos pesos colombianos obtienes por tus dólares o euros, este programa es para ti. Además, incluye una opción personalizada para convertir cualquier par de divisas que necesites.

---

## 🚀 Funcionalidades

¿Y qué hace exactamente este programa?

1. 💵 **Convertir USD a COP:**  
   Ingresa cuántos dólares tienes y te diremos cuántos pesos colombianos obtendrás.
2. 💶 **Convertir EUR a COP:**  
   Lo mismo, pero con euros.
3. 🌟 **Opción Personalizada:**  
   Elige la moneda base y la moneda destino, ingresa la cantidad, ¡y listo! Convierte cualquier cosa: USD-EUR, EUR-GBP, ¡lo que quieras!
4. 🚪 **Salir:**  
   Porque todos necesitamos descansar en algún momento.

---

## 🛠️ Instalación y Uso

### Requisitos Previos
- Java 8 o superior.
- Una conexión a internet para obtener las tasas de cambio.

### Instalación
1. Clona este repositorio:
   ```bash
   git clone https://github.com/tuusuario/conversor-de-monedas.git

2. Ve al directorio del proyecto:
   ```bash
    cd conversor-de-monedas

3. Compila el programa:
    ```bash
   javac -d bin -sourcepath src src/main/Main.java

4. Ejecuta el programa:
    ```bash
   java -cp bin main.Main

---
## 📋 ¿Cómo Usarlo?

Cuando ejecutes el programa, verás un menú como este:
    
    ********************************
    Hola soy el Conversor de Monedas

    1) United States Dollar a Pesos Colombianos
    2) Euro a Pesos Colombianos
    3) Personaliza que monedas deseas convertir (Ejemplo: USD-COP)
    4) Salir

    *************************************

1. Elige una opción: Escribe el número correspondiente (1, 2, 3 o 4).
2. Sigue las instrucciones: 
    * Ingresa la cantidad de dinero.
    * Si seleccionas la opción personalizada, escribe también las monedas base y destino.
3. Obtén el resultado: El programa hará la magia y te mostrará el monto convertido. 🎉
---
## 🧪 Ejemplos de Uso

Ejemplo 1: Convertir USD a COP
* Entrada: 100 USD
* Salida: La conversión de 100 USD es: 400,000 COP
* 
Ejemplo 2: Conversión Personalizada (EUR a USD)
* Entrada:

  * Moneda base: EUR
  * Moneda destino: USD
  * Cantidad: 50

* Salida: La conversión de 50 EUR es: 54 USD
  
---
## 🐛 ¿Errores Comunes? Aquí las Soluciones
  Error: Malformed JSON

Esto puede ocurrir si la API de conversión no está disponible o devuelve un JSON con errores. Verifica tu conexión a internet o intenta más tarde.
Problemas con Entradas Vacías:

Si el programa parece "saltarse" entradas, probablemente necesitas limpiar el buffer con sc.nextLine() después de usar sc.nextDouble().

## 🌟 ¿Por Qué Es Útil Este Proyecto?

Este programa no solo es útil para conversiones rápidas, sino que también es una gran introducción al consumo de APIs y al manejo de datos dinámicos en Java. Además, te ayuda a practicar conceptos clave de programación que son esenciales para cualquier desarrollador.

---
## ✨ Contribuciones

¡Este proyecto está abierto a mejoras! Si tienes ideas geniales, encuentras un error o simplemente quieres contribuir, no dudes en abrir un issue o enviar un pull request.

---
## 📄 Licencia
Este proyecto está bajo la licencia MIT License.
