//package javaapplication11;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import javafx.scene.control.Tooltip;

public class Maps extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //remove code from here 
//	Button btn = new Button();
//        btn.setText("Say 'HelloWorld okeee '");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
//        
//        StackPane root = new StackPane();
//        
//        Scene scene = new Scene(root, 300, 250);
//        
//        primaryStage.setTitle("Hello World!");
//        primaryStage.setScene(scene);
//        primaryStage.show();
	//to here to add your own code
         Tooltip tooltip = new Tooltip("Institut Teknologi Sepuluh Nopember");
//        Tooltip.install(button, tooltip);
          
        
        StackPane root = new StackPane();
        
        // Load an image and set it as the background
        String imagePath = "bg.png";
        Image backgroundImage = new Image(getClass().getResource(imagePath).toString());
        ImageView backgroundImageView = new ImageView(backgroundImage);
        backgroundImageView.setImage(backgroundImage);
        root.getChildren().add(backgroundImageView);      
        
        
        Scene scene = new Scene(root, 800, 600);

        
        scene.setOnMouseMoved( (MouseEvent me) -> {
                double mouseX = me.getSceneX();
                double mouseY = me.getSceneY();
                double tooltipAreaX = 600;
                double tooltipAreaY = 300;
                double tooltipAreaWidth = 200;
                double tooltipAreaHeight = 200;
                 if (mouseX >= tooltipAreaX && mouseX <= tooltipAreaX + tooltipAreaWidth
                        && mouseY >= tooltipAreaY && mouseY <= tooltipAreaY + tooltipAreaHeight) {
                    tooltip.show(primaryStage, mouseX, mouseY);
                } else {
                    tooltip.hide();
                }
            System.out.println("X= " + me.getSceneX() + ", Y= " + me.getSceneY());
        } );
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Background Image Example");
        primaryStage.setFullScreen(true);
        primaryStage.show();
         
    }

    public static void main(String[] args) {
        launch(args);
    }
}