import java.io.IOException;
public class Program {
public static void main(String...aa) {
Runtime run = Runtime.getRuntime();
try{
run.exec("sleep /l");
}catch(IOException e){e.printStackTrace();}
} 

}