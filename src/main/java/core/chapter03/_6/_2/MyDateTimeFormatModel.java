package core.chapter03._6._2;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class MyDateTimeFormatModel {
    
    //    yyyy-MM-dd
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date date;
}
