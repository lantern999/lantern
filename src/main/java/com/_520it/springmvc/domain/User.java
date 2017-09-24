package com._520it.springmvc.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by later on 2017/9/21.
 */
@Setter
@Getter
@NoArgsConstructor@AllArgsConstructor@ToString
public class User {
    private String username;
    private Integer age;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date date= new Date();

}
