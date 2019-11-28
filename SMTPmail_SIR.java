import java.io.*;
import java.net.*;
class SMTPmail_SIR {

  public static void main(String argv[]) throws Exception
    {

          Socket s=new Socket("10.110.49.101",25);								//IP adresse
          PrintWriter   os = new PrintWriter(s.getOutputStream(),true);
          BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));


                os.println("HELO " + "cse.ru");									//Server name
                System.out.println( "Response1: " + br.readLine());
                
                os.println("MAIL FROM:"+ " raju@cseru");							//Mail Sender
                System.out.println( "Response2: " + br.readLine());
                
                os.println("RCPT TO:"+ " cse@cse.ru");								//Mail Receiver
                System.out.println( "Response3: " + br.readLine());

                os.println("DATA");
                System.out.println( "Response4: " + br.readLine());
                
                os.println("Subject: My Signal");
                os.println();
                os.println("what are u doing Shuvuuu");
                os.println();
                os.println(".");
                
                System.out.println( "Response5: " + br.readLine());
                
                
                         
                os.println("QUIT");
                System.out.println( "Response6: " + br.readLine());
                
                System.out.println( "Response7: " + br.readLine());


     


    }
}