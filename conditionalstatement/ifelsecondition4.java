package conditionalstatement;
import java.util.Scanner;

public class ifelsecondition4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your URL Link: ");
        String url = scan.nextLine();

        String protocol = "";
        String ext = "";

        int protocolIndex = url.indexOf(":");
        int extIndex = url.lastIndexOf(".");

        if (protocolIndex != -1) {
            protocol = url.substring(0, protocolIndex);
        }

        if (extIndex != -1) {
            ext = url.substring(extIndex + 1);
        }

        if (protocol.equals("http")) {
            System.out.println("Hypertext Transfer Protocol");
        } else if (protocol.equals("ftp")) {
            System.out.println("File transfer protocol");
        } else {
            System.out.println("Unknown protocol");
        }

        if (!ext.isEmpty()) {
            if (ext.equals("com")) {
                System.out.println("Commercial");
            } else if (ext.equals("org")) {
                System.out.println("Organisation");
            } else if (ext.equals("net")) {
                System.out.println("Network");
            } else {
                System.out.println("Unknown domain extension");
            }
        } else {
            System.out.println("Invalid URL");
        }
    }
}
