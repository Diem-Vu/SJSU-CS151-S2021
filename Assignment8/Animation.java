//Implement an application that displays a screen partitioned into a 2x2 grid.
//There need to be some type of visual separators for the grid cells
//(e.g. border around each cell, lines separating them, etc.).
//Each cell of the grid should display a single shape.
//The following shapes should be present in the grid: sphere, cylinder, box, polygon.
//It is up to you what visual parameters to set to these shapes (size, color, etc.).
//Add user-intuitive controls (e.g. buttons or menu items, etc.) to your screen to animate each of the shapes.
//The specifics of the UI design are up to you.
//The user should be able select which cell of the grid to animate
//and select the animation type: RotateTransition, ScaleTransition, SequentialTransition.
//Additionally, implement FadeTransition for polygon shape.
//This transition will not work for 3-D shapes. Save your program to a file named Animation.java.
/**
 * class MethodTest
 * @author Diem.Vu
 * @since 05.6.2021
 * @version 1.0
 *
 * Assignment 8: Java GUi
 * */


import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Animation extends Application{
    public static void main(String[]args){
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // INITIAL SHAPE SELECTION AND NODE TO ANIMATE
        Label lblSelection = new Label();

        // DRAW SPHERE
        Sphere sphere = new Sphere();
        sphere.setRadius(40.0f);
        PhongMaterial phMaterial1 = new PhongMaterial();
        phMaterial1.setDiffuseColor(Color.ORANGE);
        sphere.setMaterial(phMaterial1);

        //DRAW CYLINDER
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(30.0f);
        cylinder.setHeight(70.0f);
        PhongMaterial phMaterial2 = new PhongMaterial();
        phMaterial2.setDiffuseColor(Color.BLUE);
        cylinder.setMaterial(phMaterial2);

        // DRAW BOX
        Box box = new Box();
        box.setWidth(70.0);
        box.setHeight(80.0);
        box.setDepth(70.0);
        box.setRotationAxis(Rotate.Z_AXIS);
        PhongMaterial boxMaterial = new PhongMaterial();
        boxMaterial.setDiffuseColor(Color.BLUEVIOLET);
        box.setMaterial(boxMaterial);

        // DRAW POLYGON
        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(new Double[]{
            90.0d, 20.0d,
            80.0d, 75.0d,
            80.0d, 95.0d,
            40.0d, 85.0d,
            5.0d, 5.0d,
        });
        polygon.setFill(Color.CORAL);

        GridPane gridLayout = new GridPane();
        gridLayout.setVgap(20);
        gridLayout.setHgap(20);

        gridLayout.add(sphere, 1, 0);
        gridLayout.add(cylinder, 2, 0);
        gridLayout.add(box, 1, 1);
        gridLayout.add(polygon, 2, 1);
        gridLayout.setMinSize(200, 200);
        gridLayout.setStyle("-fx-background-color: #ADD8E6");

        // ROTATE TRANSITION
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.millis(500));
        rotateTransition.setAxis(Rotate.Y_AXIS);
        rotateTransition.setByAngle(180);
        rotateTransition.setCycleCount(50);
        rotateTransition.setAutoReverse(true);

        // SCALETRANSITION
        ScaleTransition scaleTransition = new ScaleTransition();
        scaleTransition.setDuration(Duration.millis(500));
        scaleTransition.setByY(1.5);
        scaleTransition.setByX(1.5);
        scaleTransition.setCycleCount(5);
        scaleTransition.setAutoReverse(true);

        // FADETRANSITION ANIMATION
        FadeTransition fadeTransition = new FadeTransition(Duration.millis(500));
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0.3);
        fadeTransition.setCycleCount(4);
        fadeTransition.setAutoReverse(true);

        // SEQUENTIAL TRANSITION
        SequentialTransition sequentialTransition = new SequentialTransition(rotateTransition,scaleTransition);
        sequentialTransition.setCycleCount(5);
        sequentialTransition.setAutoReverse(true);

        Menu menu = new Menu("Play Animation");

        // ANIMATION FOR SPHERE
        Menu subMenu1 = new Menu("Sphere");
        MenuItem sub1Item1 = new MenuItem("RotateTransition");
        subMenu1.getItems().add(sub1Item1);
        sub1Item1.setOnAction((ActionEvent event) -> {
            lblSelection.setText("RotateTransition For Sphere");
            rotateTransition.setNode(sphere);
            rotateTransition.play();
        });
        MenuItem sub1Item2 = new MenuItem("ScaleTransition");
        subMenu1.getItems().add(sub1Item2);
        sub1Item2.setOnAction((ActionEvent event) -> {
            lblSelection.setText("ScaleTransition For Sphere");
            scaleTransition.setNode(sphere);
            scaleTransition.play();
        });
        MenuItem sub1Item3 = new MenuItem("SequentialTransition");
        subMenu1.getItems().add(sub1Item3);
        sub1Item3.setOnAction((ActionEvent event) -> {
            lblSelection.setText("SequentialTransition For Sphere");
            sequentialTransition.setNode(sphere);
            sequentialTransition.play();
        });
        menu.getItems().add(subMenu1);

        // ANIMATION FOR CYLINDER
        Menu subMenu2 = new Menu("Cylinder");
        MenuItem sub2Item1 = new MenuItem("RotateTransition");
        subMenu2.getItems().add(sub2Item1);
        sub1Item1.setOnAction((ActionEvent event) -> {
            lblSelection.setText("RotateTransition For Cylinder");
            rotateTransition.setNode(cylinder);
            rotateTransition.play();
        });
        MenuItem sub2Item2 = new MenuItem("ScaleTransition");
        subMenu2.getItems().add(sub2Item2);
        sub1Item2.setOnAction((ActionEvent event) -> {
            lblSelection.setText("ScaleTransition For Cylinder");
            scaleTransition.setNode(cylinder);
            scaleTransition.play();
        });
        MenuItem sub2Item3 = new MenuItem("SequentialTransition");
        subMenu2.getItems().add(sub2Item3);
        sub1Item3.setOnAction((ActionEvent event) -> {
            lblSelection.setText("SequentialTransition For Cylinder");
            sequentialTransition.setNode(cylinder);
            sequentialTransition.play();
        });
        menu.getItems().add(subMenu2);

        Menu subMenu3 = new Menu("Box");
        //ANIMATION FOR BOX
        MenuItem sub3Item1 = new MenuItem("RotateTransition");
        subMenu3.getItems().add(sub3Item1);
        sub1Item1.setOnAction((ActionEvent event) -> {
            lblSelection.setText("RotateTransition For Box");
            rotateTransition.setNode(box);
            rotateTransition.play();
        });
        MenuItem sub3Item2 = new MenuItem("ScaleTransition");
        subMenu3.getItems().add(sub3Item2);
        sub1Item3.setOnAction((ActionEvent event) -> {
            lblSelection.setText("ScaleTransition For Box");
            scaleTransition.setNode(box);
            scaleTransition.play();
        });
        MenuItem sub3Item3 = new MenuItem("SequentialTransition");
        subMenu3.getItems().add(sub3Item3);
        sub3Item3.setOnAction((ActionEvent event) -> {
            lblSelection.setText("SequentialTransition For Box");
            sequentialTransition.setNode(box);
            sequentialTransition.play();
        });
        menu.getItems().add(subMenu3);

        Menu subMenu4 = new Menu("Polygon");
        //ANIMATION FOR POLYOGON
        MenuItem sub4Item1 = new MenuItem("RotateTransition");
        subMenu4.getItems().add(sub4Item1);
        sub4Item1.setOnAction((ActionEvent event) -> {
            lblSelection.setText("RotateTransition For Polygon");
            rotateTransition.setAxis(Rotate.Y_AXIS);
            rotateTransition.setNode(box);
            rotateTransition.play();
        });
        MenuItem sub4Item2 = new MenuItem("ScaleTransition");
        subMenu4.getItems().add(sub4Item2);
        sub4Item2.setOnAction((ActionEvent event) -> {
            lblSelection.setText("ScaleTransition For Polygon");
            scaleTransition.setNode(polygon);
            scaleTransition.play();
        });
        MenuItem sub4Item3 = new MenuItem("SequentialTransition");
        subMenu4.getItems().add(sub4Item3);
        sub4Item3.setOnAction((ActionEvent event) -> {
            lblSelection.setText("SequentialTransition For Polygon");
            sequentialTransition.setNode(polygon);
            sequentialTransition.play();
        });
        MenuItem sub4Item4 = new MenuItem("FadeTransition");
        subMenu4.getItems().add(sub4Item4);
        sub4Item4.setOnAction((ActionEvent event) -> {
            lblSelection.setText("FadeTransition For Polygon");
            fadeTransition.setNode(polygon);
            fadeTransition.play();
        });
        menu.getItems().add(subMenu4);


        SeparatorMenuItem menuSeparator = new SeparatorMenuItem();
        menu.getItems().add(menuSeparator);

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu);

        AnchorPane top = new AnchorPane();
        top.getChildren().addAll(menuBar, lblSelection);
        AnchorPane.setLeftAnchor(lblSelection, 130.0);

        VBox root = new VBox();
        root.setPadding(new Insets(15, 12, 15, 12));
        root.setSpacing(10);
        root.setStyle("-fx-background-color: #F0FFFF;");
        root.getChildren().addAll(top,gridLayout);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        primaryStage.setX(200);
        primaryStage.setY(300);
        primaryStage.setHeight(300);
        primaryStage.setWidth(300);
        primaryStage.setTitle("Animation JavaFX Application");
        primaryStage.show();
    }

}

