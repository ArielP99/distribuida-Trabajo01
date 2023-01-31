package com.distribuida.db;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import javax.persistence.Entity;

@Entity
public class Author extends PanacheEntity {
    
    private Long id;
    private String first_name;
    private String last_name;
   public Long getId() {

       return id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public String getLast_name() {
       return last_name;
    }
    public void setId(Long id) {
       this.id = id;
    }
    public void setFirst_name(String first_name) {
       this.first_name = first_name;
    }
    public void setLast_name(String last_name) {
       this.last_name = last_name;
    }
}

