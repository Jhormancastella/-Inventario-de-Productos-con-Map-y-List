# Taller de Java  

## 🚀 Ejercicio #3: Inventario de Productos con Map y List  

---

## 📌 Propósito  

Este programa en Java permite gestionar un inventario de productos organizados por categorías. Utiliza una estructura de datos `Map<String, List<String>>` para almacenar categorías y sus respectivos productos. El programa permite:  

1. Registrar categorías y productos.  
2. Mostrar todos los productos de una categoría específica.  
3. Agregar nuevos productos a categorías existentes.  
4. Mostrar la lista completa de categorías y productos.  

El proyecto utiliza conceptos básicos de programación en Java, como colecciones (`Map` y `List`), entrada/salida por consola y manipulación de datos.  

---

## 🚀 Instalación y Configuración  

### Requisitos Previos  

- Java Development Kit (JDK) 17 o superior  
- Git instalado en tu sistema  

### Clonar Repositorio  

```bash  
git clone https://github.com/Jhormancastella/-Inventario-de-Productos-con-Map-y-List.git
```  

### Compilar y Ejecutar  

1. Abre una terminal en la carpeta del proyecto.  
2. Compila el archivo Java:  

   ```bash  
   javac InventarioProductos.java  
   ```  

3. Ejecuta el programa:  

   ```bash  
   java InventarioProductos  
   ```  

---

## 🛠️ Uso  

1. **Registro de Categorías y Productos**:  
   - El programa solicitará al usuario la cantidad de categorías que desea registrar.  
   - Para cada categoría, se pedirán los nombres de los productos, que se almacenarán en un `Map<String, List<String>>`.  

2. **Mostrar Productos de una Categoría Específica**:  
   - El usuario podrá seleccionar una categoría para ver todos los productos asociados a ella.  

3. **Agregar Productos a una Categoría Existente**:  
   - El programa permitirá agregar nuevos productos a una categoría ya registrada.  

4. **Mostrar Lista Completa de Categorías y Productos**:  
   - Se mostrará toda la información del inventario, incluyendo todas las categorías y sus productos.  

### Ejemplo de Ejecución  

```bash  
¿Cuántas categorías desea registrar? 2  
Ingrese el nombre de la categoría #1: Frutas  
¿Cuántos productos desea agregar a la categoría 'Frutas'? 3  
Ingrese el producto #1: Manzana  
Ingrese el producto #2: Plátano  
Ingrese el producto #3: Naranja  

Ingrese el nombre de la categoría #2: Verduras  
¿Cuántos productos desea agregar a la categoría 'Verduras'? 2  
Ingrese el producto #1: Zanahoria  
Ingrese el producto #2: Lechuga  

--- Lista Completa de Categorías y Productos ---  
Frutas: [Manzana, Plátano, Naranja]  
Verduras: [Zanahoria, Lechuga]  

¿Desea ver los productos de una categoría específica? (si/no): si  
Ingrese el nombre de la categoría: Frutas  
Productos en la categoría 'Frutas':  
- Manzana  
- Plátano  
- Naranja  

¿Desea agregar un nuevo producto a una categoría existente? (si/no): si  
Ingrese el nombre de la categoría: Verduras  
Ingrese el nuevo producto: Espinaca  
✅ Producto 'Espinaca' agregado a la categoría 'Verduras'.  

--- Lista Completa Actualizada ---  
Frutas: [Manzana, Plátano, Naranja]  
Verduras: [Zanahoria, Lechuga, Espinaca]  
```  

---

## 📋 Características  

- Registro de categorías y productos utilizando `Map<String, List<String>>`.  
- Mostrar todos los productos de una categoría específica.  
- Agregar nuevos productos a categorías existentes.  
- Mostrar la lista completa de categorías y productos.  

---

## 🚨 Estado del Ejercicio  

- Culminado.  

---

## 👤 Autor  

Jhorman Jesús Castellanos Morales  
