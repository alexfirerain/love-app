package org.swetophor.loveapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@AllArgsConstructor
@Getter
public class Present {
    private int id;
    private String matter;
    private String description;
    private Date bestBefore;

    public Present(int id, String matter, String description, String bestBefore) throws ParseException {
        this.id = id;
        this.matter = matter;
        this.description = description;
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/yy");
        this.bestBefore = dateFormatter.parse(bestBefore);
    }
}
