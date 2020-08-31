import java.net.*;
import java.io.*;



public class Server {

	public static void main(String[] args) throws IOException {
//		int a = 1;
//		String Nom;
		// TODO Auto-generated method stub

		ServerSocket ss = new ServerSocket(4999);
		Socket s = ss.accept();
//		InputStream in = s.getInputStream();
		DataInputStream datas = new DataInputStream(s.getInputStream());
		System.out.println("client connected");
		System.out.println("Demande d'autantification");
//		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		
		while(true) {
			System.out.println("on est avant la boucle");
			System.out.println("Server :"+datas.readInt());
		}
		
		
		
		
		
		
		
//		OutputStream output = s.getOutputStream();
//		InputStream in = s.getInputStream();
//		//InputStreamReader reader = new InputStreamReader(in);
//		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//		PrintWriter writer = new PrintWriter(output,true);
//		writer.println("Veuiller Rentrer Votre Nom D'utilisateur : ");
//		writer.write(a);
		
		
		
		
		
//		System.out.println("serveur1@:"+reader.readLine());
//		System.out.println("serveur1@:"+reader.readLine());
//		System.out.println("serveur1@:"+reader.readLine());
	}

}
