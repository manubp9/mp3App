
/**
 * 1---Crea una clase Test que nos permita probar los m�todos checkIndex, validIndex, listFile y removeFile
 * sin tener que usar la interfaz de BlueJ. 
 * 
 */
public class Test
{
    /**
     * Constructor for objects of class Test
     */
    public void Test()
    {
        MusicOrganizer mp3App = new MusicOrganizer();//crea un objeto organizador
        
        System.out.println("A�adiendo 4 archivos mp3 a mp3App"); 
        mp3App.addFile("one.mp3"); //a�ade canciones al organizador
        mp3App.addFile("two.mp3");//a�ade canciones al organizador
        mp3App.addFile("three.mp3");//a�ade canciones al organizador
        mp3App.addFile("four.mp3");//a�ade canciones al organizador
        
        System.out.println("comprabando que los indices son correctos");
        mp3App.checkIndex(0);//testea que los valores esten en la lista
        mp3App.checkIndex(1);//testea que los valores esten en la lista
        mp3App.checkIndex(2);//testea que los valores esten en la lista
        mp3App.checkIndex(3);//testea que los valores esten en la lista
        mp3App.checkIndex(4);//testea que el valor no sea correcto en la lista
        
        System.out.println("devuelve los archivos a�adidos a la lista");
        mp3App.listFile(0);//testea que valores estan en la lista
        mp3App.listFile(1);//testea que valores estan en la lista
        mp3App.listFile(2);//testea que valores estan en la lista
        mp3App.listFile(3);//testea que valores estan en la lista
        
        System.out.println("se borra una cancion de la lista");
        mp3App.removeFile(2);//borra la cancion 3�
        System.out.println("La 4� cancion ahora es la 3�");
        mp3App.listFile(2);//muestra el orden de la cancion tras eliminar una que estaba por encima
        
        
        
    }

}
