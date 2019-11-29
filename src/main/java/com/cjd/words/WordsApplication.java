package com.cjd.words;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;


@RestController
@SpringBootApplication()
public class WordsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WordsApplication.class, args);
    }
}
