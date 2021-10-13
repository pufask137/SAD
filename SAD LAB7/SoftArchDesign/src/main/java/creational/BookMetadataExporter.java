package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) throws ParserConfigurationException, IOException{
        BookMetadataFormatter format = getBookFormat();
        for(Book bookitem : books){
            formatter.append(bookitem);
        }
        stream.println(formatter.getMetadataString());
    }

    public abstract BookMetadataFormatter getBookFormat() throws IOException, ParserConfigurationException;
}
