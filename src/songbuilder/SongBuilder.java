/*
 * Copyright (C) 2018 sumisel
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package songbuilder;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author sumisel
 */
public class SongBuilder extends Application {
    
    private static Stage stage;
    
    @Override
    public void start(Stage stage) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));        
        this.stage = stage;
        
        // Create the Scene
        Scene scene = new Scene(root);
        String css = this.getClass().getResource("main.css").toExternalForm();
        scene.getStylesheets().add(css);
        // Set the Scene to the Stage
        stage.setScene(scene);
        // Set the Title to the Stage
        stage.setTitle("Unterschleißheim Song");
        stage.getIcons().add(new Image("/res/logo.png"));
        // Display the Stage
        stage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public static Stage getStage() {
        return stage;
    }
    
}
