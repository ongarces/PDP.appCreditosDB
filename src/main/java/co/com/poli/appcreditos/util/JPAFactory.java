package co.com.poli.appcreditos.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author cgaop
 */
public class JPAFactory {

    private static final String UP = "PU_credito";

    private static final EntityManagerFactory FACTORY;

    static {
        FACTORY = Persistence.createEntityManagerFactory(UP);
    }

    public static EntityManagerFactory getFACTORY() {
        return FACTORY;
    }
}
