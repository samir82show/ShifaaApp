package entity.domain.util;

public class Helper {

    public static String getAbsPath(String appPath, String category) {
        String absolutePath = appPath + category + "\\";
        return absolutePath;
    }
    
    public static String getAppPath(String path, String category) {
        String appPath = path + category + "/";
        return appPath;
    }

}
