import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class App {
    /**
     * vamos a convertir un gson a ArrayList
     * @param args
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario("carlos@gmail.com","root", new ArrayList<Nombre>());
        /**
         * Crear un usuario
         * con GsonBuilder podemos hacer que salga mas ordenado por consola.
         */
        String JSON = new GsonBuilder().setPrettyPrinting().create().toJson(usuario);
        System.out.println(JSON);
        Usuario usuarioFromJSON = new Gson().fromJson(JSON, Usuario.class);
        System.out.println("USUARIO " +usuarioFromJSON.getEmail());
        /**
         * Creamos una lista de usuarios y la convertimos a Json. de la misma manera.
         */
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        List<Nombre> nombres = new ArrayList<Nombre>();
        nombres.add(new Nombre("Pepe",120.20));
        nombres.add(new Nombre("fra",200.20));
        nombres.add(new Nombre("Pedro", 100.20));
        listaUsuarios.add(new Usuario("email1" ,"1231",nombres));
        listaUsuarios.add(new Usuario("email1" ,"1232",nombres));
        listaUsuarios.add(new Usuario("email1" ,"1233",nombres));
        listaUsuarios.add(new Usuario("email1" ,"1235",nombres));
        listaUsuarios.add(new Usuario("email1" ,"1236",nombres));
        listaUsuarios.add(new Usuario("email1" ,"1237",nombres));

        String listaJSON = new GsonBuilder().setPrettyPrinting().create().toJson(listaUsuarios);
        System.out.println(listaJSON);
        /**
         * Generamos una lista de usuarios y inicializamos Gson().fromJson( le  pasamos por parametros la lista
         * y como segundo parametro creamos un objeto de tipo TypeToken.
         */
        List<Usuario> listaFronJSON = new Gson().fromJson(listaJSON, new TypeToken<ArrayList<Usuario>>(){}.getType());
        System.out.println(listaFronJSON.get(0).getEmail());



    }
}
