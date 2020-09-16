package com.personal.info.docker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonalInfo {

    @GetMapping(path = "/info")
    public ResponseEntity<PersonalInfoDTO> getInfo(){
        PersonalInfoDTO info = new PersonalInfoDTO();
        info.setAge(31);
        info.setName("Abhishek Shah");
        info.setOccupation("Software Engineer");
        System.out.println(info.toString());
        return ResponseEntity.accepted().body(info);
    }


}
class PersonalInfoDTO{
    private String name;
    private int age;
    private String occupation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "PersonalInfoDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
