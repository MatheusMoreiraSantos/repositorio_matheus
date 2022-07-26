package desenv.ti.conceitosmor.utils_app;

public class UtilsApp {
    private static final String TAG = "UtilsApp";
    private static UtilsApp.DataBaseCrudOperations dataBaseCrudOperations;

    public enum DataBaseCrudOperations{
        CREATE,
        READ,
        UPDATE,
        DELETE,
        NONE
    }

}
