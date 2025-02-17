# Validación de DNI en Java

Este es un proyecto desarrollado en Java que permite la validación de un DNI a través de un sistema cliente-servidor. El cliente introduce un DNI, lo envía al servidor y este verifica si es válido o no.

## 📌 Características
- Implementación en Java con `Socket` para la comunicación cliente-servidor.
- Verificación de la validez del DNI en el servidor.
- Respuesta automática al cliente indicando si el DNI es válido o no.

## 🚀 Tecnologías Utilizadas
- Java
- Sockets para comunicación en red

## 📂 Estructura del Proyecto
```
📦 ValidacionDNI
┣ 📜 DniClient.java          # Lógica del cliente
┣ 📜 DniServer.java          # Lógica del servidor
┣ 📜 DniClientHandler.java   # Manejador de clientes
┣ 📜 DniValidator.java       # Clase para validar el DNI
```

## 🔧 Instalación y Uso
### 1️⃣ Clonar el repositorio
```bash
git clone https://github.com/tu-usuario/validacion-dni.git
cd validacion-dni
```

### 2️⃣ Compilar el código
```bash
javac DniServer.java DniClient.java DniClientHandler.java DniValidator.java
```

### 3️⃣ Iniciar el servidor
```bash
java DniServer <puerto>
```
Ejemplo:
```bash
java DniServer 5000
```

### 4️⃣ Iniciar el cliente
```bash
java DniClient <servidor> <puerto>
```
Ejemplo:
```bash
java DniClient localhost 5000
```

## 📜 Funcionamiento
1. El servidor inicia en el puerto especificado y espera conexiones de clientes.
2. El cliente se conecta al servidor e ingresa un DNI.
3. El servidor recibe el DNI y lo valida utilizando la clase `DniValidator`.
4. El servidor responde al cliente si el DNI es válido o no.
5. El cliente muestra la respuesta del servidor en la consola.

✨ _Desarrollado por [Tu Nombre](https://github.com/tu-usuario)_ ✨

