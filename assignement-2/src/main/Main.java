package main;

import java.util.Arrays;
import java.util.Scanner;

import model.FilePath;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("===== Analysis Path Program =====");
    System.out.println("Please input Path:");
    String path = scan.nextLine();
    FilePath file = new FilePath();
    file.setPath(path);

    scan.close();

    System.out.println("Disk: " + file.getDisk());
    System.out.println("Extension: " + file.getExtension());
    System.out.println("File Name: " + file.getFileName());
    System.out.println("Path: " + file.getPath());
    System.out.println("Folders: " + Arrays.toString(file.getFolders()));
  }

}
