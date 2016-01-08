import java.util.ArrayList;

/**
 * Clona el repositorio music-organizer-v1 de mi p�gina de GitHub en un directorio llamado 0039.
�Cu�ntos commits tiene el repositorio de tu carpeta 0039 ahora mismo?
1---A�ade un m�todo llamado checkIndex a la clase MusicOrganizer. 
    Este m�todo toma un par�metro entero y comprueba que sea un �ndice v�lido para el atributo files.
    Si el par�metro no es v�lido debe mostrar un mensaje de error por pantalla e indicar el rango v�lido. 
    Si el par�metro es v�lido, no debe mostrar nada. El m�todo no devuelve nada.
    Testea el m�todo mediante la interfaz de BlueJ creando un objeto de la clase MusicOrganizer.
    En el momento en que hayas testeado que funciona siempre correctamente, 
    haz un commit llamado "?A�adida capacidad del organizador de comprobar indices?".
2---A�ade un m�todo llamado validIndex que devuelva un valor booleano en funci�n de si su par�metro entero
    es un �ndice v�lido o no para el atributo files. Este m�todo no muestra nada por pantalla en ning�n caso.
    Testea el m�todo a�adido a trav�s de la interfaz de BlueJ creando un objeto de la clase MusicOrganizer.
3---Reescribe los m�todos listFile y removeFile de la clase MusicOrganizer para que usen el m�todo validIndex 
    en vez de la condici�n booleana actual.
    Testea los cambios creando un objeto de la clase MusicOrganizer.
    En el momento en que hayas testeado que funciona siempre correctamente, 
    haz un commit llamado "M�todos listFile y removeFile reescritos para evitar redundancia?".
4---Crea una clase Test que nos permita probar los m�todos checkIndex, validIndex, listFile y removeFile
    sin tener que usar la interfaz de BlueJ. 
 * @author David J. Barnes and Michael Kölling
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
     *A�ade un m�todo llamado validIndex que devuelva un valor booleano en funci�n de si su par�metro entero
     *es un �ndice v�lido o no para el atributo files. Este m�todo no muestra nada por pantalla en ning�n caso.
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
     * Reescribe listFile  de la clase MusicOrganizer para que usen el m�todo validIndex 
     * en vez de la condici�n booleana actual.
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
     * -Reescribe removeFile de la clase MusicOrganizer para que use el m�todo validIndex 
     * en vez de la condici�n booleana actual.
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

