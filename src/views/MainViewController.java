package views;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainViewController {

	private Stage primaryStage = new Stage();
	
	@FXML
	public void onRadio() {
		VBox vbox = new VBox();
		StackPane root = new StackPane();
		ToggleGroup group = new ToggleGroup();
		RadioButton rb1 = new RadioButton("option 1");
		RadioButton rb2 = new RadioButton("option 2");
		RadioButton rb3 = new RadioButton("option 3");
		RadioButton rb4 = new RadioButton("option 4");
		rb1.setUserData("option 1");
		rb2.setUserData("option 2");
		rb3.setUserData("option 3");
		rb4.setUserData("option 4");
		rb1.setToggleGroup(group);
		rb2.setToggleGroup(group);
		rb3.setToggleGroup(group);
		rb4.setToggleGroup(group);
		Label label = new Label("select option");
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			public void changed(ObservableValue<? extends Toggle> ov,
			        Toggle old_toggle, Toggle new_toggle) {
			            if (group.getSelectedToggle() != null) {
			                label.setText(group.getSelectedToggle().getUserData().toString());
			            }                
			        }
		});
		
		vbox.getChildren().addAll(rb1,rb2,rb3,rb4,label);
		root.getChildren().add(vbox);
		root.setAlignment(Pos.CENTER);
		vbox.setAlignment(Pos.CENTER);
		vbox.setSpacing(20);
		
		Scene scene = new Scene(root,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	@FXML
	public void onCheckbox() {
		SplitPane root = new SplitPane();
		VBox leftBox = new VBox(); 
		VBox rightBox = new VBox();
		leftBox.setPadding(new Insets(20));
		leftBox.setSpacing(10);
		rightBox.setPadding(new Insets(20));
		rightBox.setSpacing(10);
		root.getItems().addAll(leftBox,rightBox);
		Label java = new Label("Java");
		Label cpp = new Label("C++");
		Label c = new Label("C");
		Label javascrip = new Label("JavaScrip");
		Label HTML = new Label("HTML");
		Label css = new Label("CSS");
		Label rumy = new Label("Rumy");
		Label javafx = new Label("JavaFX");
		Label python = new Label("Python");
		
		
		
		CheckBox cb1 = new CheckBox("java");
		cb1.selectedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				// TODO Auto-generated method stub
				if(newValue) {
					
					rightBox.getChildren().add(java);
				}else {
					if(rightBox.getChildren().contains(java)){
						rightBox.getChildren().remove(java);
					}
				}
				
			}
		});
		CheckBox cb2 = new CheckBox("C++");
		cb2.selectedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				// TODO Auto-generated method stub
				if(newValue) {
					
					rightBox.getChildren().add(cpp);
				}else {
					if(rightBox.getChildren().contains(cpp)){
						rightBox.getChildren().remove(cpp);
					}
				}
				
			}
		});
		CheckBox cb3 = new CheckBox("C");
		cb3.selectedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				// TODO Auto-generated method stub
				if(newValue) {
					
					rightBox.getChildren().add(c);
				}else {
					if(rightBox.getChildren().contains(c)){
						rightBox.getChildren().remove(c);
					}
				}
				
			}
		});
		CheckBox cb4 = new CheckBox("Python");
		cb4.selectedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				// TODO Auto-generated method stub
				if(newValue) {
					
					rightBox.getChildren().add(python);
				}else {
					if(rightBox.getChildren().contains(python)){
						rightBox.getChildren().remove(python);
					}
				}
				
			}
		});
		CheckBox cb5 = new CheckBox("Rumy");
		cb5.selectedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				// TODO Auto-generated method stub
				if(newValue) {
					
					rightBox.getChildren().add(rumy);
				}else {
					if(rightBox.getChildren().contains(rumy)){
						rightBox.getChildren().remove(rumy);
					}
				}
				
			}
		});
		CheckBox cb6 = new CheckBox("HTML");
		cb6.selectedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				// TODO Auto-generated method stub
				if(newValue) {
					
					rightBox.getChildren().add(HTML);
				}else {
					if(rightBox.getChildren().contains(HTML)){
						rightBox.getChildren().remove(HTML);
					}
				}
				
			}
		});
		CheckBox cb7 = new CheckBox("CSS");
		cb7.selectedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				// TODO Auto-generated method stub
				if(newValue) {
					
					rightBox.getChildren().add(css);
				}else {
					if(rightBox.getChildren().contains(css)){
						rightBox.getChildren().remove(css);
					}
				}
				
			}
		});
		CheckBox cb8 = new CheckBox("javascrip");
		cb8.selectedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				// TODO Auto-generated method stub
				if(newValue) {
					
					rightBox.getChildren().add(javascrip);
				}else {
					if(rightBox.getChildren().contains(javascrip)){
						rightBox.getChildren().remove(javascrip);
					}
				}
				
			}
		});
		CheckBox cb9 = new CheckBox("javafx");
		cb9.selectedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				// TODO Auto-generated method stub
				if(newValue) {
					
					rightBox.getChildren().add(javafx);
				}else {
					if(rightBox.getChildren().contains(javafx)){
						rightBox.getChildren().remove(javafx);
					}
				}
				
			}
		});
		
		leftBox.getChildren().addAll(cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9);
		
		Scene scene = new Scene(root,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	@FXML
	public void onHyperLink() {
		StackPane root = new StackPane();
		Hyperlink link = new Hyperlink("Click me");
		link.setOnAction(e -> System.out.println("Click"));
		link.setAlignment(Pos.CENTER);
		root.getChildren().add(link);
		
		Scene scene = new Scene(root,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	@FXML
	public void onProgress() {
		StackPane root = new StackPane();
		
		ProgressBar bar= new ProgressBar();
		ProgressIndicator indi = new ProgressIndicator();
		HBox hbox = new HBox();
		hbox.getChildren().addAll(bar,indi);
		hbox.setAlignment(Pos.CENTER);
		hbox.setSpacing(30);
		root.getChildren().add(hbox);
		
		Scene scene = new Scene(root,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
}
