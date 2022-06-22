// Create some socket application
public class test {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 9999);
            System.out.println("Connected to server");
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            s.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}