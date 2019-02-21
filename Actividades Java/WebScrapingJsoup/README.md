# Web Scraping con Jsoup
## Aplicación para parsear archivos XML desde web

La aplicación ha sido desarrollada en Java, usando JavaFX para desarrollar su interfaz gráfica. Sirve para extraer información de un archivo .xml procedente de una dirección URL.

<p align="center">
  <img src="https://github.com/sergiosabater/PSP/blob/master/Recursos/Imagenes/JSoup%20Scraping.PNG" width="600"/>
</p>


## Desarrollo de la aplicación

La aplicación se conecta a una dirección URL determinada, en este caso es: https://www.w3schools.com/xml/simple.xml.

Dicha URL nos proporciona un archivo .xml. De dicho archivo extraemos la información de los nodos que nos interesan. Para ello usamos la librería **JSoup**.

Fragmento de código donde se realiza el parseo del XML utilizando la librería JSoup:

```java
@FXML
    void searchTitle(ActionEvent event) throws IOException {
        
        String texto = "";

        Document doc = Jsoup.connect("https://www.w3schools.com/xml/simple.xml")
        .parser(Parser.xmlParser()).get();
        for (Element e : doc.select("food")) {
            
            texto = texto + "----------------------------------------\n";
            texto = texto + "Producto:\t\t"+e.select("name").text()+"\nPrecio:\t\t"+e.select("price").text()
            +"\nDescripcion:\t"+e.select("description").text()+"\nCalorias:\t\t"+e.select("calories").text()
            +" Kcal\n";
        }

        miTextArea.setText(texto);
    }

```
Obtenemos el documento http mediante Jsoup, después realizamos el parseo de dicho documento mediante el propio parser de JSoup, por lo que no ha sido necesario usar un parser externo.

Debemos establecer el nodo principal desde el cual queremos iterar para obtener la información, en este caso es `food`, y vamos obteniendo de cada subnodo el contenido del texto. Después, asignamos ese resultado a un String y finalmente lo mostramos en un TextArea en la interfaz.

Todo ello se realiza al presionar el botón `Extraer`, mediante una acción programada en JavaFX con SceneBuilder.



Ir a [código de la aplicación](https://github.com/sergiosabater/PSP/tree/master/Actividades%20Java/WebScrapingJsoup)
