package com.cjd.words.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
public class Vocabulary {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private Long id;
    private String name;
    private String description;
    private String add_time;
    private String update_time;
    private String preposition;
    private String pronoun;
    private String noun;
    private String uncountableNoun;
    private String countableNoun;
    private String verb;
    private String intransitiveVerb;
    private String transitiveVerb;
    private String conjunction;
    private String adjective;
    private String adverb;
    private String article;
    private String numeral;
    private String interjection;

    public String getName(){return this.name;}
    public Long getId() {
        return id;
    }
    public String getDescription(){return this.description;}
    public String getAdd_time(){return this.add_time;}
    public String getUpdate_time(){return this.update_time;}
    public String getPreposition(){return this.preposition;}
    public String getPronoun(){return this.pronoun;}
    public String getNoun(){return this.noun;}
    public String getUncountableNoun(){return this.uncountableNoun;}
    public String getCountableNoun(){return this.countableNoun;}
    public String getVerb(){return this.verb;}
    public String getIntransitiveVerb(){return this.intransitiveVerb;}
    public String getTransitiveVerb(){return this.transitiveVerb;}
    public String getAdjective(){return this.adjective;}
    public String getAdverb(){return this.adverb;}
    public String getConjunction(){return this.conjunction;}
    public String getArticle(){return this.article;}
    public String getNumeral(){return this.numeral;}
    public String getInterjection(){return this.interjection;}

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUpdate_time() {
        this.update_time = (new SimpleDateFormat("yyyy-MM-dd")).format(new Date());
    }

    public void setAdd_time() {
        this.add_time = (new SimpleDateFormat("yyyy-MM-dd")).format(new Date());
    }

    public void setPreposition(String preposition){
        this.preposition = preposition;
    }
    public void setPronoun(String pronoun){
        this.pronoun=pronoun;
    }
    public void setNoun(String noun){
        this.noun=noun;
    }
    public void setUncountableNoun(String uncountableNoun){
        this.uncountableNoun=uncountableNoun;
    }
    public void setCountableNoun(String countableNoun){
        this.countableNoun=countableNoun;
    }
    public void setVerb(String verb){
        this.verb=verb;
    }
    public void setIntransitiveVerb(String intransitiveVerb){
        this.intransitiveVerb=intransitiveVerb;
    }
    public void setTransitiveVerb(String transitiveVerb){
        this.transitiveVerb=transitiveVerb;
    }
    public void setAdjective(String adjective){
        this.adjective=adjective;
    }
    public void setAdverb(String adverb){
        this.adverb=adverb;
    }
    public void setConjunction(String conjunction){
        this.conjunction=conjunction;
    }
    public void setArticle(String article){
        this.article=article;
    }
    public void setNumeral(String numeral){
        this.numeral=numeral;
    }
    public void setInterjection(String interjection){
        this.interjection=interjection;
    }
}
