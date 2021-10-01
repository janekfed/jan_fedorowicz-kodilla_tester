package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {
        Person kamilKwiatkowski = new Person("Kamil", 42, new BusDriver());
        Person annaMorawska = new Person("Anna", 28, new Lawer());
        Person przemyslawSawicki = new Person("Przemysław", 57, new Hairdresser());

        System.out.println(kamilKwiatkowski.getFirstName() + ", age: " + kamilKwiatkowski.getAge() + ", salary: " + kamilKwiatkowski.getJob().getSalary() + ", responsibilities: " + kamilKwiatkowski.getJob().getResponsibilities());
        System.out.println(annaMorawska.getFirstName() + ", age: " + annaMorawska.getAge() + ", salary: " + annaMorawska.getJob().getSalary() + ", responsibilities: " + annaMorawska.getJob().getResponsibilities());
        System.out.println(przemyslawSawicki.getFirstName() + ", age: " + przemyslawSawicki.getAge() + ", salary: " + przemyslawSawicki.getJob().getSalary() + ", responsibilities: " + przemyslawSawicki.getJob().getResponsibilities());
    }
}