package ru.invegorant.heartapp;

import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class Effects extends HelloController
{

    private FadeTransition ft;
    private ScaleTransition st;
    private ParallelTransition pt;
    private Node node;

    public Effects()
    {

    }

    public Effects(Node node)
    {
        this.node = node;
    }

    public void doShake(Node node)
    {
        TranslateTransition tt = new TranslateTransition(Duration.millis(300), node);
        tt.setByX(5f);
        tt.setByY(5f);
        tt.setCycleCount(2);
        tt.setAutoReverse(true);
        tt.playFromStart();
    }

    public void doFadeout()
    {
        fadeoutElement(node);
        ft.playFromStart();
    }

    public void fadeoutElement(Node node)
    {
        ft = new FadeTransition(Duration.millis(250), node);
        ft.setFromValue(1.0);
        ft.setToValue(0.4);
        ft.setCycleCount(4);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
    }

    public void scaleElement(Node node)
    {
        st = new ScaleTransition(Duration.millis(250), node);
        st.setToX(1.5f);
        st.setToY(1.5f);
        st.setCycleCount(4);
        st.setCycleCount(Timeline.INDEFINITE);
        st.setAutoReverse(true);
    }

    public void heartBeat()
    {
        fadeoutElement(node);
        scaleElement(node);
        pt = new ParallelTransition();
        pt.getChildren().addAll(
                ft,
                st
        );
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(true);
        pt.play();
    }
}
