/**
 * VBoxBorderPaneDemo.java
 * Author: Reed Bunnell
 * Course: CSD-402 - Module 11
 * Description:
 *   Demonstrates JavaFX VBox and BorderPane layout behavior.
 *   - Left sidebar: a VBox with vertically stacked controls and spacing.
 *   - Top area: a header bar (HBox) placed in BorderPane.TOP.
 *   - Center area: a resizable content panel that expands with the window.
 *
 * How to run:
 *   Requires JavaFX modules on the classpath (JDK 11+ uses OpenJFX separately).
 *   Example (Windows, adjust paths):
 *     javac VBoxBorderPaneDemo.java
 *     java --module-path "C:\javafx\lib" --add-modules javafx.controls VBoxBorderPaneDemo
 *
 * References:
 *   - VBox: https://openjfx.io/javadoc/17/javafx.graphics/javafx/scene/layout/VBox.html
 *   - BorderPane: https://openjfx.io/javadoc/11/javafx.graphics/javafx/scene/layout/BorderPane.html
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class VBoxBorderPaneDemo extends Application {

    @Override
    public void start(Stage stage) {
        // --- LEFT: VBox navigation column ---
        VBox sidebar = new VBox(10);                  // 10px vertical gap
        sidebar.setPadding(new Insets(12));
        sidebar.setFillWidth(true);                   // children can expand to full width
        sidebar.setAlignment(Pos.TOP_LEFT);

        Label navTitle = new Label("Navigation");
        Button homeBtn = new Button("Home");
        Button reportsBtn = new Button("Reports");
        Button settingsBtn = new Button("Settings");
        homeBtn.setMaxWidth(Double.MAX_VALUE);
        reportsBtn.setMaxWidth(Double.MAX_VALUE);
        settingsBtn.setMaxWidth(Double.MAX_VALUE);

        sidebar.getChildren().addAll(navTitle, homeBtn, reportsBtn, settingsBtn);
        sidebar.setStyle("-fx-background-color: #f3f6fa;");

        // --- TOP: Header bar (using HBox, placed into BorderPane.TOP) ---
        HBox header = new HBox(12);
        header.setPadding(new Insets(10));
        header.setAlignment(Pos.CENTER_LEFT);
        Label appTitle = new Label("VBox + BorderPane Demo");
        TextField search = new TextField();
        search.setPromptText("Search…");
        header.getChildren().addAll(appTitle, search);
        header.setStyle("-fx-background-color: #e6eef7;");

        // --- CENTER: Resizable content area ---
        VBox content = new VBox(12);
        content.setPadding(new Insets(16));
        content.getChildren().addAll(
                new Label("Content Area"),
                new TextArea("This area grows with the window.\nTry resizing the stage.")
        );
        content.setStyle("-fx-background-color: white; -fx-border-color: #d0d7de; -fx-border-radius: 6;");

        // --- FOOTER: Status bar at the bottom ---
        HBox footer = new HBox();
        footer.setPadding(new Insets(8, 12, 8, 12));
        footer.getChildren().add(new Label("Ready"));
        footer.setStyle("-fx-background-color: #f0f3f6;");

        // --- ROOT: BorderPane frame with five semantic regions ---
        BorderPane root = new BorderPane();
        root.setTop(header);
        root.setLeft(sidebar);
        root.setCenter(content);
        root.setBottom(footer);
        BorderPane.setMargin(content, new Insets(8));

        Scene scene = new Scene(root, 820, 480);
        stage.setScene(scene);
        stage.setTitle("CSD-402 Module 11 - VBox & BorderPane");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
