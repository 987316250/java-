import java.io.*;
import  java.net.URL;
import java.net.URLConnection;
//爬取百度的html
public class pachong {
    public static void main(String[] args) {
        File file=new File("J:\\data.txt");
         String url="http://www.baidu.com";
        BufferedReader br=null;
        PrintWriter pw=null;
         try {
             URL realURL=new URL(url);
             URLConnection uc=realURL.openConnection();
            br=new BufferedReader(new InputStreamReader(uc.getInputStream()));
             String line=null;
             pw=new PrintWriter(new FileOutputStream(file),true);
             while( (line = br.readLine())!=null)
             {
                pw.println(line);
             }
         }
         catch (Exception e)
         {
             e.printStackTrace();
         }
         finally {
             try {
                     br.close();
                     pw.close();

             }
             catch (Exception e)
             {
                 e.printStackTrace();
             }

         }
    }
}
