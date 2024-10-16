import java.io.File;

public class path {
    private String path;

    public path(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void currentPath() {
        File file = new File(path);
        System.out.println(" path: " + file.getAbsolutePath());
    }

    public boolean isDirectory() {
        File file = new File(path);
        return file.isDirectory();
    }   

    public boolean exists() {
        File file = new File(path);
        return file.exists();
    }

    public boolean isFile() {
        File file = new File(path);
        return file.isFile();
    }

    public boolean isHidden() {
        File file = new File(path);
        return file.isHidden();
}
}
