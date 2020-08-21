package edu.escuelaing.arep;

import static spark.Spark.*;
import spark.Response;
import spark.Request;

public class SparkWebApp {

    public static void main(String[] args) {
        port(getPort());
        get("/hello", (req, res) -> "Hello Heroku");
        get("/", (req, res) -> inputDataPage(req, res));
        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));

    }

    /**
     * Metodo el cual hace el envio de los datos a evaluar
     * @param req Solicitud hecha por spark
     * @param res Solicitud hecha por spark
     * @return un string que contiene el esquema de una pagina web
     */
    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>Calculo Media y Desviacion Estandar</h2>"
                + "<p>Esta pagina calcula la media y la desviacion estandar de los datos que se ingresen</p>"
                + "<p>Ingrese los datos separados por coma</p>"
                + "<form action=\"/results\">"
                + "  Valores:<br>"
                + "  <input type=\"text\" name=\"valores\">"
                + "  <br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    /**
     * Metodo que calcula la media y desviacion estandar de los adtos que son ingresados por la pagina web
     * @param req Solicitud hecha por spark
     * @param res Solicitud hecha por spark
     * @return un string que contiene el esquema de una pagina web
     */
    private static String resultsPage(Request req, Response res) {
        String lista[] = req.queryParams("valores").split(",");
        System.out.println(lista);
        LinkedList LL = new LinkedList();
        for (String valor : lista){
            LL.addNode(Double.parseDouble(valor));
        }
        Calculos calc = new Calculos(LL);
        double mean = calc.mean();
        double desv = calc.deviation();
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>Calculo Media y Desviacion Estandar</h2>"
                + "<form action=\"/inputdata\">"
                + "<h3>Media</h3>"
                + mean
                + "<h3>Desviacion Estandar</h3>"
                + desv
                + "  <br>"
                + "  <br>"
                + "  <input type=\"submit\" value=\"Volver\">"
                + "</form>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    /**
     * Metodo que retorna el puerto por el cual esta corriendo la aplicacion
     * @return un entero que refiere al puerto
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }
}
