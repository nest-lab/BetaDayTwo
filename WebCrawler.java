/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestlab;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author DEJI
 */
public class WebCrawler {
    public static final String browserAGENTS = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.101 Safari/537.36";
    public static void main(String[] args){
        String searchWord="";
        Document doc = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Input what you wanna search about and press enter");
        String word = input.nextLine();
            if(word.contains(" ")){
                searchWord = word.replace(" ", "+");
                //System.out.print(searchWord);  
        }
        try {
            doc = Jsoup.connect("https://google.com/search?q="+searchWord+"").userAgent(browserAGENTS).get();
        } catch (IOException ex) {
            Logger.getLogger(WebCrawler.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(Element result : doc.select("h3.r a")){
            final String title = result.text();
            final String url = result.attr("href");
            System.out.println(title+"->"+url);
        }
    }
    
}
