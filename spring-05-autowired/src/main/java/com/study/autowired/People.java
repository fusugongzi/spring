package com.study.autowired;

/**
 * @author wzz
 * @create 2020-11-13 22:56
 **/

public class People {
    private Cat cat;
    private Dog dog;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}