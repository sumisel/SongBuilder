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
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.StringJoiner;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

/**
 * FXML Controller class
 *
 * @author sumisel
 */
public class MainController implements Initializable {

    private String[] song = new String[10];
    private boolean songComplete = false;

    // ugly code :(
    
    @FXML
    private Button buttonPlay;
    @FXML
    private Label labelPlayProgress;
    
    @FXML
    private Button buttonSave;
    
    @FXML
    private GridPane paneVerse1;
    @FXML
    private GridPane paneVerse2;
    @FXML
    private GridPane paneVerse3;
    @FXML
    private GridPane paneVerse4;
    @FXML
    private GridPane paneVerse5;
    @FXML
    private GridPane paneVerse6;
    @FXML
    private GridPane paneVerse7;
    @FXML
    private GridPane paneVerse8;
    @FXML
    private GridPane paneVerse9;
    @FXML
    private GridPane paneVerse10;
    @FXML
    private GridPane paneVerse11;
    @FXML
    private GridPane paneVerse12;
    @FXML
    private GridPane paneVerse13;
    @FXML
    private GridPane paneVerse14;
    @FXML
    private GridPane paneVerse15;
    @FXML
    private GridPane paneVerse16;
    @FXML
    private GridPane paneVerse17;
    @FXML
    private GridPane paneVerse18;
    @FXML
    private GridPane paneVerse19;
    @FXML
    private GridPane paneVerse20;
    @FXML
    private GridPane paneVerse21;
    
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

    @FXML
    private Button playButtonIntro;
    @FXML
    private Button playButtonRefrain1;
    @FXML
    private Button playButtonRefrain2;
    @FXML
    private Button playButtonRefrain3;

    
    @FXML
    private GridPane paneSlot1;
    @FXML
    private GridPane paneSlot2;
    @FXML
    private GridPane paneSlot3;
    @FXML
    private GridPane paneSlot4;
    @FXML
    private GridPane paneSlot5;
    @FXML
    private GridPane paneSlot6;
    
    @FXML
    private Label labelVerse1;
    @FXML
    private Label labelVerse2;
    @FXML
    private Label labelVerse3;
    @FXML
    private Label labelVerse4;
    @FXML
    private Label labelVerse5;
    @FXML
    private Label labelVerse6;
    
    @FXML
    private Label textVerse1;
    @FXML
    private Label textVerse2;
    @FXML
    private Label textVerse3;
    @FXML
    private Label textVerse4;
    @FXML
    private Label textVerse5;
    @FXML
    private Label textVerse6;
    
    
    
    /**
     * Initialises the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initVerseTexts();
        initButtons();
        initDragDrop();
        initSong();
        initPlayer();
    }
    
    private void initSong() {
        song[0] = "intro";
        song[1] = "";
        song[2] = "";
        song[3] = "refrain1";
        song[4] = "";
        song[5] = "";
        song[6] = "refrain2";
        song[7] = "";
        song[8] = "";
        song[9] = "refrain3";
    }
    
    private void initDragDrop() {
        addDragSource(paneVerse1);
        addDragSource(paneVerse2);
        addDragSource(paneVerse3);
        addDragSource(paneVerse4);
        addDragSource(paneVerse5);
        addDragSource(paneVerse6);
        addDragSource(paneVerse7);
        addDragSource(paneVerse8);
        addDragSource(paneVerse9);
        addDragSource(paneVerse10);
        addDragSource(paneVerse11);
        addDragSource(paneVerse12);
        addDragSource(paneVerse13);
        addDragSource(paneVerse14);
        addDragSource(paneVerse15);
        addDragSource(paneVerse16);
        addDragSource(paneVerse17);
        addDragSource(paneVerse18);
        addDragSource(paneVerse19);
        addDragSource(paneVerse20);
        addDragSource(paneVerse21);

        addDropTarget(paneSlot1);
        addDropTarget(paneSlot2);
        addDropTarget(paneSlot3);
        addDropTarget(paneSlot4);
        addDropTarget(paneSlot5);
        addDropTarget(paneSlot6);
    }
    
    private void addDragSource(GridPane source) {
        source.setOnDragDetected(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                /* drag was detected, start a drag-and-drop gesture*/
                /* allow any transfer mode */
                Dragboard db = source.startDragAndDrop(TransferMode.COPY.ANY);
        
