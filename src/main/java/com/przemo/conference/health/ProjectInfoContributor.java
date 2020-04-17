package com.przemo.conference.health;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class ProjectInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("projectName", "MyProjectName")
                .withDetail("team", "DrinkTeam")
                .withDetail("contact", "con@ta.ct")
                .build();
    }
}
