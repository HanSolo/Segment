/*
 * Copyright (c) 2016 by Gerrit Grunwald
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.hansolo.fx.segment;

import eu.hansolo.fx.segment.Segment.Character;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;


/**
 * User: hansolo
 * Date: 19.05.16
 * Time: 13:08
 */
public class Demo extends Application {
    private HBox    row0;
    private Label   r0Label;
    private Segment r00;
    private Segment r01;
    private Segment r02;
    private HBox    row1;
    private Label   r1Label;
    private Segment r10;
    private Segment r11;
    private Segment r12;
    private HBox    row2;
    private Label   r2Label;
    private Segment r20;
    private Segment r21;
    private Segment r22;
    private HBox    row3;
    private Label   r3Label;
    private Segment r30;
    private Segment r31;
    private Segment r32;


    @Override public void init() {
        r0Label = createLabel("Bichelweiher");
        r00     = new Segment(Character.C4);
        r01     = new Segment(Character.C7);
        r02     = new Segment(Character.C1);
        row0     = new HBox(r0Label, r00, r01, r02);
        row0.setSpacing(5);
        row0.setAlignment(Pos.CENTER_LEFT);

        r1Label = createLabel("Technikum");
        r10     = new Segment(Character.C1);
        r11     = new Segment(Character.C3);
        r12     = new Segment(Character.C1);
        row1    = new HBox(r1Label, r10, r11, r12);
        row1.setSpacing(5);
        row1.setAlignment(Pos.CENTER_LEFT);

        r2Label = createLabel("Archhöfe");
        r20     = new Segment(Character.C1);
        r21     = new Segment(Character.C5);
        r22     = new Segment(Character.C8);
        row2    = new HBox(r2Label, r20, r21, r22);
        row2.setSpacing(5);
        row2.setAlignment(Pos.CENTER_LEFT);

        r3Label = createLabel("Citypassage");
        r30     = new Segment(Character.C2);
        r31     = new Segment(Character.C1);
        r32     = new Segment(Character.C0);
        row3    = new HBox(r3Label, r30, r31, r32);
        row3.setSpacing(5);
        row3.setAlignment(Pos.CENTER_LEFT);

    }

    @Override public void start(Stage stage) {
        VBox vbox = new VBox(row0, row1, row2, row3);
        vbox.setSpacing(20);

        StackPane pane = new StackPane(vbox);
        pane.setPadding(new Insets(10));
        pane.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));

        Scene scene = new Scene(pane);

        stage.setTitle("Friday Fun XXX");
        stage.setScene(scene);
        stage.show();
    }

    @Override public void stop() {
        System.exit(0);
    }

    private Label createLabel(final String TEXT) {
        Label label = new Label(TEXT);
        label.setFont(Font.font(50));
        label.setTextFill(Color.BLACK);
        label.setPrefWidth(350);
        label.setBackground(new Background(new BackgroundFill(Color.rgb(250, 197, 17), CornerRadii.EMPTY, Insets.EMPTY)));
        return label;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
