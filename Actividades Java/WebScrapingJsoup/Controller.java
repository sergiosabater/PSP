package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class Controller {

    @FXML
    private TextArea miTextArea;

    @FXML
    void searchTitle(ActionEvent event) throws IOException {

        String texto = "";

        Document doc = Jsoup.connect("https://www.w3schools.com/xml/simple.xml")
        .parser(Parser.xmlParser()).get();
        
        for (Element e : doc.select("food")) {

            texto = texto + "----------------------------------------\n";
            texto = texto + "Producto:\t\t"+e.select("name").text()
            +"\nPrecio:\t\t"+e.select("price").text()
            +"\nDescripcion:\t"+e.select("description").text()
            +"\nCalorias:\t\t"+e.select("calories").text()
            +" Kcal\n";

        }

        miTextArea.setText(texto);
    }
}
