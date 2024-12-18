import dao.CityDao;
import dao.CityDaoJDBC;
import model.City;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.concurrent.Callable;

import static db.MysqlConnection.getConnection;

public class Main {


    public static void main(String[] args) {

        CityDao matata = new CityDaoJDBC();

        // findById

        City city = matata.findById(2);
        System.out.println(city);

        // findByCode

        List<City> cities = matata.findByCode("USA");
        cities.forEach(city1 -> System.out.println(city1));

        // findByName

        List<City> cities = matata.findByName("Jari");
        cities.forEach(System.out::println);

        // findAll

        List<City> cities1 = matata.findAll();
        cities1.forEach(city1 -> System.out.println(city1));

        // addCity

        City brocoli = new City("Jari", "USA", "Snuss", 2000000);
        matata.add(brocoli);
        System.out.println("added brocoli");

        brocoli.setDistrict("Bonjour");

        // update
        matata.update(brocoli);
        System.out.println("update brocoli" + brocoli);

        // delete

        matata.delete(brocoli);
        System.out.println("deleted brocoli");








    }




}
