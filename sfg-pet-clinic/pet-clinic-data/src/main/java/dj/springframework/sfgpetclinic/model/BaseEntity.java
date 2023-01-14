package dj.springframework.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private Long id; // use box types -> can be null

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
