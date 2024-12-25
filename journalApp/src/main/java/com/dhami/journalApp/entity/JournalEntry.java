package com.dhami.journalApp.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Document(collection = "journal_entries" ) // class mongodb collection se mapped entity h
@Getter
@Setter
@NoArgsConstructor// deserialization
public class JournalEntry {
    @Id// for Primary key
    private ObjectId id;
    @NonNull
    private String title;
    private String content;
//   private Date date;
     private LocalDateTime date;// java 8


}
