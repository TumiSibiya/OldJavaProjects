package practice;
//GUI
import javafx.application.Application;
    //layout
    import javafx.scene.layout.GridPane;
       //rpoperties
        import javafx.geometry.Insets;
        import javafx.geometry.Pos;
        import javafx.geometry.Orientation;
//nodes
    //Button
    import javafx.scene.control.Button;
    //Label
    import javafx.scene.control.Label;
    //text  
    import javafx.scene.text.Text;
         import javafx.scene.text.Font;
    //Textfields
    import javafx.scene.control.TextField;
    
//Scene and Stage
import javafx.scene.Scene;
import javafx.stage.Stage;
//handlers
import javafx.event.EventHandler;
    //actions
    import javafx.event.ActionEvent;
//Exceptins
import java.lang.IllegalArgumentException;
//Collections
    //type
    import java.util.List;
        import java.util.ArrayList; 
    
public class UnsolvedProblem extends Application{
    //pane 
    GridPane pane = new GridPane();
    //nodes
    Button buyButton = new Button("buy");
    Text organisationName = new Text();
    
    public UnsolvedProblem(){}
    
    @Override
    public void start(Stage primaryStage){
        System.out.println("Im inside start");
        //pane setup
        pane.setPadding(new Insets(10,10,10,10));
        //node setups
        //add to pane
        pane.add(new Label("BuyaaaaA !"), 0,0);
        pane.add(new Label("PlayStation "), 0,1); pane.add(buyButton, 1,1);
        pane.add(new Label("Xbox360"), 0,2); pane.add(new Label("nothing"), 1,2);
        
        //scene and stage
        Scene scene = new Scene(pane, 600,600);
        primaryStage.setScene(scene);
        primaryStage.show();
        System.out.println("Im done with start");
    }
   public class Item{
        String name;
        double price;
        
        public Item(String productName , double priceValue){
            this.name = productName;
            this.price = priceValue;
        }
        
    }
    public List<Item> addProduct(List<Item> productToAdd){
        productToAdd.add(new Item("Playstation 4", 5000));
        productToAdd.add(new Item("Xbox360 E", 1800));
        productToAdd.add(new Item("Xbox One S", 4000));
      return productToAdd;
    }
    public static void main(String... args){
        List<Item> products = new ArrayList<>();
        UnsolvedProblem access = new UnsolvedProblem();
        access.addProduct(products);
        //products.remove(0);
        System.out.println(products.size());
        for(Item loop : products){
            if(loop.name.equals("Playstation 4")){
                System.out.println(loop.name+" cost R"+loop.price);
            }
        }
        System.out.println("I am done");
        Application.launch(args);
    }
}
