import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Inserisci comando: ");
    String comando = br.readLine().toLowerCase();
    if(comando.equals("/saluta"))
    System.out.println("Hello, Pasquale!");
    }
}
