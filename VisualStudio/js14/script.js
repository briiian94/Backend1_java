// Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor,
// Número de páginas. Crear un método para cargar un libro pidiendo los datos al usuario
// y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
// numero de páginas.

var libro = {};


function cargarLibro() {
    var datos = {};

    datos.isbn = prompt("Ingrese el ISBN del libro a cargar");
    datos.titulo  = prompt("Ingrese el Titulo");
    datos.autor = prompt("Ingrese el autor");
    datos.cantPag = prompt("Ingrese la cantidad de paginas");

    return datos;
   
}

var datosDelLibro = cargarLibro();

libro = datosDelLibro;
var mostrar = mostrarDatos(libro);

function mostrarDatos(libro){
document.write("Datos del Libro:" + "<br>");
document.write("<strong>ISBN: </strong>"+ libro.isbn + "<br>");
document.write("<strong>Título: </strong>" + libro.titulo + "<br>");
document.write("<strong>Autor: </strong>" + libro.autor + "<br>");
document.write("<strong>Cantidad de Páginas: </strong>" + libro.cantPag + "<br>");

}






