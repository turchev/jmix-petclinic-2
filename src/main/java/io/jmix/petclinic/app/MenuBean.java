package io.jmix.petclinic.app;

import io.jmix.flowui.ViewNavigators;
import io.jmix.petclinic.view.visit.MyVisitsView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("petclinic_MenuBean")
public class MenuBean {
    @Autowired
    private ViewNavigators viewNavigators;

    public void browseMyVisits() {
        viewNavigators.view(MyVisitsView.class)
                .navigate();
    }
}