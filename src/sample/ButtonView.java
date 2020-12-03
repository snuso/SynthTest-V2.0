package sample;

import java.awt.*;

public class ButtonView extends Button{

    public Button createButton(String text, int x, int y, int width, int height){
        Button button = new Button();
        button.setLabel(text);
        button.setBounds(x, y, width, height);
        return button;
    }
}
