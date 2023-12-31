package be.hepl.gitlab_buider;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import org.apache.http.client.utils.URIBuilder;

public class App {

    public static void main(String[] args) {
        String scheme = "https";
        String host = "gitlab.com";
        String path = "api/v4/projects/";
        String projectNb = "51311559"; //exemple de projet

        try {
            //Mise en place du "monteur concret": "URIBuilder"
            URIBuilder uriBuilder = new URIBuilder();
            uriBuilder.setScheme(scheme);
            uriBuilder.setHost(host);
            uriBuilder.setPath(path+projectNb);  
            //Le produit URI reçoit l'URI construit précedemment
            URI uri = uriBuilder.build();
            URL url = uri.toURL();
            //afficher l'URL construite
            System.out.println(url.toString());

            //ouvrir la connexion
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            //recuperer le status et la reponse
            int status = con.getResponseCode();
            if (status == 200) {
                BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line + "\n");
                }
                br.close();
                System.out.println(sb);
            }
            con.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
