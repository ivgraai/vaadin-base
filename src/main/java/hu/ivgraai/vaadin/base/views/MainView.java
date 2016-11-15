package hu.ivgraai.vaadin.base.views;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

/**
 * @author igergo
 * @since Nov 15, 2016
 */
public class MainView extends VerticalLayout implements View {

    public static final String VIEW_NAME = "MainView";

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        addComponent(new Label("Hello, World!"));
    }

}
