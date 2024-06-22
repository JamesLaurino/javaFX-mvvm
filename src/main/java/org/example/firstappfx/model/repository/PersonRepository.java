package org.example.firstappfx.model.repository;

import org.example.firstappfx.model.Person;
import org.example.firstappfx.service.DatabaseConnexionService;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PersonRepository implements SqliteRepository<Person>
{
    private DatabaseConnexionService databaseService = DatabaseConnexionService.getInstance();

    @Override
    public Person getOne(Integer id) {
        return null;
    }

    @Override
    public List<Person> getAll() {
        try (Connection conn = databaseService.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM utilisateur")) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");

                System.out.println("ID : " + id);
                System.out.println("Nom : " + nom);
                System.out.println("Prénom : " + prenom);
                System.out.println("--------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Person update(Person objet) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
