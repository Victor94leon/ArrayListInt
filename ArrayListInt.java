
public class ArrayListInt
{
    // Array para almacenar números enteros
    private int[] array;

    /**
     * Constructor de objetos de la clase ArrayListInt
     */
    public ArrayListInt()
    {
        array = new int[0];
    }
    
    /**
     * Añade un elemento a la colección al final de la misma
     */
    public void add(int elemento) 
    {
        //Se crea un nuevo array con el tamaño del atributo array incrementado en 1
        int[] nuevoArray = new int[array.length + 1];
        // Se copian los elementos del atributo array en el nuevo array
        for (int cont = 0; cont<array.length; cont++) {
            nuevoArray[cont] = array[cont];
        }
        // Se añade el nuevo elemento al ultimo elemento del nuevoArray
        nuevoArray[nuevoArray.length-1] = elemento;
        // Se sustituye el atributo array por el nuevo
        array = nuevoArray;
    }
}
