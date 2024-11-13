package composite;

public class CompositePatternDeno {
    public static void main(String[] args) {
        // Create individual files
        File file1 = new File("Resume.pdf");
        File file2 = new File("Photo.jpg");
        File file3 = new File("Presentation.pptx");

        // Create folders and add files to them
        Folder documents = new Folder("Documents");
        documents.addComponent(file1);

        Folder pictures = new Folder("Pictures");
        pictures.addComponent(file2);

        Folder work = new Folder("Work");
        work.addComponent(file3);
        work.addComponent(documents);  // Add "Documents" folder to "Work"

        // Create a root folder and add other folders to it
        Folder root = new Folder("Root");
        root.addComponent(work);
        root.addComponent(pictures);

        // Display the entire file system structure
        root.showDetails();
    }
}
