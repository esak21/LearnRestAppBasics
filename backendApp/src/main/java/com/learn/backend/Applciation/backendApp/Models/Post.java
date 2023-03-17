package com.learn.backend.Applciation.backendApp.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "jobpost")
public class Post {

    private String id;

    private String desc;

    private int exp ;

    private String profile;

    private String[] techs;


}
