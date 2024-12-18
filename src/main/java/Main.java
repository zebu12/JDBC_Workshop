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

//        City city = matata.findById(2);
//        System.out.println(city);

//        List<City> cities = matata.findByCode("USA");
//        cities.forEach(city1 -> System.out.println(city1));

//        List<City> cities = matata.findByName("Jari");
//        cities.forEach(System.out::println);

//        List<City> cities1 = matata.findAll();
//        cities1.forEach(city1 -> System.out.println(city1));

//        City brocoli = new City("Jari","USA","Snuss",2000000);
////        matata.add(brocoli);
////        System.out.println("added brocoli");
//
//        brocoli.setDistrict("Bonjour");
//        matata.update(brocoli);
//        System.out.println("update brocoli"+ brocoli);









    }




}
