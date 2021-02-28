/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Khaya
 *//*
import java.util.Collection;
import java.util.Collections;
    import java.util.List;
     import java.util.ArrayList;
import java.util.Arrays;
//GUI
import javafx.application.Application;
//nodes
import javafx.scene.layout.*;
    import javafx.geometry.Insets; import javafx.geometry.Pos;
    import javafx.scene.control.Label;
    import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class A extends Application{

    BorderPane bpane = new BorderPane();
    GridPane gpane = new GridPane();
    FlowPane fpane = new FlowPane();
    StackPane spane = new StackPane();
    @Override
    public void start(Stage primaryStage){
        HBox pane = new HBox(30);
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(15,15,15,15));
        spane.getChildren().add(new Label("Do want to continue ?"));
        spane.setPadding(new Insets(50,15,20,15));
        Button continueButton = new Button("Yes");
        Button cancelButton = new Button("No");
        pane.getChildren().addAll(continueButton, cancelButton);
        bpane.setTop(spane);
        bpane.setCenter(pane);
        Scene scene = new Scene(bpane, 300,200);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        cancelButton.setOnAction( e -> {
            primaryStage.close();
            cancelProcess();
        });
        continueButton.setOnAction(e -> {
            primaryStage.close();
            continueToRegistration();
        });
    }
    public StackPane getStackPane(){
        StackPane pane = new StackPane();
       return pane;
    }
    public void cancelProcess(){
        Stage cancelProcessStage = new Stage();
        StackPane spane = getStackPane();
        spane.getChildren().add(new Label("Thank for using our service"));
        Scene cancelProcessScene = new Scene(spane);
        cancelProcessStage.setScene(cancelProcessScene);
        cancelProcessStage.show();
    }
    public void continueToRegistration(){
        Stage registrationStage = new Stage();
        Pane spane = getStackPane();
        spane.getChildren().add(new Label("This is registatoin Stage"));
        Scene registrationScene = new Scene(spane);
        registrationStage.setScene(registrationScene);
        registrationStage.show();
    }
    class Person{
        String name;
        byte age;
        Person(){}
        Person(String name, byte age){
            this.name=name;
            this.age = age;
        }
       String getName(){return this.name;}
       byte getAge(){return this.age;}
    }
     ArrayList<Person> b(){
        ArrayList<Person> bList = new ArrayList();
        bList.add(new Person("Tony Johannesson", (byte)23));
        bList.add(new Person("Oscer Jake", (byte)25));
        bList.add(new Person("Lola Beckhams", (byte)19));
        return bList;
    }
    public static void main(String... args){/*
        List<Person> list = new A().b();
        //Collection<Integ> collection = (ArrayList<Integer>)list;
        list.removeIf( ref -> (ref.getAge()>20));
        list.forEach( count -> System.out.println(count.getName() + " is younger than 20"));
       Application.launch(args);
    }
}

*/
public class A{

    int num =1;
    static int num0 =2;
    
   protected void test(){
        System.out.println(num0);
    }
    public static void main(String[] args){
        A access = new A();
        System.out.println(access.num);
    }
}