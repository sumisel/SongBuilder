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

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ResourceBundle;
import java.util.StringJoiner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.Tooltip;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.FileChooser;
import javafx.util.Duration;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

/**
 * FXML Controller class
 *
 * @author sumisel
 */
public class MainController implements Initializable {

    private final String[] song = new String[10];
    private boolean songComplete = false;
    private AudioInputStream songStream = null;

    // ugly code :(
    
    @FXML
    private Button buttonPlay;
    @FXML
    private Slider sliderPlayProgress;
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
    
    
    
    /**
     * Initialises the controller class.
     * @param url
     * @param rb
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
        source.setOnDragDetected((MouseEvent event) -> {
            /* drag was detected, start a drag-and-drop gesture*/
            /* allow any transfer mode */
            Dragboard db = source.startDragAndDrop(TransferMode.COPY.ANY);
            
            /* Put a string on a dragboard */
            ClipboardContent content = new ClipboardContent();
            content.putString(((Label) source.getChildren().get(0)).getText());
            content.putHtml(((Label) source.getChildren().get(2)).getText());
            
            db.setContent(content);
            
            event.consume();
        });
    }
    
    private void addDropTarget(GridPane target) {
        target.setOnDragOver((DragEvent event) -> {
            /* data is dragged over the target */
            /* accept it only if it is not dragged from the same node
            * and if it has a string data */
            if (event.getGestureSource() != target &&
                    event.getDragboard().hasString()) {
                /* allow for both copying and moving, whatever user chooses */
                event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
            }
            
            event.consume();
        });
        
        target.setOnDragDropped((DragEvent event) -> {
            /* data dropped */
            /* if there is a string data on dragboard, read it and use it */
            Dragboard db = event.getDragboard();
            boolean success = false;
            if (db.hasString()) {
                for(int i=target.getStyleClass().size()-1; i>=0; i--) {
                    if(target.getStyleClass().get(i).equals("empty")) {
                        target.getStyleClass().remove(i);
                    }
                }
                
                int index = Integer.parseInt(target.getId().replaceAll("[^0-9]+", ""));
                index += (index-1)/2;
                song[index] = db.getString();
                initPlayer();
                
                ((Label) target.getChildren().get(0)).setText(db.getString());
                ((Label) target.getChildren().get(2)).setText(db.getHtml());
                setOnPlay(((Button) target.getChildren().get(1)), "/res/"+db.getString()+".wav", "Strophe abspielen");
                setOnRemove(((Button) target.getChildren().get(3)), index, "Strophe entfernen");
                
                success = true;
            }
            /* let the source know whether the string was successfully
            * transferred and used */
            event.setDropCompleted(success);
        
            event.consume();
        });
        
        
        target.setOnDragEntered((DragEvent event) -> {
            /* the drag-and-drop gesture entered the target */
            /* show to the user that it is an actual gesture target */
            if (event.getGestureSource() != target &&
                    event.getDragboard().hasString()) {
                // nothing implemented here
            }
            
            event.consume();
        });
    }
        
    private void initButtons() {
        // save button
        buttonSave.setTooltip(new Tooltip("Song speichern"));
        buttonSave.setOnAction((final ActionEvent e) -> {
            if(songComplete) {
                /*if(!(new File("C:\\\\").exists())) {
                    Alert alert = new Alert(Alert.AlertType.ERROR, "", ButtonType.OK);
                    alert.setHeaderText("Bitte USB-Stick verbinden.");
                    alert.setTitle("");
                    alert.showAndWait();
                    return;
                }*/
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Speicher dein Lied");
                fileChooser.setInitialDirectory(new File("C:\\\\"));
                fileChooser.setInitialFileName("Mein Unterschleißheim Lied");
                fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("WAV files (*.wav)", "*.wav"));

                File dest = fileChooser.showSaveDialog(SongBuilder.getStage());
                if (dest != null) {
                    try {
                        if(dest.exists()) {
                            dest.delete();
                        }
                        File file = new File(System.getProperty("user.dir")+"\\song.wav");
                        Files.copy(file.toPath(), dest.toPath());
                    } catch (IOException ex) {
                        Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    // save for statistics
                    StringJoiner joiner = new StringJoiner(", ");
                    for(String elem : song) {
                        joiner.add(elem);
                    }//getClass().getResourceAsStream("/res/stats.txt")
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.dir")+"\\stats.txt", true))) {
                        bw.write(joiner.toString());
                        bw.newLine();
                    } catch (IOException f) {
                        f.printStackTrace();
                    }
                }
            }
        });
        
        setOnPlay(playButtonVerse01, "/res/01.wav", "Strophe abspielen");
        setOnPlay(playButtonVerse02, "/res/02.wav", "Strophe abspielen");
        setOnPlay(playButtonVerse03, "/res/03.wav", "Strophe abspielen");
        setOnPlay(playButtonVerse04, "/res/04.wav", "Strophe abspielen");
        setOnPlay(playButtonVerse05, "/res/05.wav", "Strophe abspielen");
        setOnPlay(playButtonVerse06, "/res/06.wav", "Strophe abspielen");
        setOnPlay(playButtonVerse07, "/res/07.wav", "Strophe abspielen");
        setOnPlay(playButtonVerse08, "/res/08.wav", "Strophe abspielen");
        setOnPlay(playButtonVerse09, "/res/09.wav", "Strophe abspielen");
        setOnPlay(playButtonVerse10, "/res/10.wav", "Strophe abspielen");
        setOnPlay(playButtonVerse11, "/res/11.wav", "Strophe abspielen");
        setOnPlay(playButtonVerse12, "/res/12.wav", "Strophe abspielen");
        setOnPlay(playButtonVerse13, "/res/13.wav", "Strophe abspielen");
        setOnPlay(playButtonVerse14, "/res/14.wav", "Strophe abspielen");
        setOnPlay(playButtonVerse15, "/res/15.wav", "Strophe abspielen");
        setOnPlay(playButtonVerse16, "/res/16.wav", "Strophe abspielen");
        setOnPlay(playButtonVerse17, "/res/17.wav", "Strophe abspielen");
        setOnPlay(playButtonVerse18, "/res/18.wav", "Strophe abspielen");
        setOnPlay(playButtonVerse19, "/res/19.wav", "Strophe abspielen");
        setOnPlay(playButtonVerse20, "/res/20.wav", "Strophe abspielen");
        setOnPlay(playButtonVerse21, "/res/21.wav", "Strophe abspielen");

        setOnPlay(playButtonIntro, "/res/intro.wav", "Intro abspielen");
        setOnPlay(playButtonRefrain1, "/res/refrain1.wav", "Refrain abspielen");
        setOnPlay(playButtonRefrain2, "/res/refrain2.wav", "Refrain abspielen");
        setOnPlay(playButtonRefrain3, "/res/refrain3.wav", "Refrain abspielen");
    }
    
    private void initPlayer() {
        for (String songVerse : song) {
            if (songVerse.equals("")) {
                buttonSave.getStyleClass().set(2, "disabled");
                songComplete = false;
                break;
            }
            buttonSave.getStyleClass().set(2, "a");
            songComplete = true;
        }
                
        try {
            AudioInputStream clipIntro = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getResourceAsStream("/res/"+song[0]+".wav")));
            
            int index = 1;
            index = getNextSongSlot(index);
            AudioInputStream clipNext = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getResourceAsStream("/res/"+song[index]+".wav")));
            index++;

            songStream = 
                            new AudioInputStream(
                                new SequenceInputStream(clipIntro, clipNext),     
                                clipIntro.getFormat(), 
                                clipIntro.getFrameLength() + clipNext.getFrameLength() -5000);
            
            while(index < song.length) {
                index = getNextSongSlot(index);
                clipNext = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getResourceAsStream(("/res/"+song[index]+".wav"))));
                index++;

                songStream = 
                            new AudioInputStream(
                                new SequenceInputStream(songStream, clipNext),     
                                songStream.getFormat(), 
                                songStream.getFrameLength() + clipNext.getFrameLength() -5000);
            }

            int length = (int)((songStream.getFrameLength())/(songStream.getFormat().getFrameRate()));
            updatePlayerLabel(length, 0);
            sliderPlayProgress.setMax(length);

            AudioSystem.write(songStream, 
                            AudioFileFormat.Type.WAVE,
                            new File(System.getProperty("user.dir")+"\\song.wav"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        final Media media;
        media = new Media((new File(System.getProperty("user.dir")+"\\song.wav")).toURI().toString());
        final MediaPlayer mediaPlayer = new MediaPlayer(media);

        buttonPlay.setTooltip(new Tooltip("Song abspielen"));
        buttonPlay.setOnAction(e ->{
            boolean playing = false;
            for(int i=buttonPlay.getStyleClass().size()-1; i>=0; i--) {
                if(buttonPlay.getStyleClass().get(i).equals("pause")) {
                    playing = true;
                    buttonPlay.getStyleClass().remove(i);
                }
            }

            if(playing) {
                mediaPlayer.pause();
            } else {
                mediaPlayer.play();
                buttonPlay.getStyleClass().add("pause");
            }
        });

        // connect media player with slider and label slider
        mediaPlayer.currentTimeProperty().addListener(ov -> {
            sliderPlayProgress.setValue(mediaPlayer.getCurrentTime().toSeconds());
            updatePlayerLabel((int) sliderPlayProgress.getMax(), (int) mediaPlayer.getCurrentTime().toSeconds());
        });
        EventHandler handler = (EventHandler) (Event event) -> {
            MediaPlayer.Status status = mediaPlayer.getStatus();
            mediaPlayer.pause();
            mediaPlayer.seek(Duration.seconds(sliderPlayProgress.getValue()));
            updatePlayerLabel((int) sliderPlayProgress.getMax(), (int) Duration.seconds(sliderPlayProgress.getValue()).toSeconds());
            if(status == MediaPlayer.Status.PLAYING) {
                mediaPlayer.play();
            }
        };
        sliderPlayProgress.setOnMousePressed(handler);
        //sliderPlayProgress.setOnMouseDragged(handler);
    }
    
    private void updatePlayerLabel(int length, int current) {
        String secondsMax = ""+(length%60);
        secondsMax = secondsMax.length()==1 ? "0"+secondsMax : secondsMax;
        String minutesMax = ""+(length/60);
        minutesMax = minutesMax.length()==1 ? "0"+minutesMax : minutesMax;
        
        String secondsCur = ""+(current%60);
        secondsCur = secondsCur.length()==1 ? "0"+secondsCur : secondsCur;
        String minutesCur = ""+(current/60);
        minutesCur = minutesCur.length()==1 ? "0"+minutesCur : minutesCur;
        
        labelPlayProgress.setText(minutesCur+":"+secondsCur + " / " + minutesMax+":"+secondsMax);
    }
    
    private int getNextSongSlot(int index) {
        while(index < song.length && song[index].equals("")) {
                index++;
            }
        
        return index;
    }
    
    private void setOnPlay(Button button, String res, String tooltip) {
        button.setTooltip(new Tooltip(tooltip));
        setOnPlay(button, res);
    }
    
    private void setOnPlay(Button button, String res) {
        final Media media;
        try {
            media = new Media(getClass().getResource(res).toURI().toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            button.setOnAction(e -> {
                boolean playing = false;
                for(int i=button.getStyleClass().size()-1; i>=0; i--) {
                    if(button.getStyleClass().get(i).equals("stop")) {
                        playing = true;
                        button.getStyleClass().remove(i);
                    }
                }
            
                if(playing) {
                    mediaPlayer.pause();
                } else {
                    mediaPlayer.play();
                    button.getStyleClass().add("stop");
                }
            });
        } catch (URISyntaxException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void initVerseTexts() {
        textVerse01.setText(readFile("/res/01.txt"));
        textVerse02.setText(readFile("/res/02.txt"));
        textVerse03.setText(readFile("/res/03.txt"));
        textVerse04.setText(readFile("/res/04.txt"));
        textVerse05.setText(readFile("/res/05.txt"));
        textVerse06.setText(readFile("/res/06.txt"));
        textVerse07.setText(readFile("/res/07.txt"));
        textVerse08.setText(readFile("/res/08.txt"));
        textVerse09.setText(readFile("/res/09.txt"));
        textVerse10.setText(readFile("/res/10.txt"));
        textVerse11.setText(readFile("/res/11.txt"));
        textVerse12.setText(readFile("/res/12.txt"));
        textVerse13.setText(readFile("/res/13.txt"));
        textVerse14.setText(readFile("/res/14.txt"));
        textVerse15.setText(readFile("/res/15.txt"));
        textVerse16.setText(readFile("/res/16.txt"));
        textVerse17.setText(readFile("/res/17.txt"));
        textVerse18.setText(readFile("/res/18.txt"));
        textVerse19.setText(readFile("/res/19.txt"));
        textVerse20.setText(readFile("/res/20.txt"));
        textVerse21.setText(readFile("/res/21.txt"));

        textIntro.setText(readFile("/res/intro.txt"));
        textRefrain1.setText(readFile("/res/refrain1.txt"));
        textRefrain2.setText(readFile("/res/refrain2.txt"));
        textRefrain3.setText(readFile("/res/refrain3.txt"));
    }
    
    private String readFile(String path) {
        String content = "";
        StringJoiner joiner = new StringJoiner("\n");
        
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(path), "ISO-8859-1"));
            String line;
            while ((line = reader.readLine()) != null) {
                joiner.add(line);
            }
            content = joiner.toString();
        } catch (IOException e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, e);
        }
        return content;
    }

    private void setOnRemove(Button button, int index, String tooltip) {
        button.setTooltip(new Tooltip(tooltip));
        button.setOnAction(e -> {
            song[index] = "";
            ((Label) ((GridPane) button.getParent()).getChildren().get(0)).setText("");
            ((Label) ((GridPane) button.getParent()).getChildren().get(2)).setText("");
            ((Button) ((GridPane) button.getParent()).getChildren().get(1)).setOnAction(null);
            ((GridPane) button.getParent()).getStyleClass().add("empty");
            initPlayer();
        });
    }
}
