package web.pages.todoist;

import org.openqa.selenium.By;
import web.controls.Button;
import web.controls.Label;

public class LateralProjectSection {

    public Label projectSectionLabel = new Label(By.xpath("//a[@href='/app/projects']"));
    public Button addProjectButton = new Button(By.xpath("//button[@aria-label='A\u00f1adir proyecto']"));


}
