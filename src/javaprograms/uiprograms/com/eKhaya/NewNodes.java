package javaprograms.uiprograms.com.eKhaya;
/**
 *
 * @author Tumi Sibiya
 */
import java.util.List;
    import java.util.ArrayList;

import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

class CreateNewStage{
    Stage getNewStage(){
        return new Stage();
    }
}
class CreateNewLayout{

    public Pane getNewPane(){
        return new Pane();
    }
    public GridPane getNewGridPane(){
        return new GridPane();
    }
    public BorderPane getNewBorderPane(){
        return new BorderPane();
    }
    public FlowPane getNewFlowPane(){
        return new FlowPane();
    }
    public StackPane getNewStackPane(){
        return new StackPane();
    }
    public BorderPane getNewBorderane(){
        return new BorderPane();
    }
    public HBox getNewHBox(){
        return new HBox();
    }
}
public class NewNodes {
    //button Names
    static final String loginButtonName = "Login";
    static final String registerButtonName = "Legister";
    static final String createNewAccountButtonName ="Create";
    static final String deleteAccountButtonName ="Delete";
    static final String saveButtonName = "Save";
    static final String continueButtonName ="Continue";
    static final String cancelButtonName ="Cancel";
    static final String optionButtonName ="Options";
    //labels
    final  String companyNameLabel =" EKhaya Banking Group ";
    final  String usernameLabel =" Username ";
    final  String passwordlabel =" Uassword ";
    final  String accountBackupLabel =" Account backup ";
    final  String confiremPasswordLabel ="Confirm password ";
    final String firsNameLabel = "First name ";
    final String secondNameLabel = "Second name ";
    final String IDnumbeLabel = "I.D number ";
    final String mobilNumber = "Mobile number ";
    
    //list of buttons
    static List<Button> buttonNodeList = new ArrayList<>();
    //list of labels
    static List<Label> labelNameList = new ArrayList<>();
    //list of textfields
    static List<TextField> textFieldList = new ArrayList<>();
    
    static {
        ArrayList<Button> nodes = new ArrayList<>();
        nodes.add(new Button(loginButtonName)); 
        nodes.add(new Button(registerButtonName));
        
        nodes.add(new Button(saveButtonName));
        nodes.add(new Button(continueButtonName));
        
        nodes.add(new Button(cancelButtonName));
        
        nodes.add(new Button(createNewAccountButtonName));
        nodes.add(new Button(deleteAccountButtonName));
        
        buttonNodeList.addAll(nodes);
    }//getButtonss
    protected Button getNewLoginButton(){return buttonNodeList.get(0);}
    
    protected Button getNewSaveButton(){return buttonNodeList.get(2);}
    
    protected Button getNewCancelButton(){return buttonNodeList.get(4);}
    
    protected Button getNewRegisterButton(){return buttonNodeList.get(2);}
    
    protected Button getNewCreateButton(){return buttonNodeList.get(5);}

    protected Button getNewDeleteButton(){return buttonNodeList.get(6);}
    //getTextField
    protected TextField getNewTextField(){return new TextField();}
    //passwordField
    protected PasswordField getNewPasswordField(){return new PasswordField();}
    
}
