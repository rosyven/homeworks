/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookauthorclassesexample;

//Man (Человек: имя, фамилия, Отчество) + Pet (nicknamwe = кличка = псевдоним)
public class Author {

    public Author(String name, String lastName, String nickName) {
        this.name = name;
        this.lastName = lastName;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Author{" + "name=" + name + ", lastName=" + lastName + ", nickName=" + nickName + '}';
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    private String name;
    private String lastName;
    private String nickName;
    
    
}
