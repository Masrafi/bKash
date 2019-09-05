package com.example.lenovo.bkash.pojo;

public class Person {
    private String name;
    private String phone;
    private String city;
    private String email;

    public Person(String name, String phone, String city, String email) {
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "লেনদেন আইডি='" + name + '\'' +
                ",িকাশ একাউন্ট নাম্বার='" + phone + '\'' +
                ", লেনদেনের পরিমাণ='" + city + '\'' +
                ", বিকাশ একাউন্ট ব্যালেন্স='" + email + '\'' +
                '}';
    }
}
