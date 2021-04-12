/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author XeroFox
 */
public class CasinoCoinController implements Initializable {
    
    @FXML
    void MenuCloseButton(ActionEvent event){
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.close();
    }
    
    @FXML
    void MenuKijelentkezesButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoLogin.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }

    @FXML
    void MenuRouletteButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoRoulette.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }
    
    @FXML
    void MenuFooldalGomb(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoFomenu.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }
    
    @FXML
    void MenuProfileButton(ActionEvent event) throws IOException {
        Parent ProfileViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoProfile.fxml"));
        Scene ProfileViewScene = new Scene(ProfileViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ProfileViewScene);
        window.show();
    }
    
    @FXML
    void MenuBJButton(ActionEvent event) throws IOException {
        Parent BJViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoBJ.fxml"));
        Scene BJViewScene = new Scene(BJViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(BJViewScene);
        window.show();
    }

    @FXML
    void MenuBoltButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoBolt.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }

    @FXML
    void MenuDiceButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoDice.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }

    @FXML
    void MenuFeltoltesButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoFeltoltes.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }

    @FXML
    void MenuSlotIButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoSlotI.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }

    @FXML
    void MenuWheelButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoWheel.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }

    @FXML
    void MenuSlotIIButton(ActionEvent event) throws IOException {
        Parent ViewParent = FXMLLoader.load(getClass().getResource("/fxml/CasinoSlotII.fxml"));
        Scene ViewScene = new Scene(ViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ViewScene);
        window.show();
    }
    
    ////////////////////
    ///////////////////
    ////////////////////
    
    int money = 5000;
    int bet = 0;
    int coin;   //  0-tail  1-head
    Random rand = new Random();
    
    @FXML
    private Label MoneyLabel;   
    @FXML
    private Label BetLabel;
    @FXML
    private Label ResultLabel;
    
  

    @FXML
    void MoreButtonPushed() {
        if (bet >= money) {
            
        }
        else
            bet += 1000;
        
        BetLabel.setText("Bet: " + bet);
        ResultLabel.setText("");

    }
    
    @FXML
    void LessButtonPushed() {
        if (bet == 0) {
            
        }
        else
         bet -= 1000;
        
        BetLabel.setText("Bet: " + bet);
        ResultLabel.setText("");

    }
    
    //  0-tail  1-head
    @FXML
    void HeadButtonPushed() {
        if (bet > 0) {
            
            int randint = rand.nextInt(2);

            if(randint==1)
            {
                ResultLabel.setText("Win!");

                money += bet;
            }
            else
            {
                ResultLabel.setText("Loss!");        

                money -= bet;
            }
            bet = 0;
            MoneyLabel.setText("Money: " + money /*+ "\n Rand: " + randint*/);
            BetLabel.setText("Bet: " + bet);
        }
    }
    @FXML
    void TailButtonPushed() {
        if (bet > 0) {
            

            int randint = rand.nextInt(2);

            if(randint==0)
            {
                ResultLabel.setText("Win!");

                money += bet;
            }
            else
            {
                ResultLabel.setText("Loss!");

                money -= bet;
            }
            bet = 0;
            MoneyLabel.setText("Money: " + money /*+ "\n Rand: " + randint*/);
            BetLabel.setText("Bet: " + bet);
        }
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        MoneyLabel.setText("Money: " + money);
        BetLabel.setText("Bet: " + bet);

    }    
    
}