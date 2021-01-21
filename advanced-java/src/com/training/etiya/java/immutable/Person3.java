package com.training.etiya.java.immutable;


public class Person3 {

    private String name;
    private String surname;
    private int    age;
    private String company;
    private String phone;

    public String getName() {
        return this.name;
    }

    public Person3 setName(final String nameParam) {
        this.name = nameParam;
        return this;
    }

    public String getSurname() {
        return this.surname;
    }

    public Person3 setSurname(final String surnameParam) {
        this.surname = surnameParam;
        return this;
    }

    public int getAge() {
        return this.age;
    }

    public Person3 setAge(final int ageParam) {
        this.age = ageParam;
        return this;
    }

    public String getCompany() {
        return this.company;
    }

    public Person3 setCompany(final String companyParam) {
        this.company = companyParam;
        return this;
    }

    public String getPhone() {
        return this.phone;
    }

    public Person3 setPhone(final String phoneParam) {
        this.phone = phoneParam;
        return this;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + this.age;
        result = (prime * result) + ((this.company == null) ? 0 : this.company.hashCode());
        result = (prime * result) + ((this.name == null) ? 0 : this.name.hashCode());
        result = (prime * result) + ((this.phone == null) ? 0 : this.phone.hashCode());
        result = (prime * result) + ((this.surname == null) ? 0 : this.surname.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Person3 other = (Person3) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.company == null) {
            if (other.company != null) {
                return false;
            }
        } else if (!this.company.equals(other.company)) {
            return false;
        }
        if (this.name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!this.name.equals(other.name)) {
            return false;
        }
        if (this.phone == null) {
            if (other.phone != null) {
                return false;
            }
        } else if (!this.phone.equals(other.phone)) {
            return false;
        }
        if (this.surname == null) {
            if (other.surname != null) {
                return false;
            }
        } else if (!this.surname.equals(other.surname)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Person3 [name="
               + this.name
               + ", surname="
               + this.surname
               + ", age="
               + this.age
               + ", company="
               + this.company
               + ", phone="
               + this.phone
               + "]";
    }


}
