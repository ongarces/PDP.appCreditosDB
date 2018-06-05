package co.com.poli.appcreditos.data;

import co.com.poli.appcreditos.model.Credito;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cgaop
 */
public class CreditoData {
    
    private static List<Credito> listaCreditos;
    
    static{
        listaCreditos = new ArrayList<Credito>(){
            {
                add(new Credito("1212", "1234", "Catalina", 2000, "independiente", "vivienda", "SI"));
                add(new Credito("1515", "4567", "Cristian", 500, "dependiente", "estudio", "NO"));
                add(new Credito("1616", "7890", "Luisa", 3000, "independiente", "inversion", "NO"));
                add(new Credito("1313", "1209", "Miguel", 1550, "dependiente", "vivienda", "SI"));
                
            }            
        };
    }//fin static

    public static List<Credito> getListaCreditos() {
        return listaCreditos;
    }

    public static void setListaCreditos(List<Credito> aListaCreditos) {
        listaCreditos = aListaCreditos;
    }
    
}
