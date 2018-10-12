package entity.domain.util;

public class Helper {

    public static final String APPLICATION_PATH = "C:\\Users\\sawad\\Documents\\NetBeansProjects\\ShifaaApp\\web\\resources\\images\\";
    public static final String APP_INTERNAL_PATH = "../resources/images/";

    public static String getAbsPath(String category) {
        String absolutePath = APPLICATION_PATH + category + "\\";
        return absolutePath;
    }

    public static String getAppPath(String category) {
        String appPath = APP_INTERNAL_PATH + category + "/";
        return appPath;
    }

}
