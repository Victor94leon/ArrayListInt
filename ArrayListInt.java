
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

    /**
     * añade un elemento a la colección en la posición especificada por el parámetro index. 
     * Si el valor de index no es válido, entonces no hace nada. Los elementos a continuación 
     * del añadido se desplazan una posición.
     */
    public void add(int index, int elemento)
    {   
        if (index<array.length) {
            // Se crea un nuevo array con el tamaño del atributo array incrementado
            int[] nuevoArray = new int[array.length + 1];
            // Se crea un contador para recorrer los elementos de los arrays
            int cont = 0;
            // Mientras el ocntador sea menorque el indice se ejecutara un bucle para ir añadiendo nuevos elementos
            while (cont<=index) {
                // Si el contador es igual que el indice se añade el elemento en el indice y se hace un bucle para ir añadiendo
                // los elementos de la antigua lista con el indice incrementado en 1.
                if (cont==index) {
                    nuevoArray[cont] = elemento;
                    cont++;
                    while (cont<nuevoArray.length) {
                        nuevoArray[cont] = array[cont-1];
                        cont++;
                    }
                }
                else {
                    nuevoArray[cont] = array[cont];
                    cont++;
                }
            }
            // Se sustituye el atributo array por nuevoArray
            array = nuevoArray;
        }
    }

    /**
     * Vacia la colección
     */
    public void clear()
    {
        // Se vuelve a inicializar el array con 0 elementos
        array = new int[0];
    }
}
