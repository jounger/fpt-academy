package model;

public class FilePath {

  private String path;

  public String getPath() {
    int index = path.lastIndexOf("\\");
    return path.substring(0, index);
  }

  public String getFileName() {
    int index = path.lastIndexOf("\\");
    return path.substring(index + 1).split("\\.")[0];
  }

  public String getExtension() {
    int index = path.lastIndexOf("\\");
    return path.substring(index + 1).split("\\.")[1];
  }

  public String getDisk() {
    int index = path.indexOf(":");
    return path.substring(0, index + 1);
  }

  public String[] getFolders() {
    int f = path.indexOf("\\");
    int l = path.lastIndexOf("\\");
    return path.substring(f + 1, l - 1).split("\\\\");
  }

  public void setPath(String path) {
    this.path = path;
  }

}
