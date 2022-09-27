package com.example.firstproject;

import com.example.firstproject.model.Product;
import com.example.firstproject.notification.Test;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        print("print_was");
        //launch();


        Product p1 = new Product("PC");
        print(p1.getName());
        Test t1 = new Test("Test1");
        print(t1.getName());


        print("i am a student");
    }

    private static void print(String i_am_a_student) {
        System.out.println(i_am_a_student);
    }


}