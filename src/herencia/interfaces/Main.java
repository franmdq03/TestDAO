package herencia.interfaces;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        DaoPerson dao = new DaoPerson();

        //Crear
        Person person1 = new Person(1, "Juan", "123456");
        Person person2 = new Person(2, "Maria", "654321");
        Person person3 = new Person(3, "Diego", "321232");
        dao.create(person1);
        dao.create(person2);
        dao.create(person3);
        System.out.println("Creacion: ");
        printPeople(dao.readAll());

        //Listar todos
        System.out.println("\nListar todos: ");
        printPeople(dao.readAll());

        //Listar por id
        System.out.println("\nListar por id (1):");
        Person personById = dao.readById(1);
        if (personById != null) {
            System.out.println(personById);
        } else {
            System.out.println("Persona no encontrada.");
        }

        //Actualizar
        Person updatedPerson = new Person(1, "Juan Updated", "1234566778");//ID se actualizara
        dao.update(updatedPerson, 2);
        System.out.println("\nDespues de actualizar:");
        printPeople(dao.readAll());

        //Eliminar
        dao.delete(2);
        System.out.println("\nDespues de eliminar id 2:");
        printPeople(dao.readAll());
    }

    //Metodo para imprimir una lista de personas usando un bucle for
    private static void printPeople(List<Person> people) {
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
    }
}
