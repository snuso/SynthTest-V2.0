package sample;

import java.awt.*;

public class ButtonController extends Button {

    private ButtonModel model;
    private ButtonView view;


    public ButtonController(ButtonModel model, ButtonView view ){
        this.model = model;
        this.view = view;
    }

    // TEXT
    public void setButtonText(String text){
        model.setText(text);
    }

    public String getButtonText(){
        return model.getText();
    }

    // X
    public void setButtonX(int x){
        model.setX(x);
    }

    public int getButtonX(){
        return model.getX();
    }

    // Y
    public void setButtonY(int y){
        model.setY(y);
    }

    public int getButtonY(){
        return model.getY();
    }

    // WIDTH
    public void setButtonWidth(int width){
        model.setWidth(width);
    }

    public int getButtonWidth(){
        return model.getWidth();
    }

    // HEIGHT
    public void setButtonHeight(int height){
        model.setHeight(height);
    }

    public int getButtonHeight(){
        return model.getHeight();
    }

    public void updateView(){
        view.createButton(model.getText(), model.getX(), model.getY(), model.getWidth(), model.getHeight());
    }
}
