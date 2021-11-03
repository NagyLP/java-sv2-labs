package stringmethod.filename;

public class FileNameManipulator {

    public char findLastCharacter(String str) {
        str.trim();
        return str.charAt(str.length()-1);
    }

    public String findFileExtension(String fileName) {
        fileName.trim();
        return fileName.substring(fileName.lastIndexOf("."));
    }

    public boolean identifyFilesByExtension (String ext, String fileName) {
//        int index = fileName.lastIndexOf('.');
        return fileName.trim().endsWith(ext.trim());
    }

    public boolean comapreFilesByName ( String searchedFileName, String  actualFileName) {
       return searchedFileName.trim().equalsIgnoreCase((actualFileName.trim()));
    }

    public String changeExtensionToLowerCase (String fileName) {
        String name = fileName.trim() . substring (0, fileName.lastIndexOf(".") );
        String extension = fileName.trim(). substring ( fileName.lastIndexOf(".") );
        return name + extension;
    }

    public String replaceStringPart ( String fileName, String present, String target) {
        if (fileName.contains(present)) {
            return fileName.replace(present, target);
        }
        return fileName;
    }

    public static void main(String[] args) {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();

        System.out.println(fileNameManipulator.findLastCharacter("Józsi Béla"));
        System.out.println(fileNameManipulator.findLastCharacter("Józsi Béla \n" +"\n"));

        System.out.println(fileNameManipulator.findFileExtension(" pom.xml " +"\n"));

        System.out.println(fileNameManipulator.identifyFilesByExtension("xml", "pom.xml"));
        System.out.println(fileNameManipulator.identifyFilesByExtension("yml", "pom.xml")+"\n");

        System.out.println(fileNameManipulator.comapreFilesByName("pom.xml", "pom.xml"));
        System.out.println(fileNameManipulator.comapreFilesByName("pom.Xml", "pom.xml")+"\n");

        System.out.println(fileNameManipulator.changeExtensionToLowerCase("Pom-Pom.Xml")+"\n");

        System.out.println(fileNameManipulator.replaceStringPart("pom.Xml", "Xml", "xml"));
        System.out.println(fileNameManipulator.replaceStringPart("pom.xml", "Xml", "xml"));
        System.out.println(fileNameManipulator.replaceStringPart("pom.xml", "xml", "xml"));
    }
}
