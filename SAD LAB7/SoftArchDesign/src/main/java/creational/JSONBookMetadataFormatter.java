package creational;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private ArrayList<JSONObject> bookList;

    public JSONBookMetadataFormatter() throws IOException {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        bookList = new ArrayList<>();
        return null;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        JSONObject bookitem = new JSONObject();
        List<String> author = Arrays.asList(b.getAuthors());

        bookitem.put(Book.Metadata.ISBN.value,b.getISBN());
        bookitem.put(Book.Metadata.AUTHORS.value, newAuthorsList);
        bookitem.put(Book.Metadata.TITLE.value,b.getTitle());
        bookitem.put(Book.Metadata.PUBLISHER.value,b.getPublisher());

        books.add(bookitem);
        return this;
    }

    @Override
    public String getMetadataString() {
        HashMap<String, Object> b = new HashMap<>();
        b.put("Books", books);
        JSONObject bookitem = new JSONObject(b);
        return bookitem.toString();
    }
}