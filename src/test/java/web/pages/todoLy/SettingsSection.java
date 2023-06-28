package web.pages.todoLy;

import org.openqa.selenium.By;
import web.controls.Button;
import web.controls.TextBox;

public class SettingsSection {

    public TextBox fullNameInput = new TextBox(By.id("FullNameInput"));
    public Button confirmChangesButton = new Button(By.xpath("//span[text()='Ok']"));

}
