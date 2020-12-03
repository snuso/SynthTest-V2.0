package sample;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;


public class View {
    GranularModel model;
    Controller control;

    private GridPane StartView;

    // labels
    Label sampleNameLbl = new Label("Sample name:");
    Label soundlength = new Label();
    Label filePath = new Label();

    // buttons

    Button loadBtn = new Button("Load sample");

    //PITCH
    float pitchVal = 1;
    Label pitchTitel = new Label("Pitch");
    Label pitchLbl = new Label(String.valueOf(pitchVal));
    TextArea pitchTextArea = new TextArea();
    Button pitchBtn = new Button("Set pitch");

    //GRAIN
    float grainVal = 1;
    Label grainTitel = new Label("Grain");
    Label grainLbl = new Label(String.valueOf(grainVal));
    TextArea grainTextArea = new TextArea();
    Button grainBtn = new Button("Set Grain");


    //textareas
    TextArea sampleName = new TextArea();

    //comboboxes
    String looptypes[] = { "Forwards", "Backwards", "Wednesday", "Thrusday", "Friday" };
    ComboBox loopComboBox = new ComboBox(FXCollections.observableArrayList(looptypes));



    public View(GranularModel model, Controller control){
        this.model = model;
        this.control = control;
        createAndConfigure();
    }

    ////TEST////
    /*
    ButtonModel exitModel = exitButton();

    ButtonView exitView = new ButtonView();

    ButtonController exitbtn = new ButtonController(exitModel, exitView);

    public static ButtonModel exitButton(){
        ButtonModel buttonModel = new ButtonModel();
        buttonModel.setText("Hej");
        buttonModel.setX(40);
        buttonModel.setY(40);
        buttonModel.setWidth(100);
        buttonModel.setHeight(40);

    }*/
    ////TEST///

    private void createAndConfigure(){
        StartView = new GridPane();
        StartView = new GridPane();
        StartView.setMinSize(00, 200);
        StartView.setPadding(new Insets(10, 10, 10, 10));
        StartView.setVgap(3);
        StartView.setHgap(10);

        StartView.add(loadBtn, 0, 0);

        sampleName.setMaxHeight(2);
        sampleName.setMinWidth(90);
        StartView.add(sampleName,1,0, 2, 1);

        loopComboBox.setMinWidth(90);
        loopComboBox.getSelectionModel().selectFirst();
        StartView.add(loopComboBox, 0, 1);

        // FileLoader
        StartView.add(soundlength, 4, 3);
        StartView.add(filePath, 5, 3);

        //PITCH
        StartView.add(pitchTitel, 0, 4);
        StartView.add(pitchLbl, 1, 5);
        pitchTextArea.setMaxWidth(1);
        pitchTextArea.setMaxHeight(1);
        StartView.add(pitchTextArea, 0, 5);
        StartView.add(pitchBtn, 0, 6);

        //PITCH
        StartView.add(grainTitel, 0, 8);
        StartView.add(grainLbl, 1, 9);
        grainTextArea.setMaxWidth(1);
        grainTextArea.setMaxHeight(1);
        StartView.add(grainTextArea, 0, 8);
        StartView.add(grainBtn, 0, 10);
        System.out.println(pitchLbl.getText());

    }



    public Parent asParent() {
        return StartView;
    }
}
