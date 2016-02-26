
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

    /**
     * Devuelve true si la colección contiene ese elemento.
     */
    public boolean contains(int elemento)
    {
        // Se crea una variable local booleana para indicar si la lista contiene el elemento
        boolean contieneElemento = false;
        // Se crea un indice para recorrer la lista
        int index = 0; 
        // Se recorrera la lista mientras el indice sea menor que su tamaño y mientras el elemento buscado no sea true
        while (index<array.length && !contieneElemento) {
            if (elemento==array[index]) {
                contieneElemento = true;
            }
            index++;
        }
        return contieneElemento;
    }

    /**
     * Devuelve el elemento existente en la posición indicada. 
     * Si el valor de index no es válido, entonces devuelve -1.
     */
    public int get(int index)
    {
        // Se crea una variable local para guardar el elemento indicado, inicializandolo en -1 por si
        // no el index no es un parámetro válido
        int elementoIndicado = -1;
        // Si index es válido se asigna a la variable local el contenido de dicho elemento
        if (index<array.length) {
            elementoIndicado = array[index];
        }
        return elementoIndicado;
    }

    /**
     * Reemplaza el elemento en la posición index con el valor de element. 
     * Si el índice no es válido, no hace nada.
     */
    public void set(int index,int element)
    {
        // Se comprueba si el index introducido es válido
        if (index<array.length) {
            // Si es válido se asigna en su posición de la lista el parámetro elemento
            array[index] = element;
        }
    }

    /**
     * Devuelve el indice en el que aparece la primera ocurrencia del elemento especificado
     * o -1 en caso de que la colección no contenga el elemento especificado.
     */
    public int indexOf(int elemento)
    {
        // Se crea una variable local booleana para indicar si la lista contiene el elemento
        boolean contieneElemento = false;
        // Se crea un indice para recorrer la lista
        int index = 0; 
        // Se recorrera la lista mientras el indice sea menor que su tamaño y mientras el elemento buscado no sea true
        while (index<array.length && !contieneElemento) { 
            // Si el elemento insertado coincide con alguno de la lista se cambia la variable local booleana a true
            // y se decrementa en uno el indice para evitarerrores al incrementarlo al final del bucle
            if (elemento==array[index]) {
                contieneElemento = true;
                index--;
            }
            index++;
        }
        // Si la lista no contiene el elemento devuelve -1
        if (!contieneElemento) {
            index = -1;
        }
        return index;
    }

    /**
     * Devuelve true si la lista no contiene elementos
     */
    public boolean isEmpty()
    {
        // Se crea una variable local booleana inicializada con true
        boolean listaVacia = true;
        // Secompueba si el número de elementos en la lista es mayor que 0,
        // y si es asi se cambia la variable booleana a false
        if (array.length>0) {
            listaVacia = false;
        }
        return listaVacia;
    }

    /**
     * Devuelve el número de elementos de la colección.
     */
    public int size()
    {
        return array.length;
    }
}
