package es.dracosoft.animalstudy.models;

import java.io.File;
import java.sql.Date;

/**
 * Created by Dracosoft.es on 31/03/2017.
 *
 * @Author Jesús Román Fernández
 * @Version 0.1
 * Basic class for animals register on app.
 */

public class Animal {


    private int id;
    private String species;
    private String latinName;
    private String name;
    private Date bornDate;
    private float weight;
    private float length;
    private float width;
    private float height;
    private String color;
    private File image;
    private File[] images;
    private String identifyParts;
    private Animal dad;
    private Animal mom;
    private Animal dadGrandpa;
    private Animal dadGrandma;
    private Animal momGrandpa;
    private Animal momGrandma;

    /**
     * Full constructor of class
     * @param id            (int)Unique id
     * @param species       (String) Common species name
     * @param latinName     (String) Scientific name
     * @param name
     * @param bornDate
     * @param weight
     * @param length
     * @param identifyParts
     * @param images
     * @param width
     * @param height
     * @param color
     * @param image
     * @param dad
     * @param mom
     * @param dadGrandpa
     * @param dadGrandma
     * @param momGrandpa
     * @param momGrandma
     */
    public Animal(int id, String species, String latinName, String name, Date bornDate,
                  float weight, float length, float width, float height, String color,
                  File image, File[] images, String identifyParts, Animal dad, Animal mom,
                  Animal dadGrandpa, Animal dadGrandma, Animal momGrandpa, Animal momGrandma) {
        this.id = id;
        this.species = species;
        this.latinName = latinName;
        this.name = name;
        this.bornDate = bornDate;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.image = image;
        this.images = images;
        this.identifyParts = identifyParts;
        this.dad = dad;
        this.mom = mom;
        this.dadGrandpa = dadGrandpa;
        this.dadGrandma = dadGrandma;
        this.momGrandpa = momGrandpa;
        this.momGrandma = momGrandma;
    }

    /**
     * Default constructor
     */
    public void Animal() {

    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public File[] getImages() {
        return images;
    }

    public void setImages(File[] images) {
        this.images = images;
    }

    public String getIdentifyParts() {
        return identifyParts;
    }

    public void setIdentifyParts(String identifyParts) {
        this.identifyParts = identifyParts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public Animal getDad() {
        return dad;
    }

    public void setDad(Animal dad) {
        this.dad = dad;
    }

    public Animal getMom() {
        return mom;
    }

    public void setMom(Animal mom) {
        this.mom = mom;
    }

    public Animal getDadGrandpa() {
        return dadGrandpa;
    }

    public void setDadGrandpa(Animal dadGrandpa) {
        this.dadGrandpa = dadGrandpa;
    }

    public Animal getDadGrandma() {
        return dadGrandma;
    }

    public void setDadGrandma(Animal dadGrandma) {
        this.dadGrandma = dadGrandma;
    }

    public Animal getMomGrandpa() {
        return momGrandpa;
    }

    public void setMomGrandpa(Animal momGrandpa) {
        this.momGrandpa = momGrandpa;
    }

    public Animal getMomGrandma() {
        return momGrandma;
    }

    public void setMomGrandma(Animal momGrandma) {
        this.momGrandma = momGrandma;
    }
}
