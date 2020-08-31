import java.net.*;
import java.io.*;

//Ceci importe la classe Scanner du package java.util
import java.util.Scanner; 
//Ceci importe toutes les classes du package java.util
import java.util.*;

public class Client {
	public static void main(String[] args) throws IOException, InterruptedException{
//		int a =0;
		Socket s = new Socket("a967cdd0-0d13-4a55-be06-9ef8e052c9d9.local",4999);
//		OutputStream output = s.getOutputStream();
		DataOutputStream data = new DataOutputStream(s.getOutputStream());
//		PrintWriter writer = new PrintWriter(output,true);
//		writer.println("Coucou");
			int i =0;
		while(true) {
			Thread.sleep(1000);
			System.out.println("on est dans la boucle client");
//			writer.write(i);
			data.writeInt(i);
			i++;
			
		}
		
		
		
		
//		InputStream in = s.getInputStream();
//		//InputStreamReader reader = new InputStreamReader(in);
//		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//		PrintWriter writer = new PrintWriter(output,true);
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("serveur1@:"+reader.readLine());
//		System.out.println("a="+a);
////		a = reader.read();
//		System.out.println("a="+a);
////		if(a== 1) {
//			
//			String str = sc.nextLine();
//			writer.println(sc);
//		}
//		
	
//		System.out.println("Veuillez saisir un mot :");
//		String str = sc.nextLine();
				
		

//		writer.println("Coucou");
//		writer.println(str);
		
	}

}
