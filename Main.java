package sample;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        //Creating a Path
        Path path = new Path();

        //Moving to the starting point
        MoveTo moveTo = new MoveTo(108, 71);
//        LineTo line1 = new LineTo(321, 71);//(b)
//        LineTo line2 = new LineTo(126,232);//(c)
//        LineTo line3 = new LineTo(213,1);//(d)
//        LineTo line4 = new LineTo(303, 232);//(e)
//        LineTo line5 = new LineTo(108, 71);

        LineTo line1 = new LineTo(190, 71);//(b)
        LineTo line2 = new LineTo(213,1);//(c)
        LineTo line3 = new LineTo(240,71);//(d)
        LineTo line4 = new LineTo(321, 71);//(e)
        LineTo line5 = new LineTo(260, 121);
        LineTo line6 = new LineTo(303, 232);//(b)
        LineTo line7 = new LineTo(213,151);//(c)
        LineTo line8 = new LineTo(126,232);//(d)
        LineTo line9 = new LineTo( 169, 121);//(e)
        LineTo line10 = new LineTo(108, 71);



        Circle circle1 = new Circle();
        circle1.setCenterX(215.0f);
        circle1.setCenterY(108.0f);
        circle1.setRadius(40.0f);





        path.getElements().add(moveTo);
        path.getElements().addAll(line1, line2, line3, line4, line5, line6, line7, line8, line9, line10);
        Shape shape = Shape.union(circle1, path);
        Group root = new Group( shape);

        Scene scene = new Scene(root, 600, 600);
        stage.setTitle(" Star ");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}