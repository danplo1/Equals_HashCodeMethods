package com.dan;

public class Person {

    private String firstName;

    private int age;


//    @Override
//    public boolean equals(Object object) {
//
//        if (object == null) {
//            return false;
//        }
//        if (this == object) {
//            return true;
//        }
//        if (object instanceof Person) { //sprawdzamy czy nasz paramter jest instancją naszej klasy ->instance of
//
//            Person paramPerson = (Person) object;
//            if (firstName.equals(paramPerson.firstName) && this.age == paramPerson.age) {
//                return true;
//            } else {
//
//                return false;
//            }
//
//        } else {
//            return false;
//        }
//    }
//}


    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return firstName != null ? firstName.equals(person.firstName) : person.firstName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
