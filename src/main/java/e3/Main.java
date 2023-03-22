package e3;

public class Main {
    public static void main(String[] args) {
        Component component1 = new Archivo(10);
        Component component2 = new Archivo(15);
        Component component3 = new Archivo(20);

        Folder folder1 = new Folder();
        folder1.agregarArchivo(component1);
        folder1.agregarArchivo(component2);

        Folder folder2 = new Folder();
        folder2.agregarArchivo(folder1);
        folder2.agregarArchivo(component3);

        Folder disco1 = new Folder();
        disco1.agregarArchivo((folder2));
        System.out.println("El disco creado tiene "+disco1.getNumPalabras()+" palabras en total");

    }
}