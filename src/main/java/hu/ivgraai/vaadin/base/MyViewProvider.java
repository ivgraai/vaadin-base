package hu.ivgraai.vaadin.base;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewProvider;
import hu.ivgraai.vaadin.base.views.MainView;

/**
 * @author igergo
 * @since Nov 15, 2016
 */
public class MyViewProvider implements ViewProvider {

    @Override
    public String getViewName(String viewAndParameters) {
        return viewAndParameters;
    }

    @Override
    public View getView(String viewName) {
        if ((!viewName.equals("")) && !viewName.equals(MainView.VIEW_NAME)) {
            throw new RuntimeException();
        }

        return new MainView();
    }

}
