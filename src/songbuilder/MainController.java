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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.StringJoiner;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author sumisel
 */
public class MainController implements Initializable {

    // ugly code :(
    
    
    @FXML
    private Label textVerse01;
    @FXML
    private Label textVerse02;
    @FXML
    private Label textVerse03;
    @FXML
    private Label textVerse04;
    @FXML
    private Label textVerse05;
    @FXML
    private Label textVerse06;
    @FXML
    private Label textVerse07;
    @FXML
    private Label textVerse08;
    @FXML
    private Label textVerse09;
    @FXML
    private Label textVerse10;
    @FXML
    private Label textVerse11;
    @FXML
    private Label textVerse12;
    @FXML
    private Label textVerse13;
    @FXML
    private Label textVerse14;
    @FXML
    private Label textVerse15;
    @FXML
    private Label textVerse16;
    @FXML
    private Label textVerse17;
    @FXML
    private Label textVerse18;
    @FXML
    private Label textVerse19;
    @FXML
    private Label textVerse20;
    @FXML
    private Label textVerse21;

    @FXML
    private Label textIntro;
    @FXML
    private Label textRefrain1;
    @FXML
    private Label textRefrain2;
    @FXML
    private Label textRefrain3;

    
    @FXML
    private Button playButtonVerse01;
    @FXML
    private Button playButtonVerse02;
    @FXML
    private Button playButtonVerse03;
    @FXML
    private Button playButtonVerse04;
    @FXML
    private Button playButtonVerse05;
    @FXML
    private Button playButtonVerse06;
    @FXML
    private Button playButtonVerse07;
    @FXML
    private Button playButtonVerse08;
    @FXML
    private Button playButtonVerse09;
    @FXML
    private Button playButtonVerse10;
    @FXML
    private Button playButtonVerse11;
    @FXML
    private Button playButtonVerse12;
    @FXML
    private Button playButtonVerse13;
    @FXML
    private Button playButtonVerse14;
    @FXML
    private Button playButtonVerse15;
    @FXML
    private Button playButtonVerse16;
    @FXML
    private Button playButtonVerse17;
    @FXML
    private Button playButtonVerse18;
    @FXML
    private Button playButtonVerse19;
    @FXML
    private Button playButtonVerse20;
    @FXML
    private Button playButtonVerse21;

    /**
     * Initialises the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initVerseTexts();
        initButtons();
    }
    
    private void initButtons() {
        
    }
    
    private void initVerseTexts() {
        textVerse01.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\01.txt"));
        textVerse02.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\02.txt"));
        textVerse03.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\03.txt"));
        textVerse04.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\04.txt"));
        textVerse05.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\05.txt"));
        textVerse06.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\06.txt"));
        textVerse07.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\07.txt"));
        textVerse08.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\08.txt"));
        textVerse09.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\09.txt"));
        textVerse10.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\10.txt"));
        textVerse11.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\11.txt"));
        textVerse12.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\12.txt"));
        textVerse13.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\13.txt"));
        textVerse14.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\14.txt"));
        textVerse15.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\15.txt"));
        textVerse16.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\16.txt"));
        textVerse17.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\17.txt"));
        textVerse18.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\18.txt"));
        textVerse19.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\19.txt"));
        textVerse20.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\20.txt"));
        textVerse21.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\21.txt"));

        textIntro.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\intro.txt"));
        textRefrain1.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\refrain1.txt"));
        textRefrain2.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\refrain2.txt"));
        textRefrain3.setText(readFile(System.getProperty("user.dir")+"\\src\\res\\refrain3.txt"));
    }
    
    private String readFile(String path) {
        String content = "";
        StringJoiner joiner = new StringJoiner("\n");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "ISO-8859-1"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                joiner.add(line);
            }
            content = joiner.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
