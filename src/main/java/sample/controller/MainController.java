package sample.controller;

import javafx.fxml.FXML;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class MainController {
    @FXML
    private GridPane gridPane;

    private String chars = "نعاصدصكززمكدكايبسبهينطبرنمنرترپنهلوهيلادبهشعاقدممامرگريمرادهيزراذكملكزرعليمياساكسغعمامبنركنيعيمريناعاهيكيرلانلرمزدآشكصزوعطكلعرودنبينمفسبمعرپدراهلستولمدشرخنبزببدزلبيييبينحسننوسمنرسنهاييهرياكميداناكازاناجابريروردريرورد";
//    private String chars = "بعصنبمحجمزگکهربهیزامقبذگردراانجیصعررحسبلزدتعددزداماصیمتحصصییجطشبناماابنمتلورمزیجبرآکمبکمدیشتررردشتلقعندتاازردایصاحدبنحوامزددقاریبتفزشدهآطجدشرآکیورروعتاکآورنغدمرنپببیردرمرقدظییرددگهگآصبراقآزبرکییداکثییواکذنددرنمنددرنر";

    public void initialize() {
        Integer charsIndex = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 18; j++) {
                Button button = new Button();
                button.setText(String.valueOf(chars.charAt(charsIndex++)));
                button.setAlignment(Pos.CENTER);
                button.setTextAlignment(TextAlignment.CENTER);
                button.setMaxHeight(Double.MAX_VALUE);
                button.setMaxWidth(Double.MAX_VALUE);
                button.setUserData(charsIndex);
                button.setOnAction(event -> {
                    Integer charIndex = (Integer) button.getUserData();

                    String horoofbaad = "";
                    String horoofghabl = "";
                    String natijeh = "";
                    String mesraa1 = "";
                    String mesraa2 = "";
                    for (int k = charIndex + 5; k < 216; k += 6) {
                        horoofbaad = horoofbaad.concat(String.valueOf(chars.charAt(k)));
                    }
                    System.out.println(horoofbaad);

                    for (int k = (charIndex % 6) + 5, m = 0; k < charIndex; k += 6, m++) {
                        if (charIndex % 6 != 0 && m == 0) {
                            horoofghabl = horoofghabl.concat(String.valueOf(chars.charAt((charIndex % 6))));
                        }
                        horoofghabl = horoofghabl.concat(String.valueOf(chars.charAt(k)));
                    }
                    System.out.println(horoofghabl);


                    natijeh = horoofghabl + horoofbaad;
                    System.out.println(natijeh);


                    for (int k = 0; k < natijeh.length(); k++) {

                        if (k % 2 == 1) {
                            mesraa1 = mesraa1.concat(String.valueOf(natijeh.charAt(k)));
                        }

                        if (k % 2 == 0) {
                            mesraa2 = mesraa2.concat(String.valueOf(natijeh.charAt(k)));
                        }

                    }


                    System.out.println("\n\n\n");

                    System.out.println(mesraa2);
                    System.out.println(mesraa1);

                    Stage stage = new Stage();
                    Label label = new Label(mesraa2 + "\n" + mesraa1);
                    Pane pane = new Pane(label);
                    Scene scene = new Scene(pane);
                    stage.setScene(scene);
                    stage.showAndWait();

                });

                gridPane.add(button, j, i);
                GridPane.setHalignment(button, HPos.CENTER);
                GridPane.setValignment(button, VPos.CENTER);
                GridPane.setFillWidth(button, true);
                GridPane.setFillHeight(button, true);
            }
        }
    }
}
