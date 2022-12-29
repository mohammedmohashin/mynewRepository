package src.FirstPakege.java_intermediate.jdbc_oi;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysqlconnect {
    public static void main(String[] args) {
    }

}

        try{
            connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "abcd");

            statement query = con.createstatement();

            resultset reasltset = quary.executequery("select * from sakila.actor");

            while (reasltset.next()){

                String id = reasltset.getString("actor_id");

                String fn = reasltset.getString(2);
                String In = reasltset.getString(3);

                System.out.println(id + "__" +  fn + "__" + In + "__" + "\t\t");

                System.out.println();



            }catch (SQLException e){

                throw new runtimeException(e);

                package java_intermediate.json;

                import com.mysql.cj.xdevapi.jsonparser;

                import java.io.FileNotFoundException;

                import java.io.FileReader;

                public class readJson{

                    public static void main(String[] args) {

                        try{
                            Jsonparser jp = new JsonParser();
                            FileReader fr = new FileReader("c:\\Users\\moha\\IdeaProject\\my_very_first_Project\\src\\java_intermediate\\json\\test.join");

                        }catch (FileNotFoundException e){
                            throw new RuntimeException(e);

                            "firstName" "Json",
                            "LastName": "Kennedy","address":[

                            {
                                "street": "street one",
                                "city": "Austin",
                                "state": "Texas"

                                "street": "street two",
                                "city": "Brooklyn",
                                "state": "NY"
                            }
                                    ]

                            import org.w3c.dom.Document;
                            import org.w3c.dom.Element;
                            import org.w3c.dom.Node;
                            import org.w3c.dom.NodeList;
                            import org.w3c.xml.sax.SaxException;

                            import javax.print.Doc;
                            import javax.xml.parsers.DocumentBuilder;
                            import javax.xml.parsers.DocumentBuilderFactory;
                            import javax.xml.parsers.ParserConfigurationException;
                            import java.io.File;
                            import java.io.IOException;

                            public class ReadXml{
                                public static void main(String[] args) {
                                    File xmlFile = new File("c:\\ Users\\moha\\IdeaProject\\my_very_first_project\\src\\java_intermediate\\learning_xml\\xml_files\\data.xml");

                                    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();


                                    try{

                                        DocumentBuilder db = dbf.newDocumentBuilder();

                                        Document doc = db.parse(xmlFile);


                                        //System.out.println(doc.getDocumentElement().getNodeName());


                                        NodeList nl = doc.getElementsByTagName("idpass");

                                            for (int a = 0; a < n1.getLeangth(); a++){

                                                 Node nN = n1.item(a);

                                                Element ele = (Element)nN;

                                                System.out.println(ele.getElementsByTagName("User").item(e).getTextContent());

                                                System.out.println(ele.getElementsByTagName("pass").item(e).getTextContent());




                                            }catch (ParserConfigurationException e){
                                            throw new RuntimeException(e);
                                        }catch (IOException e){

                                            throw new RuntimeException(e);

                                        }catch (SAXException e) {

                                                throw  new RuntimeException(e);

                                        }

                                    }

