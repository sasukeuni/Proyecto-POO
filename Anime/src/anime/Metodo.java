/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anime;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 *
 * @author sasukeuni
 */
public class Metodo {

    private static final Logger LOG = Logger.getLogger ( Metodo.class.getName () );

    static int ejecutado = 0;

    static Integer edad ( LocalDate annoNacimiento ) {

        LocalDate today = LocalDate.now ();
        int edad = 0;
        try {
            edad = today.getYear () - annoNacimiento.getYear ();
        } catch ( NullPointerException n ) {
        }
        return edad;
    }

    static void isVacio ( String dato ) {
        try {
            if ( dato.length () != 0 ) {
                System.out.println ( dato );
                ejecutado ++;
            }

        } catch ( NullPointerException e ) {

        }

    }

    static String lector () {
        InputStreamReader isr = new InputStreamReader ( System.in );
        BufferedReader flujoE = new BufferedReader ( isr );
        String dato = "";
        try {
            dato = flujoE.readLine ();
        } catch ( IOException gaizki ) {
        }
        return dato;
    }
    private ArrayList<String> archivo;
    private String campo1 = null;
    private String campo2 = null;
    private String campo3 = null;
    private String campo4 = null;
    private String campo5 = null;
    private String campo6 = null;
    private String campo7 = null;
    private String campo8 = null;

    public boolean readXML ( String xml ) {
        archivo = new ArrayList<> ();
        Document dom;
        // Make an  instance of the DocumentBuilderFactory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance ();
        try {
            // use the factory to take an instance of the document builder
            DocumentBuilder db = dbf.newDocumentBuilder ();
            // parse using the builder to get the DOM mapping of the    
            // XML file
            dom = db.parse ( xml );

            Element doc = dom.getDocumentElement ();

            campo1 = getTextValue ( campo1 , doc , "role1" );
            if ( campo1 != null ) {
                if (  ! campo1.isEmpty () ) {
                    archivo.add ( campo1 );
                }
            }

            campo2 = getTextValue ( campo2 , doc , "role2" );
            if ( campo2 != null ) {
                if (  ! campo2.isEmpty () ) {
                    archivo.add ( campo2 );
                }
            }

            campo3 = getTextValue ( campo3 , doc , "role3" );
            if ( campo3 != null ) {
                if (  ! campo3.isEmpty () ) {
                    archivo.add ( campo3 );
                }
            }

            campo4 = getTextValue ( campo4 , doc , "campo4" );
            if ( campo4 != null ) {
                if (  ! campo4.isEmpty () ) {
                    archivo.add ( campo4 );
                }
            }

            campo5 = getTextValue ( campo5 , doc , "campo5" );
            if ( campo5 != null ) {
                if (  ! campo5.isEmpty () ) {
                    archivo.add ( campo5 );
                }
            }

            campo6 = getTextValue ( campo6 , doc , "campo4" );
            if ( campo6 != null ) {
                if (  ! campo6.isEmpty () ) {
                    archivo.add ( campo6 );
                }
            }

            campo7 = getTextValue ( campo7 , doc , "campo4" );
            if ( campo7 != null ) {
                if (  ! campo7.isEmpty () ) {
                    archivo.add ( campo7 );
                }
            }

            campo8 = getTextValue ( campo8 , doc , "campo4" );
            if ( campo8 != null ) {
                if (  ! campo8.isEmpty () ) {
                    archivo.add ( campo8 );
                }
            }

            return true;

        } catch ( ParserConfigurationException | SAXException pce ) {
            System.out.println ( pce.getMessage () );
        } catch ( IOException ioe ) {
            System.err.println ( ioe.getMessage () );
        }

        return false;
    }

    public void saveToXML ( String xml ) {
        Document dom;
        Element e;

        // instance of a DocumentBuilderFactory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance ();
        try {
            // use factory to get an instance of document builder
            DocumentBuilder db = dbf.newDocumentBuilder ();
            // create instance of DOM
            dom = db.newDocument ();

            // create the root element
            Element rootEle = dom.createElement ( "anime" );

            // create data elements and place them under root
            e = dom.createElement ( "titulo" );
            e.appendChild ( dom.createTextNode ( campo1 ) );
            rootEle.appendChild ( e );

            e = dom.createElement ( "autor" );
            e.appendChild ( dom.createTextNode ( campo2 ) );
            rootEle.appendChild ( e );

            e = dom.createElement ( "anno" );
            e.appendChild ( dom.createTextNode ( campo3 ) );
            rootEle.appendChild ( e );

            e = dom.createElement ( "capitulos" );
            e.appendChild ( dom.createTextNode ( campo4 ) );
            rootEle.appendChild ( e );

            e = dom.createElement ( "sino" );
            e.appendChild ( dom.createTextNode ( campo5 ) );
            rootEle.appendChild ( e );

            e = dom.createElement ( "nombre" );
            e.appendChild ( dom.createTextNode ( campo6 ) );
            rootEle.appendChild ( e );

            e = dom.createElement ( "rating" );
            e.appendChild ( dom.createTextNode ( campo7 ) );
            rootEle.appendChild ( e );

            e = dom.createElement ( "publicacion" );
            e.appendChild ( dom.createTextNode ( campo8 ) );
            rootEle.appendChild ( e );

            dom.appendChild ( rootEle );

            try {
                Transformer tr = TransformerFactory.newInstance ().newTransformer ();
                tr.setOutputProperty ( OutputKeys.INDENT , "yes" );
                tr.setOutputProperty ( OutputKeys.METHOD , "xml" );
                tr.setOutputProperty ( OutputKeys.ENCODING , "UTF-8" );
                tr.setOutputProperty ( OutputKeys.DOCTYPE_SYSTEM , "AnimeClass.xml" );
                tr.setOutputProperty ( "{http://xml.apache.org/xslt}indent-amount" , "4" );

                // send DOM to file
                tr.transform ( new DOMSource ( dom ) ,
                               new StreamResult ( new FileOutputStream ( xml ) ) );

            } catch ( TransformerException | IOException te ) {
                System.out.println ( te.getMessage () );
            }
        } catch ( ParserConfigurationException pce ) {
            System.out.println ( "UsersXML: Error trying to instantiate DocumentBuilder " + pce );
        }
    }

    private String getTextValue ( String def , Element doc , String tag ) {
        String value = def;
        NodeList nl;
        nl = doc.getElementsByTagName ( tag );
        if ( nl.getLength () > 0 && nl.item ( 0 ).hasChildNodes () ) {
            value = nl.item ( 0 ).getFirstChild ().getNodeValue ();
        }
        return value;
    }
}
