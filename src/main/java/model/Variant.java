package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Variant")
public class Variant {

    @Id
    @GeneratedValue
    private int Id;
    private String variant;

    @Column(name = "scratch_number")
    private String scratchNumber;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getScratchNumber() {
        return scratchNumber;
    }

    public void setScratchNumber(String scratchNumber) {
        this.scratchNumber = scratchNumber;
    }

}
