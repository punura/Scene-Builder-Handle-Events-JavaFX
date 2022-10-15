package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;

public class Controller {
	
	@FXML
	private Rectangle myRectangle1, myRectangle2;
	private double y;
	
	public void up1(ActionEvent e) {
		myRectangle1.setY(y-=10);
	}
	public void down1(ActionEvent e) {
		myRectangle1.setY(y+=10);
	}
	public void up2(ActionEvent e) {
		myRectangle2.setY(y-=10);
	}
	public void down2(ActionEvent e) {
		myRectangle2.setY(y+=10);
	}
}
