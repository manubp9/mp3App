import java.util.ArrayList;

/**
 * Clona el repositorio music-organizer-v1 de mi página de GitHub en un directorio llamado 0039.
¿Cuántos commits tiene el repositorio de tu carpeta 0039 ahora mismo?
1---Añade un método llamado checkIndex a la clase MusicOrganizer. 
    Este método toma un parámetro entero y comprueba que sea un índice válido para el atributo files.
    Si el parámetro no es válido debe mostrar un mensaje de error por pantalla e indicar el rango válido. 
    Si el parámetro es válido, no debe mostrar nada. El método no devuelve nada.
    Testea el método mediante la interfaz de BlueJ creando un objeto de la clase MusicOrganizer.
    En el momento en que hayas testeado que funciona siempre correctamente, 
    haz un commit llamado "?Añadida capacidad del organizador de comprobar indices?".
2---Añade un método llamado validIndex que devuelva un valor booleano en función de si su parámetro entero
    es un índice válido o no para el atributo files. Este método no muestra nada por pantalla en ningún caso.
    Testea el método añadido a través de la interfaz de BlueJ creando un objeto de la clase MusicOrganizer.
3---Reescribe los métodos listFile y removeFile de la clase MusicOrganizer para que usen el método validIndex 
    en vez de la condición booleana actual.
    Testea los cambios creando un objeto de la clase MusicOrganizer.
    En el momento en que hayas testeado que funciona siempre correctamente, 
    haz un commit llamado "Métodos listFile y removeFile reescritos para evitar redundancia?".
4---Crea una clase Test que nos permita probar los métodos checkIndex, validIndex, listFile y removeFile
    sin tener que usar la interfaz de BlueJ. 
 * @author David J. Barnes and Michael KÃ¶lling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
    }

    /**
     *Añade un método llamado validIndex que devuelva un valor booleano en función de si su parámetro entero
     *es un índice válido o no para el atributo files. Este método no muestra nada por pantalla en ningún caso.
     */
    public boolean validIndex(int index)
    {
        return (index>= 0 && index < files.size());
    }


    /**
     * comprueba que sea un indice valido para el atributo files.si el parametro no es valido muestra error.
     * Si es valido ni muestra ni devuelve nada
     */
    public void checkIndex(int index)
    {
        if ((index<0 || index>= files.size()))
        {
            System.out.println ("El indice no esta entre los valores correctos");
        }
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * Reescribe listFile  de la clase MusicOrganizer para que usen el método validIndex 
     * en vez de la condición booleana actual.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) 
        {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }

    /**
     * Remove a file from the collection.
     * -Reescribe removeFile de la clase MusicOrganizer para que use el método validIndex 
     * en vez de la condición booleana actual.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if( validIndex(index))
        {
            files.remove(index);
        }
    }
}

