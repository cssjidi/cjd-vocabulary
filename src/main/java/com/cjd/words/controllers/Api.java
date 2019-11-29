package com.cjd.words.controllers;

import com.cjd.words.User;
import com.cjd.words.models.Vocabulary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class Api{
    @Resource
    private JdbcTemplate db;

    @RequestMapping("/words")
    public List words(){
        String sql = "SELECT * FROM cjd_words";
        List<Vocabulary> list = db.query(sql, new RowMapper<Vocabulary>() {
            @Override
            public Vocabulary mapRow(ResultSet resultSet, int i) throws SQLException {
                Vocabulary vol = new Vocabulary();
                vol.setId(resultSet.getString("id"));
                vol.setDescription(resultSet.getString("description"));
                vol.setName(resultSet.getString("name"));
                vol.setUpdate_time(resultSet.getString("update_time"));
                vol.setAdd_time(resultSet.getString("add_time"));
                return vol;
            }
        });
        return list;
    }
    @RequestMapping(value="/search",method = RequestMethod.POST)
    public String search(@RequestBody Map params){
        this.findOrCreate(params);
        return "{name:'json'}";
    }

    private void findOrCreate(Map params){
        Boolean exists = this.findRecord(params.get("name").toString());
        if(!exists){
            HttpUtil
            //http://dict-mobile.iciba.com/interface/index.php?c=word&m=getsuggest&word=gt&nums=5&ck=709a0db45332167b0e2ce1868b84773e&timestamp=1575017298804&client=6&uid=0&is_need_mean=1&callback=jsonp_1575017298804_36121
        }
    }
    private void updateRecord(){

    }
    private Boolean findRecord(String name){
        int exists = db.queryForObject("SELECT COUNT(*) FROM cjd_words WHERE 1=1 AND name='"+name+"'",int.class);
        return exists > 0 ? true : false;
    }
}