                /* Put a string on a dragboard */
                ClipboardContent content = new ClipboardContent();
                content.putString(((Label) source.getChildren().get(0)).getText());
                content.putHtml(((Label) source.getChildren().get(2)).getText());
                
                db.setContent(content);
        
                event.consume();
            }
        });
    }
    
    private void addDropTarget(GridPane target) {
        target.setOnDragOver(new EventHandler<DragEvent>() {
            public void handle(DragEvent event) {
                /* data is dragged over the target */
                /* accept it only if it is not dragged from the same node 
                 * and if it has a string data */
                if (event.getGestureSource() != target &&
                    event.getDragboard().hasString()) {
                        /* allow for both copying and moving, whatever user chooses */
                        event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
                    }
        
                    event.consume();
                }
            });
        
        target.setOnDragDropped(new EventHandler<DragEvent>() {
            public void handle(DragEvent event) {
            /* data dropped */
            /* if there is a string data on dragboard, read it and use it */
            Dragboard db = event.getDragboard();
            boolean success = false;
            if (db.hasString()) {
                if(target.getStyleClass().size()>1) {
                    target.getStyleClass().remove(1);
                }
                
                ((Label) target.getChildren().get(0)).setText(db.getString());
                ((Label) target.getChildren().get(2)).setText(db.getHtml());
                setOnPlay(((Button) target.getChildren().get(1)), System.getProperty("user.dir")+"\\src\\res\\"+db.getString()+".wav");
                
                int index = Integer.parseInt(target.getId().replaceAll("[^0-9]+", ""));
                index += (index-1)/2;
                song[index] = db.getString();
                initPlayer();
                
                success = true;
            }
            /* let the source know whether the string was successfully 
            * transferred and used */
            event.setDropCompleted(success);
        
            event.consume();
            }
        });
        
        
        target.setOnDragEntered(new EventHandler<DragEvent>() {
            public void handle(DragEvent event) {
                /* the drag-and-drop gesture entered the target */
                /* show to the user that it is an actual gesture target */
                if (event.getGestureSource() != target &&
                 event.getDragboard().hasString()) {
                    // nothing implemented here
                }
                
                event.consume();
            }
        });
    }
        
    private void initButtons() {
        // save button
        //TODO file chooser and save wav
        
        setOnPlay(playButtonVerse01, System.getProperty("user.dir")+"\\src\\res\\01.wav");
        setOnPlay(playButtonVerse02, System.getProperty("user.dir")+"\\src\\res\\02.wav");
        setOnPlay(playButtonVerse03, System.getProperty("user.dir")+"\\src\\res\\03.wav");
        setOnPlay(playButtonVerse04, System.getProperty("user.dir")+"\\src\\res\\04.wav");
        setOnPlay(playButtonVerse05, System.getProperty("user.dir")+"\\src\\res\\05.wav");
        setOnPlay(playButtonVerse06, System.getProperty("user.dir")+"\\src\\res\\06.wav");
        setOnPlay(playButtonVerse07, System.getProperty("user.dir")+"\\src\\res\\07.wav");
        setOnPlay(playButtonVerse08, System.getProperty("user.dir")+"\\src\\res\\08.wav");
        setOnPlay(playButtonVerse09, System.getProperty("user.dir")+"\\src\\res\\09.wav");
        setOnPlay(playButtonVerse10, System.getProperty("user.dir")+"\\src\\res\\10.wav");
        setOnPlay(playButtonVerse11, System.getProperty("user.dir")+"\\src\\res\\11.wav");
        setOnPlay(playButtonVerse12, System.getProperty("user.dir")+"\\src\\res\\12.wav");
        setOnPlay(playButtonVerse13, System.getProperty("user.dir")+"\\src\\res\\13.wav");
        setOnPlay(playButtonVerse14, System.getProperty("user.dir")+"\\src\\res\\14.wav");
        setOnPlay(playButtonVerse15, System.getProperty("user.dir")+"\\src\\res\\15.wav");
        setOnPlay(playButtonVerse16, System.getProperty("user.dir")+"\\src\\res\\16.wav");
        setOnPlay(playButtonVerse17, System.getProperty("user.dir")+"\\src\\res\\17.wav");
        setOnPlay(playButtonVerse18, System.getProperty("user.dir")+"\\src\\res\\18.wav");
        setOnPlay(playButtonVerse19, System.getProperty("user.dir")+"\\src\\res\\19.wav");
        setOnPlay(playButtonVerse20, System.getProperty("user.dir")+"\\src\\res\\20.wav");
        setOnPlay(playButtonVerse21, System.getProperty("user.dir")+"\\src\\res\\21.wav");

        setOnPlay(playButtonIntro, System.getProperty("user.dir")+"\\src\\res\\intro.wav");
        setOnPlay(playButtonRefrain1, System.getProperty("user.dir")+"\\src\\res\\refrain1.wav");
        setOnPlay(playButtonRefrain2, System.getProperty("user.dir")+"\\src\\res\\refrain2.wav");
        setOnPlay(playButtonRefrain3, System.getProperty("user.dir")+"\\src\\res\\refrain3.wav");
    }
    
    private void initPlayer() {
        for(int i=0; i<song.length; i++) {
            if(song[i].equals("")) {
                songComplete = false;
                break;
            }
            songComplete = true;
        }
                
        try {
            AudioInputStream clipIntro = AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir")+"\\src\\res\\"+song[0]+".wav"));
            
            int index = 1;
            index = getNextSongSlot(index);
            AudioInputStream clipNext = AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir")+"\\src\\res\\"+song[index]+".wav"));
            index++;

            AudioInputStream appendedFiles = 
                            new AudioInputStream(
                                new SequenceInputStream(clipIntro, clipNext),     
                                clipIntro.getFormat(), 
                                clipIntro.getFrameLength() + clipNext.getFrameLength());
            
            while(index < song.length) {
                index = getNextSongSlot(index);
                clipNext = AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir")+"\\src\\res\\"+song[index]+".wav"));
                index++;

                appendedFiles = 
                            new AudioInputStream(
                                new SequenceInputStream(appendedFiles, clipNext),     
                                appendedFiles.getFormat(), 
                                appendedFiles.getFrameLength() + clipNext.getFrameLength());
            }

            int length = (int)((appendedFiles.getFrameLength())/(appendedFiles.getFormat().getFrameRate()));
            String seconds = ""+(length%60);
            seconds = seconds.length()==1 ? "0"+seconds : seconds;
            String minutes = ""+(length/60);
            minutes = minutes.length()==1 ? "0"+minutes : minutes;
            labelPlayProgress.setText(minutes+":"+seconds);

            AudioSystem.write(appendedFiles, 
                            AudioFileFormat.Type.WAVE,
                            new File(System.getProperty("user.dir")+"\\src\\res\\song.wav"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        final Media media = new Media((new File(System.getProperty("user.dir")+"\\src\\res\\song.wav")).toURI().toString());
        final MediaPlayer mediaPlayer = new MediaPlayer(media);
        buttonPlay.setOnAction(e ->{
            if(buttonPlay.getStyleClass().size()>2) {
                mediaPlayer.pause();
                buttonPlay.getStyleClass().remove(2);
            } else {
                mediaPlayer.play();
                buttonPlay.getStyleClass().add("pause");
            }
        });
        
        //TODO init progress bar
    }
    
    private int getNextSongSlot(int index) {
        while(index < song.length && song[index].equals("")) {
                index++;
            }
        
        return index;
    }
    
    private void setOnPlay(Button button, String res) {
        final Media media = new Media((new File(res)).toURI().toString());
        final MediaPlayer mediaPlayer = new MediaPlayer(media);
        button.setOnAction(e ->{
            mediaPlayer.stop();
            mediaPlayer.play();
        });
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
